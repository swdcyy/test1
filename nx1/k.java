package nx1.k;
import ok.o;
import nx1.q;
import nx1.j;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class k implements o	// class@003414
{
    public final q b;
    public final j c;

    public void k(q p0,j p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       return TextUtils.equals(this.b.c(p0), this.c.a());
    }
}
