package fq9.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class c	// class@00234c
{
    public final QPhoto a;
    public final long b;
    public final String c;

    public void c(QPhoto p0,long p1,String p2){
       a.p(p0, "photo");
       a.p(p2, "saveMode");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final QPhoto a(){
       return this.a;
    }
    public final long b(){
       return this.b;
    }
    public final String c(){
       return this.c;
    }
}
