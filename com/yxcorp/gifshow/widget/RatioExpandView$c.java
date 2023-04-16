package com.yxcorp.gifshow.widget.RatioExpandView$c;
import tyc.y4;
import com.yxcorp.gifshow.widget.RatioExpandView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import tyc.x4;

public class RatioExpandView$c implements y4	// class@0018a9
{
    public final RatioExpandView a;

    public void RatioExpandView$c(RatioExpandView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       RatioExpandView$c uoc = RatioExpandView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (p0 < this.a.j.getChildCount()) {
          uoc = this.a;
          uoc.b = p0;
          RatioExpandView m = uoc.m;
          uoc.l = m;
          m.b();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RatioExpandView$c.class, "1")) {
          return;
       }
       if (this.a.isShown()) {
          RatioExpandView$c ta = this.a;
          if (ta.c != null && ta.d != null) {
             ta.a();
             RatioExpandView p = this.a.p;
             if (p != null) {
                p.a(false);
             }
          }else {
          label_002c :
             this.a.d(false);
          }
       }else {
          goto label_002c ;
       }
       return;
    }
}
