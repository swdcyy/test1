package com.vivo.push.b.m;
import com.vivo.push.b.s;
import com.vivo.push.a;
import java.lang.String;
import java.util.ArrayList;

public final class m extends s	// class@00103c
{
    public ArrayList a;

    public void m(){
       super(8);
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("tags_list", this.a);
    }
    public final ArrayList d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.c("tags_list");
    }
    public final String toString(){
       return "OnListTagCommand";
    }
}
