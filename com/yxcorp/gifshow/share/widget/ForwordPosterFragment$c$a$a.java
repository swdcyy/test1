package com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c$a$a;
import erd.g;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c$a;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment$c;
import com.yxcorp.gifshow.share.widget.ForwordPosterFragment;
import android.view.View;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import com.kwai.sharelib.jsshare.StartShareParam$PosterConfig;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;

public final class ForwordPosterFragment$c$a$a implements g	// class@001cfb
{
    public final ForwordPosterFragment$c$a b;

    public void ForwordPosterFragment$c$a$a(ForwordPosterFragment$c$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ForwordPosterFragment y0;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ForwordPosterFragment$c$a$a.class, "1")) {
       }else {
          a.o(p0, "result");
          if (p0.getHeight() > ForwordPosterFragment.ii(this.b.b.c).getHeight() && ForwordPosterFragment.hi(this.b.b.c).mPosterConfig.mPosterShowType == null) {
             ForwordPosterFragment.ii(this.b.b.c).setVisibility(0);
             ForwordPosterFragment.ji(this.b.b.c).setVisibility(8);
             y0 = this.b.b.c.Y0;
             if (y0 == null) {
                a.S("posterLongPictureView");
             }
             y0.setImageBitmap(p0);
          }else {
             ForwordPosterFragment.ii(this.b.b.c).setVisibility(8);
             ForwordPosterFragment.ji(this.b.b.c).setVisibility(0);
             ViewGroup$LayoutParams layoutParams = ForwordPosterFragment.ji(this.b.b.c).getLayoutParams();
             layoutParams.width = p0.getWidth();
             layoutParams.height = p0.getHeight();
             ForwordPosterFragment.ji(this.b.b.c).setLayoutParams(layoutParams);
             y0 = this.b.b.c.Z0;
             if (y0 == null) {
                a.S("posterShortPictureView");
             }
             y0.setImageBitmap(p0);
          }
          PatchProxy.onMethodExit(ForwordPosterFragment$c$a$a.class, "1");
       }
       return;
    }
}
