package com.kuaishou.merchant.transaction.purchase.presenter.j0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.j0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.merchant.transaction.base.model.PageModuleInfo;
import android.view.View;
import android.view.ViewStub;
import com.kwai.library.widget.edittext.SafeEditText;
import we4.e;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.transaction.purchase.model.RechargeConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import um4.s1;
import java.util.HashMap;

public class j0 extends PresenterV2 implements g	// class@000985
{
    public j0$b p;
    public Map q;
    public ViewStub r;
    public View s;
    public SafeEditText t;
    public List u;
    public RechargeConfig v;

    public void j0(){
       super();
       this.p = new j0$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j0.class, "3")) {
          return;
       }
       j0 tq = this.q;
       if (tq != null) {
          PageModuleInfo pageModuleIn = tq.get("phoneNumber");
          if (pageModuleIn != null && pageModuleIn.mDisplayType == 2) {
             tq = this.r;
             if (tq != null) {
                View view = tq.inflate();
                this.s = view;
                SafeEditText safeEditText = view.findViewById(R.id.et_phone_number);
                this.t = safeEditText;
                safeEditText.addTextChangedListener(new e());
                if (!q.f(this.u)) {
                   RechargeConfig rechargeConf = this.u.get(0);
                   this.v = rechargeConf;
                   if (rechargeConf != null && !TextUtils.x(rechargeConf.mPhoneNumber)) {
                      this.t.setText(this.v.mPhoneNumber);
                   }
                }
                this.r = objArray;
             }
             this.s.setVisibility(0);
          }else {
          label_006a :
             tq = this.s;
             if (tq != null) {
                tq.setVisibility(8);
             }
          }
       }else {
          goto label_006a ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a3b90);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j0.class, new s1());
       }else {
          obj.put(j0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j0.class, "1")) {
          return;
       }
       this.q = this.t8("page_module_info");
       this.u = this.t8("recharge_config_list");
       return;
    }
}
