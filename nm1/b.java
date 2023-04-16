package nm1.b;
import java.lang.Object;

public class b	// class@003370
{
    public final byte[] a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public static final char[] e;
    public static final char[] f;
    public static final byte[] g;
    public static final b h;
    public static final b i;
    public static final b j;

    static {
       b.e = new char[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       b.f = new char[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
       byte[] uobyteArray = new byte[2]{0x0d,0x0a};
       b.g = uobyteArray;
       b.h = new b(false, null, -1, true);
       b.i = new b(true, null, -1, true);
       b.j = new b(false, uobyteArray, 76, true);
    }
    public void b(boolean p0,byte[] p1,int p2,boolean p3){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
       this.d = p3;
    }
}
