package laa.g;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class g	// class@002d85
{
    public List a;
    public Map b;
    public Set c;

    public void g(List p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       if (p0 != null) {
          uArrayList.addAll(p0);
       }
       this.b = new HashMap();
       this.c = new HashSet();
       return;
    }
}
