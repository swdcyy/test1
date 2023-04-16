package com.kuaishou.android.security.base.logsender.engine.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.Integer;
import org.json.JSONObject;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.cloudconfig.c;
import java.lang.Throwable;
import com.kuaishou.android.security.base.util.g;

public class b	// class@000ee5
{
    public Context a;

    public void b(Context p0){
       this.a = p0;
    }
    public int a(String p0,String p1,String p2,boolean p3,Bundle p4){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.isEmpty(p0)) {
          return 1;
       }else {
          b = ("KS_TV").equals(b.i().h().getProductName());
          p1 = (p3)? this.a(p0, p2, b): this.a(p0, p1, p2, p4, b);
          if (("403").equals(p1)) {
             return -3;
          }else if(TextUtils.isEmpty(p1)){
             p2.equals(Integer.toString(20));
             return -2;
          }else if(new JSONObject(p1).getInt("result") == 1){
             d.b("Send succ "+p0);
             if (p2.equals(Integer.toString(20))) {
                new c(this.a).c(0);
             }
             return 1;
          }else {
             return -3;
          }
       }
    }
    public final String a(String p0,String p1,String p2,Bundle p3,boolean p4){
       c obj;
       boolean b;
       String str;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2.equals(Integer.toString(20))) {
          obj = new c(this.a);
          obj.e((obj.c() + 1));
       }
       d.b("Send:  "+p2+p0);
       b = ("100111").equals(p1);
       if (p4) {
          if (b) {
             b = "aHR0cHM6Ly9nZGZwLWtzYXBpc3J2LnlzdC5haXNlZS50di9yZXN0L2luZnJhL3VuaWZpZWRJZC9sb2dSZXBvcnQvYW5kcm9pZA==";
             str = "aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvdW5pZmllZElkL2xvZ1JlcG9ydC9hbmRyb2lk";
          }else {
             b = "aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvYW5kcm9pZC9lbnZpcm9ubWVudA==";
             str = "aHR0cHM6Ly9nZGZwLWtzYXBpc3J2LnlzdC5haXNlZS50di9yZXN0L2luZnJhL2dkZnAvcmVwb3J0L2FuZHJvaWQvZW52aXJvbm1lbnQ=";
          }
       }else if(b){
          b = "aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvdW5pZmllZElkL2xvZ1JlcG9ydC9hbmRyb2lk";
          str = "aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL3VuaWZpZWRJZC9sb2dSZXBvcnQvYW5kcm9pZA==";
       }else {
          b = "aHR0cHM6Ly9nZGZwc2VjLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvYW5kcm9pZC9lbnZpcm9ubWVudA==";
          str = "aHR0cHM6Ly9nZGZwc2VjLmtzYXBpc3J2LmNvbS9yZXN0L2luZnJhL2dkZnAvcmVwb3J0L2FuZHJvaWQvZW52aXJvbm1lbnQ=";
       }
       return new g(b, str).a("carryInfo", p0, p2, p3);
    }
    public final String a(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       g og = (p2)? new g("aHR0cHM6Ly9nZGZwLWdpZnNob3cueXN0LmFpc2VlLnR2L3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvYWlvL3JlcG9ydA=="): new g("aHR0cHM6Ly9nZGZwLmdpZnNob3cuY29tL3Jlc3QvaW5mcmEvZ2RmcC9yZXBvcnQvYWlvL3JlcG9ydA==");
       return og.a("carryInfo", p0, p1);
    }
}
