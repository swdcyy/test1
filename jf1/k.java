package jf1.k;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveFansGroupJoinMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import lnc.a1;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.k$a;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class k implements d	// class@002b73
{
    public final f a;

    public void k(){
       super(null);
    }
    public void k(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          k ta = this.a;
          if (ta != null) {
             ta.a(p0);
          }
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          String str = (true == p0.mJoinSource)? a1.p(R.string.arg_RES_7f10215a): a1.p(R.string.arg_RES_7f102157);
          LiveSpannable$b uob = f.c(b.c(p0.getUser()), p1);
          LiveSpannable$b uob1 = f.c(str, p1);
          if (p1.p()) {
             uob.d(p1.h());
             uob1.d(p1.l());
          }else {
             int i = 0x7f060871;
             uob.d(i);
             uob1.d(i);
          }
          if (p1.p()) {
             liveSpannabl.j(uob).e().j(uob1);
          }else {
             liveSpannabl.j(uob).j(uob1);
          }
          if (p0.shouldShowJoinButton() && this.a != null) {
             LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f10212b);
             if (p1.n()) {
                liveSpannabl.c();
             }else {
                liveSpannabl.d();
             }
             uoa.a(new k$a(p0, this.a));
             liveSpannabl.h(uoa);
             p0.setHasLastButton(true);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
