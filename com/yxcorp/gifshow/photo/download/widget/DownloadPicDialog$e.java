package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import java.util.ArrayList;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$e$a;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kxb.a;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.yxcorp.gifshow.photo.download.widget.s;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Iterator;
import android.view.ViewGroup;
import i2b.a;

public class DownloadPicDialog$e extends RecyclerView$Adapter	// class@000f32
{
    public BaseFeed e;
    public KwaiImageView f;
    public View g;
    public List h;
    public int i;
    public Context j;
    public int k;
    public a l;
    public boolean m;
    public final DownloadPicDialog n;

    public void DownloadPicDialog$e(DownloadPicDialog p0,Context p1,BaseFeed p2,View p3,View p4){
       this.n = p0;
       super();
       this.h = new ArrayList();
       this.i = 0;
       this.e = p2;
       this.f = p3;
       this.j = p1;
       this.k = n.c(p1, 412.00f);
       this.g = p4;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, DownloadPicDialog$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return r1.n0(this.e).length;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       DownloadPicDialog$e uoe = DownloadPicDialog$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          p0.a.P(r1.m0(this.e, p1));
          boolean b = true;
          if (!p1 && this.m == null) {
             List list = r1.m0(this.e, p1);
             CDNUrl[] uCDNUrlArray = new CDNUrl[list.size()];
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.f.getController());
             uod.w(a.a(ImageRequestBuilder.d(d.b(list.toArray(uCDNUrlArray))[0]), this.f, 100));
             uod.s(new s(this));
             AbstractDraweeController uAbstractDra = uod.e();
             this.l = uAbstractDra;
             this.f.setController(uAbstractDra);
             this.m = b;
          }
          DownloadPicDialog$e tn = this.n;
          DownloadPicDialog j = tn.J;
          ViewGroup$LayoutParams layoutParams = p0.a.getLayoutParams();
          layoutParams.height = Math.round(((float)tn.F * (j[p1].mHeight / j[p1].mWidth)));
          p0.a.setLayoutParams(layoutParams);
          this.h.add(p0.a);
          this.i = this.i + layoutParams.height;
          if (p1 == (this.getItemCount() - b) && this.i < this.k) {
             Iterator iterator = this.h.iterator();
             while (iterator.hasNext()) {
                KwaiImageView kwaiImageVie = iterator.next();
                ViewGroup$LayoutParams layoutParams1 = kwaiImageVie.getLayoutParams();
                float f = (float)layoutParams1.height / (float)layoutParams1.width;
                float f1 = (float)this.k * f;
                layoutParams1.height = Math.round(f1);
                layoutParams1.width = this.k;
                kwaiImageVie.setLayoutParams(layoutParams1);
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       DownloadPicDialog$e$a uoe$a;
       DownloadPicDialog$e uoe = DownloadPicDialog$e.class;
       if (PatchProxy.isSupport(uoe)) {
          uoe$a = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (uoe$a != PatchProxyResult.class) {
          label_002a :
             return uoe$a;
          }
       }
       uoe$a = new DownloadPicDialog$e$a(this, a.d(p0.getContext(), 0x7f0d031b, p0, false));
       goto label_002a ;
    }
}
