package isd.g;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class g	// class@001506
{
    public final File a;
    public final List b;

    public void g(File p0,List p1){
       a.p(p0, "root");
       a.p(p1, "segments");
       super();
       this.a = p0;
       this.b = p1;
    }
    public static g d(g p0,File p1,List p2,int p3,Object p4){
       g a;
       g b;
       if (p3 & 0x01) {
          a = p0.a;
       }
       if (p3 & 0x02) {
          b = p0.b;
       }
       return p0.c(a, b);
    }
    public final File a(){
       return this.a;
    }
    public final List b(){
       return this.b;
    }
    public final g c(File p0,List p1){
       a.p(p0, "root");
       a.p(p1, "segments");
       return new g(p0, p1);
    }
    public final File e(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof g && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public final String f(){
       String path = this.a.getPath();
       a.o(path, "root.path");
       return path;
    }
    public final List g(){
       return this.b;
    }
    public final int h(){
       return this.b.size();
    }
    public int hashCode(){
       g ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       g tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final boolean i(){
       String path = this.a.getPath();
       a.o(path, "root.path");
       boolean b = (path.length() > 0)? true: false;
       return b;
    }
    public final File j(int p0,int p1){
       if (p0 < 0 || (p0 > p1 || p1 > this.h())) {
          throw new IllegalArgumentException();
       }
       String separator = File.separator;
       a.o(separator, "File.separator");
       return new File(CollectionsKt___CollectionsKt.V2(this.b.subList(p0, p1), separator, null, null, 0, null, null, 62, null));
    }
    public String toString(){
       return "FilePathComponents\(root="+this.a+", segments="+this.b+"\)";
    }
}
