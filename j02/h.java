package j02.h;
import androidx.lifecycle.Observer;
import j02.k;
import j02.o;
import java.lang.Object;
import k02.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import j02.l;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import j02.a$c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import j02.a;
import com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import java.lang.Integer;
import java.lang.Boolean;
import android.widget.ProgressBar;

public final class h implements Observer	// class@002a1d
{
    public final k b;
    public final o c;

    public void h(k p0,o p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       a$c b;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if((System.currentTimeMillis() - this.b.d) - 5000 > 0){
          b.P(l.a, "updateTimerInfo, progress:"+p0.a());
          this.b.d = System.currentTimeMillis();
       }
       if (p0.a() >= 1000 && (p0.d != null && p0.b() != null)) {
          b = a$c.b;
          String str = p0.b();
          a.m(str);
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(str, b, a$c.class, "2")) {
             a.p(str, "<set-?>");
             a$c.a = str;
          }
          this.c.A0(b);
       }
    label_0074 :
       k b1 = this.b.b;
       if (b1 != null) {
          int i = p0.a();
          p0 = p0.a;
          if (!PatchProxy.isSupport(LiveAudienceTreasureBoxWidgetView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Boolean.valueOf(p0), b1, LiveAudienceTreasureBoxWidgetView.class, "3")) {
             LiveAudienceTreasureBoxWidgetView g = b1.g;
             if (g == null) {
                a.S("watchTimeProgressView");
             }
             int i1 = (p0 != null)? 0: 8;
             g.setVisibility(i1);
             i1 = b1.g;
             if (i1 == null) {
                a.S("watchTimeProgressView");
             }
             i1.setProgress(i);
          }
       }
       return;
    }
}
