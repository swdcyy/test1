package l4.i;
import l4.h;
import l4.f;

public class i	// class@002516
{
    public static h a;

    public static h a(){
       h a = i.a;
       if (a != null) {
          return a;
       }
       return new f();
    }
    public static void b(h p0){
       i.a = p0;
    }
}
