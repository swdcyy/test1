package com.yxcorp.gifshow.share.widget.MerchantSectionFragment$a$a;
import mp7.e;
import com.yxcorp.gifshow.share.widget.MerchantSectionFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uo7.j0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import ekd.m1;
import android.widget.CheckBox;
import android.widget.TextView;
import com.yxcorp.gifshow.share.model.JsMerchantShareParams;
import com.yxcorp.gifshow.share.model.JsMerchantShareParams$Param;
import java.lang.CharSequence;
import mp7.e$a;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import java.lang.Number;
import java.util.List;
import mp7.d;

public final class MerchantSectionFragment$a$a implements e	// class@001d17
{
    public final MerchantSectionFragment a;

    public void MerchantSectionFragment$a$a(MerchantSectionFragment p0){
       a.p(p0, "merchantSectionFragment");
       super();
       this.a = p0;
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       MerchantSectionFragment$a$a uoa$a = MerchantSectionFragment$a$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa$a)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uoa$a, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       if (a.g(p0.c(), "MERCHANT_POP_BANNER")) {
          MerchantSectionFragment$a$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p1, ta, MerchantSectionFragment.class, "1")) {
             View view = m1.f(p1, R.id.cb_copy);
             a.o(view, "bindWidget\(v, R.id.cb_copy\)");
             ta.Y0 = view;
             p1 = m1.f(p1, R.id.tv_introduc);
             a.o(p1, "bindWidget\(v, R.id.tv_introduc\)");
             ta.Z0 = p1;
             if (p1 == null) {
                a.S("introductionTv");
             }
             MerchantSectionFragment x0 = ta.X0;
             if (x0 == null) {
                a.S("shareParams");
             }
             JsMerchantShareParams param = x0.param;
             JsMerchantShareParams$Param clipboardTex = (param != null)? param.clipboardText: null;
             p1.setText(clipboardTex);
          }
       }else {
          i = e$a.a(this, p0, p1, p2, p3, p4);
       }
       return i;
    }
    public void b(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       MerchantSectionFragment$a$a uoa$a = MerchantSectionFragment$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uoa$a, "7")) {
             return;
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       e$a.f(this, p0, p1, p2, p3, p4, p5);
       return;
    }
    public int c(i0 p0,int p1,int p2){
       if (PatchProxy.isSupport(MerchantSectionFragment$a$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MerchantSectionFragment$a$a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       return e$a.d(this, p0, p1, p2);
    }
    public void d(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       MerchantSectionFragment$a$a uoa$a = MerchantSectionFragment$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoa$a, "6")) {
             return;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       e$a.e(this, p0, p1, p2, p3, p4);
       return;
    }
    public List e(int p0){
       return d.b(this, p0);
    }
    public boolean f(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       MerchantSectionFragment$a$a uoa$a = MerchantSectionFragment$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, uoa$a, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "op");
       a.p(p1, "v");
       return e$a.b(this, p0, p1, p2, p3, p4, p5);
    }
    public int g(int p0){
       MerchantSectionFragment$a$a uoa$a = MerchantSectionFragment$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa$a, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = (p0 == 1)? 0x7f0d0480: -1;
       return p0;
    }
    public int h(j0 p0,int p1){
       MerchantSectionFragment$a$a uoa$a = MerchantSectionFragment$a$a.class;
       if (PatchProxy.isSupport(uoa$a)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa$a, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "bundle");
       int i = (a.g(p0.c(), "MERCHANT_POP_BANNER"))? 1: e$a.c(this, p0, p1);
       return i;
    }
    public int i(int p0){
       return d.a(this, p0);
    }
}
