package fx8.b0;
import ekd.q$b;
import java.lang.String;
import im8.f;
import java.lang.Object;
import com.kuaishou.android.post.topic.model.TopicItem;

public final class b0 implements q$b	// class@002373
{
    public final String a;
    public final f b;

    public void b0(String p0,f p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(Object p0){
       b0 tb = this.b;
       boolean b = (p0.getKeyWorld()).equals(this.a);
       if (b) {
          tb.set(p0);
       }
       return (b ^ 0x01);
    }
}
