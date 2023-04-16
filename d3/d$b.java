package d3.d$b;
import java.lang.ThreadLocal;
import java.nio.charset.Charset;
import java.lang.String;
import java.lang.Object;

public final class d$b extends ThreadLocal	// class@001dfb
{

    public void d$b(){
       super();
    }
    public Charset a(){
       return Charset.forName("UTF-8");
    }
    public Object initialValue(){
       return this.a();
    }
}
