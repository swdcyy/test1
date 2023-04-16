package com.kwai.privacykit.config.PrivacyPolicy;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.privacykit.config.PrivacyPolicy$Frequency;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Iterator;
import com.kwai.privacykit.config.PrivacyPolicy$a;
import java.lang.CharSequence;
import android.text.TextUtils;

public class PrivacyPolicy	// class@0013c2
{
    public List mAppList;
    public List mBizList;
    public long mCooldownTime;
    public boolean mEnableUidIteration;
    public Map mExtra;
    public PrivacyPolicy$Frequency mFrequency;
    public boolean mLightMode;
    public String mPermission;
    public List mPrivilegedCases;
    public List mWhitelistScenes;

    public void PrivacyPolicy(){
       super();
    }
    public List a(){
       return this.mBizList;
    }
    public long b(){
       PrivacyPolicy obj = PatchProxy.apply(null, this, PrivacyPolicy.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mFrequency;
       if (obj == null) {
          return Long.MAX_VALUE;
       }
       PrivacyPolicy$Frequency mUnit = obj.mUnit;
       Objects.requireNonNull(mUnit);
       if (mUnit.equals("day")) {
          return 0x5265c00;
       }
       if (!mUnit.equals("hour")) {
          return Long.MAX_VALUE;
       }
       return 0x36ee80;
    }
    public String c(){
       return this.mPermission;
    }
    public final boolean d(List p0,String p1,String p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PrivacyPolicy.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          PrivacyPolicy$a uoa = iterator.next();
          Objects.requireNonNull(uoa);
          Object obj1 = PatchProxy.applyTwoRefs(p1, p2, uoa, PrivacyPolicy$a.class, "1");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(TextUtils.equals(p1, uoa.mBiz)){
             uoa = uoa.mScenes;
             if (uoa != null && uoa.contains(p2)) {
                b = true;
             }
          }
          b = false;
          if (b) {
             break ;
          }
       }
       return true;
    }
}
