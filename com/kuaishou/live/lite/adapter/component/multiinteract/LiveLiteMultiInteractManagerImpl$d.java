package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$d;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.livestage.CloseCameraReason;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import je3.e;
import fe3.c;
import je3.b;
import u71.a;
import com.kwai.robust.PatchProxyResult;
import kotlin.NotImplementedError;
import com.kuaishou.live.common.core.component.livestage.a$b;
import je3.l;

public final class LiveLiteMultiInteractManagerImpl$d extends a	// class@001dfb
{

    public void LiveLiteMultiInteractManagerImpl$d(){
       super();
    }
    public void b(CloseCameraReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiInteractManagerImpl$d.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiInteractManagerImpl$d.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       return;
    }
    public void e(c p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteMultiInteractManagerImpl$d.class, "4")) {
          return;
       }
       a.p(p0, "streamId");
       a.p(p1, "param");
       return;
    }
    public void f(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiInteractManagerImpl$d.class, "7")) {
          return;
       }
       a.p(p0, "callback");
       return;
    }
    public a g(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiInteractManagerImpl$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
    public boolean h(){
       return false;
    }
    public boolean isFrontCamera(){
       return false;
    }
    public a$b j(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiInteractManagerImpl$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
    public void l(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteMultiInteractManagerImpl$d.class, "6")) {
          return;
       }
       a.p(p0, "camera");
       return;
    }
    public void release(){
    }
}
