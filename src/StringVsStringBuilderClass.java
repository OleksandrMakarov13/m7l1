public class StringVsStringBuilderClass {
    public static void main(String[] args) {

        long builderStart = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            builder.append(i);
        }
        builder.toString();
        long builderEnd = System.nanoTime();

        System.out.println("builderEnd - builderStart = " + (builderEnd - builderStart));


        long bufferStart = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            buffer.append(i);
        }
        buffer.toString();
        long bufferEnd = System.nanoTime();

        System.out.println("(bufferEnd - bufferStart) = " + (bufferEnd - bufferStart));

        long stringStart = System.nanoTime();
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s.concat(String.valueOf(i));
        }
        buffer.toString();
        long stringEnd = System.nanoTime();

        System.out.println("(stringEnd - stringStart with concat ) = " + (stringEnd - stringStart));

        long stringStart1 = System.nanoTime();
        String s1 = "";
        for (int i = 0; i < 1000000; i++) {
            s1 +=i;
        }
        buffer.toString();
        long stringEnd1 = System.nanoTime();

        System.out.println("(stringEnd1 - stringStart1 with + ) = " + (stringEnd1 - stringStart1));


    }
}
