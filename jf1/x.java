package jf1.x;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kwai.live.gzone.comments.LiveGzoneTagMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import android.text.SpannableStringBuilder;

public class x implements d	// class@002b83
{

    public void x(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, x.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          spannableStr = new LiveSpannable().h(new LiveSpannable$a(R.drawable.arg_RES_7f081292).c(p1.f)).e().j(f.c(p0.mContent, p1).d(R.color.arg_RES_7f060871)).k();
       }
       return spannableStr;
    }
}
