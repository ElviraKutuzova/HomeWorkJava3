package Lesson4;

import java.util.List;

public class Task1 {

    public static void main(String[] ags) throws InterruptedException {
        System.out.println("Стартуем задание!");

        List<Thread> printers = List.of(
                new Thread(new PrinterLetter( Letter.A) :: print),
                new Thread(new PrinterLetter( Letter.B) :: print),
                new Thread(new PrinterLetter( Letter.C) :: print)
        );
        printers.forEach(Thread::start);
        for(Thread printer : printers){
            printer.join();
        }
        System.out.println("\nЗадание выполнено!");
    }
}
