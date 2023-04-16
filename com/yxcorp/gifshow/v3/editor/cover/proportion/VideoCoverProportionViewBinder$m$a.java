package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.a;
import qrd.l1;

public final class VideoCoverProportionViewBinder$m$a implements Runnable	// class@000ead
{
    public final VideoCoverProportionViewBinder$m b;

    public void VideoCoverProportionViewBinder$m$a(VideoCoverProportionViewBinder$m p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$m$a.class, "1")) {
          return;
       }
       VideoCoverProportionViewBinder$m c = this.b.c;
       if (c != null) {
          c.invoke();
       }
       return;
    }
}
