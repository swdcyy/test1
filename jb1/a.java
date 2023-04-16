package jb1.a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import jb1.b;

public final class a implements Comparator	// class@002b07
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       if (p0.isWatching() == p1.isWatching()) {
          i = 0;
       }else if(p0.isWatching()){
          i = -1;
       }else {
          i = 1;
       }
       return i;
    }
}
