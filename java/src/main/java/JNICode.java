
public class JNICode {
    static {
        System.loadLibrary("GradleCppTest");
    }

    public static native int doThing();
    public static native int doThing23();
}
