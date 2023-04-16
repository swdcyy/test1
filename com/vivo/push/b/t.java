package com.vivo.push.b.t;
import com.vivo.push.b.s;
import com.vivo.push.a;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public final class t extends s	// class@001043
{
    public ArrayList a;
    public ArrayList b;

    public void t(int p0){
       super(p0);
       this.a = null;
       this.b = null;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("content", this.a);
       p0.a("error_msg", this.b);
    }
    public final ArrayList d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.c("content");
       this.b = p0.c("error_msg");
    }
    public final List e(){
       return this.b;
    }
    public final String toString(){
       return "OnSetTagsCommand";
    }
}
