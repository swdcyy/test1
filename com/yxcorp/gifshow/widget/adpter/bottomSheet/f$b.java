package com.yxcorp.gifshow.widget.adpter.bottomSheet.f$b;
import ekd.f$i;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;

public class f$b extends f$i	// class@0018f4
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       this.b.c.p1();
       return;
    }
}
