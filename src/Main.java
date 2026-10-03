void main(){
    Scanner sc = new Scanner(System.in);
    double xp, xk, x, dx, eps, a=0, R=0, S=0;
    int n=0;

    System.out.print("xp = ");
    xp = sc.nextDouble();

    System.out.print("xk = ");
    xk = sc.nextDouble();

    System.out.print("dx = ");
    dx = sc.nextDouble();

    System.out.print("eps = ");
    eps = sc.nextDouble();

    System.out.println("+------+---------------------+---------------------+------+");
    System.out.printf("|%5s |%20s |%20s |%5s |%n", "x", "ln(x)", "S", "n");
    System.out.println("+------+---------------------+---------------------+------+");


    for (x = xp; x <= xk; x += dx) {
        n = 0;
        a = x - 1;
        S = a;

        do {
            n++;
            R = -((x - 1) * n) / (n + 1.0);
            a *= R;
            S += a;
        } while (Math.abs(a) >= eps);

        System.out.printf("|%5.2f |%20.10f |%20.10f |%5s |%n", x, Math.log(x), S, n);
        System.out.println("+------+---------------------+---------------------+------+");
    }
}