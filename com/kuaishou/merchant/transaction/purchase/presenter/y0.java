package com.kuaishou.merchant.transaction.purchase.presenter.y0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.y0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import vm4.e;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import android.widget.EditText;
import we4.e;
import android.text.TextWatcher;
import com.kwai.robust.PatchProxyResult;
import um4.p2;
import java.util.HashMap;

public class y0 extends PresenterV2 implements g	// class@0009bf
{
    public y0$b p;
    public Map q;
    public List r;
    public RechargeConfig s;
    public int t;
    public TextWatcher u;
    public ViewStub v;
    public View w;
    public TextView x;
    public SafeEditText y;
    public TextView z;

    public void y0(){
       super();
       this.p = new y0$a(this);
    }
    public void E8(){
       y0 oy0 = y0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy0, "3")) {
          return;
       }
       int i = 8;
       if (e.i(this.q, "rechargeAccount") && !q.f(this.r)) {
          int i1 = 0;
          RechargeConfig rechargeConf = this.r.get(i1);
          if (rechargeConf != null) {
             if (!PatchProxy.applyVoid(objArray, this, oy0, "5")) {
                y0 tv = this.v;
                if (tv != null) {
                   View view = tv.inflate();
                   this.w = view;
                   this.x = view.findViewById(0x7f0a4231);
                   this.y = this.w.findViewById(0x7f0a0d93);
                   this.z = this.w.findViewById(0x7f0a4230);
                   this.v = objArray;
                }
             }
             this.w.setVisibility(i1);
             if (!PatchProxy.applyVoidOneRefs(rechargeConf, this, oy0, "6")) {
                this.s = rechargeConf;
                this.x.setText(rechargeConf.mLabel);
                this.y.setHintText(rechargeConf.mInputHint);
                y0 tz = this.z;
                if (!TextUtils.x(rechargeConf.mHint)) {
                   i = 0;
                }
                tz.setVisibility(i);
                this.z.setText(rechargeConf.mHint);
                RechargeConfig mAccountNumT = rechargeConf.mAccountNumType;
                if (!PatchProxy.isSupport(oy0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mAccountNumT), this, oy0, "7")) {
                   this.t = mAccountNumT;
                   if (mAccountNumT == 2) {
                      this.y.setInputType(3);
                      if (this.u == null) {
                         this.u = new e();
                      }
                      this.y.addTextChangedListener(this.u);
                   }else {
                      this.y.setInputType(1);
                   }
                }
                if (!TextUtils.x(rechargeConf.mPhoneNumber)) {
                   this.y.setText(rechargeConf.mPhoneNumber);
                }
             }
          }else {
          label_00e3 :
             oy0 = this.w;
             if (oy0 != null) {
                oy0.setVisibility(i);
             }
          }
       }else {
          goto label_00e3 ;
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y0.class, "4")) {
          return;
       }
       this.t = 0;
       this.s = objArray;
       y0 ty = this.y;
       if (ty != null) {
          y0 tu = this.u;
          if (tu != null) {
             ty.removeTextChangedListener(tu);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "2")) {
          return;
       }
       this.v = p0.findViewById(0x7f0a3b91);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, y0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(y0.class, new p2());
       }else {
          obj.put(y0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "1")) {
          return;
       }
       this.q = this.t8("page_module_info");
       this.r = this.t8("recharge_config_list");
       return;
    }
}
