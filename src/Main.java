public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int salary = 15_000;
        int totalAmount = 0;
        int month = 0;

        while (totalAmount <= 2_459_000) {
            totalAmount += totalAmount / 100;
            totalAmount += salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalAmount + " рублей");
        }

        //Task 2
        System.out.println("Task 2");
        int count = 1;

        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }

        count --;   //выглядит как костыли. не придумал дргуой способ привести count к 10

        System.out.println();
        for (int i = count; count > 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println();


        //Task 3
        System.out.println("Task 3");
        int birthRate = 17;
        int mortalityRate = 8;
        int populationSize = 12_000_000;
        int counter = 0;

        while (counter < 10) {
            populationSize += (populationSize * (birthRate - mortalityRate))/ 1000;
            counter ++;
            System.out.println("Год " + counter + ", численность населения составляет " + populationSize);
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        int salaryVasiliy = 15_000;
        int totalVasiliy = 0;
        int monthVasiliy = 0;

        while (totalVasiliy < 12_000_000) {
            totalVasiliy += (totalVasiliy / 100) * 7;
            totalVasiliy += salaryVasiliy;
            monthVasiliy ++;

            System.out.println("Месяц " + monthVasiliy + ", сумма накоплений Василия равна " + totalVasiliy + " рублей");
        }


        //Task 5
        System.out.println("Task 5");
        int salaryVasiliy2 = 15_000;
        int totalVasiliy2 = 0;
        int monthVasiliy2 = 0;

        while (totalVasiliy2 < 12_000_000) {
            totalVasiliy2 += (totalVasiliy2 / 100) * 7;
            totalVasiliy2 += salaryVasiliy2;
            monthVasiliy2 ++;

            if (monthVasiliy2 % 6 == 0) {
                System.out.println("Месяц " + monthVasiliy2 + ", сумма накоплений Василия равна " + totalVasiliy2 + " рублей");
            }
        }
        /*
        не очень понятно из условия задачи надо ли переписывать основную часть кода, или просто выдергивать каждый 6-ой
        месяц из Задания 5. Я выбрал переписать код с другими переменными
         */

        //Task 6
        System.out.println("Task 6");
        int salaryVasiliy3 = 15_000;
        int totalVasiliy3 = 0;
        int monthVasiliy3 = 0;

        while (monthVasiliy3 <= 9 * 12) {
            totalVasiliy3 += (totalVasiliy3 / 100) * 7;
            totalVasiliy3 += salaryVasiliy3;
            monthVasiliy3 ++;

            if (monthVasiliy3 % 6 == 0) {
                System.out.println("Месяц " + monthVasiliy3 + ", сумма накоплений Василия равна " + totalVasiliy3 + " рублей");
            }
        }

        //Task 7
        System.out.println("Task 7");
        int friday = 3;
        int daysPerMonth = 31;

        while (friday < daysPerMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        //Task 8
        System.out.println("Task 8");
        int cometArrival = 79;
        int currentYear = 0;
        int yearMinus200 = 2024 - 200;
        int yearPlus100 = 2024 + 100;

        while (currentYear <= yearPlus100) {
            currentYear += cometArrival;
            if (currentYear >= yearMinus200 && currentYear <= yearPlus100) {
                System.out.println(currentYear);
            }
        }
        System.out.println(); //кажется, сюда просили добавлять нпереход на новую строку
    }
}


