package com.kuaishou.live.gzone.v2.profile.j$c;
import y8c.r;
import com.kuaishou.live.gzone.v2.profile.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.kwai.framework.model.feed.BaseFeed;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import mxb.j0;
import mxb.i0;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kuaishou.android.model.mix.w;
import com.kwai.component.feedstaggercard.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.c;
import kp.r1;
import com.kuaishou.android.model.mix.ImageMeta;
import b06.e;
import com.kuaishou.android.model.mix.ImageMetaExt;
import kp.w1;
import com.kwai.component.imageextension.util.ImageMetaImagePrefetchUtil;
import android.content.res.Resources$NotFoundException;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.Long;
import java.lang.CharSequence;
import jp.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kuaishou.live.gzone.v2.profile.j$c$a;

public class j$c extends r	// class@001cf0
{
    public KwaiImageView i;
    public ImageView j;
    public ImageView k;
    public ImageView l;
    public ImageView m;
    public ImageView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public final j r;
    public static String s = "LiveGzoneProfilePhotoListAdapter$PhotoPresenter";

    public void j$c(j p0){
       this.r = p0;
       super();
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, j$c.class, "1")) {
          return;
       }
       this.i = this.q(0x7f0a3ecc);
       this.j = this.q(0x7f0a136d);
       this.k = this.q(0x7f0a3b71);
       this.l = this.q(0x7f0a3485);
       this.m = this.q(0x7f0a3ff9);
       this.n = this.q(0x7f0a215f);
       this.o = this.q(0x7f0a3353);
       this.p = this.q(0x7f0a13d9);
       if (this.r.F > null) {
          RoundingParams roundingPara = new RoundingParams();
          roundingPara.n((float)this.r.F);
          this.i.getHierarchy().L(roundingPara);
       }
       this.q = this.q(0x7f0a23e0);
       return;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j$c.class, "2")) {
          return;
       }
       BaseFeed uBaseFeed = this.t();
       int i = 0x7f0a300b;
       if (uBaseFeed == null) {
          this.o.setVisibility(8);
          this.n.setVisibility(8);
          this.j.setVisibility(8);
          this.k.setVisibility(8);
          this.m.setVisibility(8);
          this.q.setVisibility(8);
          this.l.setVisibility(8);
          this.i.setImageDrawable(objArray);
          this.i.setImageResource(0);
          this.i.setTag(objArray);
          this.i.setTag(i, objArray);
          this.i.setOnClickListener(objArray);
          return;
       }else {
          i0.a().t(121, uBaseFeed);
          try{
             objArray = 1;
             if (this.r.w1(uBaseFeed)) {
                this.l.setVisibility(0);
                this.m.setVisibility(8);
                this.q.setVisibility(8);
                this.k.setVisibility(8);
             }else if(uBaseFeed.a(PhotoMeta.class) != null && (uBaseFeed.a(PhotoMeta.class).isPublic() && w.F0(uBaseFeed))){
                this.m.setVisibility(8);
                this.q.setVisibility(0);
                this.l.setVisibility(8);
                this.k.setVisibility(8);
             }else if(uBaseFeed.a(PhotoMeta.class) != null && uBaseFeed.a(PhotoMeta.class).mTopPhoto != null){
                this.m.setVisibility(0);
                this.q.setVisibility(8);
                this.l.setVisibility(8);
                this.k.setVisibility(8);
             }else if(uBaseFeed.a(PhotoMeta.class) != null && uBaseFeed.a(PhotoMeta.class).isPublic()){
                f uof = new f();
                uof.f(this.k);
                Object[] objArray1 = new Object[2];
                objArray1[0] = uBaseFeed;
                objArray1[objArray] = new c("FRAGMENT", this.r.D);
                uof.i(objArray1);
                this.m.setVisibility(8);
                this.q.setVisibility(8);
                this.l.setVisibility(8);
             }
             if (r1.D2(uBaseFeed)) {
                ImageMeta imageMeta = r1.W0(uBaseFeed);
                this.j.setImageResource(e.b(uBaseFeed));
                this.j.setVisibility(0);
                if (ImageMetaExt.isAtlasPhotos(imageMeta) || (ImageMetaExt.isLongPhotos(imageMeta) && imageMeta != null)) {
                   ImageMetaImagePrefetchUtil.prefetchAtlas(imageMeta, w1.m(uBaseFeed), 0, objArray);
                }
             }else {
                this.j.setVisibility(8);
             }
          }catch(android.content.res.Resources$NotFoundException e5){
             e5.printStackTrace();
          }
       label_0155 :
          if (r1.S2(uBaseFeed)) {
             this.n.setImageResource(R.drawable.arg_RES_7f08098f);
             this.n.setVisibility(0);
          }else {
             this.n.setVisibility(8);
          }
          if (uBaseFeed.a(PhotoMeta.class) != null && w.b0(uBaseFeed.a(PhotoMeta.class)) > 0) {
             objArray = new Object[objArray];
             objArray[0] = Long.valueOf(w.b0(uBaseFeed.a(PhotoMeta.class)));
             this.o.setText(a.a().a().getString(R.string.arg_RES_7f103d27, objArray));
             this.o.setVisibility(0);
          }else {
             this.o.setVisibility(8);
          }
          j$c ti = this.i;
          if (ti.getTag(i) == uBaseFeed) {
             return;
          }else {
             ti.setTag(i, uBaseFeed);
             g.z(ti, uBaseFeed, a.e);
             if (this.r.B != null) {
                this.i.setOnClickListener(new j$c$a(this, uBaseFeed));
             }
             if (uBaseFeed.a(PhotoMeta.class) != null && w.m0(uBaseFeed.a(PhotoMeta.class))) {
                this.p.setVisibility(0);
             }else {
                this.p.setVisibility(8);
             }
             return;
          }
       }
    }
}
