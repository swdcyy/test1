package com.kuaishou.tuna_core.button.TunaButton$Companion$performActionInterval$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaButton$Companion$performActionInterval$1 extends Lambda implements a	// class@001091
{
    public final TunaButtonModel $model;

    public void TunaButton$Companion$performActionInterval$1(TunaButtonModel p0){
       this.$model = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaButton$Companion$performActionInterval$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "not support action type: "+this.$model.mActionType;
    }
}
