package com.yxcorp.gifshow.v3.editor.frame_v2.vm.FrameMiddleware;
import tvc.c;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.frame_v2.vm.FrameMiddleware$compositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import tvc.a;
import tvc.e;
import xvc.b;
import yqc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.frame_v2.action.FrameDetachAction;
import crd.a;
import com.yxcorp.gifshow.v3.editor.frame_v2.action.BackgroundSilentDownloadAction;
import wqc.b;
import brd.v;

public final class FrameMiddleware extends c	// class@000faa
{
    public final p b;
    public final EditFrameRepo c;

    public void FrameMiddleware(EditFrameRepo p0){
       a.p(p0, "editFrameRepo");
       super();
       this.c = p0;
       this.b = s.c(FrameMiddleware$compositeDisposable$2.INSTANCE);
    }
    public e b(a p0,e p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FrameMiddleware.class, "2");
       if (obj != patchProxyRe) {
          p1 = obj;
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
          if (p0 instanceof FrameDetachAction) {
             p0 = PatchProxy.apply(null, this, FrameMiddleware.class, "1");
             if (p0 == patchProxyRe) {
                p0 = this.b.getValue();
             }
             p0.dispose();
          }else if(p0 instanceof BackgroundSilentDownloadAction){
             this.c.b(p0.getData(), null);
          }
       }
       return p1;
    }
}
