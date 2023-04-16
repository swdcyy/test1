package jf1.j0;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.redpacket.SendRedPacketMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.SpannableStringBuilder;

public class j0 implements d	// class@002b6f
{

    public void j0(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, j0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          String str = b.c(p0.getUser());
          String str1 = (p0.mRedPacketType == 11)? a1.p(R.string.arg_RES_7f101fb3): a1.p(R.string.arg_RES_7f104a3a);
          LiveSpannable$b uob = f.c(str, p1);
          LiveSpannable$b uob1 = f.c(str1, p1);
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
