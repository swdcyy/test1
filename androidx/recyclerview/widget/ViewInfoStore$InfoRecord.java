package androidx.recyclerview.widget.ViewInfoStore$InfoRecord;
import androidx.core.util.Pools$SimplePool;
import java.lang.Object;
import z1.f;

public class ViewInfoStore$InfoRecord	// class@0008da
{
    public int flags;
    public RecyclerView$l$c postInfo;
    public RecyclerView$l$c preInfo;
    public static f sPool;

    static {
       ViewInfoStore$InfoRecord.sPool = new Pools$SimplePool(20);
    }
    public void ViewInfoStore$InfoRecord(){
       super();
    }
    public static void drainCache(){
       do {
       } while (ViewInfoStore$InfoRecord.sPool.q() != null);
       return;
    }
    public static ViewInfoStore$InfoRecord obtain(){
       ViewInfoStore$InfoRecord infoRecord = ViewInfoStore$InfoRecord.sPool.q();
       if (infoRecord == null) {
          infoRecord = new ViewInfoStore$InfoRecord();
       }
       return infoRecord;
    }
    public static void recycle(ViewInfoStore$InfoRecord p0){
       p0.flags = 0;
       p0.preInfo = null;
       p0.postInfo = null;
       ViewInfoStore$InfoRecord.sPool.a(p0);
    }
}
