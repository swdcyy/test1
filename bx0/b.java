package bx0.b;
import lf3.g;
import bx0.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAuthorPause;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i$b;
import e17.i;
import lf3.f;

public final class b implements g	// class@000424
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "5")) {
       }else if(tb.R8()){
          int i = 0x7f101d8e;
          if (p0.pauseType == 2) {
             i = 0x7f101db4;
          }
          i$b uob = i.m();
          uob.x(i);
          uob.o(-2);
          tb.L = uob.a();
          tb.S8();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
