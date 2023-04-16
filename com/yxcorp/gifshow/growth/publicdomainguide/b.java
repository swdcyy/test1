package com.yxcorp.gifshow.growth.publicdomainguide.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.publicdomainguide.c;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqa.j;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.ref.WeakReference;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import kotlin.jvm.internal.a;
import yw6.g;
import java.util.List;
import fw6.b;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import cra.w;
import q87.c;
import com.yxcorp.gifshow.growth.publicdomainguide.model.PublicDomainGuideResponse;
import com.yxcorp.gifshow.growth.publicdomainguide.model.PublicDomainGuideResponse$CardInfo;
import gqa.e;
import com.kwai.library.widget.popup.common.c;
import u07.t$a;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.c$b;
import ekd.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.e;
import brd.t;
import t45.d;
import brd.z;
import gqa.a;
import erd.g;
import crd.b;

public final class b implements Runnable	// class@00148a
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       PublicDomainGuideResponse$CardInfo tag;
       c e;
       e uoe;
       Object[] objArray1;
       boolean b2;
       b tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, tb, c.class, "7");
       boolean b = false;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(tb.getActivity() == null || !tb.R8()){
          obj = j.class;
          WeakReference obj1 = PatchProxy.apply(objArray, objArray, obj, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = j.a;
             if (obj1 != null) {
                SlidePlayViewModel slidePlayVie = obj1.get();
                if (slidePlayVie != null) {
                   a.o(slidePlayVie, "viewModel");
                   g og = slidePlayVie.O0();
                   if (og != null) {
                      List list = og.n0();
                      if (list != null) {
                         Iterator iterator = list.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               objArray1 = iterator.next();
                               Object obj2 = objArray1;
                               j b1 = j.b;
                               a.o(obj2, "it");
                               Objects.requireNonNull(b1);
                               PlcEntryStyleInfo obj3 = PatchProxy.applyOneRefs(obj2, b1, obj, "2");
                               if (obj3 != patchProxyRe) {
                                  b2 = obj3.booleanValue();
                               }else if(!obj2.isShowed() && !TextUtils.x(obj2.getCaption())){
                                  obj3 = obj2.getPlcEntryStyleInfo();
                                  if (obj3 == null || (obj3.mBizType == 3 || (!obj2.isAd() && (!obj2.isVideoType() && (obj2.isAtlasPhotos() || obj2.isLongPhotos()))))) {
                                     b2 = true;
                                  }
                               }
                            label_00b7 :
                               b2 = false;
                               if (!b2) {
                                  continue ;
                               }
                            }else {
                               objArray1 = objArray;
                            }
                            obj1 = objArray1;
                         }
                      }
                   }
                }
             }
             obj1 = objArray;
          }
          if (obj1 == null) {
             objArray = new Object[b];
             w.C().s(c.I, "Œ¥ªÒ»°µΩphoto", objArray);
          }else {
             c u = tb.u;
             if (u != null) {
                PublicDomainGuideResponse cardInfo = u.cardInfo;
                if (cardInfo != null) {
                   tag = cardInfo.tag;
                   if (tag != null) {
                   label_00e0 :
                      Activity activity = tb.getActivity();
                      e = tb.E;
                      if (PatchProxy.isSupport(e.class)) {
                         uoe = PatchProxy.applyFourRefs(activity, obj1, tag, Boolean.valueOf(e), null, e.class, "7");
                         if (uoe != patchProxyRe) {
                         label_011d :
                            tb.t = uoe;
                            b = true;
                         }
                      }
                      t$a uoa = new t$a(activity);
                      uoa.w(objArray);
                      uoe = new e(uoa);
                      uoe.r = activity;
                      uoe.u = obj1;
                      uoe.v = tag;
                      uoe.t = e;
                      uoe.Z();
                      goto label_011d ;
                   }
                }
             }
             tag = "";
             goto label_00e0 ;
          }
       }
       if (b) {
          k1.r(tb.F, (long)tb.z);
          if (tb.D == null) {
             tb.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new a(tb)));
             tb.D = true;
          }
       }
       return;
    }
}
