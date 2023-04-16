package ata.d$e;
import fr6.i;
import ata.d;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.model.kcube.TabViewInfo$TabLottie;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import oe6.g;

public final class d$e implements i	// class@0002fb
{
    public final d a;

    public void d$e(d p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       d$e uoe = d$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       a.p(p0, "t");
       h.c(this, p0, p1);
       d$e ta = this.a;
       StringBuilder obj = null;
       d.f(ta, a.g(p0, ta.k), false, 2, obj);
       d$e ta1 = this.a;
       Objects.requireNonNull(ta1);
       if (!PatchProxy.applyVoid(obj, ta1, d.class, "11") && ta1.a != null) {
          d c = ta1.c;
          if (c == null) {
             a.S("mTabLottie");
          }
          c = ta1.g(c.mId);
          d c1 = ta1.c;
          if (c1 == null) {
             a.S("mTabLottie");
          }
          if (c < c1.mLottieDisplayMaxCount) {
             c++;
             ta1.f = Integer.valueOf(c);
             SharedPreferences$Editor uEditor = n.b().edit();
             obj = "activity_tab_lottie_play_";
             d c2 = ta1.c;
             if (c2 == null) {
                a.S("mTabLottie");
             }
             g.a(uEditor.putInt(obj+c2.mId, c));
          }
       }
    label_008b :
       return;
    }
}
