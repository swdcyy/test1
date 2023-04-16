package com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$c;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.util.PostUtils;
import brd.g;
import aegon.chrome.net.NetworkException;

public final class EffectMagicDataProvider$c implements g	// class@000f4e
{
    public final v b;

    public void EffectMagicDataProvider$c(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectMagicDataProvider$c.class, "1")) {
       }else {
          ExceptionHandler.handleCaughtException(p0);
          PostUtils.D("EffectMagicDataProvider", "refreshFirstPageObservable", p0);
          this.b.onError(p0);
          p0 = p0 instanceof NetworkException;
       }
       return;
    }
}
