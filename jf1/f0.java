package jf1.f0;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.recruit.questionmessage.LiveRecruitQuestionMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import java.lang.StringBuilder;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.e0;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class f0 implements d	// class@002b67
{
    public final f a;

    public void f0(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, f0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          LiveSpannable$b uob = f.c(p0.mPrefix+"£º"+p0.mContent, p1);
          if (p1.p()) {
             uob.d(p1.k());
          }else {
             uob.d(R.color.arg_RES_7f060871);
          }
          liveSpannabl.j(uob);
          if (!TextUtils.x(p0.mButtonContent)) {
             LiveSpannable$a uoa = p1.f(p0.mButtonContent);
             uoa.a(new e0(this, p0));
             liveSpannabl.h(uoa);
             p0.setHasLastButton(true);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
