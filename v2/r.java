package v2.r;
import androidx.room.RoomDatabase;
import java.lang.Object;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.String;
import java.util.concurrent.Callable;
import androidx.lifecycle.LiveData;
import androidx.room.e0;

public class r	// class@00265e
{
    public final Set a;
    public final RoomDatabase b;

    public void r(RoomDatabase p0){
       super();
       this.a = Collections.newSetFromMap(new IdentityHashMap());
       this.b = p0;
    }
    public LiveData a(String[] p0,boolean p1,Callable p2){
       e0 uoe0 = new e0(this.b, this, p1, p2, p0);
       return v6;
    }
    public void b(LiveData p0){
       this.a.add(p0);
    }
    public void c(LiveData p0){
       this.a.remove(p0);
    }
}
