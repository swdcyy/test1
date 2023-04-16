package jf1.b0;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.text.SpannableStringBuilder;

public class b0 implements d	// class@002b62
{
    public boolean a;

    public void b0(){
       super();
       this.a = true;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, b0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          String str = b.c(p0.mUser);
          String str1 = str+"£º"+p0.mContent;
          if (!TextUtils.x(str) && (TextUtils.x(p0.mContent) || (p0.mContent).contains("null"))) {
             b.d0(LiveLogTag.COMMENT, "systemMessage warning", "id", p0.getId(), "text", str1);
          }
          LiveSpannable$b uob = f.c(str1, p1);
          if (p1.p()) {
             uob.d(R.color.arg_RES_7f061fda);
          }else {
             uob.d(R.color.arg_RES_7f060871);
          }
          spannableStr = new LiveSpannable().j(uob).k();
       }
       return spannableStr;
    }
}
