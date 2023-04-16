package com.kuaishou.merchant.transaction.purchase.presenter.a0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$g;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$d;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$e;
import android.view.View;
import com.kuaishou.merchant.transaction.purchase.model.FollowingInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import ha0.a;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.Map;
import com.kuaishou.merchant.transaction.base.model.PageModuleInfo;
import android.widget.ImageView;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$c;
import android.view.View$OnClickListener;
import um4.t0;
import java.util.HashMap;

public class a0 extends PresenterV2 implements g	// class@000964
{
    public boolean A;
    public boolean B;
    public boolean C;
    public a0$g D;
    public ViewTreeObserver$OnScrollChangedListener E;
    public a0$f p;
    public Map q;
    public FollowingInfo r;
    public boolean s;
    public View t;
    public View u;
    public ImageView v;
    public TextView w;
    public c x;
    public boolean y;
    public boolean z;

    public void a0(){
       super();
       this.p = new a0$a(this);
       this.E = new a0$b(this);
    }
    public void E8(){
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa0, "3")) {
          return;
       }
       a0$d uod = PatchProxy.apply(objArray, this, uoa0, "6");
       if (uod != PatchProxyResult.class) {
       }else if(this.P8()){
          uod = new a0$d(this);
       }else {
          uod = new a0$e(this);
       }
       this.D = uod;
       if (this.R8()) {
          this.t.setVisibility(0);
          uoa0 = this.w;
          a0 tr = this.r;
          if (tr != null) {
             objArray = tr.mDesc;
          }
          uoa0.setText(objArray);
          this.S8(this.P8());
       }else {
          this.t.setVisibility(8);
       }
       ViewTreeObserver viewTreeObse = this.u.getViewTreeObserver();
       if (viewTreeObse != null && viewTreeObse.isAlive()) {
          viewTreeObse.addOnScrollChangedListener(this.E);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0.class, "4")) {
          return;
       }
       this.y = false;
       a0 tx = this.x;
       if (tx != null) {
          tx.o();
          this.x = objArray;
       }
       ViewTreeObserver viewTreeObse = this.u.getViewTreeObserver();
       if (viewTreeObse != null && viewTreeObse.isAlive()) {
          viewTreeObse.removeOnScrollChangedListener(this.E);
       }
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, a0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = a.a();
       boolean b = true;
       if (this.r == null || (l && DateUtils.r(l, System.currentTimeMillis()) <= this.r.mDaysOfUncheckSubmitOrder)) {
          b = false;
       }
    label_0033 :
       return b;
    }
    public boolean R8(){
       a0 obj = PatchProxy.apply(null, this, a0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       boolean b = true;
       if (obj != null) {
          PageModuleInfo pageModuleIn = obj.get("following");
          if (pageModuleIn != null && pageModuleIn.mDisplayType == 2) {
             obj = 1;
          label_002c :
             a0 tr = this.r;
             tr = (tr != null && tr.mHasFollowed != null)? 1: 0;
             if (!obj || (tr || this.s == null)) {
                b = false;
             }
             return b;
          }
       }
       obj = null;
       goto label_002c ;
    }
    public void S8(boolean p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "9")) {
          return;
       }
       uoa0 = this.v;
       int i = (p0)? 0x7f082547: 0x7f082546;
       uoa0.setImageResource(i);
       this.y = p0;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a0f7d);
       this.v = p0.findViewById(0x7f0a1529);
       this.w = p0.findViewById(0x7f0a4186);
       this.u = p0.findViewById(0x7f0a3750);
       this.t.setOnClickListener(new a0$c(this, false, 200));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a0.class, new t0());
       }else {
          obj.put(a0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.q = this.t8("page_module_info");
       this.r = this.t8("follow_info");
       this.s = this.v8("can_sale", Boolean.class).booleanValue();
       return;
    }
}
