package fva.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.util.Collection;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import jva.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import zf6.k;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf6.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import fva.w$a;
import erd.g;
import crd.b;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import fva.w$b;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class w extends PresenterV2	// class@002a37
{
    public HotSpotModel p;
    public l q;

    public void w(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       w tp = this.p;
       String str = "data";
       if (tp == null) {
          a.S(str);
       }
       HotSpotModel mHotSpotItem = tp.mHotSpotItems;
       int i = 0;
       tp = (mHotSpotItem == null || mHotSpotItem.isEmpty())? 1: null;
       if (!tp) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          if (TextUtils.x(tp.mTitleIcon)) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             if (TextUtils.x(tp.mTitleIconDarkUrl)) {
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                if (!TextUtils.x(tp.mTitleName)) {
                label_0056 :
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   tp.o1().setVisibility(i);
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   tp.n1().setVisibility(i);
                label_0091 :
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   w tp1 = this.p;
                   if (tp1 == null) {
                      a.S(str);
                   }
                   this.P8(tp, tp1, k.d());
                   this.X7(RxBus.f.g(h.class, RxBus$ThreadMode.MAIN).subscribe(new w$a(this)));
                   return;
                }
             }else {
                goto label_0056 ;
             }
          }else {
             goto label_0056 ;
          }
       }
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       i = 8;
       tp.o1().setVisibility(i);
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       tp.n1().setVisibility(i);
       goto label_0091 ;
    }
    public final void P8(l p0,HotSpotModel p1,boolean p2){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, w.class, "3")) {
          return;
       }
       HotSpotModel mTitleIconDa = (p2)? p1.mTitleIconDarkUrl: p1.mTitleIcon;
       Uri uri = x0.f(mTitleIconDa);
       if (uri != null) {
          p0.n1().B(uri, 0, 0, new w$b(p0, p1));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       Object obj = this.q8(HotSpotModel.class);
       a.o(obj, "inject\(HotSpotModel::class.java\)");
       this.p = obj;
       obj = this.q8(l.class);
       a.o(obj, "inject\(HotSpotTodayTitleView::class.java\)");
       this.q = obj;
       return;
    }
}
