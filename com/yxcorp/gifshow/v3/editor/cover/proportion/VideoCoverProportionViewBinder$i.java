package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$i;
import uv8.i2;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.widget.FrameLayout;
import uv8.h2;

public final class VideoCoverProportionViewBinder$i implements i2	// class@000ea7
{
    public final VideoCoverProportionViewBinder a;

    public void VideoCoverProportionViewBinder$i(VideoCoverProportionViewBinder p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$i.class, "1")) {
          return;
       }
       RatioExpandView ratioExpandV = this.a.L();
       if (ratioExpandV != null && (ratioExpandV.isShown() && ratioExpandV.getExpand())) {
          ratioExpandV.a();
       }
    label_0023 :
       return;
    }
    public void b(){
       h2.a(this);
    }
}
