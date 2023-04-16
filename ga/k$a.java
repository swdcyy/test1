package ga.k$a;
import ja.a;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class k$a implements a	// class@00206a
{
    public String b;
    public String c;

    public void k$a(String p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean equals(Object p0){
       if (p0 instanceof k$a) {
          return TextUtils.n(this.c, p0.c);
       }
       return false;
    }
    public String getPickerViewText(){
       object oobject = (this.b).split("#")[1];
       if (oobject.length() > 8) {
          oobject = oobject.substring(0, 8)+"...";
       }
       return oobject;
    }
}
