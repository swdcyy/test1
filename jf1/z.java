package jf1.z;
import o81.d;
import if1.b;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderMusicMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.z$a;
import android.text.style.ClickableSpan;

public class z implements d	// class@002b87
{
    public final b a;

    public void z(){
       super(null);
    }
    public void z(b p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       return this.b(p0, p1);
    }
    public CharSequence b(LiveKtvOrderMusicMessage p0,g p1){
       LiveSpannable$b obj = PatchProxy.applyTwoRefs(p0, p1, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveSpannable liveSpannabl = new LiveSpannable(new SpannableStringBuilder());
       f.b(p0, liveSpannabl, p1);
       obj = f.c(p0.getContentString(), p1);
       LiveSpannable$b uob = f.c(p0.getUserName(), p1);
       if (p1.p()) {
          obj.d(p1.k());
          uob.d(p1.h());
       }else {
          int i = 0x7f060871;
          obj.d(i);
          uob.d(i);
       }
       if (p1.p()) {
          liveSpannabl.j(uob).e().j(obj);
       }else {
          liveSpannabl.j(uob).j(obj);
       }
       z ta = this.a;
       if (ta != null && ta.a(p0)) {
          LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f102543);
          if (p1.n()) {
             liveSpannabl.c();
          }else {
             liveSpannabl.d();
          }
          uoa.a(new z$a(this, p0, p1));
          liveSpannabl.h(uoa);
          p0.setHasLastButton(true);
       }
       return liveSpannabl.k();
    }
}
