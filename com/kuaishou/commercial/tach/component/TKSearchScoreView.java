package com.kuaishou.commercial.tach.component.TKSearchScoreView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.m;
import java.lang.Float;
import java.lang.Integer;

public class TKSearchScoreView extends e	// class@001663
{

    public void TKSearchScoreView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKSearchScoreView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-1226859321).b(p0);
    }
    public void setScore(float p0){
       TKSearchScoreView tKSearchScor = TKSearchScoreView.class;
       if (PatchProxy.isSupport(tKSearchScor) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKSearchScor, "2")) {
          return;
       }
       d.a(-1226859321).u40(this.getView(), p0);
       return;
    }
    public void setScoreLevel(int p0){
       TKSearchScoreView tKSearchScor = TKSearchScoreView.class;
       if (PatchProxy.isSupport(tKSearchScor) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScor, "3")) {
          return;
       }
       d.a(-1226859321).gn(this.getView(), p0);
       return;
    }
    public void setStarSize(int p0){
       TKSearchScoreView tKSearchScor = TKSearchScoreView.class;
       if (PatchProxy.isSupport(tKSearchScor) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKSearchScor, "4")) {
          return;
       }
       d.a(-1226859321).yI(this.getView(), p0);
       return;
    }
}
