package com.kuaishou.live.common.core.component.livestage.a$a$a;
import v71.b;
import com.kuaishou.live.common.core.component.livestage.a;
import u71.a;
import com.kuaishou.live.common.core.component.livestage.a$b;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.StringBuilder;
import xo1.d;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Iterable;
import je3.e;
import v71.a;
import com.kuaishou.live.livestage.CloseCameraReason;
import java.util.List;
import fe3.c;
import je3.b;
import xo1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import je3.l;
import u71.c;

public final class a$a$a extends a implements b	// class@0014ab
{
    public final a$b e;
    public boolean f;
    public final List g;
    public b h;
    public boolean i;
    public final a j;

    public void a$a$a(a p0){
       this.j = p0;
       super();
       View view = p0.n1();
       a.o(view, "camera.cameraView");
       this.e = new a$b(true, view);
       this.g = new ArrayList();
       d.a(true, "isCameraOpenWhenEnter "+p0.h());
       p0.X(this);
    }
    public void B3(int p0,Exception p1){
       a$a$a uoa$a = a$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa$a, "6")) {
          return;
       }
       a.p(p1, "e");
       d.a(true, "onOpenCameraFailed "+p0+' '+p1);
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().B3(p0, p1);
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a$a$a.class, "5")) {
          return;
       }
       d.a(true, "onCameraClosed");
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().G();
       }
       return;
    }
    public void N(long p0,long p1){
       a.e(this, p0, p1);
    }
    public void b(CloseCameraReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "9")) {
          return;
       }
       a.p(p0, "reason");
       a$a$a uoa$a = (p0 == CloseCameraReason.USER_CLOSE)? 1: null;
       if (!uoa$a && this.f == null) {
          d.a(true, "closeCamera not open previously. "+p0);
          return;
       }else {
          d.a(true, "closeCamera "+p0+' '+this.f);
          this.j.g();
          this.j.A(this);
          return;
       }
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "11")) {
          return;
       }
       a.p(p0, "callback");
       this.g.add(p0);
       return;
    }
    public void e(c p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$a.class, "7")) {
          return;
       }
       a.p(p0, "streamId");
       a.p(p1, "param");
       d.a(true, "open "+p0);
       this.f = true;
       this.m(p0);
       this.h = p1;
       if (this.j.h()) {
          a$a$a th = this.h;
          a.m(th);
          this.o(th);
       }else {
          this.i = true;
       }
       this.j.X(this);
       this.j.f();
       return;
    }
    public void f(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "12")) {
          return;
       }
       a.p(p0, "callback");
       this.g.remove(p0);
       return;
    }
    public a g(){
       return this.j;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, a$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.h();
    }
    public boolean isFrontCamera(){
       Object obj = PatchProxy.apply(null, this, a$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.I();
    }
    public a$b j(){
       return this.e;
    }
    public void l(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a$a.class, "10")) {
          return;
       }
       a.p(p0, "camera");
       return;
    }
    public final void o(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "8")) {
          return;
       }
       if (p0.a.i() != this.j.I()) {
          this.j.switchCamera();
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a$a$a.class, "3")) {
          return;
       }
       this.j.A(this);
       this.g.clear();
       this.h = null;
       this.i = false;
       return;
    }
    public void t1(){
       a.c(this);
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, a$a$a.class, "4")) {
          return;
       }
       d.a(true, "onCameraOpen");
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().w();
       }
       if (this.i != null) {
          this.i = false;
          a$a$a th = this.h;
          if (th != null) {
             this.o(th);
          }
       }
       return;
    }
}
