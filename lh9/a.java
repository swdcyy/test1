package lh9.a;
import lnc.a1;

public class a	// class@002de7
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static float d;

    static {
       int i = a1.e(0x43cf0000);
       a.a = i;
       a.b = a1.d(0x7f070f51);
       a.c = a1.d(0x7f070f50);
       a.d = (float)a1.h() / (float)i;
    }
    public static float a(){
       return ((float)a.c * a.d);
    }
}
