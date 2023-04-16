package gra.v;
import gra.b;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import fra.g;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcTokenShowDialogResponse;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.TextView;
import java.lang.CharSequence;
import gra.o;
import java.lang.Enum;
import android.widget.ImageView;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gra.u;
import android.view.View$OnClickListener;
import gra.h;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import gra.v$a;
import gra.v$b;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcPopType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import brd.t;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import t45.d;
import brd.z;
import gra.s;
import erd.o;
import gra.v$d;
import erd.a;
import crd.b;
import gra.q;
import gra.v$c;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;

public final class v extends b	// class@002bcc
{
    public final e A;
    public boolean B;
    public final String r;
    public g s;
    public final e t;
    public final e u;
    public final e v;
    public final e w;
    public final e x;
    public final e y;
    public final e z;
    public static final n[] C;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(v.class, "mOpenBtn", "getMOpenBtn\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mBackground", "getMBackground\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mAvatar", "getMAvatar\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mTitle", "getMTitle\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mSubTitle", "getMSubTitle\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mAmount", "getMAmount\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mYuan", "getMYuan\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(v.class, "mImgClose", "getMImgClose\(\)Landroid/widget/ImageView;", 0))};
       v.C = onArray;
    }
    public void v(){
       super();
       this.r = "GrowthVfcPresenter";
       this.t = this.S8(0x7f0a2ebb);
       this.u = this.S8(0x7f0a03a0);
       this.v = this.S8(0x7f0a0333);
       this.w = this.S8(0x7f0a3f2c);
       this.x = this.S8(0x7f0a3bd1);
       this.y = this.S8(0x7f0a01f5);
       this.z = this.S8(0x7f0a4601);
       this.A = this.S8(0x7f0a13a9);
    }
    public void E8(){
       GrowthVfcTokenShowDialogResponse activityType;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "14")) {
          return;
       }
       v ts = this.s;
       String str = "mCallContext";
       if (ts == null) {
          a.S(str);
       }
       GrowthVfcModel growthVfcMod = ts.b();
       if (growthVfcMod != null) {
          growthVfcMod = growthVfcMod.tokenShowDialog;
          if (growthVfcMod != null) {
             this.j9().setImageURI(growthVfcMod.background);
             KwaiImageView kwaiImageVie = PatchProxy.apply(objArray, this, ov, "5");
             GrowthVfcTokenShowDialogResponse growthVfcTok = 2;
             if (kwaiImageVie == patchProxyRe) {
                kwaiImageVie = this.v.a(this, v.C[growthVfcTok]);
             }
             kwaiImageVie.setImageURI(growthVfcMod.headImg);
             TextView textView = PatchProxy.apply(objArray, this, ov, "6");
             if (textView == patchProxyRe) {
                textView = this.w.a(this, v.C[3]);
             }
             textView.setText(growthVfcMod.title);
             textView = PatchProxy.apply(objArray, this, ov, "7");
             if (textView == patchProxyRe) {
                textView = this.x.a(this, v.C[4]);
             }
             textView.setText(growthVfcMod.subTitle);
             if (!PatchProxy.applyVoidOneRefs(growthVfcMod, this, ov, "15")) {
                v ts1 = this.s;
                if (ts1 == null) {
                   a.S(str);
                }
                GrowthVfcModel growthVfcMod1 = ts1.b();
                if (growthVfcMod1 != null) {
                   growthVfcMod1 = growthVfcMod1.tokenShowDialog;
                   if (growthVfcMod1 != null) {
                      activityType = growthVfcMod1.activityType;
                   label_009a :
                      if (activityType != null) {
                         int i = o.a[activityType.ordinal()];
                         if (i != 1) {
                            if (i == growthVfcTok) {
                               this.l9().setImageURI(growthVfcMod.btnBgImg);
                               this.l9().setVisibility(0);
                               this.h9().setVisibility(8);
                               this.m9().setVisibility(8);
                               View view = this.k8(R.id.btn_layout);
                               if (view != null) {
                                  view.setVisibility(8);
                               }
                               this.l9().setOnClickListener(new u(this));
                            }
                         }else {
                            View view1 = this.m8();
                            a.o(view1, "rootView");
                            this.Y8(view1, growthVfcMod.btnText, growthVfcMod.btnBgImg);
                            this.l9().setVisibility(8);
                            TextView textView1 = this.h9();
                            textView1.setText(growthVfcMod.amount);
                            textView1.setTypeface(d0.a("alte-din.ttf", textView1.getContext()));
                            this.m9().setText(growthVfcMod.amountUnit);
                         }
                      }
                   }
                }
                activityType = objArray;
                goto label_009a ;
             }
          }
       }
    label_011c :
       Object obj = PatchProxy.apply(objArray, this, ov, "10");
       if (obj != patchProxyRe) {
       }else {
          obj = this.A.a(this, v.C[7]);
       }
       obj.setOnClickListener(new v$a(this));
       this.j9().setOnClickListener(v$b.b);
       GrowthVfcLogger.a.f(GrowthVfcLogger$VfcPopType.TYPE1, this.e9());
       return;
    }
    public String c9(){
       Object[] objArray = null;
       v obj = PatchProxy.apply(objArray, this, v.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mCallContext");
       }
       GrowthVfcModel growthVfcMod = obj.b();
       if (growthVfcMod != null) {
          objArray = growthVfcMod.vUserId;
       }
       return objArray;
    }
    public t d9(){
       Object obj = PatchProxy.apply(null, this, v.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(Boolean.TRUE);
    }
    public final String e9(){
       Object[] objArray = null;
       v obj = PatchProxy.apply(objArray, this, v.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mCallContext");
       }
       GrowthVfcModel growthVfcMod = obj.b();
       if (growthVfcMod != null) {
          growthVfcMod = growthVfcMod.tokenShowDialog;
          if (growthVfcMod != null) {
             objArray = growthVfcMod.logTracker;
          }
       }
       return objArray;
    }
    public final TextView h9(){
       Object obj = PatchProxy.apply(null, this, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.a(this, v.C[5]);
    }
    public void j6(){
       GrowthVfcTokenShowDialogResponse activityType;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "17")) {
          return;
       }
       if (this.B != null) {
          return;
       }
       boolean b = true;
       this.B = b;
       v ts = this.s;
       if (ts == null) {
          a.S("mCallContext");
       }
       GrowthVfcModel growthVfcMod = ts.b();
       if (growthVfcMod != null) {
          growthVfcMod = growthVfcMod.tokenShowDialog;
          if (growthVfcMod != null) {
             activityType = growthVfcMod.activityType;
          label_002d :
             if (activityType == null) {
             label_003f :
                c uoc = this.X8();
                if (uoc != null) {
                   GrowthVfcUtilKt.a(uoc);
                }
             }else {
                int i = o.b[activityType.ordinal()];
                if (i != b) {
                   if (i != 2) {
                      goto label_003f ;
                   }else {
                      ot = PatchProxy.apply(objArray, this, ov, "19");
                      if (ot != patchProxyRe) {
                      }else {
                         ot = this.W8().observeOn(d.b).flatMap(new s(this));
                         a.o(ot, "callLogin\(\).observeOn\(Kw¡­just\(false\)\n      }\n    }");
                      }
                      this.X7(ot.doFinally(new v$d(this)).subscribe());
                   }
                }else {
                   ot = PatchProxy.apply(objArray, this, ov, "18");
                   if (ot != patchProxyRe) {
                   }else {
                      ot = this.W8().observeOn(d.b).flatMap(new q(this));
                      a.o(ot, "callLogin\(\).observeOn\(Kw¡­just\(false\)\n      }\n    }");
                   }
                   this.X7(ot.doFinally(new v$c(this)).subscribeOn(d.a).subscribe());
                }
             }
             GrowthVfcLogger.a.b(GrowthVfcLogger$VfcButtonType.MAIN_BUTTON, GrowthVfcLogger$VfcPopType.TYPE1, this.e9());
             return;
          }
       }
       activityType = objArray;
       goto label_002d ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "11")) {
          return;
       }
       super.j8();
       Object obj = this.r8("GROWTH_VFC_DIALOG_CONTEXT");
       a.o(obj, "inject\(GrowthVfcDialog.GROWTH_VFC_DIALOG_CONTEXT\)");
       this.s = obj;
       return;
    }
    public final KwaiImageView j9(){
       Object obj = PatchProxy.apply(null, this, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.a(this, v.C[1]);
    }
    public final g k9(){
       v obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mCallContext");
       }
       return obj;
    }
    public final KwaiImageView l9(){
       Object obj = PatchProxy.apply(null, this, v.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.a(this, v.C[0]);
    }
    public final TextView m9(){
       Object obj = PatchProxy.apply(null, this, v.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.a(this, v.C[6]);
    }
}
