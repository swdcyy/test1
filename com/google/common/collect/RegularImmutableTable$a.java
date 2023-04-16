package com.google.common.collect.RegularImmutableTable$a;
import java.util.Comparator;
import java.lang.Object;
import com.google.common.collect.s$a;

public final class RegularImmutableTable$a implements Comparator	// class@001879
{
    public final Comparator b;
    public final Comparator c;

    public void RegularImmutableTable$a(Comparator p0,Comparator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public int compare(Object p0,Object p1){
       RegularImmutableTable$a tb = this.b;
       int i = 0;
       int i1 = (tb == null)? 0: tb.compare(p0.getRowKey(), p1.getRowKey());
       if (!i1) {
          tb = this.c;
          if (tb != null) {
             i = tb.compare(p0.getColumnKey(), p1.getColumnKey());
          }
          i1 = i;
       }
       return i1;
    }
}
