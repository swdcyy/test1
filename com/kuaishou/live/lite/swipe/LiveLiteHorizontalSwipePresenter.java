package com.kuaishou.live.lite.swipe.LiveLiteHorizontalSwipePresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import od3.a;
import or5.d;
import xp5.i;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;

public class LiveLiteHorizontalSwipePresenter extends d	// class@000b76
{
    public d v;
    public i w;

    public void LiveLiteHorizontalSwipePresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteHorizontalSwipePresenter.class, "2")) {
          return;
       }
       super.F8();
       this.P8().xg(new a(this.v, this.w));
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHorizontalSwipePresenter.class, "1")) {
          return;
       }
       this.v = p0.a(d.class);
       this.w = p0.a(i.class);
       return;
    }
}
