package com.yxcorp.login.helper.d;
import java.lang.Object;
import com.yxcorp.login.loginaction.LoginHelper;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import o1d.a;
import java.lang.StringBuilder;
import o1d.g;
import java.util.HashMap;
import mw4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import m1d.a;
import java.util.Map;
import cjd.e;
import erd.o;
import l1d.d;
import erd.g;
import t45.d;
import brd.z;

public class d	// class@001ab8
{
    public LoginHelper a;

    public void d(){
       super();
       this.a = new LoginHelper();
    }
    public t a(SwitchAccountModel p0,int p1){
       String obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = QCurrentUser.me().getId();
       SwitchAccountModel mUserId = p0.mUserId;
       if (!PatchProxy.applyVoidTwoRefs(obj, mUserId, null, a.class, "20")) {
          String[] stringArray = new String[]{"’ ∫≈»’÷æ"};
          g.c("ø™ º«–ªª’À∫≈«–ªª’À∫≈‘¥uid :"+obj+"«–ªª’À∫≈«–Õ˘uid :"+mUserId, stringArray);
       }
       HashMap hashMap = new HashMap();
       if (!a.h() && !TextUtils.x(p0.mToken)) {
          hashMap.put("switchUserNewToken", p0.mToken);
       }
       if (!TextUtils.x(p0.mApiServiceToken)) {
          hashMap.put("switchUserNewServiceToken", p0.mApiServiceToken);
       }
       return b.a(0x5cfaafff).V(hashMap).map(new e()).doOnNext(new d(this, p0, p1)).subscribeOn(d.c);
    }
}
