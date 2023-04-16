package lf1.m;
import z1.a;
import com.kuaishou.live.common.core.component.comments.mock.c;
import java.util.Collection;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.util.Objects;
import java.util.Iterator;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Boolean;

public final class m implements a	// class@002eee
{
    public final c a;
    public final Collection b;
    public final a c;

    public void m(c p0,Collection p1,a p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0){
       m ta = this.a;
       m tc = this.c;
       Objects.requireNonNull(ta);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          ta.P8(iterator.next(), p0);
       }
       tc.accept(Boolean.TRUE);
       return;
    }
}
