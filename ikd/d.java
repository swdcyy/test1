package ikd.d;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import ikd.c;
import java.lang.Integer;
import com.smile.gifshow.annotation.plugin.Factory;
import com.smile.gifshow.annotation.plugin.a;
import java.util.Iterator;
import java.util.List;
import java.lang.String;
import ukd.a;

public final class d	// class@001803
{
    public static c a;
    public static b b;
    public static final List c;
    public static final List d;

    static {
       d.c = new CopyOnWriteArrayList();
       d.d = new CopyOnWriteArrayList();
    }
    public void d(){
       super();
    }
    public static Factory a(c p0,Integer p1,int p2){
       if (!p2) {
          return p0.createPlugin(p1);
       }
       if (p2 == 1) {
          return p0.createSingleton(p1);
       }
       return p0.createImpl(p1);
    }
    public static Factory b(Integer p0,int p1){
       Factory uFactory;
       Factory uFactory1;
       if (d.c() != null) {
          uFactory = d.a(d.c(), p0, p1);
          if (uFactory != null) {
             if (!uFactory instanceof a) {
                return uFactory;
             }else {
             label_0016 :
                Iterator iterator = d.d.iterator();
                while (true) {
                   if (!iterator.hasNext()) {
                      return uFactory;
                   }
                   uFactory1 = d.a(iterator.next(), p0, p1);
                   if (uFactory1 != null) {
                      if (!uFactory1 instanceof a) {
                         break ;
                      }else {
                         uFactory = uFactory1;
                      }
                   }
                }
                return uFactory1;
             }
          }
       }
       uFactory = null;
       goto label_0016 ;
    }
    public static c c(){
       if (d.a == null) {
          String str = "com.kwai.asuka.ioc.IOCProviderImpl";
          _monitor_enter(str);
          if (d.a == null) {
             Object[] objArray = new Object[0];
             d.a = a.l("com.kwai.asuka.ioc.IOCProviderImpl", objArray);
          }
          _monitor_exit(str);
       }
       return d.a;
    }
}
