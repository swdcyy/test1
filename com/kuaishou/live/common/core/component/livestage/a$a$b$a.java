package com.kuaishou.live.common.core.component.livestage.a$a$b$a;
import v71.b;
import com.kuaishou.live.common.core.component.livestage.a$a$b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import xo1.d;
import java.util.Iterator;
import java.lang.Iterable;
import je3.e;
import v71.a;

public final class a$a$b$a implements b	// class@0014ac
{
    public final a$a$b b;

    public void a$a$b$a(a$a$b p0){
       this.b = p0;
       super();
    }
    public void B3(int p0,Exception p1){
       a$a$b$a uoa$b$a = a$a$b$a.class;
       if (PatchProxy.isSupport(uoa$b$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa$b$a, "2")) {
          return;
       }
       a.p(p1, "e");
       d.a(true, "onOpenCameraFailed "+p0+' '+p1);
       Iterator iterator = this.b.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().B3(p0, p1);
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a$a$b$a.class, "3")) {
          return;
       }
       d.a(true, "onCameraClosed");
       Iterator iterator = this.b.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().G();
       }
       return;
    }
    public void N(long p0,long p1){
       a.e(this, p0, p1);
    }
    public void t1(){
       a.c(this);
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, a$a$b$a.class, "1")) {
          return;
       }
       d.a(true, "onCameraOpen");
       Iterator iterator = this.b.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().w();
       }
       return;
    }
}
