package jf1.v;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneCommonMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import va1.a0;
import com.kuaishou.livestream.message.nano.GzoneCommonFeed$CommentFeedButton;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.u;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class v implements d	// class@002b81
{
    public final f a;

    public void v(){
       super(null);
    }
    public void v(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       LiveSpannable$b uob;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, v.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          v ta = this.a;
          if (ta != null) {
             ta.a(p0);
          }
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          int i = 0x7f060871;
          if (p0.getUser() != null) {
             uob = f.c(b.c(p0.getUser()), p1);
             if (p1.p()) {
                uob.d(p1.h());
             }else {
                uob.d(i);
             }
             liveSpannabl.j(uob).e();
          }
          uob = f.c(p0.mContent, p1);
          if (p1.p()) {
             uob.d(p1.k());
          }else {
             uob.d(i);
          }
          liveSpannabl.j(uob);
          if (a0.h(p0, true)) {
             p0.mSpaceQualified = false;
          }
          if (p0.mSpaceQualified != null) {
             LiveGzoneCommonMessage mFeedButton = p0.mFeedButton;
             if (mFeedButton != null && (!TextUtils.x(mFeedButton.text) && (!TextUtils.x(p0.mFeedButton.url) && this.a != null))) {
                LiveSpannable$a uoa = p1.f(p0.mFeedButton.text);
                uoa.a(new u(this, p0));
                liveSpannabl.d().h(uoa);
                p0.setHasLastButton(true);
             }
          }
       label_00aa :
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
