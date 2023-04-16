package com.kwai.component.photo.detail.core.log.NonnullFieldDelegate$getValue$exec$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.photo.detail.core.log.NonnullFieldDelegate;
import vsd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vsd.c;
import java.util.Objects;
import wd5.b;

public final class NonnullFieldDelegate$getValue$exec$1 extends Lambda implements a	// class@000a21
{
    public final n $property;
    public final NonnullFieldDelegate this$0;

    public void NonnullFieldDelegate$getValue$exec$1(NonnullFieldDelegate p0,n p1){
       this.this$0 = p0;
       this.$property = p1;
       super(0);
    }
    public final Object invoke(){
       Object obj = PatchProxy.apply(null, this, NonnullFieldDelegate$getValue$exec$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       NonnullFieldDelegate c = this.this$0.c;
       Objects.requireNonNull(c, "null cannot be cast to non-null type kotlin.Any");
       return this.this$0.b.a(this.$property.getName(), c);
    }
}
