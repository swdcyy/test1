package nc.a;
import com.facebook.imageformat.a;
import java.lang.String;

public final class a	// class@001f27
{
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static ImmutableList m;

    static {
       a.a = new a("JPEG", "jpeg");
       a.b = new a("PNG", "png");
       a.c = new a("GIF", "gif");
       a.d = new a("BMP", "bmp");
       a.e = new a("ICO", "ico");
       a.f = new a("WEBP_SIMPLE", "webp");
       a.g = new a("WEBP_LOSSLESS", "webp");
       a.h = new a("WEBP_EXTENDED", "webp");
       a.i = new a("WEBP_EXTENDED_WITH_ALPHA", "webp");
       a.j = new a("WEBP_ANIMATED", "webp");
       a.k = new a("HEIF", "heif");
       a.l = new a("DNG", "dng");
    }
    public static boolean a(a p0){
       boolean b = (p0 != a.f && (p0 != a.g && (p0 == a.h || p0 == a.i)))? true: false;
       return b;
    }
}
