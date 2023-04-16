package aa.a;
import ia.a;
import java.util.List;
import java.lang.Object;

public class a implements a	// class@000108
{
    public List a;

    public void a(List p0){
       super();
       this.a = p0;
    }
    public Object getItem(int p0){
       if (p0 >= 0 && p0 < this.a.size()) {
          return this.a.get(p0);
       }
       return "";
    }
    public int getItemsCount(){
       return this.a.size();
    }
    public int indexOf(Object p0){
       return this.a.indexOf(p0);
    }
}
