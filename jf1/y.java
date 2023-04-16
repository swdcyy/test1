package jf1.y;
import o81.d;
import if1.a;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderGuideMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.livestream.message.nano.SCKtvRecommendToSing;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.y$a;
import android.text.style.ClickableSpan;

public class y implements d	// class@002b85
{
    public final a a;

    public void y(a p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       return this.b(p0, p1);
    }
    public CharSequence b(LiveKtvOrderGuideMessage p0,g p1){
       LiveSpannable$b obj = PatchProxy.applyTwoRefs(p0, p1, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveSpannable liveSpannabl = new LiveSpannable(new SpannableStringBuilder());
       f.b(p0, liveSpannabl, p1);
       obj = f.c(p0.mRecommendToSingMsg.feedContent, p1);
       if (p1.p()) {
          obj.d(p1.k());
       }else {
          obj.d(R.color.arg_RES_7f060871);
       }
       liveSpannabl.j(obj);
       y ta = this.a;
       if (ta != null && ta.b(p0)) {
          LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f102537);
          if (p1.n()) {
             liveSpannabl.c();
          }else {
             liveSpannabl.d();
          }
          uoa.a(new y$a(this, p0, p1));
          liveSpannabl.h(uoa);
          p0.setHasLastButton(true);
       }
       return liveSpannabl.k();
    }
}
