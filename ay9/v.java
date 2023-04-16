package ay9.v;
import erd.g;
import ay9.a0;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import android.text.SpannableStringBuilder;
import ay9.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import uw9.o;
import q87.c;
import java.lang.StringBuilder;
import android.util.Log;
import hn5.i0;

public final class v implements g	// class@00030d
{
    public final a0 b;

    public void v(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a0.class, "10")) {
       }else {
          tb.E().q(new SpannableStringBuilder(tb.v.getCaption()), true);
          Object[] objArray = new Object[0];
          o.C().u("CaptionElement", p0, objArray);
          i0.b("element_get_caption_fail", "photo id: "+tb.v.getPhotoId()+", error: "+Log.getStackTraceString(p0));
       }
       return;
    }
}
