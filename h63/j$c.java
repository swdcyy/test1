package h63.j$c;
import lf3.g;
import h63.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.gamezone.multitab.nano.SCGzoneLiveRoomMultiTab;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import h63.k;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import y43.a;
import h47.b;
import j47.d;
import lf3.f;

public class j$c implements g	// class@002c84
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
       }else {
          int i = 0;
          try{
             List list = a.a.i(p0.payload, new k(this).getType());
          }catch(java.lang.Exception e0){
          }
          if (e0 != null) {
             j$c tb = this.b;
             tb.s.u.H8(tb.v);
             this.b.R8(e0);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
