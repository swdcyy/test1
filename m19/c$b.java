package m19.c$b;
import d6a.a;
import m19.c;
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
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import p5a.e;
import de5.a;
import p5a.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.PhotoType;

public class c$b extends a	// class@002dde
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void B0(){
       c$b tb = this.b;
       tb.A = false;
       tb.B = false;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       if (this.b.x != null) {
          String str = d.a(-859095268).en();
          c x = this.b.x;
          if (TextUtils.x(str)) {
             str = "null";
          }
          x.setPoorNetSessionId(str);
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       this.b.A = true;
       if (!SlidePerformanceExp.e() && !this.b.q.getPlayer().j()) {
          c$b tb = this.b;
          if (tb.z == null && tb.p.getType() == PhotoType.VIDEO.toInt()) {
          label_003e :
             return;
          }
       }
       this.b.R8();
       goto label_003e ;
    }
}
