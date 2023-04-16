package nn1.j;
import androidx.lifecycle.Observer;
import nn1.m;
import java.lang.Object;
import kotlin.Triple;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class j implements Observer	// class@003389
{
    public final m b;

    public void j(m p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          String str = p0.component1();
          String str1 = p0.component2();
          p0 = p0.component3();
          int i = 0;
          int i1 = (str.length() > 0)? 1: 0;
          if (i1) {
             p0 = this.b.c;
             a.o(p0, "titleView");
             p0.setMaxLines(2);
             p0 = this.b.c;
             a.o(p0, "titleView");
             p0.setText(str);
          }else if(str1.length() > 0){
             i2 = 1;
          }else {
             i2 = 0;
          }
          if (i2) {
             p0 = this.b.c;
             a.o(p0, "titleView");
             p0.setMaxLines(2);
             p0 = this.b.c;
             a.o(p0, "titleView");
             p0.setText(str1);
          }else if(p0 != null){
             p0 = p0.getName();
          }else {
             p0 = null;
          }
          if (p0 != null) {
             if (p0.length() > 0) {
                i = 1;
             }
             if (i == 1) {
                m c = this.b.c;
                a.o(c, "titleView");
                c.setMaxLines(1);
                c = this.b.c;
                a.o(c, "titleView");
                c.setText('@'+p0);
             }
          }
       }
       return;
    }
}
