package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$k;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.widget.FrameLayout;

public final class VideoCoverProportionViewBinder$k implements View$OnClickListener	// class@000eab
{
    public final VideoCoverProportionViewBinder b;

    public void VideoCoverProportionViewBinder$k(VideoCoverProportionViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverProportionViewBinder$k.class, "1")) {
          return;
       }
       RatioExpandView ratioExpandV = this.b.L();
       if (ratioExpandV != null && (ratioExpandV.isShown() && ratioExpandV.getExpand())) {
          ratioExpandV.a();
       }
    label_0022 :
       return;
    }
}
