package com.kwai.privacykit.config.PrivacyConfig;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.privacykit.config.PrivacyPolicy;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;

public class PrivacyConfig	// class@0013bf
{
    public int configVersion;
    public String mAppVersion;
    public long mCreateTime;
    public Map mExtra;
    public String mKpn;
    public List mPrivacyPolicies;

    public void PrivacyConfig(List p0){
       super();
       this.mPrivacyPolicies = p0;
    }
    public boolean a(String p0,String p1,String p2,boolean p3){
       Object obj;
       boolean b1;
       if (PatchProxy.isSupport(PrivacyConfig.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, PrivacyConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       PrivacyPolicy privacyPolic = this.c(p0);
       boolean b = false;
       if (privacyPolic == null) {
          return b;
       }else if(PatchProxy.isSupport(PrivacyPolicy.class)){
          obj = PatchProxy.applyThreeRefs(p1, p2, Boolean.valueOf(p3), privacyPolic, PrivacyPolicy.class, "1");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(p3){
             Object obj1 = PatchProxy.applyTwoRefs(p1, p2, privacyPolic, PrivacyPolicy.class, "3");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else {
                b1 = privacyPolic.d(privacyPolic.mWhitelistScenes, p1, p2);
             }
          }else {
             p2 = PatchProxy.applyOneRefs(p1, privacyPolic, PrivacyPolicy.class, "2");
             if (p2 != PatchProxyResult.class) {
                b = p2.booleanValue();
             }else {
                privacyPolic = privacyPolic.mBizList;
                if (privacyPolic != null && privacyPolic.contains(p1)) {
                   b = 1;
                }
             }
             b1 = b;
          }
       }else {
          goto label_004b ;
       }
       return b1;
    }
    public int b(){
       return this.configVersion;
    }
    public PrivacyPolicy c(String p0){
       PrivacyPolicy privacyPolic;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, PrivacyConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPrivacyPolicies.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          privacyPolic = obj.next();
          if (TextUtils.equals(p0, privacyPolic.c())) {
             break ;
          }
       }
       return privacyPolic;
    }
}
