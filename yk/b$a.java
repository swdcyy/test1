package yk.b$a;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.Charset;

public final class b$a extends ThreadLocal	// class@0028c5
{

    public void b$a(){
       super();
    }
    public Object initialValue(){
       return Charset.forName("UTF-8");
    }
}
