package byd.i;
import byd.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class i implements h	// class@00030a
{
    public static final h Z;

    static {
       i.Z = new i();
    }
    public void i(){
       super();
    }
    public Class annotationType(){
       return h.class;
    }
    public boolean equals(Object p0){
       return p0 instanceof h;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       return "@"+h.class.getName()+"\(\)";
    }
}
