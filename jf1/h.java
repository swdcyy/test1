package jf1.h;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.topbar.topuser.LiveAudienceRankChangeMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import java.util.regex.Pattern;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.SpannableStringBuilder;

public class h implements d	// class@002b6b
{

    public void h(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          LiveAudienceRankChangeMessage mUserName = p0.mUserName;
          String[] stringArray = (p0.mNoticeText).split(Pattern.quote(mUserName), 2);
          if (!p1.p()) {
             spannableStr = liveSpannabl.j(f.c(p0.mNoticeText, p1).d(R.color.arg_RES_7f060871)).k();
          }else if(stringArray.length < 2){
             liveSpannabl.j(f.c(p0.mNoticeText, p1).d(p1.l()));
          }else {
             liveSpannabl.j(f.c(stringArray[0], p1).d(p1.l())).e().j(f.c(mUserName, p1).d(p1.h())).e().j(f.c(stringArray[1], p1).d(p1.l()));
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
