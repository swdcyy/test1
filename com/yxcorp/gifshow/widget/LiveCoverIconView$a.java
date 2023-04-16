package com.yxcorp.gifshow.widget.LiveCoverIconView$a;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.LiveCoverIconView$e;

public class LiveCoverIconView$a implements LiveCoverIconView$f	// class@001875
{
    public final LiveCoverIconView$f a;
    public final LiveCoverIconView b;

    public void LiveCoverIconView$a(LiveCoverIconView p0,LiveCoverIconView$f p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveCoverIconView$a.class, "2")) {
          return;
       }
       this.b.Q().a();
       LiveCoverIconView$a ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, LiveCoverIconView$a.class, "1")) {
          return;
       }
       LiveCoverIconView$a ta = this.a;
       if (ta != null) {
          ta.onSuccess();
       }
       return;
    }
}
