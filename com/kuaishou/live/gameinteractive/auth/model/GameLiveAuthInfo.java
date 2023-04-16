package com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.lang.Object;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONArray;
import g43.a;
import java.util.List;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import pp.a;
import org.json.JSONException;
import q87.c;
import com.kuaishou.live.gameinteractive.auth.model.a;
import java.lang.Boolean;
import java.util.Set;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Iterator;
import android.util.SparseArray;
import java.util.HashSet;
import java.lang.Integer;
import com.kuaishou.live.gameinteractive.auth.model.a$a;
import java.util.Collections;

public class GameLiveAuthInfo	// class@001bcd
{
    public String a;
    public a b;
    public a c;
    public String d;
    public List e;
    public String f;
    public String g;

    public void GameLiveAuthInfo(){
       super();
    }
    public static GameLiveAuthInfo f(JSONObject p0){
       a obj4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       GameLiveAuthInfo obj1 = PatchProxy.applyOneRefs(p0, obj, GameLiveAuthInfo.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new GameLiveAuthInfo();
       obj1.a = p0.optString("openId");
       obj1.d = p0.optString("gameName");
       obj1.f = p0.optString("title");
       obj1.g = p0.optString("message");
       JSONArray jSONArray = p0.optJSONArray("icon");
       ArrayList obj2 = PatchProxy.applyOneRefs(jSONArray, obj, a.class, "2");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else if(jSONArray == null){
          obj2 = new ArrayList(jSONArray.length());
          int i = 0;
          while (i < jSONArray.length()) {
             try{
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Object obj3 = PatchProxy.applyOneRefs(jSONObject, obj, a.class, "1");
                if (obj3 != patchProxyRe) {
                   obj4 = obj3;
                }else if(jSONObject == null){
                   obj4 = obj;
                }else {
                   obj4 = a.a.h(jSONObject.toString(), a.class);
                }
             }catch(org.json.JSONException e10){
                Object[] objArray = new Object[0];
                a.C().t("GameLiveAuthImage", e10.getMessage(), objArray);
             }
             if (obj != null) {
                obj2.add(obj);
                obj4 = obj;
             }
             i = i + 1;
          }
          obj = obj2;
       }
       obj1.e = obj;
       obj1.b = a.c(p0.optJSONObject("userInfo"));
       obj1.c = a.c(p0.optJSONObject("liveInfo"));
       return obj1;
    }
    public boolean a(){
       boolean b;
       GameLiveAuthInfo obj = PatchProxy.apply(null, this, GameLiveAuthInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null && obj.b.isEmpty()) {
          obj = this.c;
          if (obj != null && obj.b.isEmpty()) {
             b = true;
          label_002f :
             return b;
          }
       }
       b = false;
       goto label_002f ;
    }
    public String b(){
       ArrayList obj = PatchProxy.apply(null, this, GameLiveAuthInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       GameLiveAuthInfo tb = this.b;
       if (tb != null) {
          obj.addAll(tb.a(tb.b));
       }
       tb = this.c;
       if (tb != null) {
          obj.addAll(tb.a(tb.b));
       }
       String str = "";
       if (!obj.isEmpty() && (!TextUtils.isEmpty(this.f) && (this.f).contains("{}"))) {
          StringBuilder str1 = "";
          Iterator iterator = obj.iterator();
          String str2 = null;
          while (iterator.hasNext()) {
             str1 = str1+iterator.next()+"¡¢";
             str2 = 1;
          }
          GameLiveAuthInfo tf = this.f;
          if (str2 != null) {
             str = str1.substring(0, str1.lastIndexOf("¡¢"));
          }
          return tf.replace("{}", str);
       }else {
          return (this.f).replace("{}", str);
       }
    }
    public Set c(Set p0){
       a a;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, GameLiveAuthInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       String str = "GameLiveAuthInfo";
       if (p0 == null || !p0.size()) {
          obj = new Object[i];
          a.C().t(str, "composeUserInfoAuthByLiveInfoAuth error! liveAuthCodes empty!", obj);
          return Collections.emptySet();
       }else {
          GameLiveAuthInfo tc = this.c;
          if (tc != null && tc.c != null) {
             a = tc.a;
             if (a != null && a.size() != this.c.c.size()) {
                HashSet hashSet = new HashSet();
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   Integer integer = iterator.next();
                   if (integer != null) {
                      a$a uoa = this.c.c.get(integer.intValue());
                      if (uoa != null) {
                         uoa = uoa.relatedUserAuth;
                         if (uoa != null) {
                            tc = this.b;
                            if (tc != null && tc.a != null) {
                               Iterator iterator1 = uoa.iterator();
                               while (iterator1.hasNext()) {
                                  Integer integer1 = iterator1.next();
                                  if (integer1 != null && !this.b.a.contains(integer1)) {
                                     hashSet.add(integer1);
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                         }
                      }
                   }
                }
                GameLiveAuthInfo tb = this.b;
                if (tb != null) {
                   a a1 = tb.a;
                   if (a1 != null) {
                      hashSet.removeAll(a1);
                   }
                }
                return hashSet;
             }
          }
          obj = new Object[i];
          a.C().t(str, "composeUserInfoAuthByLiveInfoAuth error! liveAuth empty!", obj);
          return Collections.emptySet();
       }
    }
    public boolean d(Set p0,boolean p1){
       GameLiveAuthInfo tb;
       GameLiveAuthInfo gameLiveAuth = GameLiveAuthInfo.class;
       if (PatchProxy.isSupport(gameLiveAuth)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, gameLiveAuth, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p1) {
          tb = this.b;
          if (tb != null) {
             a a = tb.a;
             if (a != null && p0 != null) {
                return a.containsAll(p0);
             }
          }
          return b;
       }else {
          tb = this.c;
          if (tb == null || (tb.a != null && p0 != null)) {
             Set set = this.c(p0);
             set = (set != null && !set.isEmpty())? this.d(set, true): true;
             if (this.c.a.containsAll(p0) && set) {
                b = true;
             }
          }
       label_005c :
          return b;
       }
    }
    public boolean e(Set p0,boolean p1){
       String obj;
       Iterator iterator;
       GameLiveAuthInfo gameLiveAuth = GameLiveAuthInfo.class;
       if (PatchProxy.isSupport(gameLiveAuth)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, gameLiveAuth, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "GameLiveAuthInfo";
       int i = 0;
       if (p0 == null || !p0.size()) {
          Object[] objArray = new Object[i];
          a.C().t(obj, "isInRequiredList error! authCodes empty!", objArray);
          return i;
       }else if(p1){
          GameLiveAuthInfo tb = this.b;
          if (tb != null && tb.c != null) {
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer != null && this.b.c.indexOfKey(integer.intValue()) < 0) {
                   return i;
                }
             }
          }
          return true;
       }else {
          HashSet hashSet = new HashSet();
          GameLiveAuthInfo tc = this.c;
          if (tc != null && tc.c != null) {
             iterator = p0.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Integer integer1 = iterator.next();
                   if (integer1 != null) {
                      if (this.c.c.indexOfKey(integer1.intValue()) < 0) {
                         break ;
                      }else {
                         a$a uoa = this.c.c.get(integer1.intValue());
                         if (uoa != null) {
                            uoa = uoa.relatedUserAuth;
                            if (uoa != null) {
                               hashSet.addAll(uoa);
                            }
                         }
                      }
                   }
                }
             }
             return i;
          }
          if (hashSet.size() > 0) {
             Object[] objArray1 = new Object[i];
             a.C().w(obj, "isInRequiredList  liveInfo check Length passed! Now, check related userInfo", objArray1);
             return this.e(hashSet, true);
          }else {
             return true;
          }
       }
    }
}
