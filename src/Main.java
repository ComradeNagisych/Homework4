public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        age = 17;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача №2");
        int weather = -8;
        if (weather < -5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        }
        weather = 8;
        if (weather > 5) {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки");
        }
        System.out.println("Задача №3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        speed = 50;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println("Задача №4");
        int age2 = 4;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить на работу");
        }
        age2 = 8;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить на работу");
        }
        age2 = 20;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить на работу");
        }
        age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить на работу");
        }
        System.out.println("Задача №5");
        int age3 = 4;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему нельзя кататься на аттракционе");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        age3 = 8;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему нельзя кататься на аттракционе");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        age3 = 15;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему нельзя кататься на аттракционе");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача №6");
        int totalCapacity = 102;
        int seats = 60;
        int ticketNumber = 8;
        boolean seatAvailable = ticketNumber <= seats;
        boolean standAvailable = ticketNumber > seats && ticketNumber <= totalCapacity;
        System.out.println("При номере билета " + ticketNumber);
        if (seatAvailable) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (standAvailable) {
            System.out.println("В вагоне нет свободных сидячих мест, но есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        ticketNumber = 88;
        seatAvailable = ticketNumber <= seats;
        standAvailable = ticketNumber > seats && ticketNumber <= totalCapacity;
        System.out.println("При номере билета " + ticketNumber);
        if (seatAvailable) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (standAvailable) {
            System.out.println("В вагоне нет свободных сидячих мест, но есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        ticketNumber = 108;
        seatAvailable = ticketNumber <= seats;
        standAvailable = ticketNumber > seats && ticketNumber <= totalCapacity;
        System.out.println("При номере билета " + ticketNumber);
        if (seatAvailable) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (standAvailable) {
            System.out.println("В вагоне нет свободных сидячих мест, но есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задача №7");
        int one = 8;
        int two = 4;
        int three = 45;
        System.out.println("При исходных числах " + one + ", " + two + " и " + three);
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (one > two || one < two && one < three || two < three) {
            System.out.println("Число " + three + " больше остальных");
        } else if (one < two && two > three) {
            System.out.println("Число " + two + " больше остальных");
        }
        three = 6;
        System.out.println("При исходных числах " + one + ", " + two + " и " + three);
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (one > two || one < two && one < three || two < three) {
            System.out.println("Число " + three + " больше остальных");
        } else if (one < two && two > three) {
            System.out.println("Число " + two + " больше остальных");
        }
        two = 10;
        System.out.println("При исходных числах " + one + ", " + two + " и " + three);
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (one > two || one < two && one < three || two < three) {
            System.out.println("Число " + three + " больше остальных");
        } else if (one < two && two > three) {
            System.out.println("Число " + two + " больше остальных");
        }
    }
}
