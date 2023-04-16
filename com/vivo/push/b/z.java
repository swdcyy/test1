package com.vivo.push.b.z;
import com.vivo.push.b.c;
import java.lang.String;
import java.util.ArrayList;
import com.vivo.push.a;
import java.io.Serializable;

public final class z extends c	// class@001049
{
    public ArrayList a;

    public void z(boolean p0,String p1,ArrayList p2){
       int i = (p0)? 2004: 2005;
       super(i, p1);
       this.a = p2;
       return;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("tags", this.a);
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.c("tags");
    }
    public final String toString(){
       return "TagCommand";
    }
}
