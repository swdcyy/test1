package bac.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.e0;
import bac.p$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class w extends Accessor	// class@000420
{
    public final p$a c;
    public final e0 d;

    public void w(e0 p0,p$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
