package k7a.h$a;
import d6a.a;
import k7a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ida.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class h$a extends a	// class@002c10
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "2")) {
          return;
       }
       this.b.P8("becomesDetached");
       h$a tb = this.b;
       tb.z = false;
       tb.y = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       this.b.P8("becomesAttached");
       h$a tb = this.b;
       tb.y = true;
       if (tb.w != null) {
          String str = d.a(-859095268).en();
          h w = this.b.w;
          if (TextUtils.x(str)) {
             str = "null";
          }
          w.setPoorNetSessionId(str);
       }
       return;
    }
}
