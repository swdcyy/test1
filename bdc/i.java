package bdc.i;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bdc.b;
import com.yxcorp.gifshow.reminder.friend.preload.a;
import bdc.h;
import bdc.c;

public final class i implements k	// class@00045a
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, i.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else if(a.c()){
          objArray = new b(new h());
       }
       objArray1 = objArray;
       return objArray1;
    }
}
