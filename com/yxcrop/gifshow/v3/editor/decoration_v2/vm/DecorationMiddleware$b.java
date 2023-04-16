package com.yxcrop.gifshow.v3.editor.decoration_v2.vm.DecorationMiddleware$b;
import erd.g;
import xvc.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.WaitDrawerBitmapAction;
import brd.v;
import brd.g;

public final class DecorationMiddleware$b implements g	// class@000a3c
{
    public final b b;

    public void DecorationMiddleware$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationMiddleware$b.class, "1")) {
       }else {
          this.b.getEmitter().onError(p0);
       }
       return;
    }
}
