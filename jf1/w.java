package jf1.w;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r81.c;
import android.text.SpannableStringBuilder;
import fz1.b;

public class w implements d	// class@002b82
{

    public void w(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, w.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          spannableStr = b.a(p0, p1.d().h(), 16);
       }
       return spannableStr;
    }
}
