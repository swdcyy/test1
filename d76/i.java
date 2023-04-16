package d76.i;
import zk.a;
import java.lang.Object;
import java.lang.Class;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import zk.b;

public class i implements a	// class@00147a
{

    public void i(){
       super();
    }
    public boolean shouldSkipClass(Class p0){
       boolean b = (p0 == DefaultSyncable.class || p0 == DefaultObservable.class)? true: false;
       return b;
    }
    public boolean shouldSkipField(b p0){
       return false;
    }
}
