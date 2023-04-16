package e3.o;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;

public class o	// class@001eed
{
    public final Map a;
    public View b;
    public final ArrayList c;

    public void o(){
       super();
       this.a = new HashMap();
       this.c = new ArrayList();
    }
    public void o(View p0){
       super();
       this.a = new HashMap();
       this.c = new ArrayList();
       this.b = p0;
    }
    public boolean equals(Object p0){
       if (p0 instanceof o && (this.b == p0.b && this.a.equals(p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       return ((this.b.hashCode() * 31) + this.a.hashCode());
    }
    public String toString(){
       String str = "TransitionValues@"+Integer.toHexString(this.hashCode())+":\n"+"    view = "+this.b+"\n"+"    values:";
       Iterator iterator = this.a.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          str = str+"    "+str1+": "+this.a.get(str1)+"\n";
       }
       return str;
    }
}
