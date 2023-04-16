package cud.f;
import java.util.RandomAccess;
import java.util.AbstractList;
import cud.f$a;
import nsd.u;
import okio.ByteString;
import java.lang.Object;
import java.util.AbstractCollection;

public final class f extends AbstractList implements RandomAccess	// class@000c88
{
    public final ByteString[] b;
    public final int[] c;
    public static final f$a d;

    static {
       f.d = new f$a(null);
    }
    public void f(ByteString[] p0,int[] p1,u p2){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final ByteString[] b(){
       return this.b;
    }
    public final boolean contains(Object p0){
       int i;
       v0 = (p0 != null)? p0 instanceof ByteString: 1;
       if (v0) {
          return super.contains(p0);
       }else {
          return false;
       }
    }
    public Object get(int p0){
       return this.b[p0];
    }
    public final int indexOf(Object p0){
       int i;
       v0 = (p0 != null)? p0 instanceof ByteString: 1;
       if (v0) {
          return super.indexOf(p0);
       }else {
          return -1;
       }
    }
    public final int lastIndexOf(Object p0){
       int i;
       v0 = (p0 != null)? p0 instanceof ByteString: 1;
       if (v0) {
          return super.lastIndexOf(p0);
       }else {
          return -1;
       }
    }
    public final boolean remove(Object p0){
       int i;
       v0 = (p0 != null)? p0 instanceof ByteString: 1;
       if (v0) {
          return super.remove(p0);
       }else {
          return false;
       }
    }
    public final int size(){
       return this.b.length;
    }
}
