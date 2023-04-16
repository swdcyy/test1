package kotlin.text.CharCategory$a;
import java.lang.Object;
import nsd.u;
import java.util.Map;
import kotlin.text.CharCategory;
import qrd.p;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class CharCategory$a	// class@0018e9
{

    public void CharCategory$a(){
       super();
    }
    public void CharCategory$a(u p0){
       super();
    }
    public final Map a(){
       return CharCategory.categoryMap$delegate.getValue();
    }
    public final CharCategory b(int p0){
       CharCategory uCharCategor = this.a().get(Integer.valueOf(p0));
       if (uCharCategor != null) {
          return uCharCategor;
       }
       throw new IllegalArgumentException("Category #"+p0+" is not defined.");
    }
}
