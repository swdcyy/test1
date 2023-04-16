package c30.g;
import e30.b;
import com.kuaishou.cover.container.loader.b;
import java.lang.Object;
import com.kuaishou.cover.pop.PopItemParams;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;

public final class g implements b	// class@0002ea
{
    public final b a;

    public void g(b p0){
       this.a = p0;
    }
    public final void a(PopItemParams p0){
       g ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          if (TextUtils.isEmpty(p0.b)) {
             ta.e = p0.b;
          }
          PopItemParams a = p0.a;
          if (a > 0) {
             ta.d = a;
          }
          a = p0.c;
          if (a != null && a.size() > 0) {
             ta.f = p0.c;
          }
       }
    label_002b :
       ta.e();
       return;
    }
}
