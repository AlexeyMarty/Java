package HW_1_1;

public class HW_1_1 {
    public static void main(String[] args) {
        String vowels = "aouiey";
        String str = "bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb\n" +
                "    quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s\n" +
                "    pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag\n" +
                "    xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx\n" +
                "    v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba\n" +
                "    auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk\n" +
                "    cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd\n" +
                "    vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob\n" +
                "    rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf\n" +
                "    nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan\n" +
                "    a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv\n" +
                "    hikmyxfw ri l to o ji jyirjqrf  hdsncempvq\n" +
                "    ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh\n" +
                "    ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk\n" +
                "    mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa\n" +
                "    watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb\n" +
                "    utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs";

        calcOfVowels(str, vowels);
    }

    //разделяем текст по символу \n на массив строк и создаем локальные массивы символов
    public static void calcOfVowels(String str, String vowels) {
        String[] stringSplits = str.split("\n");
        char[] vowelLocal = vowels.toCharArray();

        for (int i = 0; i < stringSplits.length; i++) {
            int count = 0;
            char[] temp = stringSplits[i].toCharArray();
            count = splitString(temp, vowelLocal, count);
            System.out.println("В строке " + (i + 1) + ": " + count + " гласных.");
        }

    }

    //сравниваем  два массива на схожесть символов
    public static int splitString(char[] letterOfText, char[] vowelArr, int count) {
        for (char letter : letterOfText) {
            for (char vowel : vowelArr) {
                if (vowel == letter) {
                    count++;
                }
            }
        }
        return count;
    }
}
