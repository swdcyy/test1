package old.soloader.e$a;
import java.lang.Comparable;
import old.soloader.i$b;
import java.lang.String;
import java.util.zip.ZipEntry;
import java.lang.Object;
import java.lang.Long;

public final class e$a extends i$b implements Comparable	// class@002010
{
    public final ZipEntry d;
    public final int e;

    public void e$a(String p0,ZipEntry p1,int p2){
       Object[] objArray = new Object[]{p1.getName(),Long.valueOf(p1.getSize()),Long.valueOf(p1.getCompressedSize()),Long.valueOf(p1.getCrc())};
       super(p0, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", objArray));
       this.d = p1;
       this.e = p2;
    }
    public int compareTo(Object p0){
       return (this.b).compareTo(p0.b);
    }
}
