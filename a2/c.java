package a2.c;
import a2.c$a;
import java.lang.Object;
import z1.h;
import android.content.ClipData;
import java.lang.String;
import java.lang.StringBuilder;

public final class c	// class@000051
{
    public final ClipData a;
    public final int b;
    public final int c;
    public final Uri d;
    public final Bundle e;

    public void c(c$a p0){
       super();
       c$a a = p0.a;
       h.g(a);
       this.a = a;
       a = p0.b;
       h.c(a, 0, 3, "source");
       this.b = a;
       a = p0.c;
       h.f(a, 1);
       this.c = a;
       this.d = p0.d;
       this.e = p0.e;
    }
    public static String a(int p0){
       if (p0 & 0x01) {
          return "FLAG_CONVERT_TO_PLAIN_TEXT";
       }
       return String.valueOf(p0);
    }
    public static String b(int p0){
       if (!p0) {
          return "SOURCE_APP";
       }
       if (p0 == 1) {
          return "SOURCE_CLIPBOARD";
       }
       if (p0 == 2) {
          return "SOURCE_INPUT_METHOD";
       }
       if (p0 != 3) {
          return String.valueOf(p0);
       }
       return "SOURCE_DRAG_AND_DROP";
    }
    public String toString(){
       return "ContentInfoCompat{clip="+this.a+", source="+c.b(this.b)+", flags="+c.a(this.c)+", linkUri="+this.d+", extras="+this.e+"}";
    }
}
