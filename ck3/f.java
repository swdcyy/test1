package ck3.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ck3.m;
import ck3.b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class f extends Accessor	// class@00057c
{
    public final b c;
    public final m d;

    public void f(m p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
