package uo7.c0;
import uo7.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;

public abstract class c0	// class@00393e
{
    public final k b;

    public void c0(k p0){
       a.p(p0, "configuration");
       super();
       this.b = p0;
    }
    public final k getConfiguration(){
       return this.b;
    }
    public abstract t s();
}
