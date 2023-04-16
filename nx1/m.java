package nx1.m;
import ok.o;
import nx1.q;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import java.lang.Object;
import nx1.j;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class m implements o	// class@003416
{
    public final q b;
    public final LiveInteractiveWidgetProto$LiveInteractiveWidget c;

    public void m(q p0,LiveInteractiveWidgetProto$LiveInteractiveWidget p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       return TextUtils.equals(p0.a(), tb.c(this.c));
    }
}
