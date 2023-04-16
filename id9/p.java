package id9.p;
import erd.g;
import id9.t;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import j80.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kqb.g0;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.List;
import android.view.View;
import pi9.j;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.camera.record.sidebar.a;

public final class p implements g	// class@0027f6
{
    public final t b;

    public void p(t p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, t.class, "23")) {
       }else {
          a c = p0.c;
          if (c == 2 || c == 7) {
             c = p0.a;
             tb.p = c;
             tb.q = t.k2(c);
             if (tb.r == null) {
                p0 = t.i2(p0.a);
                if (p0 != null && p0.exists()) {
                   p0 = g.d(p0);
                   if (!TextUtils.x(p0)) {
                      p0 = new g0().b(p0);
                      if (p0 != null) {
                         Lyrics mLines = p0.mLines;
                         if (mLines != null && !mLines.isEmpty()) {
                            tb.r = p0;
                            a.a(tb.t.d(), tb.t.e(), tb.t.c(), tb.q, true);
                            tb.g2();
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
