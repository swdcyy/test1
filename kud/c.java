package kud.c;
import kud.d;
import java.lang.String;
import org.apache.internal.commons.io.filefilter.AndFileFilter;
import java.util.List;
import org.apache.internal.commons.io.filefilter.DirectoryFileFilter;
import org.apache.internal.commons.io.filefilter.NameFileFilter;
import org.apache.internal.commons.io.filefilter.NotFileFilter;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class c	// class@001c01
{
    public static final d a;
    public static final d b;

    static {
       d[] uodArray = new d[]{c.b(),c.c("CVS")};
       c.a = c.d(c.a(uodArray));
       d[] uodArray1 = new d[]{c.b(),c.c(".svn")};
       c.b = c.d(c.a(uodArray1));
    }
    public static d a(d[] p0){
       return new AndFileFilter(c.e(p0));
    }
    public static d b(){
       return DirectoryFileFilter.DIRECTORY;
    }
    public static d c(String p0){
       return new NameFileFilter(p0);
    }
    public static d d(d p0){
       return new NotFileFilter(p0);
    }
    public static List e(d[] p0){
       if (p0 == null) {
          throw new IllegalArgumentException("The filters must not be null");
       }
       ArrayList uArrayList = new ArrayList(p0.length);
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return uArrayList;
          }
          if (p0[i] != null) {
             uArrayList.add(p0[i]);
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("The filter["+i+"] is null");
    }
}
