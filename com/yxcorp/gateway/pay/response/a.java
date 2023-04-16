package com.yxcorp.gateway.pay.response.a;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import lv8.d;
import com.yxcorp.gateway.pay.response.b;
import java.lang.Class;
import com.google.gson.Gson;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.response.b$a;
import java.lang.StringBuilder;

public class a	// class@001272
{
    public String a;
    public String b;
    public String c;
    public b d;

    public void a(Map p0){
       super();
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (TextUtils.equals(str, "resultStatus")) {
             this.a = p0.get(str);
          }else if(TextUtils.equals(str, "result")){
             str = p0.get(str);
             try{
                this.b = str;
                this.d = d.a.h(str, b.class);
             }catch(java.lang.Exception e0){
                goto label_000e ;
             }
          }else if(TextUtils.equals(str, "memo")){
             this.c = p0.get(str);
          }
       }
       return;
    }
    public String a(){
       return this.a;
    }
    public String b(){
       b$a b;
       b$a c;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       Object[] objArray1 = (obj == null)? objArray: obj.a;
       if (objArray1 != null) {
          objArray = objArray1.a;
          b = objArray1.b;
          c = objArray1.c;
       }else {
          c = objArray;
          b = c;
       }
       return "resultStatus="+this.a+", code="+objArray+", msg="+b+", subMsg="+c+", memo="+this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "resultStatus={"+this.a+"};memo={"+this.c+"};result={"+this.b+"}";
    }
}
