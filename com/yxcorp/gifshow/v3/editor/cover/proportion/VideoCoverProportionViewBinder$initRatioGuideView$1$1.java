package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$initRatioGuideView$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$initRatioGuideView$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.io.File;
import xp6.d;
import com.kwai.imsdk.internal.util.a;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.RelativeLayout;
import android.widget.ImageView;

public final class VideoCoverProportionViewBinder$initRatioGuideView$1$1 extends Lambda implements a	// class@000ea8
{
    public final VideoCoverProportionViewBinder$initRatioGuideView$1 this$0;

    public void VideoCoverProportionViewBinder$initRatioGuideView$1$1(VideoCoverProportionViewBinder$initRatioGuideView$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$initRatioGuideView$1$1.class, "1")) {
          return;
       }
       d uod = a.b(this.this$0.b.p.getAbsolutePath());
       if (uod != null && (uod.a != null && uod.b != null)) {
          this.this$0.c.x(new File(this.this$0.b.p.getAbsolutePath()), a1.d(R.dimen.arg_RES_7f070181), a1.d(R.dimen.arg_RES_7f070180));
          this.this$0.d.setVisibility(4);
          this.this$0.c.setVisibility(0);
       }
    label_0058 :
       return;
    }
}
