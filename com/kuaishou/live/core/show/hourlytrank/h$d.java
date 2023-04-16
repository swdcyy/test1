package com.kuaishou.live.core.show.hourlytrank.h$d;
import com.kuaishou.live.core.show.hourlytrank.a$a;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import android.view.View$OnClickListener;
import android.view.View;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankPendantView;

public class h$d implements a$a	// class@000c15
{
    public final h a;

    public void h$d(h p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       uod = this.a;
       uod.p = p0;
       if (uod.q != null || p0 == 1) {
          uod.s.setVisibility(0);
          this.a.r.setVisibility(8);
          View currentView = this.a.r.getCurrentView();
          if (currentView instanceof LiveHourlyRankPendantView) {
             this.a.s.setOnClickListener(currentView.getPendantViewClickListener());
          }
       }else {
          uod.s.setVisibility(8);
          this.a.r.setVisibility(0);
          this.a.s.setOnClickListener(null);
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, h$d.class, "1")) {
          return;
       }
       this.a.b9();
       return;
    }
}
