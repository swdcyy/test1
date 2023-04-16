package b2.b;
import android.view.accessibility.AccessibilityEvent;

public final class b	// class@000aba
{
    public static final int a = 128;
    public static final int b = 256;
    public static final int c = 512;
    public static final int d = 1024;
    public static final int e = 2048;
    public static final int f = 4096;
    public static final int g = 8192;

    public static int a(AccessibilityEvent p0){
       return p0.getContentChangeTypes();
    }
    public static void b(AccessibilityEvent p0,int p1){
       p0.setContentChangeTypes(p1);
    }
}
