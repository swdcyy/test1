package he1.a;
import erd.g;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$a;
import androidx.fragment.app.KwaiDialogFragment;

public final class a implements g	// class@00267c
{
    public final LiveChatCountdownDialog b;

    public void a(LiveChatCountdownDialog p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.longValue() > 0) {
          tb.s.setText(String.valueOf(p0));
       }else {
          tb.q.a();
          tb.dismissAllowingStateLoss();
       }
       return;
    }
}
