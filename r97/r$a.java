package r97.r$a;
import java.lang.Object;
import r97.r;
import java.lang.String;
import ca7.v;
import r97.o;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public abstract class r$a	// class@00234d
{

    public void r$a(){
       super();
    }
    public abstract r a();
    public abstract r$a b(String p0);
    public r c(){
       r or = this.a();
       v.d(or.e(), "custom stat event key is empty string");
       return or;
    }
    public abstract r$a d(o p0);
    public abstract r$a e(String p0);
    public abstract r$a f(String p0);
    public r$a g(JsonObject p0){
       this.h(p0.toString());
       return this;
    }
    public abstract r$a h(String p0);
}
