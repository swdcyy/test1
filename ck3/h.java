package ck3.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ck3.m;
import ck3.b;
import java.lang.Object;
import jl3.b;

public class h extends Accessor	// class@00057e
{
    public final b c;
    public final m d;

    public void h(m p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
