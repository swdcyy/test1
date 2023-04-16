package bl.j;
import bl.p;
import bl.g;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.reflect.ParameterizedType;
import java.lang.Class;
import java.util.EnumSet;
import com.google.gson.JsonIOException;
import java.lang.StringBuilder;
import java.lang.String;

public class j implements p	// class@000b4a
{
    public final Type a;
    public final g b;

    public void j(g p0,Type p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(){
       j ta = this.a;
       String str = "Invalid EnumSet type: ";
       if (!ta instanceof ParameterizedType) {
          throw new JsonIOException(str+this.a.toString());
       }
       object oobject = ta.getActualTypeArguments()[0];
       if (oobject instanceof Class) {
          return EnumSet.noneOf(oobject);
       }
       throw new JsonIOException(str+this.a.toString());
    }
}
