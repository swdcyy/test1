package mx1.f;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty;
import java.lang.Integer;

public final class f implements Comparator	// class@003240
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Integer.compare(p1.property.priority, p0.property.priority);
    }
}
