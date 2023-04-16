package com.yxcorp.gifshow.prettify.makeup.a;
import g9c.a;
import p0c.f;
import hka.h;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import java.util.List;
import l16.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.prettify.makeup.a$a;
import t16.a;
import f1c.c2;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.prettify.makeup.i;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import xyb.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import q87.c;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Float;
import java.util.Map;
import java.util.LinkedList;
import f1c.p;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kwai.robust.PatchProxyResult;
import s0d.f;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import s0d.a;
import s0d.e;
import android.content.Context;
import lnc.a1;
import ekd.p0;
import e17.i;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import ub.b;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public abstract class a extends a	// class@001165
{
    public h g;
    public MakeupKey h;
    public f i;

    public void a(f p0,h p1){
       super();
       this.i = p0;
       this.g = p1;
       this.h = p0.h();
    }
    public void X0(a$b p0,MakeupItem p1,boolean p2,boolean p3,List p4,b p5){
       String uniqueIdenti;
       a uoa = a.class;
       int i = 5;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
             return;
          }
       }
       if (!this.a1()) {
          return;
       }else {
          p0.e.setVisibility(8);
          p0.f.setVisibility(0);
          a$a uoa1 = new a$a(this, p0, p5);
          a uoa2 = new a(c2.d(this.h), "inner_resource");
          if (p3) {
             i.f(uoa2, p1, p2, p4, uoa1);
          }else {
             i oi = i.class;
             if (PatchProxy.isSupport(oi)) {
                Object[] objArray1 = new Object[i];
                objArray1[0] = uoa2;
                objArray1[1] = p1;
                objArray1[2] = Boolean.valueOf(p2);
                objArray1[3] = p4;
                objArray1[4] = uoa1;
                if (!PatchProxy.applyVoid(objArray1, null, oi, "16")) {
                }
             }else {
             }
          }
          return;
       }
    }
    public ImageRequest[] Y0(CDNUrl[] p0){
       f obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.length) {
          return null;
       }
       obj = f.x();
       obj.r(p0);
       obj.f(ImageRequest$CacheChoice.SMALL);
       return obj.w();
    }
    public abstract int Z0();
    public boolean a1(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.C(a1.c())) {
          return true;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       return false;
    }
    public void b1(KwaiImageView p0,ImageRequest[] p1,Drawable p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "4")) {
          return;
       }
       if (p1 != null && p1.length) {
          if (p2 != null) {
             p0.getHierarchy().G(p2, t$b.e);
          }
          d uod = Fresco.newDraweeControllerBuilder();
          uod.y(p0.getController());
          uod.s(p3);
          uod.u(p1);
          p0.setController(uod.e());
       }
       return;
    }
    public void d1(KwaiImageView p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       this.b1(p0, this.Y0(p1), null, null);
       return;
    }
    public void e1(PrettifyTagView p0,String p1,String p2,String p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else if(!p4 && (TextUtils.isEmpty(p2) || TextUtils.isEmpty(p1))){
          p0.p();
          return;
       }else {
          p0.setTagBgColor(p2);
          p0.setTagBgSecondColor(p3);
          p0.setTagText(p1);
          p0.q();
          return;
       }
    }
    public a$b f1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a$b(a.d(p0.getContext(), this.Z0(), p0, false));
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.f1(p0, p1);
    }
}
