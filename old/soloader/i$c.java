package old.soloader.i$c;
import old.soloader.i$b;
import java.lang.Object;
import java.io.DataInput;
import java.lang.String;
import java.lang.RuntimeException;

public final class i$c	// class@00201a
{
    public final i$b[] a;

    public void i$c(i$b[] p0){
       super();
       this.a = p0;
    }
    public static final i$c a(DataInput p0){
       if (p0.readByte() != 1) {
          throw new RuntimeException("wrong dso manifest version");
       }
       int i = p0.readInt();
       if (i < 0) {
          throw new RuntimeException("illegal number of shared libraries");
       }
       i$b[] uobArray = new i$b[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uobArray[i1] = new i$b(p0.readUTF(), p0.readUTF());
       }
       return new i$c(uobArray);
    }
}
