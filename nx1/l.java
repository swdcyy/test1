package nx1.l;
import ok.o;
import nx1.q;
import px1.a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class l implements o	// class@003415
{
    public final q b;
    public final a c;

    public void l(q p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       return TextUtils.equals(tb.c(this.c.j()), tb.c(p0));
    }
}
