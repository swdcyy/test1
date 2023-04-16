package com.frog.engine.network.xhr.FrogHttpRequestClient$a;
import okhttp3.Callback;
import com.frog.engine.network.xhr.FrogHttpResultCallBack;
import com.frog.engine.network.xhr.FrogXHRTask;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import okhttp3.Response;
import java.util.Map;
import okhttp3.ResponseBody;
import okhttp3.Headers;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;

public final class FrogHttpRequestClient$a implements Callback	// class@001563
{
    public final long a;
    public final FrogHttpResultCallBack b;
    public final FrogXHRTask c;

    public void FrogHttpRequestClient$a(long p0,FrogHttpResultCallBack p1,FrogXHRTask p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogHttpRequestClient$a.class, "1")) {
          return;
       }
       if (KsFrogPerfReportManager.instance().isHttpPerfEnable()) {
          KsFrogPerfReportManager.instance().reportHttpPerfEx(this.a, p1);
       }
       FrogHttpRequestClient$a tb = this.b;
       if (tb != null) {
          tb.onFail(p1.getMessage());
       }
       return;
    }
    public void onResponse(Call p0,Response p1){
       byte[] uobyteArray;
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogHttpRequestClient$a.class, "2")) {
          return;
       }
       if (KsFrogPerfReportManager.instance().isHttpPerfEnable()) {
          KsFrogPerfReportManager.instance().reportLogObject(this.a);
       }
       if (p1 == null) {
          FrogHttpRequestClient$a tb = this.b;
          if (tb != null) {
             tb.onFail("response is null");
          }
          return;
       }else {
          int i = p1.code();
          String str = null;
          if (("arraybuffer").equals(this.c.getConfigs().get("responseType"))) {
             uobyteArray = p1.body().bytes();
          }else {
             String str1 = p1.body().string();
             uobyteArray = str;
          }
          Headers headers = p1.headers();
          if (headers != null) {
             str = p1.headers().values("Set-Cookie");
          }
          ArrayList uArrayList = new ArrayList();
          if (str != null) {
             iterator = str.iterator();
             while (iterator.hasNext()) {
                String[] stringArray = (iterator.next()).split(";");
                if (stringArray != null) {
                   int len = stringArray.length;
                   int i1 = 0;
                   while (i1 < len) {
                      object oobject = stringArray[i1];
                      if (!TextUtils.isEmpty(oobject)) {
                         uArrayList.add(oobject.trim());
                      }
                      i1 = i1 + 1;
                   }
                }
             }
          }
          if (this.b != null) {
             HashMap hashMap = new HashMap();
             iterator = headers.names().iterator();
             while (iterator.hasNext()) {
                str = iterator.next();
                hashMap.put(str, headers.get(str));
             }
             this.b.onResult(i, "", uobyteArray, hashMap, uArrayList);
          }
       }
    }
}
