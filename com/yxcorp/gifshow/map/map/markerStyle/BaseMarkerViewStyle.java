package com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle;
import java.io.Serializable;
import com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle$a;
import nsd.u;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import h6b.b;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle$b;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import s0d.e;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CoverMeta;
import s0d.f;
import wb5.b;
import s0d.a;

public abstract class BaseMarkerViewStyle implements Serializable	// class@001c92
{
    public Context mContext;
    public QPhoto mQPhoto;
    public View mView;
    public static final BaseMarkerViewStyle$a Companion;
    public static final long serialVersionUID;

    static {
       BaseMarkerViewStyle.Companion = new BaseMarkerViewStyle$a(null);
    }
    public void BaseMarkerViewStyle(){
       super();
    }
    public final void bindDataAndView(View p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseMarkerViewStyle.class, "1")) {
          return;
       }
       a.p(p1, "photo");
       this.mView = p0;
       this.mQPhoto = p1;
       Context uContext = null;
       Context context = (p0 != null)? p0.getContext(): uContext;
       this.mContext = context;
       if (p0 != null) {
          uContext = p0.getContext();
       }
       this.initView(uContext, p0, p1);
       return;
    }
    public final void bindMarkerCover(KwaiImageView p0,QPhoto p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BaseMarkerViewStyle.class, "3")) {
          return;
       }
       a.p(p0, "view");
       if (p2 != null) {
          p2.onStart();
       }
       d uod = Fresco.newDraweeControllerBuilder();
       uod.s(new BaseMarkerViewStyle$b(p2));
       uod.y(p0.getController());
       uod.w(this.imageRequest(p1));
       AbstractDraweeController uAbstractDra = uod.e();
       a.o(uAbstractDra, "Fresco.newDraweeControll¡­\(photo\)\)\n        .build\(\)");
       p0.setController(uAbstractDra);
       return;
    }
    public abstract int cardType();
    public abstract int coverHeight();
    public abstract int coverWidth();
    public abstract View createView(Context p0);
    public final View getMView(){
       return this.mView;
    }
    public e imageRequest(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseMarkerViewStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 != null) {
          CoverMeta coverMeta = p0.getCoverMeta();
          if (coverMeta != null) {
             i = b.h(coverMeta).o(this.coverWidth(), this.coverHeight()).v();
          }
       }
       return i;
    }
    public abstract void initView(Context p0,View p1,QPhoto p2);
    public void onCancelSelectMarker(){
    }
    public void onSelectMarker(){
    }
    public void onUnbind(){
    }
    public final void setMView(View p0){
       this.mView = p0;
    }
}
