package dn1.g$b;
import lf3.g;
import dn1.g;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveHotspotRankClose;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import lf3.f;

public final class g$b implements g	// class@001fd5
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
       }else {
          g$b tb = this.b;
          tb.r0(tb.x0()).setValue(Boolean.FALSE);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
