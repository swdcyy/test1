package jf1.a0;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.SpannableStringBuilder;

public class a0 implements d	// class@002b60
{

    public void a0(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, a0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          LikeMessage mUserStateSe = p0.mUserStateSegment;
          if (mUserStateSe != null) {
             f.a(p0, mUserStateSe, liveSpannabl, p1);
          }
          String str = b.c(p0.getUser());
          String str1 = a1.p(R.string.arg_RES_7f102565);
          Drawable uDrawable = a1.f(R.drawable.arg_RES_7f0812c6);
          int i = (p1.p())? p1.k(): 0x7f060871;
          String str2 = p1.i(p0);
          if (!TextUtils.isEmpty(str2)) {
             liveSpannabl.j(f.c(str2, p1).d(i));
          }
          LiveSpannable$b uob = f.c(str, p1).d(i);
          LiveSpannable$b uob1 = f.c(str1, p1).d(i);
          SpannableStringBuilder spannableStr1 = (p1.p())? liveSpannabl.j(uob).e().j(uob1).e().h(new LiveSpannable$a(uDrawable).c(p1.f)).k(): liveSpannabl.j(uob).j(uob1).e().h(new LiveSpannable$a(uDrawable).c(p1.f)).k();
          spannableStr = spannableStr1;
       }
       return spannableStr;
    }
}
