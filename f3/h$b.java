package f3.h$b;
import f3.h$f;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import o1.g;
import f3.a;
import android.content.res.TypedArray;
import p1.d$b;
import p1.d;

public class h$b extends h$f	// class@001fc6
{

    public void h$b(){
       super();
    }
    public void h$b(h$b p0){
       super(p0);
    }
    public void e(Resources p0,AttributeSet p1,Resources$Theme p2,XmlPullParser p3){
       if (!g.j(p3, "pathData")) {
          return;
       }
       TypedArray typedArray = g.k(p0, p2, p1, a.d);
       this.f(typedArray, p3);
       typedArray.recycle();
       return;
    }
    public final void f(TypedArray p0,XmlPullParser p1){
       String str = p0.getString(0);
       if (str != null) {
          this.b = str;
       }
       str = p0.getString(1);
       if (str != null) {
          this.a = d.d(str);
       }
       this.c = g.g(p0, p1, "fillType", 2, 0);
       return;
    }
}
