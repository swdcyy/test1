package az3.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import az3.f$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed$ActivityInfo;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import kotlin.jvm.internal.a;
import java.lang.Long;
import crd.b;
import com.yxcorp.utility.f;
import ot3.u0;
import brd.t;
import az3.h;
import android.widget.TextView;
import erd.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import java.util.List;
import az3.g;
import java.util.Collection;
import ekd.q;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;

public final class f extends PresenterV2	// class@0002dd
{
    public b p;
    public MerchantKwaiImageView q;
    public TextView r;
    public TextView s;
    public MerchantKwaiImageView t;
    public TextView u;
    public b v;
    public b w;
    public static final f$a x;

    static {
       f.x = new f$a(null);
    }
    public void f(){
       super();
    }
    public void E8(){
       f tq;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "3")) {
          return;
       }
       this.R8();
       f tp = this.p;
       if (tp != null) {
          b c = tp.c;
          if (c != null) {
             objArray = c.getActivityInfo();
          }
       }
       Object[] objArray1 = objArray;
       if (objArray1 != null) {
          LiveFeed$ActivityInfo mType = objArray1.mType;
          int i = 8;
          String str = null;
          if (mType != 1) {
             if (mType != 2) {
                if (mType != 3) {
                   return;
                }else if(PatchProxy.applyVoidOneRefs(objArray1, this, f.class, "6")){
                   String str1 = "mCountDownTv";
                   if (objArray1.mCountDownTime > 0) {
                      f tu = this.u;
                      if (tu == null) {
                         a.S(str1);
                      }
                      LiveFeed$ActivityInfo mCountDownTi = objArray1.mCountDownTime;
                      LiveFeed$ActivityInfo mDesc = objArray1.mDesc;
                      if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(tu, Long.valueOf(mCountDownTi), mDesc, this, f.class, "7")) {
                         tq = this.w;
                         if (tq != null) {
                            tq.dispose();
                         }
                         this.w = f.d().b((mCountDownTi - u0.b()), 100).subscribe(new h(this, tu, mDesc));
                      }
                   }else if(!TextUtils.x(objArray1.mDesc)){
                      tq = this.u;
                      if (tq == null) {
                         a.S(str1);
                      }
                      tq.setVisibility(str);
                      tq = this.u;
                      if (tq == null) {
                         a.S(str1);
                      }
                      tq.setText(objArray1.mDesc);
                   }else {
                      tq = this.u;
                      if (tq == null) {
                         a.S(str1);
                      }
                      tq.setVisibility(i);
                   }
                   tq = this.t;
                   if (tq == null) {
                      a.S("mActivityExtraImage");
                   }
                   this.P8(tq, objArray1.mExtraImg);
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(objArray1, this, f.class, "5")){
             String str2 = "mActivityPriceUnitTv";
             if (TextUtils.x(objArray1.mDesc)) {
                tq = this.r;
                if (tq == null) {
                   a.S("mActivityPriceTv");
                }
                tq.setVisibility(i);
                tq = this.s;
                if (tq == null) {
                   a.S(str2);
                }
                tq.setVisibility(i);
             }else {
                tq = this.r;
                if (tq == null) {
                   a.S("mActivityPriceTv");
                }
                tq.setVisibility(str);
                tq = this.r;
                if (tq == null) {
                   a.S("mActivityPriceTv");
                }
                tq.setText(objArray1.mDesc);
                tq = this.s;
                if (tq == null) {
                   a.S(str2);
                }
                tq.setVisibility(str);
             }
          }
          tq = this.q;
          if (tq == null) {
             a.S("mActivityBackground");
          }
          this.P8(tq, objArray1.mPhotoUrls);
          mType = objArray1.mPedantDisappearTime;
          if (mType > 0 && (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mType), this, f.class, "9"))) {
             f tv = this.v;
             if (tv != null) {
                tv.dispose();
             }
             this.v = f.d().e((mType - u0.b())).subscribe(new g(this));
          }
       }
    label_014e :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.R8();
       return;
    }
    public final void P8(MerchantKwaiImageView p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "10")) {
          return;
       }
       if (q.f(p1)) {
          p0.setVisibility(8);
       }else {
          p0.setVisibility(0);
          a.m(p1);
          p0.P(p1);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
          return;
       }
       f tq = this.q;
       if (tq == null) {
          a.S("mActivityBackground");
       }
       tq.setVisibility(8);
       tq = this.r;
       if (tq == null) {
          a.S("mActivityPriceTv");
       }
       tq.setVisibility(8);
       tq = this.s;
       if (tq == null) {
          a.S("mActivityPriceUnitTv");
       }
       tq.setVisibility(8);
       tq = this.t;
       if (tq == null) {
          a.S("mActivityExtraImage");
       }
       tq.setVisibility(8);
       tq = this.u;
       if (tq == null) {
          a.S("mCountDownTv");
       }
       tq.setVisibility(8);
       tq = this.w;
       if (tq != null) {
          tq.dispose();
       }
       tq = this.v;
       if (tq != null) {
          tq.dispose();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a00ca);
       this.s = m1.f(p0, 0x7f0a00cf);
       this.r = m1.f(p0, 0x7f0a00ce);
       this.t = m1.f(p0, 0x7f0a1383);
       this.u = m1.f(p0, 0x7f0a2af9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       return;
    }
}
