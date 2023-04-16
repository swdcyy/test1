package com.kwai.video.krtc.rtcengine.internal.u;
import com.kwai.video.krtc.rtcengine.internal.u$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import java.lang.Boolean;

public class u	// class@00089b
{
    public u$a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public long f;
    public String g;

    public void u(u$a p0){
       super();
       this.b = true;
       this.c = true;
       this.d = false;
       this.e = 0;
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, u.class, "5")) {
          return;
       }
       this.a(0);
       return;
    }
    public final void a(int p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ou, "8")) {
          return;
       }
       if (this.e == p0) {
          return;
       }
       long l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
       if (!this.f - null) {
          this.f = l;
       }
       int i = (int)(l - this.f);
       u ta = this.a;
       if (ta != null) {
          ta.a(this.g, this.e, p0, i);
       }
       this.e = p0;
       this.f = l;
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "4")) {
          return;
       }
       this.g = p0;
       if (this.d()) {
          this.a(2);
       }else {
          this.a(1);
       }
       return;
    }
    public void a(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "1")) {
          return;
       }
       this.b = p0;
       this.c();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, u.class, "6")) {
          return;
       }
       if (this.d()) {
          this.a(3);
       }
       return;
    }
    public void b(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "2")) {
          return;
       }
       this.c = p0;
       this.c();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, u.class, "7")) {
          return;
       }
       if (this.e == 1 && this.d()) {
          this.a(3);
       }else if(this.e == 3 && !this.d()){
          this.a(1);
       }
       return;
    }
    public void c(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "3")) {
          return;
       }
       this.d = p0;
       this.c();
       return;
    }
    public final boolean d(){
       boolean b = (this.b != null && (this.c != null && this.d == null))? true: false;
       return b;
    }
}
