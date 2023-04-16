package dx9.i;
import com.yxcorp.gifshow.detail.comment.limitcomment.d$a;
import com.yxcorp.gifshow.detail.comment.limitcomment.l;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.ImageView;

public final class i implements d$a	// class@001ff0
{
    public final l a;

    public void i(l p0){
       this.a = p0;
    }
    public final void a(boolean p0,QPhoto p1){
       i ta = this.a;
       Objects.requireNonNull(ta);
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, ta, ol, "6") && ta.r.equals(p1))) {
          if (p0) {
             ta.q.setImageResource(R.drawable.arg_RES_7f080f5c);
          }else {
             ta.q.setImageResource(R.drawable.arg_RES_7f080617);
          }
       }
       return;
    }
}
