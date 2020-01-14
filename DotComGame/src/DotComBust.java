

import java.util.ArrayList;

public class DotComBust {
    /*
    Объявляем и инициализируем необходимые переменные
     */
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses;


    private void setUpGame() {
        /*
        Создаем три объекта DotCom, даем им имена и помещаем в ArrayList
         */
        DotCom one = new DotCom();
        one.setName("Geek.com");
        DotCom two = new DotCom();
        two.setName("Pets.com");
        DotCom three = new DotCom();
        three.setName("Toys.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        /*
        Выводим краткие инструкции для пользователей
         */
        System.out.println("Ваша цель - потопить три \"сайта\".");
        System.out.println("Geek.com, Pets.com, Toys.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        //повторяем с каждым объектом DotCom в списке
        for (DotCom dotComToSet : dotComList) {
            //запрашиваем у вспомогательного объекта адрес сайта
            ArrayList<String> newLocation = helper.placeDotCom(3);
            //Вызываем сеттер из объекта DotCom, чтобы передать ему местоположение, которое полько что получили от вспомогательного объекта
            dotComToSet.setLocationCells(newLocation);
        }

    }

    private void startPlaying() {
        //До тех пор пока список DotCom не станет пустым
        while (!dotComList.isEmpty()) {
            //получаем пользовательский ход
            String userGuess = helper.getUserInput("Сделай ход");
            //Вызываем наш метод checkUserGuess
            checkUserGuess(userGuess);
        }
        //Вызываем наш метод finishGame
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        //инкрементируем количество попыток, которые сделал пользователь
        numOfGuesses++;
        //подразумеваем промах пока не выяснили обратного
        String result = "мимо";

        //Повторяем это для всех объектов DotCom в списке
        for (DotCom dotComToTest : dotComList) {
            //просим DotCom проверить ход пользователя, ищем попадание(или потопление)
            result = dotComToTest.checkYourSelf(userGuess);
            if (result.equals("попал")) {
                //выбираемся из цикла раньше времени, т.к. нет смысла проверять другие сайты
                break;
            }
            if (result.equals("потопил")) {
                //удаляем сайт из списка
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        //Выводим сообщение о том как пользователь прошел игру
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ниего не стоят");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        //Создаем игровой объект
        DotComBust game = new DotComBust();
        //Говорим игровому объекту подготовить игру
        game.setUpGame();
        //Говорим игровому объекту начать главный игровой цикл
        game.startPlaying();
    }
}

