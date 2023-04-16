package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$f;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import oq5.a;
import am0.b;
import com.kuaishou.live.ad.social.u;

public final class LiveAdAudienceBellCardPresenter$f implements View$OnLayoutChangeListener	// class@0009f2
{
    public final LiveAdAudienceBellCardPresenter b;

    public void LiveAdAudienceBellCardPresenter$f(LiveAdAudienceBellCardPresenter p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(LiveAdAudienceBellCardPresenter$f.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, LiveAdAudienceBellCardPresenter$f.class, "1")) {
             return;
          }
       }
       LiveAdAudienceBellCardPresenter x = this.b.x;
       if (x != null) {
          a.m(x);
          if (!x.H2()) {
          label_0062 :
             if (this.b.R8().b()) {
                x = this.b.t;
                View view = null;
                View view1 = (x != null)? x.m(): view;
                if (a.g(p0, view1)) {
                   b uob = this.b.R8();
                   x = this.b.t;
                   if (x != null) {
                      view = x.m();
                   }
                   a.m(view);
                   uob.d(view);
                }
             }
          }
       }else {
          goto label_0062 ;
       }
       return;
    }
}
