package aq3.j;
import msd.a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public final class j implements a	// class@0002a5
{
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public void j(boolean p0,boolean p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       return "isMsgValid: "+this.b+", isPreRequest: "+this.c+", isMsgExisted: "+this.d;
    }
}
