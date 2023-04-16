package jf1.g;
import o81.d;
import java.lang.Object;
import o81.f;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveAudienceMerchantSendCSSuccessMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.text.SpannableStringBuilder;

public class g implements d	// class@002b69
{
    public f a;

    public void g(){
       super();
    }
    public void g(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else if(p0 != null){
          this.a.a(p0);
       }
       LiveSpannable$b uob = f.c(p0.mContent, p1);
       if (p1.p()) {
          uob.d(p1.k());
       }else {
          uob.d(R.color.arg_RES_7f060871);
       }
       spannableStr = new LiveSpannable().j(uob).k();
       return spannableStr;
    }
}
