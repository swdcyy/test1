package wu8.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.util.Map;
import java.util.List;

public class u	// class@002798
{
    public Map a;

    public void u(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public synchronized boolean a(String p0){
       List list = this.a.get(p0);
       boolean b = (list != null && !list.isEmpty())? true: false;
       return b;
    }
}
