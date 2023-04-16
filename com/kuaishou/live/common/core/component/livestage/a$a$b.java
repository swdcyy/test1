package com.kuaishou.live.common.core.component.livestage.a$a$b;
import com.kuaishou.live.common.core.component.livestage.a;
import msd.l;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.livestage.a$a$b$a;
import com.kuaishou.live.livestage.CloseCameraReason;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xo1.d;
import u71.a;
import v71.b;
import je3.e;
import java.util.List;
import fe3.c;
import je3.b;
import xo1.c;
import u71.c;
import com.kuaishou.live.common.core.component.livestage.a$b;
import android.view.View;
import qrd.l1;
import java.lang.IllegalStateException;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import je3.l;
import java.lang.StringBuilder;
import u71.d;
import com.kuaishou.live.common.core.component.livestage.a$a$b$b;
import x71.c;
import x71.a;

public final class a$a$b extends a	// class@0014ae
{
    public c e;
    public final List f;
    public final a$a$b$a g;
    public a h;
    public a$b i;
    public final l j;

    public void a$a$b(l p0){
       this.j = p0;
       super();
       this.f = new ArrayList();
       this.g = new a$a$b$a(this);
    }
    public void b(CloseCameraReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$b.class, "6")) {
          return;
       }
       a.p(p0, "reason");
       d.a(false, "close");
       this.g().g();
       this.g().l2();
       this.g().A(this.g);
       this.h = null;
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$b.class, "9")) {
          return;
       }
       a.p(p0, "callback");
       this.f.add(p0);
       return;
    }
    public void e(c p0,b p1){
       l1 a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$b.class, "5")) {
          return;
       }
       a.p(p0, "streamId");
       a.p(p1, "param");
       boolean b = false;
       d.a(b, "open");
       this.e = p1;
       this.m(p0);
       a uoa = this.j.invoke(p1.a());
       if (uoa != null) {
          uoa.X(this.g);
          View view = uoa.n1();
          a.o(view, "cameraView");
          this.i = new a$b(b, view);
          uoa.y();
          a = l1.a;
       }else {
          uoa = null;
       }
       this.h = uoa;
       if (uoa == null) {
          d.a(b, "Create Camera Fail: NULL");
          this.g.B3(-1, new IllegalStateException("Camera is Null."));
       }
       return;
    }
    public void f(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$b.class, "10")) {
          return;
       }
       a.p(p0, "callback");
       this.f.remove(p0);
       return;
    }
    public a g(){
       a$a$b obj = PatchProxy.apply(null, this, a$a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException();
    }
    public boolean h(){
       Object[] objArray = null;
       a$a$b obj = PatchProxy.apply(objArray, this, a$a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       if (obj != null) {
          objArray = Boolean.valueOf(obj.h());
       }
       boolean b = (objArray != null)? true: false;
       return b;
    }
    public boolean isFrontCamera(){
       a$a$b obj = PatchProxy.apply(null, this, a$a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       boolean b = (obj != null)? obj.I(): false;
       return b;
    }
    public a$b j(){
       a$a$b obj = PatchProxy.apply(null, this, a$a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       a.m(obj);
       return obj;
    }
    public void l(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$b.class, "7")) {
          return;
       }
       a.p(p0, "camera");
       int i = 0;
       if (p1 == null) {
          p0.K(i, i, i, null);
          return;
       }else {
          a$a$b te = this.e;
          a.m(te);
          c uoc = te.a();
          d.a(i, "realSetCameraDataCallback "+uoc.getResolution()+' '+p1);
          i = uoc.getFps();
          p0.o(i, uoc.getResolution().a, uoc.getResolution().b, new a$a$b$b(this, p1));
          return;
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a$a$b.class, "8")) {
          return;
       }
       this.f.clear();
       return;
    }
}
