package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import qkd.b;
import msd.a;
import qrd.l1;

public final class VideoCoverProportionViewBinder$m$b implements Runnable	// class@000eae
{
    public final VideoCoverProportionViewBinder$m b;

    public void VideoCoverProportionViewBinder$m$b(VideoCoverProportionViewBinder$m p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$m$b.class, "1")) {
          return;
       }
       b.q(this.b.d);
       VideoCoverProportionViewBinder$m c = this.b.c;
       if (c != null) {
          c.invoke();
       }
       return;
    }
}
