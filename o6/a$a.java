package o6.a$a;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public final class a$a	// class@002762
{
    public final String a;
    public final byte[] b;
    public final Map c;

    public void a$a(String p0,Map p1,byte[] p2){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.a,this.c};
       return String.format("<UrlConnectionConfigure url=%s headers=%s>", objArray);
    }
}
