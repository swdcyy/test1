package com.kuaishou.live.core.show.luckystar.openresult.b$a;
import sfc.a;
import com.kuaishou.live.core.show.luckystar.openresult.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.luckystar.util.b;
import java.util.Objects;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.Integer;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import mkc.b;
import android.view.View;
import mkc.c;
import ec2.e;
import java.lang.Runnable;

public class b$a extends a	// class@000ce2
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       int i;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       super.b(p0);
       b$a tc = this.c;
       String str = b.f(p0);
       Objects.requireNonNull(tc);
       b uob = b.class;
       if (!PatchProxy.applyVoidOneRefs(str, tc, uob, "9")) {
          if (!PatchProxy.applyVoid(null, tc, uob, "11")) {
             i = 4;
             tc.r.setVisibility(i);
             tc.w.setVisibility(i);
             tc.s.setVisibility(i);
             tc.t.setVisibility(i);
             tc.v.setVisibility(i);
          }
          i = 0;
          b = true;
          if (tc.y == null) {
             LiveLuckyStarLogger.o(tc.p.a.a(), tc.z, tc.A, Integer.valueOf(i));
             tc.y = b;
          }
          b[] uobArray = new b[b];
          uobArray[i] = b.d;
          c.d(tc.q, uobArray);
          b.i(tc.q, str, new e(tc));
       }
       return;
    }
}
