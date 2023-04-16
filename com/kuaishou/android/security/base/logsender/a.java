package com.kuaishou.android.security.base.logsender.a;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.android.security.base.logsender.engine.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import x38.a;
import java.lang.Integer;
import android.os.Message;
import com.kuaishou.android.security.base.logsender.info.a;
import android.os.Bundle;
import java.lang.Boolean;

public class a	// class@000edf
{
    public a a;
    public a b;
    public static a c;

    public void a(Context p0){
       a uoa = new a(p0);
       this.a = uoa;
       uoa.h();
    }
    public static a a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c == null) {
          _monitor_enter(a.class);
          if (a.c == null) {
             a.c = new a(p0);
          }
          _monitor_exit(a.class);
       }
       return a.c;
    }
    public a a(){
       return this.b;
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       Message message = new Message();
       message.what = 2;
       message.arg1 = p0;
       this.a.a(message);
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Message message = new Message();
       message.what = 1;
       message.obj = p0;
       this.a.a(message);
       return;
    }
    public void a(String p0,boolean p1,boolean p2,Bundle p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, a.class, "5")) {
          return;
       }
       Message message = new Message();
       message.what = 11;
       message.obj = p0;
       if (p3 != null && !p3.isEmpty()) {
          message.setData(p3);
       }
       int i = 1;
       if (p1) {
          message.arg1 = i;
       }else {
          message.arg1 = 0;
          if (!p2) {
             message.arg2 = i;
          label_0044 :
             this.a.a(message);
             return;
          }
       }
       message.arg2 = 0;
       goto label_0044 ;
    }
    public void a(a p0){
       this.b = p0;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.c();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       Message message = new Message();
       message.what = 6;
       this.a.a(message);
       return;
    }
}
