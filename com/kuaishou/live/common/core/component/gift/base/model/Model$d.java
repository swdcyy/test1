package com.kuaishou.live.common.core.component.gift.base.model.Model$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.base.model.Model$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class Model$d implements Observer	// class@001149
{
    public final Model$a b;

    public void Model$d(Model$a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Model$d.class, "1")) {
       }else {
          this.b.w0(p0.c(), p0.b(), p0.a());
          if (a.g(p0.b(), p0.a()) ^ 0x01) {
             this.b.F(p0.c(), p0.b(), p0.a());
          }
       }
       return;
    }
}
