package p45.g;
import p45.b;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import com.google.gson.JsonObject;
import com.kwai.android.common.config.PushPreference;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import com.kwai.android.common.ext.JsonObjectExtKt;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Exception;
import java.lang.Throwable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.Boolean;

public final class g extends b	// class@002162
{

    public void g(Map p0){
       a.p(p0, "channelVersionMap");
       super(p0);
    }
    public final void e(Channel p0,int p1,String p2,Pair[] p3){
       a.p(p0, "channel");
       String str = "pairs";
       try{
          a.p(p3, str);
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "register_interval_ms", Long.valueOf((System.currentTimeMillis() - PushPreference.getChannelTokenRegisterPeriod())));
          str = "provider";
          String str1 = p0.name();
          if (str1 != null) {
             str1 = str1.toLowerCase();
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
             JsonObjectExtKt.set(jsonObject, str, str1);
             JsonObjectExtKt.set(jsonObject, "error_msg", p2);
             JsonObjectExtKt.set(jsonObject, "error_code", Integer.valueOf(p1));
             int len = p3.length;
             for (p1 = 0; p1 < len; p1++) {
                object oobject = p3[p1];
                str = oobject.getFirst();
                JsonObjectExtKt.set(jsonObject, str, oobject.getSecond());
             }
             b.d(this, "push_token_register_cancel", jsonObject, 0, 4, null);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void f(Channel p0,long p1,Throwable p2,Pair[] p3){
       a.p(p0, "channel");
       String str = "pairs";
       try{
          a.p(p3, str);
          JsonObject jsonObject = new JsonObject();
          str = "provider";
          String str1 = p0.name();
          if (str1 != null) {
             str1 = str1.toLowerCase();
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
             JsonObjectExtKt.set(jsonObject, str, str1);
             JsonObjectExtKt.set(jsonObject, "total_cost_ms", Long.valueOf((SystemClock.elapsedRealtime() - p1)));
             JsonObjectExtKt.set(jsonObject, "error_code", Integer.valueOf(2));
             JsonObjectExtKt.set(jsonObject, "error_msg", Log.getStackTraceString(p2));
             int len = p3.length;
             for (int i = 0; i < len; i++) {
                object oobject = p3[i];
                String first = oobject.getFirst();
                JsonObjectExtKt.set(jsonObject, first, oobject.getSecond());
             }
             b.d(this, "push_token_register_failed", jsonObject, 0, 4, null);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void g(Channel p0,long p1,boolean p2){
       String str = "channel";
       try{
          a.p(p0, str);
          JsonObject jsonObject = new JsonObject();
          str = "provider";
          String str1 = p0.name();
          if (str1 != null) {
             str1 = str1.toLowerCase();
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
             JsonObjectExtKt.set(jsonObject, str, str1);
             JsonObjectExtKt.set(jsonObject, "ignoreRestrict", Boolean.valueOf(p2));
             JsonObjectExtKt.set(jsonObject, "total_cost_ms", Long.valueOf((SystemClock.elapsedRealtime() - p1)));
             b.d(this, "push_token_register_success", jsonObject, 0, 4, null);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
}
