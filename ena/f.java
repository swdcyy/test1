package ena.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.growth.cleaner.GrowthCleanerFragment;
import ena.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ena.c;
import ena.d;
import ena.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@00277a
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("CLEANER_ADAPTER_DATA_OBSERVERS", new b(this, p1));
       p0.i("CLEANER_BACKWARD_LISTENERS", new c(this, p1));
       d uod = new d(this, p1);
       String str = "CLEANER_EVENT_SUBJECT";
       try{
          p0.i(str, uod);
          p0.h(GrowthCleanerFragment.class, new e(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
