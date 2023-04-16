package com.kuaishou.live.common.multiinteract.stage.MultiInteractDefaultPlaceHolderFactory;
import ee3.a0;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractDefaultPlaceHolderFactory$defaultImg$2;
import msd.a;
import qrd.p;
import qrd.s;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractDefaultPlaceHolderFactory$a;
import erd.o;

public final class MultiInteractDefaultPlaceHolderFactory implements a0	// class@001800
{
    public final p a;
    public final HashMap b;

    public void MultiInteractDefaultPlaceHolderFactory(HashMap p0,int p1){
       a.p(p0, "customBitmapMap");
       super();
       this.b = p0;
       this.a = s.c(new MultiInteractDefaultPlaceHolderFactory$defaultImg$2(p1));
    }
    public t a(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiInteractDefaultPlaceHolderFactory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "window");
       return p0.switchMap(new MultiInteractDefaultPlaceHolderFactory$a(this));
    }
}
