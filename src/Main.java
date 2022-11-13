public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        byte numberOne = 127;
        System.out.println("Значение переменной numberOne с типом byte равно " + numberOne);
        short numberTwo = 32767;
        System.out.println("Значение переменной numberTwo с типом short равно " + numberTwo);
        int numberThree = 1992949983;
        System.out.println("Значение переменной numberThree с типом int равно " + numberThree);
        long numberFour = 89548245474654L;
        System.out.println("Значение переменной numberFour с типом long равно " + numberFour);
        float numberFive = 31.567F;
        System.out.println("Значение переменной numberFive с типом float равно " + numberFive);
        double numberSix = 205.1975;
        System.out.println("Значение переменной numberSix с типом double равно " + numberSix);
        // Задание 2
        System.out.println("Задание 2");
        byte a = 67;
        System.out.println(a);
        short b = 27897;
        System.out.println(b);
        int c = -159;
        System.out.println(c);
        long d = 987678965549L;
        System.out.println(d);
        float e = 27.12F;
        System.out.println(e);
        double g = 2.786;
        System.out.println(g);
        char h = 569;
        System.out.println(h);
        boolean Q = false;
        // Задание 3
        System.out.println("Задание 3");
        int ludaPavlovna = 23;
        System.out.println(ludaPavlovna + " учеников у Людмилы Павловны");
        int annaSergeevna = 27;
        System.out.println(annaSergeevna + " учеников у Анны Сергеевны");
        int katyaAndreevna = 30;
        System.out.println(katyaAndreevna + " учкников у Екатерины Андреевны");
        int paperAll = 480;
        System.out.println(paperAll + " листов бумаги на всех учеников");
        System.out.println("На каждого ученика рассчитано " + paperAll / (ludaPavlovna + annaSergeevna + katyaAndreevna) + " листов бумаги");
        // Задание 4
        System.out.println("Задание 4");
        int machineWork = 16;
        int machineTime = 2;
        machineWork = machineWork / machineTime;
        System.out.println(machineWork + " Производительность машины за 1 минуту");
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут, машина произвела бутылок " + machineWork * twentyMinutes + " штук");
        int oneDay = 24 * 60;
        System.out.println("За сутки, машина произвела бутылок " + machineWork * oneDay + " штук");
        int threeDay = oneDay * 3;
        System.out.println("За 3 дня, машина произвела бутылок " + machineWork * threeDay + " штук");
        long workMonth = oneDay * 30;
        System.out.println("За один месяц, машина произвела бутылок " + machineWork * workMonth + " штук");
        // Задание 5
        System.out.println("Задание 5");
        int paintAll = 120;
        System.out.println(paintAll + " банок краски всего куплено");
        int paintWhite = 2;
        System.out.println(paintWhite + " банки белой краски на один класс");
        int paintBrown = 4;
        System.out.println(paintBrown + " банки коричневой краски на один класс");
        int allClass = paintAll / (paintWhite + paintBrown);
        System.out.println(allClass + " Всего классов в школе");
        int allWhite = allClass * paintWhite;
        int allBrown = allClass * paintBrown;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
        // 6 Задание
        System.out.println("Задание 6");
        int bananas = 80;
        System.out.println(bananas + " гр 1 банан");
        int milk = 105;
        System.out.println(milk + " гр 100 мл молока");
        int iceCream = 100;
        System.out.println(iceCream + " гр 1 брикет мороженного");
        int eggs = 70;
        System.out.println(eggs + " гр 1 яйцо");
        int sportBreakfast = (bananas * 5) + (milk * 2) + (iceCream * 2) + (eggs * 4);
        System.out.println(sportBreakfast + " гр спорт-завтрака");
        double sportBreakfast2 = sportBreakfast * 0.001;
        System.out.println(sportBreakfast2 + " кг спортзавтрака");
        // задание 7
        System.out.println("Задание 7");
        double needLose = 7;
        System.out.println(needLose + " килограмм надо сбросить спортсмену");
        needLose = needLose * 1000;
        System.out.println(needLose + " грамм надо сбросить спортсмену");
        double gramLose1 = 250;
        double gramLose2 = 500;
        System.out.println(needLose / gramLose1 + " дней понадобится спотсмену чтобы сбросить 7 кг");
        System.out.println(needLose / gramLose2 + " дней понадобится спортсмену чтобы сбросить 7 кг");
        System.out.println((28 + 14) / 2 + " таково среднее количестра дней для похудения спортсмена");
        // Задание 8
        System.out.println("Задание 8");
        double workerMasha = 67760;
        double workerDenis = 83690;
        double workerKristina = 76230;
        System.out.println("Маша теперь получает " + (workerMasha + (workerMasha * 0.1)) + " рублей. Годовой доход вырос на " + ((workerMasha * 0.1) * 12) + " рублей");
        System.out.println("Денис теперь получает " + (workerDenis + (workerDenis * 0.1)) + " рублей. Годовой доход вырос на " + ((workerDenis * 0.1) * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (workerKristina + (workerKristina * 0.1)) + " рублей. Годовой доход вырос на " + ((workerKristina * 0.1) * 12) + " рублей");






    }
}