class Main{
    Scanner scanner =  new Scanner(System.in);
    double balance;
    boolean isRunning = true;
    int choice;

    System.out.println("*****************");
    System.out.println("Banking Program");
    System.out.println("*****************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    System.out.println("*****************");

    System.out.print("Enter your choice (1-4): ");
    choice = scanner.nextInt();

    switch(choice){

        case 1: System.out.println("SHOW BALANCE");
        case 2: System.out.println("DEPOSIT");
        case 3: System.out.println("Withdraw");
        case 4: isRunning = false;

    }
}