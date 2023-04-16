package com.yxcorp.gifshow.detail.player.panel.ui.ElementTypes$register$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import j3a.a;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ElementTypes$register$1 extends Lambda implements a	// class@001649
{
    public final a $element;

    public void ElementTypes$register$1(a p0){
       this.$element = p0;
       super(0);
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, ElementTypes$register$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$element.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
