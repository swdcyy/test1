package p45.c;
import p45.b;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import com.google.gson.JsonObject;
import java.lang.Enum;
import com.kwai.android.common.ext.JsonObjectExtKt;
import java.lang.Long;
import java.lang.Number;
import android.content.Context;
import com.kwai.android.common.utils.ContextProvider;
import com.kwai.android.common.ext.ContextExtKt;
import java.lang.NullPointerException;
import java.lang.Exception;
import java.lang.Throwable;
import java.util.Locale;
import java.lang.Integer;
import android.util.Log;

public final class c extends b	// class@00215d
{

    public void c(Map p0){
       a.p(p0, "channelVersionMap");
       super(p0);
    }
    public final void e(Channel p0,long p1){
       String str = "channel";
       try{
          a.p(p0, str);
          JsonObject jsonObject = new JsonObject();
          String str1 = p0.name();
          if (str1 != null) {
             str1 = str1.toLowerCase();
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
             JsonObjectExtKt.set(jsonObject, "provider", str1);
             JsonObjectExtKt.set(jsonObject, "init_cost_ms", Long.valueOf(p1));
             Context context = ContextProvider.getContext();
             a.o(context, "ContextProvider.getContext\(\)");
             JsonObjectExtKt.set(jsonObject, "process_name", ContextExtKt.getProcessName(context));
             b.d(this, "push_init_abort", jsonObject, 0, 4, null);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void f(Channel p0,long p1,Throwable p2){
       String str = "channel";
       try{
          a.p(p0, str);
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "init_cost_ms", Long.valueOf(p1));
          String str1 = "provider";
          String str2 = p0.name();
          Locale default = Locale.getDefault();
          a.o(default, "Locale.getDefault\(\)");
          if (str2 != null) {
             str2 = str2.toLowerCase(default);
             a.o(str2, "\(this as java.lang.String\).toLowerCase\(locale\)");
             JsonObjectExtKt.set(jsonObject, str1, str2);
             JsonObjectExtKt.set(jsonObject, "error_code", Integer.valueOf(2));
             JsonObjectExtKt.set(jsonObject, "error_msg", Log.getStackTraceString(p2));
             b.d(this, "push_init_failed", jsonObject, 0, 4, null);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void g(Channel p0,long p1){
       String str = "channel";
       try{
          a.p(p0, str);
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "init_cost_ms", Long.valueOf(p1));
          String str1 = "provider";
          String str2 = p0.name();
          if (str2 != null) {
             str2 = str2.toLowerCase();
             a.o(str2, "\(this as java.lang.String\).toLowerCase\(\)");
             JsonObjectExtKt.set(jsonObject, str1, str2);
             Context context = ContextProvider.getContext();
             a.o(context, "ContextProvider.getContext\(\)");
             JsonObjectExtKt.set(jsonObject, "process_name", ContextExtKt.getProcessName(context));
             b.d(this, "push_init_success", jsonObject, 0, 4, null);
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
}
