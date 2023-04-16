package com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverClickPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.commercial.search.commodity.AdSearchCommodityCoverClickPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.s;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import yx.j0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import tw.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n49.d;
import n49.o;

public final class AdSearchCommodityCoverClickPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@00154f
{

    public void AdSearchCommodityCoverClickPresenter$onBind$1(AdSearchCommodityCoverClickPresenter p0){
       super(1, p0, AdSearchCommodityCoverClickPresenter.class, "receiveSearchPhotoClickedEvent", "receiveSearchPhotoClickedEvent\(Lcom/yxcorp/gifshow/commercial/event/SearchPhotoClickedEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(s p0){
       AdSearchCommodityCoverClickPresenter p1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchCommodityCoverClickPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, AdSearchCommodityCoverClickPresenter.class, "3")) {
          Object[] objArray = new Object[0];
          j0.f("AdSearchCommodityCoverClickPresenter", "receiveSearchPhotoClickedEvent", objArray);
          BaseFeed uBaseFeed = p0.a();
          AdSearchCommodityCoverClickPresenter p = treceiver.p;
          QPhoto qPhoto = null;
          QPhoto mEntity = (p != null)? p.mEntity: qPhoto;
          if (a.g(uBaseFeed, mEntity) ^ 0x01) {
             StringBuilder str = "received feed:"+p0.a()+",current feed:";
             p1 = treceiver.p;
             if (p1 != null) {
                qPhoto = p1.mEntity;
             }
             Object[] objArray1 = new Object[0];
             j0.f("AdSearchCommodityCoverClickPresenter", str+qPhoto, objArray1);
          }else if(!e.j(treceiver.p)){
             Activity activity = treceiver.getActivity();
             if (activity instanceof GifshowActivity) {
                qPhoto = activity;
             }
             if (qPhoto != null) {
                d uod = d.a();
                uod.e(0);
                treceiver.q.c(treceiver.p, qPhoto, uod);
             }
          }
       }
    label_008e :
       return;
    }
}
