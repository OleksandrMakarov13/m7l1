public class StringVsStringBuilderClass {
    public static void main(String[] args) {

        long builderStart = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("1");
        }
        builder.toString();
        long builderEnd = System.nanoTime();

        System.out.println("builderEnd-builderStart = " + (builderEnd - builderStart));


        long bufferStart = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            buffer.append("1");
        }
        buffer.toString();
        long bufferEnd = System.nanoTime();

        System.out.println("(bufferEnd - builderStart) = " + (bufferEnd - bufferStart));

        long stringStart = System.nanoTime();
        String s = "";
        for (int i = 0; i < 100; i++) {
            s.concat("1");
        }
        buffer.toString();
        long stringEnd = System.nanoTime();

        System.out.println("(stringEnd - stringStart) = " + (stringEnd - stringStart));

        long stringStart1 = System.nanoTime();
        String s1 = "";
        for (int i = 0; i < 100; i++) {
            s1 +="1";
        }
        buffer.toString();
        long stringEnd1 = System.nanoTime();

        System.out.println("(stringEnd1 - stringStart1) = " + (stringEnd1 - stringStart1));


    }
}
