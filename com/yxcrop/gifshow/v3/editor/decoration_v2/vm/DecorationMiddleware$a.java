package com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$a;
import erd.g;
import com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware;
import xvc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateProjectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.WaitDrawerBitmapAction;
import tvc.a;
import brd.v;
import qrd.l1;
import brd.g;

public final class DecorationMiddleware$a implements g	// class@000a3b
{
    public final DecorationMiddleware b;
    public final b c;

    public void DecorationMiddleware$a(DecorationMiddleware p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationMiddleware$a.class, "1")) {
          return;
       }
       if (a.g(p0, Boolean.FALSE) ^ 0x01) {
          p0 = this.b.a();
          if (p0 != null) {
             p0.a(new UpdateProjectAction(this.c.getShowAnimatedSubAsset()));
          }
       }
       this.c.getEmitter().onNext(l1.a);
       this.c.getEmitter().onComplete();
       return;
    }
}
