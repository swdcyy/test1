package jf1.n;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPackSendPacketMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.SpannableStringBuilder;

public class n implements d	// class@002b77
{

    public void n(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          LiveSpannable$b uob = f.c(b.c(p0.getUser()), p1);
          LiveSpannable$b uob1 = (p0.mRedPackSentType == true)? f.c(a1.p(R.string.arg_RES_7f104a3a), p1): f.c(a1.p(R.string.arg_RES_7f104a37), p1);
          if (p1.p()) {
             uob.d(p1.h());
             uob1.d(p1.l());
          }else {
             uob.d(R.color.arg_RES_7f060871);
             uob.d(R.color.arg_RES_7f060871);
          }
          spannableStr = liveSpannabl.j(uob).e().j(uob1).e().h(new LiveSpannable$a(R.drawable.arg_RES_7f081170).c(p1.f)).k();
       }
       return spannableStr;
    }
}
