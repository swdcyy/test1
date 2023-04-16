package com.yxcorp.gifshow.growth.pad.CoverPadAdaptationPresenter;
import pvb.a;
import com.yxcorp.gifshow.growth.pad.CoverPadAdaptationPresenter$kwaiLog$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import kp.r1;
import rkd.b;
import com.yxcorp.gifshow.growth.pad.CoverPadAdaptationPresenter$kwaiLog$2$a;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewGroup$LayoutParams;

public abstract class CoverPadAdaptationPresenter extends a	// class@001457
{
    public QPhoto q;
    public final p r;

    public void CoverPadAdaptationPresenter(){
       super();
       this.r = s.c(CoverPadAdaptationPresenter$kwaiLog$2.INSTANCE);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, CoverPadAdaptationPresenter.class, "4")) {
          return;
       }
       Context context = this.getContext();
       if (context != null) {
          a.o(context, "it");
          Resources resources = context.getResources();
          a.o(resources, "it.resources");
          this.S8(this.V8(), this.q, resources.getConfiguration().orientation);
       }
       return;
    }
    public void R8(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverPadAdaptationPresenter.class, "5")) {
          return;
       }
       a.p(p0, "newConfig");
       this.S8(this.V8(), this.q, p0.orientation);
       return;
    }
    public final void S8(View p0,QPhoto p1,int p2){
       if (PatchProxy.isSupport(CoverPadAdaptationPresenter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CoverPadAdaptationPresenter.class, "6")) {
          return;
       }
       if (p0 != null && (p1 != null && p1.getEntity() != null)) {
          BaseFeed entity = p1.getEntity();
          a.o(entity, "photo.entity");
          this.X8(p0, entity, p2);
       }
    label_0030 :
       return;
    }
    public abstract View V8();
    public Float[] W8(){
       Float[] obj = PatchProxy.apply(null, this, CoverPadAdaptationPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Float[]{Float.valueOf(0x3f800000),Float.valueOf(0x3f800000)};
       return obj;
    }
    public void X8(View p0,BaseFeed p1,int p2){
       Integer[] integerArray;
       boolean b;
       CoverPadAdaptationPresenter uCoverPadAda = CoverPadAdaptationPresenter.class;
       if (PatchProxy.isSupport(uCoverPadAda) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CoverPadAdaptationPresenter.class, "7")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "baseFeed");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uCoverPadAda)) {
          integerArray = PatchProxy.applyTwoRefs(p1, Integer.valueOf(p2), this, uCoverPadAda, "8");
          if (integerArray != patchProxyRe) {
          }else {
          label_003e :
             ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(p1);
             if (uAtlasCoverS != null) {
                int i = (!uAtlasCoverS.length)? 1: 0;
                if (i ^ 1) {
                   object oobject = uAtlasCoverS[0];
                   int[] ointArray = new int[]{(int)oobject.mWidth,(int)oobject.mHeight};
                   integerArray = b.a(ointArray, p2, this.W8(), null, 8, null);
                   if (integerArray.length < 2) {
                   label_00bf :
                      integerArray = null;
                   }
                }
             }
             CoverPadAdaptationPresenter$kwaiLog$2$a okwaiLog$2$a = PatchProxy.apply(null, this, uCoverPadAda, "2");
             if (okwaiLog$2$a == patchProxyRe) {
                okwaiLog$2$a = this.r.getValue();
             }
             String simpleName = this.getClass().getSimpleName();
             StringBuilder str = "sizeList is null == ";
             b = (uAtlasCoverS == null)? true: false;
             Object[] objArray = new Object[0];
             okwaiLog$2$a.s(simpleName, str+b+"; "+"baseFeed.id = "+p1.getId()+"; baseFeed.bizId = "+p1.getBizId(), objArray);
             goto label_00bf ;
          }
       }else {
          goto label_003e ;
       }
       if (integerArray != null && p0.getLayoutParams() != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.width = integerArray[0].intValue();
          layoutParams.height = integerArray[1].intValue();
          p0.requestLayout();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CoverPadAdaptationPresenter.class, "3")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       return;
    }
}
