package com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter;
import androidx.core.widget.NestedScrollView$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter$6;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.merchant.basic.model.AddressInfo;
import vm4.e;
import android.view.View;
import ue4.o;
import com.kuaishou.merchant.transaction.purchase.presenter.c;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.purchase.presenter.d;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import um4.g;
import o79.i;
import um4.f;
import android.app.Activity;
import u07.t$a;
import com.kuaishou.merchant.transaction.purchase.presenter.b;
import u07.u;
import u07.f;
import com.kwai.library.widget.popup.common.c$b;
import um4.h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Integer;
import android.view.ViewStub;
import com.kuaishou.merchant.transaction.purchase.presenter.d0$b;
import java.lang.Long;
import java.lang.Boolean;
import em4.m;
import androidx.core.widget.NestedScrollView;
import em4.a;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import kc4.c$a;

public class AddressUIPresenter extends PresenterV2 implements NestedScrollView$b	// class@000952
{
    public TextView A;
    public TextView B;
    public TextView C;
    public ViewStub D;
    public View E;
    public TextView F;
    public ViewStub G;
    public View H;
    public TextView I;
    public c J;
    public long K;
    public boolean L;
    public int M;
    public boolean N;
    public final LifecycleObserver O;
    public d0$b p;
    public c$a q;
    public MerchantPurchaseFragment r;
    public a s;
    public Map t;
    public AddressInfo u;
    public PurchasePageParams v;
    public View w;
    public ViewStub x;
    public View y;
    public View z;

    public void AddressUIPresenter(){
       super();
       this.L = true;
       this.M = 0;
       this.O = new AddressUIPresenter$6(this);
    }
    public void E8(){
       AddressUIPresenter uAddressUIPr = AddressUIPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAddressUIPr, "3")) {
          return;
       }
       int i = e.b(this.t, this.u);
       int i1 = 8;
       if (i != 1) {
          if (i != 2) {
             if (!PatchProxy.applyVoid(objArray, this, uAddressUIPr, "13")) {
                if (o.u(this.y)) {
                   this.y.setVisibility(i1);
                }
                if (o.u(this.E)) {
                   this.E.setVisibility(i1);
                }
                if (o.u(this.H)) {
                   this.H.setVisibility(i1);
                }
                this.P8();
                this.W8();
             }
          }else {
             this.Y8(true);
             this.X8(false);
             this.S8(this.E);
             if (PatchProxy.applyVoid(objArray, this, uAddressUIPr, "10") || (this.E != null && this.H != null)) {
                c uoc = new c(this);
                this.E.setOnClickListener(uoc);
                this.H.setOnClickListener(uoc);
                this.I.setText(R.string.arg_RES_7f1033c4);
             }
          }
       }else {
          this.Y8(false);
          this.X8(true);
          this.S8(this.y);
          AddressUIPresenter tu = this.u;
          if (PatchProxy.applyVoidOneRefs(tu, this, uAddressUIPr, "11") || (this.y == null || (this.H != null && tu != null))) {
             d uod = new d(this, tu);
             this.y.setOnClickListener(uod);
             this.H.setOnClickListener(uod);
             AddressUIPresenter tz = this.z;
             int i2 = (tu.mIsDefault == true)? 0: 8;
             tz.setVisibility(i2);
             tz = this.A;
             String str = " ";
             StringBuilder str1 = tu.mProvince+str+tu.mCity+str+tu.mDistrict;
             String str2 = "";
             String str3 = (TextUtils.x(tu.mTownName))? str2: str+tu.mTownName;
             tz.setText(str1+str3);
             this.B.setText(tu.mAddress);
             this.C.setText(tu.mConsignee+str+tu.mMobile);
             tz = this.I;
             str1 = tu.mProvince+tu.mCity+tu.mDistrict;
             if (!TextUtils.x(tu.mTownName)) {
                str2 = tu.mTownName;
             }
             tz.setText(str1+str2+tu.mAddress);
             if (tu.mDisableChange != null) {
                this.I.setCompoundDrawablesWithIntrinsicBounds(objArray, objArray, objArray, objArray);
                this.H.setOnClickListener(new g(this, tu));
             }else {
                this.I.setCompoundDrawablesWithIntrinsicBounds(objArray, objArray, i.e(R.drawable.arg_RES_7f080ec4), objArray);
             }
             if (!PatchProxy.applyVoid(objArray, this, uAddressUIPr, "4") && this.u != null) {
                tu = this.y;
                if (tu != null) {
                   TextView textView = tu.findViewById(R.id.address_disable_tips);
                   this.F = textView;
                   if (textView != null) {
                      if (this.u.mDisableChange != null) {
                         this.B.setCompoundDrawablesWithIntrinsicBounds(objArray, objArray, objArray, objArray);
                         this.F.setVisibility(false);
                         this.F.setText(this.u.mDisableReason);
                         this.y.setOnClickListener(new f(this));
                      }else {
                         textView.setVisibility(i1);
                         this.B.setCompoundDrawablesWithIntrinsicBounds(objArray, objArray, i.e(R.drawable.arg_RES_7f080ec4), objArray);
                      }
                   }
                }
             }
          }
       label_01d4 :
          AddressUIPresenter tu1 = this.u;
          if (PatchProxy.applyVoidOneRefs(tu1, this, uAddressUIPr, "15") || (tu1 != null && !o.s(tu1.mMobile))) {
             Activity activity = this.getActivity();
             if (activity != null) {
                t$a uoa = new t$a(activity);
                uoa.W0(R.string.arg_RES_7f1033c5);
                uoa.y0(R.string.arg_RES_7f1033ee);
                uoa.S0(R.string.arg_RES_7f1033ef);
                uoa.Q0(R.string.arg_RES_7f1033c9);
                uoa.u0(new b(this, tu1));
                t$a uoa1 = f.e(uoa);
                uoa1.p();
                this.J = uoa1.Y(new h(this));
             }
          }
       }
    label_0228 :
       uAddressUIPr = this.u;
       long l = (uAddressUIPr == null)? 0: uAddressUIPr.mAddressId;
       this.V8(i, l, false);
       this.M = i;
       this.K = l;
       this.L = false;
       this.N = true;
       uAddressUIPr = this.r;
       if (uAddressUIPr.M != null) {
          uAddressUIPr.getLifecycle().addObserver(this.O);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AddressUIPresenter.class, "5")) {
          return;
       }
       this.P8();
       this.W8();
       AddressUIPresenter tr = this.r;
       if (tr.M != null) {
          tr.getLifecycle().removeObserver(this.O);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, AddressUIPresenter.class, "14")) {
          return;
       }
       AddressUIPresenter tJ = this.J;
       if (tJ != null) {
          tJ.o();
          this.J = null;
       }
       return;
    }
    public final void R8(int p0){
       View view;
       AddressUIPresenter uAddressUIPr = AddressUIPresenter.class;
       if (PatchProxy.isSupport(uAddressUIPr) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAddressUIPr, "12")) {
          return;
       }
       if (0x7f0a3b8f == p0) {
          uAddressUIPr = this.D;
          if (uAddressUIPr != null) {
             this.E = uAddressUIPr.inflate();
             this.D = null;
          }else if(0x7f0a3b86 == p0){
             uAddressUIPr = this.x;
             if (uAddressUIPr != null) {
                view = uAddressUIPr.inflate();
                this.y = view;
                this.x = null;
                this.z = view.findViewById(0x7f0a1317);
                this.A = this.y.findViewById(0x7f0a423a);
                this.B = this.y.findViewById(0x7f0a4191);
                this.C = this.y.findViewById(0x7f0a41ed);
             }
          }
          if (0x7f0a3b8a == p0) {
             AddressUIPresenter tG = this.G;
             if (tG != null) {
                view = tG.inflate();
                this.H = view;
                this.G = null;
                this.I = view.findViewById(0x7f0a4128);
             }
          }
       }else {
          goto label_0028 ;
       }
       return;
    }
    public final void S8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AddressUIPresenter.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.R8(R.id.stub_floating_address_panel);
       this.w = p0;
       this.p.e(this);
       AddressUIPresenter tH = this.H;
       int i = (this.Z8(this.p.getScrollY(), this.w.getHeight(), this.w.getY()))? 0: 8;
       tH.setVisibility(i);
       return;
    }
    public void V8(int p0,long p1,boolean p2){
       if (PatchProxy.isSupport(AddressUIPresenter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), this, AddressUIPresenter.class, "20")) {
          return;
       }
       if (!p0) {
          return;
       }
       if (this.L == null && (this.K - p1 || p2)) {
          int i = 1;
          if (p0 != i) {
             i = false;
          }
          m.q(i);
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, AddressUIPresenter.class, "9")) {
          return;
       }
       this.p.f(this);
       this.w = null;
       return;
    }
    public final void X8(boolean p0){
       AddressUIPresenter uAddressUIPr = AddressUIPresenter.class;
       if (PatchProxy.isSupport(uAddressUIPr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAddressUIPr, "7")) {
          return;
       }
       if (p0) {
          this.R8(R.id.stub_address_panel);
          this.y.setVisibility(0);
       }else if(o.u(this.y)){
          this.y.setVisibility(8);
       }
       return;
    }
    public final void Y8(boolean p0){
       AddressUIPresenter uAddressUIPr = AddressUIPresenter.class;
       if (PatchProxy.isSupport(uAddressUIPr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAddressUIPr, "6")) {
          return;
       }
       if (p0) {
          this.R8(R.id.stub_no_address_panel);
          this.E.setVisibility(0);
       }else if(o.u(this.E)){
          this.E.setVisibility(8);
       }
       return;
    }
    public final boolean Z8(int p0,int p1,float p2){
       boolean b = ((float)p0 - ((float)p1 + p2) > 0)? true: false;
       return b;
    }
    public void d5(NestedScrollView p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(AddressUIPresenter.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AddressUIPresenter.class, "19")) {
             return;
          }
       }
       AddressUIPresenter tw = this.w;
       if (tw != null && this.H != null) {
          if (!this.Z8(p2, tw.getHeight(), this.w.getY())) {
             i = 8;
          }
          if (i != this.H.getVisibility()) {
             this.H.setVisibility(i);
          }
       }
    label_005c :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AddressUIPresenter.class, "2")) {
          return;
       }
       this.x = p0.findViewById(0x7f0a3b86);
       this.D = p0.findViewById(0x7f0a3b8f);
       this.G = p0.findViewById(0x7f0a3b8a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AddressUIPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("page_scroll_dispatch_service");
       this.r = this.r8("FRAGMENT");
       this.s = this.q8(a.class);
       this.t = this.t8("page_module_info");
       this.u = this.t8("address_id");
       this.v = this.r8("page_params");
       this.q = this.r8("address_service");
       return;
    }
}
