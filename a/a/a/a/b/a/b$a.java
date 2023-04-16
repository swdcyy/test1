package a.a.a.a.b.a.b$a;
import java.lang.Runnable;
import a.a.a.a.b.a.b;
import java.lang.Object;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import java.lang.String;
import a.a.a.a.b.e.b$b;
import a.a.a.a.b.e.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import a.a.a.a.b.e.c;
import a.a.a.a.b.e.a;
import a.a.a.a.b.a.a;
import f.k;
import a.a.a.a.b.f.a$a;
import a.a.a.a.b.f.a;
import java.util.Map;
import f.l;
import java.lang.System;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.event.KSTEException;
import android.os.ConditionVariable;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import org.json.JSONArray;
import java.util.ArrayList;
import org.json.JSONObject;
import a.a.a.a.b.a.c;
import a.a.a.a.b.a.c$a;
import java.io.File;
import f.j;
import android.util.Pair;
import java.lang.Boolean;
import java.util.HashMap;
import f.i;
import android.content.Context;
import d.c;
import java.util.Collection;
import java.lang.StringBuffer;

public class b$a implements Runnable	// class@00000a
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       int b;
       Iterator obj;
       String str7;
       JSONArray jSONArray;
       int i;
       JSONObject jSONObject;
       int i1;
       String str8;
       b$a uoa = this;
       StringBuffer str = "bc init not match list: [";
       String str1 = "bc init fail list: [";
       StringBuilder str2 = "\\|";
       String str3 = "SEC_ERROR_INTERP_LOAD_ERROR";
       String str4 = "";
       if (!MXSec.get().getWrapper().detectEnvironment(str4, str4, 0, 6)) {
          m$c.b("Security SDK is not init!!!");
          b.a(b$b.a, "sdk init failure ", 211);
       }
       uoa.b.s();
       String str5 = m$f.b(b.d(uoa.b).appkey());
       a.a(b.d(uoa.b).recorder());
       b = true;
       if (!a.a().e(str5)) {
          obj = uoa.b.e.a.get(a.a());
          if (obj != null && !(obj.d).isEmpty()) {
             String str6 = str4;
             c$a uoa1 = null;
             if (uoa1 < 5) {
                System.load(obj.d);
                KSTEContext.bInterpLoadStatus = b;
             }
             if (!KSTEContext.bInterpLoadStatus) {
                b.d(uoa.b).initCallback().onError(new KSTEException(101));
                b.e(uoa.b, 0);
                b.a(b$b.a, "SEC_ERROR_INTERP_LOAD_OLD_LIBRARY_ERROR exp:"+str6, 101);
                b.f(uoa.b).open();
                b.i(uoa.b).open();
                a.j(b.d(uoa.b).recorder());
                return;
             }
          }else {
             Iterator iterator1 = uoa.b.e.a.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                str4 = str4+"key:"+uEntry.getKey()+" cdn:"+uEntry.getValue().c+" md5:"+uEntry.getValue().b;
             }
             b.d(uoa.b).initCallback().onError(new KSTEException(103));
             m$c.d("SEC_ERROR_INTERP_NOT_FOUND_LIB_IN_HISTORY");
             b.e(uoa.b, 0);
             b.f(uoa.b).open();
             b.i(uoa.b).open();
             b.a(b$b.a, "SEC_ERROR_INTERP_NOT_FOUND_LIB_IN_HISTORY "+str4, 103);
             a.j(b.d(uoa.b).recorder());
             return;
          }
       }
       if (!KSTEContext.bInterpLoadStatus) {
          b.d(uoa.b).initCallback().onError(new KSTEException(100));
          b.e(uoa.b, 0);
          b.f(uoa.b).open();
          b.i(uoa.b).open();
          m$c.d(str3);
          b.a(b$b.a, str3, 100);
          a.j(b.d(uoa.b).recorder());
          return;
       }else {
          a.b(b.d(uoa.b).recorder());
          if ((b.j(uoa.b)).isEmpty() || ((b.j(uoa.b)).equals("[]") && b.k(uoa.b).isEmpty())) {
             str7 = "Skip bitcode update when there is no cache configuration or no pre-loaded bizid when the app is started for the first time";
          label_0212 :
             m$c.b(str7);
          }else {
             JSONArray jSONArray1 = new JSONArray();
             ArrayList uArrayList = new ArrayList();
             if (!(b.j(uoa.b)).isEmpty()) {
                jSONArray1 = new JSONArray(b.j(uoa.b));
                for (i1 = 0; i1 < jSONArray1.length(); i1 = i1 + 1) {
                   JSONObject jSONObject1 = jSONArray1.getJSONObject(i1);
                   if (c$a.a(jSONObject1.getInt(c.r0)) == c$a.b) {
                      File uFile = new File(jSONObject1.getString(c.q0));
                      if (uFile.exists()) {
                         m$f.c(uFile);
                      }
                      uArrayList.add(jSONObject1.getString(c.k0));
                   }
                   if (!new File(jSONObject1.optString(c.q0, str4)).exists()) {
                      if (jSONObject1.optInt(c.m0) >= jSONObject1.optInt(c.l0)) {
                         jSONObject1.put(c.l0, 0);
                      }else {
                         jSONObject1.put(c.l0, jSONObject1.optInt(c.m0));
                      }
                   }
                   jSONObject1.remove(c.m0);
                   jSONObject1.remove(c.o0);
                   jSONObject1.remove(c.p0);
                   jSONObject1.remove(c.q0);
                   jSONObject1.remove(c.n0);
                }
             }
             obj = b.k(uoa.b).iterator();
             while (obj.hasNext()) {
                j oj = obj.next();
                int i3 = 0;
                int i4 = 0;
                while (i3 < jSONArray1.length()) {
                   if ((jSONArray1.getJSONObject(i3).optString(c.k0, str4)).equals(oj.a)) {
                      i4 = 1;
                   }
                   i3 = i3 + 1;
                   str8 = 1;
                }
                if (!i4) {
                   jSONObject = new JSONObject();
                   jSONObject.put(c.k0, oj.a);
                   jSONObject.put(c.l0, 0);
                   jSONArray1.put(jSONObject);
                }
                str8 = 1;
             }
             JSONArray jSONArray2 = new JSONArray();
             i1 = 0;
             while (i1 < jSONArray1.length()) {
                if (!uArrayList.contains(jSONArray1.getJSONObject(i1).getString(c.k0))) {
                   jSONArray2.put(jSONArray1.getJSONObject(i1));
                }
                i1 = i1 + 1;
             }
             if (uoa.b.e.c == null || !jSONArray2.length()) {
                str7 = "No need to update bitcodes";
                goto label_0212 ;
             }else {
                Pair pair = a.a().c(str5, jSONArray2);
                if (!pair.first.booleanValue()) {
                   jSONArray = new JSONArray();
                   for (i = 0; i < pair.second.size(); i = i + 1) {
                      jSONArray.put(pair.second.get(i));
                   }
                   i1 = 200;
                   b.d(uoa.b).initCallback().onError(new KSTEException("bc update fail list: "+jSONArray, i1));
                   b.a(b$b.a, "performInit SEC_ERROR_BC_UPDATE_FAILS "+jSONArray, i1);
                }
             }
          }
          HashMap hashMap = new HashMap();
          if (!b.m(uoa.b).size()) {
             m$c.d("first launch with nothing bitcode as well as nothing config of startup");
             b.d(uoa.b).initCallback().onError(new KSTEException("lauch without bitcode config", 104));
          }else {
             jSONArray = new JSONArray();
             for (i = 0; i < b.m(uoa.b).size(); i = i + 1) {
                jSONObject = new JSONObject();
                if (b.m(uoa.b).get(i) != null && b.m(uoa.b).get(i).i() != c$a.b) {
                   jSONObject.put(c.k0, b.m(uoa.b).get(i).a);
                   jSONObject.put(c.l0, b.m(uoa.b).get(i).b);
                   jSONObject.put(c.n0, b.m(uoa.b).get(i).d);
                   jSONObject.put(c.o0, b.m(uoa.b).get(i).e);
                   jSONObject.put(c.p0, b.m(uoa.b).get(i).g);
                   jSONObject.put(c.q0, b.m(uoa.b).get(i).h);
                }
                jSONArray.put(jSONObject);
             }
             a.e(b.d(uoa.b).recorder());
             String[] stringArray = c.c(b.d(uoa.b).context(), jSONArray.toString());
             a.f(b.d(uoa.b).recorder());
             b = stringArray.length;
             for (i1 = 0; i1 < b; i1 = i1 + 1) {
                object oobject = stringArray[i1];
                hashMap.put(oobject.split(str2)[0], Boolean.valueOf((oobject.split(str2)[1]).equals("1")));
             }
             if (stringArray.length != b.m(uoa.b).size()) {
                str2 = str4;
                for (int i2 = 0; i2 < stringArray.length; i2 = i2 + 1) {
                   str2 = str2+stringArray[i2]+"&&&";
                }
                b.d(uoa.b).initCallback().onError(new KSTEException(str+jSONArray+"]"+str2, 124));
                b.a(b$b.a, str+jSONArray+"]"+str2, 124);
             }
          }
          b.o(uoa.b).addAll(b.m(uoa.b));
          str = "";
          Iterator iterator = b.o(uoa.b).iterator();
          while (iterator.hasNext()) {
             i oi = iterator.next();
             if (hashMap.containsKey(oi.a)) {
                oi.i = hashMap.get(oi.a).booleanValue();
                oi.j = true;
             }
             if (oi.i == null) {
                str = str+"bcid:"+oi.a+"&&";
             }
          }
          if (str.length() > 0) {
             b.d(uoa.b).initCallback().onError(new KSTEException(str1+str+"]", 125));
             b.a(b$b.a, str1+str+"]", 125);
          }
          b.e(uoa.b, 0);
          b.h(uoa.b, true);
          b.f(uoa.b).open();
          b.i(uoa.b).open();
          a.g(b.d(uoa.b).recorder());
          a.h(b.d(uoa.b).recorder());
          b.d(uoa.b).initCallback().onSuccess();
          return;
       }
    }
}
