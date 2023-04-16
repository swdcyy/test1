package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1;
import msd.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import java.lang.Boolean;
import android.graphics.Bitmap;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import d0a.r;
import brd.y;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.kuaishou.android.model.mix.CommonMeta;
import java.util.HashSet;

public final class PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1 extends FunctionReferenceImpl implements r	// class@0016c0
{

    public void PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1(PictureInPicturePresenter p0){
       super(4, p0, PictureInPicturePresenter.class, "onDismiss", "onDismiss\(Lcom/yxcorp/gifshow/entity/QPhoto;JZLandroid/graphics/Bitmap;\)V", 0);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.invoke(p0, p1.longValue(), p2.booleanValue(), p3);
       return l1.a;
    }
    public final void invoke(QPhoto p0,long p1,boolean p2,Bitmap p3){
       Object[] objArray1;
       HashSet hashSet;
       l1 a;
       Object obj = p0;
       boolean b = p2;
       if (PatchProxy.isSupport(PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), p3, this, PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1.class, "1")) {
          return;
       }
       a.p(obj, "p1");
       CallableReference uCallableRef = this.receiver;
       Objects.requireNonNull(uCallableRef);
       if (!PatchProxy.isSupport(PictureInPicturePresenter.class) || !PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), p3, uCallableRef, PictureInPicturePresenter.class, "7")) {
          a.p(obj, "photo");
          PictureInPicturePresenter x = uCallableRef.x;
          Integer integer = (x != null)? Integer.valueOf(x.R0(obj)): null;
          o oo = o.C();
          StringBuilder str = "onDismiss: photo "+p0.getUserName()+", currentIndex "+integer+", position "+p1+", isPlay "+b+", has bitmap ";
          boolean b1 = (p3 != null)? true: false;
          Object[] objArray = new Object[0];
          oo.w("PictureInPicturePresent", str+b1, objArray);
          PictureInPicturePresenter t = uCallableRef.t;
          if (t == null) {
             a.S("mSyncPlayerProgressObserver");
          }
          r or = v5;
          r or1 = v5;
          or = new r(p0, p2, p1, p3);
          t.onNext(or1);
          String str1 = "PictureInPicture";
          if (b) {
             a.d().k(new PlayEvent(obj, PlayEvent$Status.RESUME, 1, str1));
          }else {
             a.d().k(new PlayEvent(obj, PlayEvent$Status.PAUSE, 1, str1));
          }
          x = uCallableRef.x;
          QPhoto currentPhoto = (x != null)? x.getCurrentPhoto(): null;
          if (a.g(obj, currentPhoto)) {
             objArray1 = new Object[0];
             o.C().w("PictureInPicturePresent", "onDismiss: is current photo, return", objArray1);
          }else if(integer != null && integer.intValue() >= 0){
             objArray1 = new Object[0];
             o.C().w("PictureInPicturePresent", "onDismiss: setCurrentItemInViewPager", objArray1);
             CommonMeta commonMeta = p0.getCommonMeta();
             if (commonMeta != null) {
                commonMeta.mIsSmallWindowDismissPhoto = true;
             }
             commonMeta = p0.getCommonMeta();
             if (commonMeta != null) {
                if (!b) {
                   hashSet = new HashSet();
                   hashSet.add(Integer.valueOf(1));
                   a = l1.a;
                }else {
                   hashSet = null;
                }
                commonMeta.mInitPauseFlags = hashSet;
             }
             x = uCallableRef.x;
             if (x != null) {
                x.k(integer.intValue(), 0);
             }
          }
       }
    label_014a :
       return;
    }
}
