package bwd.b;
import bwd.a;
import java.lang.Class;
import bwd.e;
import awd.i;
import java.lang.String;
import org.greenrobot.eventbus.ThreadMode;

public class b extends a	// class@00036b
{
    public final e[] d;

    public void b(Class p0,boolean p1,e[] p2){
       super(p0, null, p1);
       this.d = p2;
    }
    public synchronized i[] b(){
       int i;
       int len = this.d.length;
       i[] oiArray = new i[len];
       for (i = 0; i < len; i = i + 1) {
          object oobject = this.d[i];
          oiArray[i] = this.e(oobject.a, oobject.c, oobject.b, oobject.d, oobject.e);
       }
       return oiArray;
    }
}
