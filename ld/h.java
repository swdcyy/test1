package ld.h;
import ld.d;
import java.lang.Object;
import com.facebook.imageformat.a;
import ld.c;
import ld.g;

public class h implements d	// class@001d7f
{
    public final int a;

    public void h(int p0){
       super();
       this.a = p0;
    }
    public c createImageTranscoder(a p0,boolean p1){
       return new g(p1, this.a);
    }
}
