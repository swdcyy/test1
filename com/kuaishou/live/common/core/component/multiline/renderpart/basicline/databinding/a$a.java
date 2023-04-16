package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import ir1.c;
import androidx.lifecycle.LifecycleOwner;
import hr1.a;
import sq1.a;

public final class a$a implements Observer	// class@00154f
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, str)) {
       }else {
          a.o(p0, "startRender");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, a.class, str)) {
                p0.g.c(p0.i.w0(), p0.h.j());
             }
          }
       }
       return;
    }
}
