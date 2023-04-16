package ec1.i$a;
import bq5.h$a;
import ec1.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import bq5.f;
import bq5.h;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class i$a implements h$a	// class@0020d9
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       i$a ta = this.a;
       if (ta.x != null) {
          ta.S8();
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$a.class, "1")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, i.class, "9")) {
          f uof = ta.t.dn();
          i x = ta.x;
          if (x != null && (x.g != null && (uof != null && x != uof))) {
             b.Z(LiveCommonLogTag.BOTTOM_BUBBLE, "onAddBottomBubble, break up");
             ta.t.m0();
          }else {
             ta.V8();
          }
       }
       return;
    }
}
