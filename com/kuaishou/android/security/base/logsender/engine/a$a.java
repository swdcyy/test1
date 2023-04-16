package com.kuaishou.android.security.base.logsender.engine.a$a;
import android.os.Handler;
import com.kuaishou.android.security.base.logsender.engine.a;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.cloudconfig.c;
import org.json.JSONTokener;
import org.json.JSONObject;
import android.os.Bundle;
import android.content.Context;
import com.kuaishou.android.security.base.util.n;
import org.json.JSONArray;
import android.util.Pair;
import com.kuaishou.android.security.base.log.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.security.base.logsender.engine.b;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.android.security.base.logsender.db.a;
import com.kuaishou.android.security.base.logsender.info.a;
import java.lang.Long;
import java.util.List;

public class a$a extends Handler	// class@000ee3
{
    public final a a;

    public void a$a(a p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       int i2;
       JSONObject jSONObject;
       String str3;
       String str4;
       String str5;
       Pair pair;
       a$a a;
       Message message1;
       int i4;
       int i5;
       Object obj = this;
       String obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$a.class, str)) {
          return;
       }
       if (!a.a(obj.a).r()) {
          return;
       }
       Message what = obj1.what;
       if (what != null) {
          StringBuilder str1 = 5;
          Message message = 2;
          a$a uoa = null;
          if (what != 1) {
             int i = 20;
             if (what != message) {
                if (what != str1) {
                   if (what != 6) {
                      if (what == 11) {
                         String str2 = String.valueOf(obj1.obj);
                         Object obj2 = new JSONTokener(str2).nextValue();
                         boolean b = (obj1.arg1 == 1)? true: false;
                         v5 = obj2 instanceof JSONObject;
                         b uob = (obj1.arg2 == 1)? 1: null;
                         int i1 = 21;
                         Bundle data = p0.getData();
                         i2 = 12;
                         int i3 = 0;
                         if (message) {
                            if (b) {
                               jSONObject = n.a(a.c(obj.a), obj2, i2);
                               i1 = 12;
                            }else if(uob != null){
                               i = 21;
                            }
                            jSONObject = n.a(a.c(obj.a), obj2, i);
                            i1 = i;
                            if (jSONObject != null) {
                               str3 = new JSONArray().put(jSONObject).toString();
                            label_00d7 :
                               str4 = str3;
                               uoa = message;
                            label_00dc :
                               if (!TextUtils.isEmpty(str4)) {
                                  if (b) {
                                     if (a.d(obj.a).a(str4, null, Integer.toString(i2), b, null) != 1 && str4 != null) {
                                        d.b("rep failed "+str4);
                                     }
                                  }else if(uoa != null){
                                     obj1 = obj2.getJSONObject("Header_section").optString(str);
                                     if ("100111".equals(obj1)) {
                                        d.b("env need to report yun log");
                                        str5 = "100111";
                                     label_0135 :
                                        if (a.d(obj.a).a(str4, str5, Integer.toString(i1), false, data) != 1) {
                                           d.b("handleOfflineReport "+str2);
                                           a.a(obj.a, str2, uoa);
                                           a.e(obj.a);
                                        }
                                     }
                                  }
                                  str5 = i3;
                                  goto label_0135 ;
                               }
                            }
                         }else if(obj2 instanceof JSONArray){
                            if (b) {
                               pair = n.a(a.c(obj.a), obj2, i2);
                               if (pair != null) {
                                  pair = pair.second;
                               label_00cf :
                                  if (pair != null) {
                                     str3 = pair.toString();
                                     boolean b1 = false;
                                     goto label_00d7 ;
                                  }else {
                                  label_00db :
                                     str4 = i3;
                                     goto label_00dc ;
                                  }
                               }
                            }else if(uob != null){
                               d.b("from alarm real");
                            }else {
                               i = 21;
                            }
                            pair = n.a(a.c(obj.a), obj2, i);
                            if (pair != null) {
                               pair = pair.second;
                               i1 = i;
                               goto label_00ca ;
                            }else {
                               i1 = i;
                            }
                            pair = i3;
                            goto label_00cf ;
                         }
                         uoa = message;
                         goto label_00db ;
                      }
                   }else {
                      a = obj.a;
                      a.a(a, 1, n.c(a.c(a)), 7);
                   }
                }else {
                   message1 = new Message();
                   message1.what = 10;
                   obj.sendMessage(message1);
                }
             }else {
                i4 = n.c(a.c(obj.a));
                message1 = obj1.arg1;
                i5 = a.a(a.c(obj.a)).b();
                if (i5 >= i && message1 == 1) {
                   d.b("ACTION_REPORT_DATA "+i5+" 20");
                }else if(message1 != 1){
                label_027c :
                   return;
                }
                a$a a1 = obj.a;
                a.a(a1, uoa, i4, message1);
                goto label_027c ;
             }
          }else {
             message1 = obj1.obj;
             d.b("ACTION_REPORT_RECORD "+Long.toString(a.a(a.c(obj.a)).a(message1))+message1.d);
             i2 = n.c(a.c(obj.a));
             if (message == i2) {
                i4 = a.a(a.c(obj.a)).b();
                i5 = a.a(obj.a).p();
                d.b("ACTION_REPORT_TRIGGER "+i4+" "+i5);
                if (i4 >= i5) {
                   d.b("getUploadNumberCondition satified!");
                   a.a(obj.a, uoa, i2, str1);
                   return;
                }else {
                   List list = a.a(a.c(obj.a)).a(1, i2);
                   if (list != null && list.size() > 0) {
                      a.a(obj.a, uoa, i2, 25);
                      goto label_027c ;
                   }else {
                      goto label_027c ;
                   }
                }
             }else if(1 == i2){
                a.a(obj.a, 4, i2, 15);
                goto label_027c ;
             }else {
                goto label_027c ;
             }
          }
       }else {
          a.b(obj.a);
          goto label_027c ;
       }
    }
}
