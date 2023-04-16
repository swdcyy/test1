package j89.f;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewStartupModel;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.kswebview.a;
import java.lang.Throwable;
import android.util.Log;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewSwitchConfigModel;
import msd.l;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;
import com.kwai.robust.PatchProxyResult;
import j89.f$a;
import java.lang.reflect.Type;
import el.a;
import android.content.SharedPreferences;
import km8.b;
import j89.f$b;
import j89.f$c;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Long;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewCounterModel;
import com.kwai.framework.abtest.f;

public class f implements CNYWebviewIntelligentPreinit	// class@0027ab
{
    public static l a;
    public static CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel b;

    public void f(){
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       CNYWebviewIntelligentPreinit$CNYWebviewStartupModel uCNYWebviewS = new CNYWebviewIntelligentPreinit$CNYWebviewStartupModel();
       p0 = this.g(p0);
       uCNYWebviewS.mStartupRuleList = p0;
       a.a.q(p0);
       a.b(uCNYWebviewS);
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       CNYWebviewIntelligentPreinit$CNYWebviewSwitchConfigModel uCNYWebviewS = new CNYWebviewIntelligentPreinit$CNYWebviewSwitchConfigModel();
       p0 = this.g(p0);
       uCNYWebviewS.mSwitchConfigRuleList = p0;
       a.a.q(p0);
       a.c(uCNYWebviewS);
       return;
    }
    public void c(l p0){
       f.a = p0;
    }
    public synchronized CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel d(){
       SharedPreferences a;
       CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel mLoadRule;
       Object[] objArray = null;
       CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel obj = PatchProxy.apply(objArray, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 4;
       if (f.b != null) {
          a.a.q(f.b);
          return f.b;
       }else {
          Type type = new f$a(this).getType();
          a = a.a;
          String str = a.getString("kswitchWebviewPreload", "[]");
          Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, type);
          Type type1 = new f$b(this).getType();
          StringBuilder str1 = a.getString("webKernelPreLoad", "[]");
          Object[] objArray2 = (str1 == null || str1 == "")? objArray: b.a(str1, type1);
          Type type2 = new f$c(this).getType();
          String str2 = a.getString("mCounterMap", "{}");
          if (str2 != null && str2 != "") {
             objArray = b.a(str2, type2);
          }
          if (objArray == null) {
             objArray = new HashMap();
          }
          ArrayList uArrayList = new ArrayList();
          if (objArray1 != null) {
             uArrayList.addAll(objArray1);
          }
          if (objArray2 != null) {
             uArrayList.addAll(objArray2);
          }
          Gson a1 = a.a;
          a1.q(objArray1);
          a1.q(objArray2);
          a1.q(objArray);
          a1.q(uArrayList);
          Iterator iterator = uArrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel uCNYWebviewL = iterator.next();
                Integer integer = objArray.get(uCNYWebviewL.mId);
                if (integer == null) {
                   integer = Integer.valueOf(0);
                }
                if (integer.intValue() >= uCNYWebviewL.mFrequency) {
                   str1 = "规则未命中 已生效："+integer+" frequency："+uCNYWebviewL.mFrequency+a.a.q(uCNYWebviewL);
                }else {
                   long l = System.currentTimeMillis();
                   if (l - uCNYWebviewL.mStartTime.longValue() < 0 || l - uCNYWebviewL.mEndTime.longValue() > 0) {
                      a.a.q(uCNYWebviewL);
                   }else {
                      CNYWebviewIntelligentPreinit$CNYWebviewCounterModel uCNYWebviewC = new CNYWebviewIntelligentPreinit$CNYWebviewCounterModel();
                      objArray.put(uCNYWebviewL.mId, Integer.valueOf((integer.intValue() + 1)));
                      uCNYWebviewC.mCounterMap = objArray;
                      a.a(uCNYWebviewC);
                      f.b = uCNYWebviewL;
                      a.a.q(uCNYWebviewL);
                      mLoadRule = uCNYWebviewL.mLoadRule;
                      if (mLoadRule == 1) {
                         f.b.mLoadRule = f.f("CNYWebviewInitRule1", 1);
                         f.b.mLoadRule = (f.b.mLoadRule == -1)? 1: f.b.mLoadRule;
                      }else if(mLoadRule == obj){
                         f.b.mLoadRule = f.f("CNYWebviewInitRule4", obj);
                         f.b.mLoadRule = (f.b.mLoadRule == -1)? obj: f.b.mLoadRule;
                      }else if(mLoadRule == 5){
                         f.b.mLoadRule = f.f("CNYWebviewInitRule5", 5);
                         f.b.mLoadRule = (f.b.mLoadRule == -1)? 5: f.b.mLoadRule;
                      }
                      break ;
                   }
                }
             }else {
                mLoadRule = new CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel();
                mLoadRule.mLoadRule = obj;
                mLoadRule.mFrequency = 666;
                mLoadRule.mId = "clientdefault";
                mLoadRule.mStartTime = Long.valueOf(0);
                mLoadRule.mEndTime = Long.valueOf(Long.MAX_VALUE);
                f.b = mLoadRule;
                a.a.q(mLoadRule);
                return mLoadRule;
             }
          }
          return f.b;
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       a.a(new CNYWebviewIntelligentPreinit$CNYWebviewCounterModel());
       a.b(new CNYWebviewIntelligentPreinit$CNYWebviewStartupModel());
       a.c(new CNYWebviewIntelligentPreinit$CNYWebviewSwitchConfigModel());
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       l a = f.a;
       if (a != null) {
          a.invoke(p0);
       }
       return;
    }
    public final List g(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel uCNYWebviewL = iterator.next();
          CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel mLoadRule = uCNYWebviewL.mLoadRule;
          if (mLoadRule < null || mLoadRule > 6) {
             a.a.q(uCNYWebviewL);
          }else if((uCNYWebviewL.mId).equals("unset")){
             a.a.q(uCNYWebviewL);
          }else if(uCNYWebviewL.mStartTime.longValue() || (uCNYWebviewL.mEndTime.longValue() && (uCNYWebviewL.mStartTime.longValue() < 0 || uCNYWebviewL.mEndTime.longValue() < 0))){
             a.a.q(uCNYWebviewL);
          }else if(uCNYWebviewL.mFrequency < null){
             a.a.q(uCNYWebviewL);
          }else {
             obj.add(uCNYWebviewL);
          }
       }
       return obj;
    }
}
