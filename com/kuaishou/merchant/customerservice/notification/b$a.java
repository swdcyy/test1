package com.kuaishou.merchant.customerservice.notification.b$a;
import com.kuaishou.merchant.customerservice.notification.a$a;
import com.kuaishou.merchant.customerservice.notification.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.os.Handler;

public class b$a implements a$a	// class@001687
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "6")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "18")) {
          b c = ta.c;
          if (c != null) {
             c.sendEmptyMessage(1547);
          }
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "5")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "17")) {
          b c = ta.c;
          if (c != null) {
             c.sendEmptyMessage(1546);
          }
       }
       return;
    }
    public void pause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "15")) {
          b c = ta.c;
          if (c != null) {
             c.sendEmptyMessage(1544);
          }
       }
       return;
    }
    public void play(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "3")) {
          return;
       }
       this.a.d();
       return;
    }
    public void resume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "16")) {
          b c = ta.c;
          if (c != null) {
             c.sendEmptyMessage(1545);
          }
       }
       return;
    }
    public void stop(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "4")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "14")) {
          b c = ta.c;
          if (c != null) {
             c.sendEmptyMessage(1543);
          }
       }
       return;
    }
}
