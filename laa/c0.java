package laa.c0;
import java.util.Comparator;
import java.util.HashMap;
import java.lang.Object;
import java.io.File;
import java.lang.Long;
import haa.f;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class c0 implements Comparator	// class@002d7c
{
    public final HashMap b;

    public void c0(HashMap p0){
       this.b = p0;
    }
    public final int compare(Object p0,Object p1){
       c0 tb = this.b;
       p1 = tb.get(p1);
       p0 = tb.get(p0);
       long l = 0;
       if (p1 != null && p0 != null) {
          l = Long.compare(p1.longValue(), p0.longValue());
       }else {
          p1 = new Object[l];
          f.D().w("DraftFileManager", "lastModified contains null value: lastModified2 = "+p1+", lastModified1 = "+p0, p1);
       }
       return l;
    }
}
