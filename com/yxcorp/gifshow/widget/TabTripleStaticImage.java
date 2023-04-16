package com.yxcorp.gifshow.widget.TabTripleStaticImage;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import android.graphics.drawable.Drawable;
import lnc.a1;

public class TabTripleStaticImage extends RelativeLayout	// class@0018d4
{
    public KwaiImageView b;
    public KwaiImageView c;
    public KwaiImageView d;
    public final List e;

    public void TabTripleStaticImage(Context p0){
       super(p0, null);
    }
    public void TabTripleStaticImage(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TabTripleStaticImage(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d1639, this, true);
       if (PatchProxy.applyVoid(null, this, TabTripleStaticImage.class, "1")) {
       }else {
          this.b = this.findViewById(0x7f0a134e);
          this.c = this.findViewById(0x7f0a134f);
          this.d = this.findViewById(0x7f0a1350);
          uArrayList.add(this.c);
          uArrayList.add(this.b);
          uArrayList.add(this.d);
       }
       return;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabTripleStaticImage.class, "2")) {
          return;
       }
       if (!q.f(p0)) {
          int i = 0;
          while (i < this.e.size()) {
             if (i < p0.size()) {
                KwaiImageView kwaiImageVie = this.e.get(i);
                ImageRequest[] imageRequest = new ImageRequest[]{ImageRequest.c(p0.get(i))};
                b uob = null;
                d uod = kwaiImageVie.g0(uob, uob, imageRequest);
                if (uod != null) {
                   uob = uod.e();
                }
                kwaiImageVie.setController(uob);
                kwaiImageVie.setFailureImage(a1.f(R.drawable.detail_avatar_secret));
             }
             i = i + 1;
          }
       }
       return;
    }
}
