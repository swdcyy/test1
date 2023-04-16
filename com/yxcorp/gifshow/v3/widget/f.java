package com.yxcorp.gifshow.v3.widget.f;
import y8c.r;
import com.yxcorp.gifshow.v3.widget.g$b;
import com.yxcorp.gifshow.v3.widget.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.io.File;
import android.util.Pair;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.kuaishou.edit.draft.AssetSegment;
import vba.g;
import x59.g;
import sxb.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import axc.f0;
import android.view.View$OnClickListener;
import android.widget.ImageView;

public class f extends r	// class@001665
{
    public int i;
    public int j;
    public final g$a k;
    public int l;
    public final g$b m;

    public void f(int p0,int p1,g$b p2,g$a p3){
       super();
       this.l = -1;
       this.i = p0;
       this.j = p1;
       this.m = p2;
       this.k = p3;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       KwaiImageView kwaiImageVie = this.y();
       File uFile = new File(this.t().first);
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(w0.c(uFile));
       f ti = this.i;
       if (ti > null) {
          f tj = this.j;
          if (tj > null) {
             imageRequest.v(new d(ti, tj));
          }
       }
       imageRequest.r(a.g(this.m.b(this.t().second), this.m.a(), this.t().first));
       d uod = Fresco.newDraweeControllerBuilder();
       uod.x(ImageRequest.b(w0.c(uFile)));
       uod.y(kwaiImageVie.getController());
       uod.w(imageRequest.a());
       kwaiImageVie.setController(uod.e());
       kwaiImageVie.setOnClickListener(new f0(this));
       return;
    }
}
