package k2b.k3;
import java.util.List;
import y2b.b;
import java.lang.Object;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class k3	// class@001ba9
{
    public final ImmutableList a;
    public final ImmutableList b;
    public final b c;
    public final ImmutableList d;

    public void k3(List p0,List p1,b p2,List p3){
       super();
       this.a = ImmutableList.copyOf(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(ImmutableMap.copyOf(iterator.next()));
       }
       this.b = ImmutableList.copyOf(uArrayList);
       this.c = p2;
       uArrayList = new ArrayList();
       iterator = p3.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(ImmutableMap.copyOf(iterator.next()));
       }
       this.d = ImmutableList.copyOf(uArrayList);
       return;
    }
}
