package jf1.m;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveFansTopHelpBuyMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.l;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class m implements d	// class@002b76
{
    public final f a;

    public void m(){
       super(null);
    }
    public void m(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          m ta = this.a;
          if (ta != null) {
             ta.a(p0);
          }
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          LiveSpannable$b uob = f.c(p0.mMessageTextContent, p1);
          LiveSpannable$b uob1 = f.c(b.c(p0.getUser()), p1);
          if (p1.p()) {
             uob1.d(p1.h());
             uob.d(p1.l());
          }else {
             int i = 0x7f060871;
             uob1.d(i);
             uob.d(i);
          }
          if (p1.p()) {
             liveSpannabl.j(uob1).e().j(uob);
          }else {
             liveSpannabl.j(uob1).j(uob);
          }
          if (p0.shouldShowHelpBuyButton()) {
             LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f102197);
             if (p1.n()) {
                liveSpannabl.c();
             }else {
                liveSpannabl.d();
             }
             uoa.a(new l(this, p0));
             liveSpannabl.h(uoa);
             p0.setHasLastButton(true);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
