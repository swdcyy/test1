package mrd.c;
import brd.y;
import brd.t;
import java.lang.Throwable;
import mrd.b;

public abstract class c extends t implements y	// class@001ec3
{

    public void c(){
       super();
    }
    public abstract Throwable b();
    public abstract boolean c();
    public abstract boolean d();
    public abstract boolean e();
    public final c f(){
       if (this instanceof b) {
          return this;
       }
       return new b(this);
    }
}
