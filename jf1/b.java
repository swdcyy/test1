package jf1.b;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveAdConversionTaskMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$NormalMsg;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LinkMsg;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.a;
import android.text.style.ClickableSpan;
import java.lang.Integer;
import java.lang.Boolean;

public class b implements d	// class@002b63
{
    public final f a;

    public void b(){
       super(null);
    }
    public void b(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable(new SpannableStringBuilder());
          LiveAdConversionTaskMessage mNormalMsg = p0.mNormalMsg;
          if (mNormalMsg != null && this.b(p1, mNormalMsg.showType)) {
             LiveSpannable$b uob = f.c(mNormalMsg.desc, p1);
             if (p1.p()) {
                uob.d(p1.k());
             }else {
                uob.d(R.color.arg_RES_7f060871);
             }
             liveSpannabl.j(uob);
          }
          LiveAdConversionTaskMessage mLinkMsg = p0.mLinkMsg;
          if (mNormalMsg != null && (this.b(p1, mLinkMsg.showType) && (!TextUtils.x(mLinkMsg.desc) && this.a != null))) {
             LiveSpannable$a uoa = p1.f(mLinkMsg.desc);
             if (p1.n()) {
                liveSpannabl.c();
             }else {
                liveSpannabl.d();
             }
             uoa.a(new a(this, p0));
             liveSpannabl.h(uoa);
             p0.setHasLastButton(true);
          }
       label_007f :
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
    public final boolean b(g p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 == 3) {
          return true;
       }else if(p1 == 2){
          return (p0.m() ^ true);
       }else if(p1 == 1){
          return p0.m();
       }else {
          return false;
       }
    }
}
