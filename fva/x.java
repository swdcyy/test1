package fva.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import jva.m;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import android.widget.LinearLayout;
import zf6.k;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf6.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import fva.x$a;
import erd.g;
import crd.b;
import fva.x$b;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import fva.x$c;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import k2b.e0;

public final class x extends PresenterV2	// class@002a3b
{
    public HotSpotModel p;
    public m q;
    public e0 r;

    public void x(){
       super();
    }
    public static final HotSpotModel P8(x p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("data");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       x tp = this.p;
       String str = "data";
       if (tp == null) {
          a.S(str);
       }
       HotSpotModel mHotSpotItem = tp.mHotSpotItems;
       x ox = 1;
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
                label_0059 :
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   tp.r1().setVisibility(0);
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   tp.n1().setVisibility(0);
                label_0092 :
                   tp = this.p;
                   if (tp == null) {
                      a.S(str);
                   }
                   mHotSpotItem = tp.mHotSpotItems;
                   if (mHotSpotItem != null && !mHotSpotItem.isEmpty()) {
                      ox = null;
                   }
                   if (ox) {
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.l1().setVisibility(8);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.o1().setVisibility(8);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.s1().setVisibility(8);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.q1().setVisibility(8);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.p1().setVisibility(8);
                   }else {
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.l1().setVisibility(0);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.o1().setVisibility(0);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.s1().setVisibility(0);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.q1().setVisibility(0);
                      tp = this.q;
                      if (tp == null) {
                         a.S("binding");
                      }
                      tp.p1().setVisibility(0);
                   }
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   ox = this.p;
                   if (ox == null) {
                      a.S(str);
                   }
                   this.R8(tp, ox, k.d());
                   this.X7(RxBus.f.g(h.class, RxBus$ThreadMode.MAIN).subscribe(new x$a(this)));
                   tp = this.p;
                   if (tp == null) {
                      a.S(str);
                   }
                   if (!TextUtils.x(tp.mHotBoardName)) {
                      tp = this.p;
                      if (tp == null) {
                         a.S(str);
                      }
                      if (!TextUtils.x(tp.mHotBoardLinkUrl)) {
                         tp = this.q;
                         if (tp == null) {
                            a.S("binding");
                         }
                         tp.o1().setVisibility(0);
                         tp = this.q;
                         if (tp == null) {
                            a.S("binding");
                         }
                         TextView textView = tp.q1();
                         ox = this.p;
                         if (ox == null) {
                            a.S(str);
                         }
                         textView.setText(ox.mHotBoardName);
                         tp = this.q;
                         if (tp == null) {
                            a.S("binding");
                         }
                         tp.o1().setOnClickListener(new x$b(this));
                      label_01c4 :
                         return;
                      }
                   }
                   tp = this.q;
                   if (tp == null) {
                      a.S("binding");
                   }
                   tp.o1().setVisibility(8);
                   goto label_01c4 ;
                }
             }else {
                goto label_0059 ;
             }
          }else {
             goto label_0059 ;
          }
       }
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       tp.r1().setVisibility(8);
       tp = this.q;
       if (tp == null) {
          a.S("binding");
       }
       tp.n1().setVisibility(8);
       goto label_0092 ;
    }
    public final void R8(m p0,HotSpotModel p1,boolean p2){
       if (PatchProxy.isSupport(x.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, x.class, "3")) {
          return;
       }
       HotSpotModel mTitleIconDa = (p2)? p1.mTitleIconDarkUrl: p1.mTitleIcon;
       Uri uri = x0.f(mTitleIconDa);
       if (uri != null) {
          p0.n1().B(uri, 0, 0, new x$c(p0, p1));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       Object obj = this.q8(HotSpotModel.class);
       a.o(obj, "inject\(HotSpotModel::class.java\)");
       this.p = obj;
       obj = this.q8(m.class);
       a.o(obj, "inject\(HotSpotTodayTitleViewV2::class.java\)");
       this.q = obj;
       obj = this.q8(HotSpotFragment.class);
       a.o(obj, "inject\(HotSpotFragment::class.java\)");
       this.r = obj;
       return;
    }
}
