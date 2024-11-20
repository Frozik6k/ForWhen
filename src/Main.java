public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000){
            sum = sum + 15000;
            month+=1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }


        System.out.println();
        System.out.println("Задача №2");
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i+=1;
        }
        System.out.println();
        for (i = 10; i >= 1; i-=1){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача №3");
        int peopleY = 12_000_000;
        for (int year = 1; i <= 10; i+=1){
            peopleY = peopleY + peopleY/1000*(17-8);
            System.out.println("Год " + year + ", численность населения состовляет " + peopleY);
        }

        System.out.println();
        System.out.println("Задача №4");
        double deposit = 15000;
        month = 1;
        while (deposit <= 12_000_000){
            deposit = deposit + deposit*0.07f + 15000;
            deposit = Math.round(deposit * 100.0) / 100.0;
            System.out.println("Месяц " + month + ", сумма накоплений " + deposit + " рублей");
            month+=1;
        }

        System.out.println();
        System.out.println("Задача №5");
        deposit = 15000;
        month = 1;
        while (deposit <= 12_000_000){
            deposit = deposit + deposit*0.07f + 15000;
            deposit = Math.round(deposit * 100.0) / 100.0;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit + " рублей");
            month+=1;
        }

        System.out.println();
        System.out.println("Задача №6");
        deposit = 15000;
        for (month = 1; month <= 9*12; month+=1){
            deposit = deposit + deposit*0.07f + 15000;
            deposit = Math.round(deposit * 100.0) / 100.0;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit + " рублей");
        }

        System.out.println();
        System.out.println("Задача №7");
        int friday = 2;
        for (int day = friday; day <= 31; day+=7){
            System.out.println("Сегодня пятница, " + day + "-у число. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("Задача №8");
        int startYear = 1824;
        int endYear = 2124;
        for (int year = startYear; year <= endYear; year+=1){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }

    }
}