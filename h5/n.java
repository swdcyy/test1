package h5.n;
import h5.m;
import java.lang.Object;
import n5.a;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public abstract class n implements m	// class@0020fc
{
    public final List a;

    public void n(Object p0){
       super(Collections.singletonList(new a(p0)));
    }
    public void n(List p0){
       super();
       this.a = p0;
    }
    public List b(){
       return this.a;
    }
    public boolean c(){
       int i = 0;
       if (this.a.isEmpty() || (this.a.size() == 1 && this.a.get(i).d())) {
          i = true;
       }
       return i;
    }
    public String toString(){
       StringBuilder str = "";
       if (!this.a.isEmpty()) {
          str = str+"values="+Arrays.toString(this.a.toArray());
       }
       return str;
    }
}
