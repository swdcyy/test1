package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$g;
import uv8.x1;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.widget.FrameLayout;

public final class VideoCoverProportionViewBinder$g implements x1	// class@000ea5
{
    public final VideoCoverProportionViewBinder a;

    public void VideoCoverProportionViewBinder$g(VideoCoverProportionViewBinder p0){
       this.a = p0;
       super();
    }
    public final void onClick(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$g.class, "1")) {
          return;
       }
       RatioExpandView ratioExpandV = this.a.L();
       if (ratioExpandV != null && (ratioExpandV.isShown() && ratioExpandV.getExpand())) {
          ratioExpandV.a();
       }
    label_0023 :
       return;
    }
}
