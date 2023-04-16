package com.kuaishou.merchant.transaction.purchase.presenter.w0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.w0$a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import vm4.e;
import java.util.Collection;
import ekd.q;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;
import java.util.List;
import com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import android.view.ViewGroup;
import android.view.View;
import ekd.p1;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.library.widget.edittext.SafeEditText;
import android.widget.EditText;
import we4.e;
import android.text.TextWatcher;
import um4.l2;
import com.kwai.robust.PatchProxyResult;
import um4.n2;

public class w0 extends PresenterV2 implements g	// class@0009b6
{
    public w0$c p;
    public Map q;
    public List r;
    public LinkedHashMap s;
    public HashMap t;
    public TextWatcher u;
    public LinearLayout v;

    public void w0(){
       super();
       this.p = new w0$a(this);
       this.t = new HashMap();
    }
    public void E8(){
       w0 ow0 = w0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow0, "5")) {
          return;
       }
       if (e.i(this.q, "rechargeAccountMultiRow") && !q.f(this.r)) {
          int i = 0;
          this.v.setVisibility(i);
          if (!PatchProxy.applyVoid(objArray, this, ow0, "6")) {
             this.v.removeAllViews();
             if (!q.f(this.r)) {
                this.s = new LinkedHashMap();
                while (i < this.r.size()) {
                   RechargeConfig rechargeConf = this.r.get(i);
                   if (rechargeConf != null) {
                      View view = p1.h(this.v, R.layout.arg_RES_7f0d06a2);
                      view.findViewById(R.id.tv_recharge_multi_row_label).setText(rechargeConf.mLabel);
                      View view1 = view.findViewById(R.id.view_recharge_multi_row_divider);
                      if (!PatchProxy.applyVoidTwoRefs(rechargeConf, view, this, ow0, "8")) {
                         SafeEditText safeEditText = view.findViewById(R.id.et_recharge_multi_row_account);
                         if (rechargeConf.mAccountNumType == 2) {
                            safeEditText.setInputType(3);
                            if (this.u == null) {
                               this.u = new e();
                            }
                            safeEditText.addTextChangedListener(this.u);
                         }else {
                            safeEditText.setInputType(1);
                         }
                         safeEditText.addTextChangedListener(new l2(this, rechargeConf));
                         safeEditText.setHintText(rechargeConf.mInputHint);
                         safeEditText.setText(this.t.get(rechargeConf.mLabel));
                         this.s.put(rechargeConf, safeEditText);
                      }
                      this.v.addView(view);
                      view = view1;
                   }
                   i = i + 1;
                }
                if (objArray != null) {
                   objArray.setVisibility(8);
                }
             }
          }
       }else {
          this.v.setVisibility(8);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "7")) {
          return;
       }
       if (!q.h(this.s)) {
          this.s.clear();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "4")) {
          return;
       }
       this.v = p0.findViewById(0x7f0a343e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, w0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(w0.class, new n2());
       }else {
          obj.put(w0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "3")) {
          return;
       }
       this.q = this.t8("page_module_info");
       this.r = this.t8("recharge_config_list");
       return;
    }
}
