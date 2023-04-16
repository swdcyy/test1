package d3.d$a;
import java.lang.ThreadLocal;
import java.nio.charset.CharsetDecoder;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;

public final class d$a extends ThreadLocal	// class@001dfa
{

    public void d$a(){
       super();
    }
    public CharsetDecoder a(){
       return Charset.forName("UTF-8").newDecoder();
    }
    public Object initialValue(){
       return this.a();
    }
}
