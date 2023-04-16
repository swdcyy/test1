package nx1.n;
import rx4.j;
import nx1.q;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.util.Iterator;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import nx1.j;

public final class n implements j	// class@003417
{
    public final q a;
    public final List b;

    public void n(q p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       n ta = this.a;
       Objects.requireNonNull(ta);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          ta.b.add(ta.a(iterator.next()));
       }
       return;
    }
}
