package com.kwai.component.photo.detail.core.log.NonnullFieldDelegate$setValue$exec$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.photo.detail.core.log.NonnullFieldDelegate;
import vsd.n;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vsd.c;
import wd5.b;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import msd.q;
import java.util.Objects;

public final class NonnullFieldDelegate$setValue$exec$1 extends Lambda implements a	// class@000a23
{
    public final n $property;
    public final Object $value;
    public final NonnullFieldDelegate this$0;

    public void NonnullFieldDelegate$setValue$exec$1(NonnullFieldDelegate p0,n p1,Object p2){
       this.this$0 = p0;
       this.$property = p1;
       this.$value = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, NonnullFieldDelegate$setValue$exec$1.class, "1")) {
          return;
       }
       NonnullFieldDelegate$setValue$exec$1 tthis$0 = this.this$0;
       NonnullFieldDelegate e = tthis$0.e;
       if (e != null) {
          NonnullFieldDelegate nonnullField = tthis$0.b.get(this.$property.getName());
          if (nonnullField == null) {
             nonnullField = this.this$0.c;
          }
          Boolean uBoolean = Boolean.valueOf(a.g(nonnullField, this.this$0.c));
          NonnullFieldDelegate nonnullField1 = this.this$0.b.get(this.$property.getName());
          if (nonnullField1 == null) {
             nonnullField1 = this.this$0.c;
          }
          if (!e.invoke(uBoolean, nonnullField1, this.$value).booleanValue()) {
          label_0068 :
             return;
          }
       }
       NonnullFieldDelegate$setValue$exec$1 t$value = this.$value;
       Objects.requireNonNull(t$value, "null cannot be cast to non-null type kotlin.Any");
       this.this$0.b.d(this.$property.getName(), t$value);
       goto label_0068 ;
    }
}
