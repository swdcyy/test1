package cd1.c;
import ekd.f$h;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;
import java.lang.String;
import java.lang.Object;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class c implements f$h	// class@000496
{
    public final String a;
    public final LiveIncreaseFansNoticeView b;

    public void c(LiveIncreaseFansNoticeView p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Spannable a(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SpannableString(this.a+(int)p0);
    }
    public Spannable b(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SpannableString(this.a+(int)p0);
    }
}
