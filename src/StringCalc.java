public class StringCalc {

    public static String add(String first, String second) {
        StringBuilder builder = new StringBuilder();
        String min = first.length() < second.length() ? first : second;
        String max = first.length() < second.length() ? second : first;
        char minChar;
        char maxChar;
        int curState = 0;
        int tempState = 0;

        for (int i = min.length() - 1; i >= 0; i--) {
            minChar = min.charAt(i);
            maxChar = max.charAt(i + max.length() - min.length());

            if (maxChar == minChar) {
                curState = tempState;
                switch (maxChar) {
                    case ('0') :
                        tempState = 0;
                        break;
                    case ('1') :
                        tempState = 1;
                }
            } else {
                curState = (1 + tempState) % 2;
            }
            builder.append(curState);
        }

        for(int i = max.length() - min.length() - 1; i >= 0; i--) {
            maxChar = max.charAt(i);
            if (maxChar == (char)('0' + tempState)) {
                curState = 0;
                switch (maxChar) {
                    case ('0'):
                        tempState = 0;
                        break;
                    case ('1'):
                        tempState = 1;
                }
            } else {
                curState = 1;
                tempState = 0;
            }
            builder.append(curState);
        }
        if (tempState == 1) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }
}
