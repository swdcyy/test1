package q0.f;
import android.view.LayoutInflater$Factory2;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.Window;
import android.view.ViewParent;
import a2.i0;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import q0.g;
import org.xmlpull.v1.XmlPullParser;
import androidx.appcompat.widget.j;
import androidx.appcompat.app.b;

public class f implements LayoutInflater$Factory2	// class@002943
{
    public g b;
    public static final boolean c;

    static {
       f.c = false;
    }
    public void f(){
       super();
    }
    public final boolean a(View p0){
       if (p0 == null) {
          return false;
       }
       Activity uActivity = n.d(p0);
       if (uActivity != null && uActivity.getWindow() != null) {
          ViewParent decorView = uActivity.getWindow().getDecorView();
          while (true) {
             if (p0 == null) {
                return true;
             }
             if (p0 == decorView || (p0 instanceof View && !i0.X(p0))) {
                ViewParent parent = p0.getParent();
             }
          }
       }
       return false;
    }
    public View onCreateView(View p0,String p1,Context p2,AttributeSet p3){
       boolean b1;
       if (this.b == null) {
          this.b = new g();
       }
       boolean c = f.c;
       boolean b = false;
       if (c) {
          int i = 1;
          if (p3 instanceof XmlPullParser) {
             if (p3.getDepth() > i) {
                b = true;
             }
          }else {
             b = this.a(p0);
          }
          b1 = b;
       }else {
          b1 = false;
       }
       return this.b.createView(p0, p1, p2, p3, b1, c, true, false);
    }
    public View onCreateView(String p0,Context p1,AttributeSet p2){
       return this.onCreateView(null, p0, p1, p2);
    }
}
