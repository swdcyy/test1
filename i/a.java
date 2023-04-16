package i.a;
import okhttp3.Dns;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collection;
import a.a.a.a.b.e.b$b;
import java.lang.StringBuilder;
import a.a.a.a.b.e.b;

public abstract class a implements Dns	// class@00214b
{
    public static final HashSet a;

    static {
       HashSet hashSet = new HashSet();
       a.a = hashSet;
       hashSet.add("d1.static.yximgs.com");
       hashSet.add("d2.static.yximgs.com");
       hashSet.add("d3.static.yximgs.com");
       hashSet.add("kste.ksapisrv.com");
    }
    public void a(){
       super();
    }
    public abstract List a(String p0);
    public List lookup(String p0){
       if (a.a.contains(p0)) {
          List list = this.a(p0);
          if (list != null && !list.isEmpty()) {
             LinkedList linkedList = new LinkedList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                linkedList.addAll(Arrays.asList(InetAddress.getAllByName(iterator.next())));
             }
             b.a(b$b.a, "final resolve "+p0+" is "+Arrays.toString(linkedList.toArray()), 216);
             return linkedList;
          }
       }
       return Dns.SYSTEM.lookup(p0);
    }
}
