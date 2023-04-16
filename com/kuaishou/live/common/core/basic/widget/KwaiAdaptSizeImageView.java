package com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.net.Uri;
import ub.a;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;

public class KwaiAdaptSizeImageView extends KwaiImageView	// class@000f0f
{
    public static final KwaiAdaptSizeImageView$a x;

    static {
       KwaiAdaptSizeImageView.x = new KwaiAdaptSizeImageView$a(null);
    }
    public void KwaiAdaptSizeImageView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void KwaiAdaptSizeImageView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void KwaiAdaptSizeImageView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void L(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiAdaptSizeImageView.class, "1")) {
          return;
       }
       if (p0 == null) {
          this.setController(null);
       }else {
          this.B(Uri.parse(p0), 0, 0, KwaiAdaptSizeImageView.x.a(this));
       }
       return;
    }
}
