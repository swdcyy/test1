package hl9.l;
import w07.l;
import com.yxcorp.gifshow.comment.utils.b;
import com.yxcorp.gifshow.comment.config.CommentInterceptorConfig$AlertInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;

public final class l implements l	// class@0026d6
{
    public final b a;
    public final CommentInterceptorConfig$AlertInfo b;

    public void l(b p0,CommentInterceptorConfig$AlertInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       if (this.a.a(this.b) && p0.z() != null) {
          p0.z().findViewById(R.id.content).setMovementMethod(LinkMovementMethod.getInstance());
       }
       return;
    }
}
