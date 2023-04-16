package com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import bu7.m;
import bu7.h;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog$1;
import java.lang.Object;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import ekd.k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import bu7.j;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import bu7.i0;
import com.kwai.tokenshare.presenter.s;
import com.kwai.tokenshare.presenter.KwaiTokenMerchantLotteryDialogPresenter;
import java.lang.Number;
import bu7.l;
import q87.c;
import com.kwai.tokenshare.presenter.h;
import com.kwai.tokenshare.presenter.KwaiTokenMerchantBrotherGroupDialogPresenter;
import com.kwai.tokenshare.presenter.e;
import android.util.Pair;
import java.lang.Integer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i2b.a;
import java.lang.IllegalArgumentException;

public class KwaiTokenCustomPopUpDialog implements PopupInterface$f, m	// class@001912
{
    public BaseDialogInfo b;
    public c c;
    public PresenterV2 d;
    public m e;
    public static j f;
    public static final List g;

    static {
       KwaiTokenCustomPopUpDialog.f = new h();
       KwaiTokenCustomPopUpDialog.g = new KwaiTokenCustomPopUpDialog$1();
    }
    public void KwaiTokenCustomPopUpDialog(){
       super();
    }
    public static boolean d(BaseDialogInfo p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiTokenCustomPopUpDialog kwaiTokenCus = KwaiTokenCustomPopUpDialog.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, kwaiTokenCus, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null && p0.mShowType == 107) {
          Object obj1 = PatchProxy.applyOneRefs(p0, null, kwaiTokenCus, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             p0 = p0.mExtParams;
             if (p0 != null) {
                String str = k0.h(p0, "dialogType", "");
                if (!TextUtils.x(str) && (KwaiTokenCustomPopUpDialog.g.contains(str) || KwaiTokenCustomPopUpDialog.f.b().contains(str))) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (b1) {
          label_005a :
             return b;
          }
       }
    label_0059 :
       b = false;
       goto label_005a ;
    }
    public void Gf(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenCustomPopUpDialog.class, "10")) {
          return;
       }
       KwaiTokenCustomPopUpDialog te = this.e;
       if (te != null) {
          te.Gf();
       }
       return;
    }
    public void H1(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenCustomPopUpDialog.class, "12")) {
          return;
       }
       KwaiTokenCustomPopUpDialog te = this.e;
       if (te != null) {
          te.H1();
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenCustomPopUpDialog.class, "11")) {
          return;
       }
       KwaiTokenCustomPopUpDialog te = this.e;
       if (te != null) {
          te.V8();
       }
       return;
    }
    public void Zc(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenCustomPopUpDialog.class, "9")) {
          return;
       }
       KwaiTokenCustomPopUpDialog te = this.e;
       if (te != null) {
          te.Zc();
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, KwaiTokenCustomPopUpDialog.class, "4");
       if (p3 != patchProxyRe) {
          return p3;
       }
       this.c = p0;
       if (i0.c(this.b.mOriginSubBiz)) {
          i = 0x7f0d076e;
          this.d = new s();
       }else if(i0.b(this.b.mOriginSubBiz)){
          i = 0x7f0d0758;
          this.d = new KwaiTokenMerchantLotteryDialogPresenter();
       }else {
          p3 = PatchProxy.apply(null, this, KwaiTokenCustomPopUpDialog.class, "5");
          if (p3 != patchProxyRe) {
             i = p3.intValue();
          }else {
             BaseDialogInfo mExtParams = this.b.mExtParams;
             if (mExtParams == null) {
                Object[] objArray1 = new Object[false];
                l.C().t("KwaiTokenCustomPopUpDialog", "下发的自定义弹窗数据extParams == null", objArray1);
             }else {
                String str = k0.h(mExtParams, "dialogType", "");
                if (!TextUtils.x(str)) {
                   if (("follow").equalsIgnoreCase(str)) {
                      i = 0x7f0d075a;
                      this.d = new h();
                   }else if(("groupon").equalsIgnoreCase(str)){
                      i = 0x7f0d075c;
                      this.d = new KwaiTokenMerchantBrotherGroupDialogPresenter();
                   }else if(("share").equalsIgnoreCase(str)){
                      i = 0x7f0d0759;
                      this.d = new e();
                   }else {
                      Pair pair = KwaiTokenCustomPopUpDialog.f.a(str);
                      if (pair != null) {
                         this.d = pair.second;
                         i = pair.first.intValue();
                      }
                   }
                }
             }
             i = 0;
          }
          if (!i) {
             throw new IllegalArgumentException("set correct custom dialog");
          }
       }
       View view = a.g(p1, i, p2, false);
       this.d.f(view);
       Object[] objArray = new Object[]{this.b,this};
       this.d.i(objArray);
       p0.V(1);
       p0.X(false);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenCustomPopUpDialog.class, "6")) {
          return;
       }
       KwaiTokenCustomPopUpDialog td = this.d;
       if (td != null) {
          td.destroy();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenCustomPopUpDialog.class, "7")) {
          return;
       }
       this.c.q(3);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenCustomPopUpDialog.class, "8")) {
          return;
       }
       KwaiTokenCustomPopUpDialog te = this.e;
       if (te != null) {
          te.e();
       }
       return;
    }
}
