package com.loc.bi$c;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.util.Map;

public final class bi$c	// class@001393
{
    public Map a;
    public Map b;

    public void bi$c(){
       super();
       this.a = new HashMap(8);
       this.b = new HashMap(8);
    }
    public void bi$c(byte p0){
       super();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || (bi$c.class == p0.getClass() && (this.a.equals(p0.a) && this.b.equals(p0.b)))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       bi$c ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       bi$c tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
}
