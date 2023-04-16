package com.kuaishou.live.core.show.hourlytrank.g;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2$a;
import com.kuaishou.live.core.show.hourlytrank.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;

public class g implements LiveHourlyRankTempViewV2$a	// class@000c11
{
    public final f a;

    public void g(f p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, "10")) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          if (ta.s != null) {
             layoutParams.leftMargin = a1.d(0x7f07025d);
          }else {
             layoutParams.topMargin = 0;
             layoutParams.leftMargin = a1.d(0x7f07025d);
          }
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
}
