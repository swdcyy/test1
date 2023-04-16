package hwd.a;
import hwd.b;
import java.lang.Object;
import iwd.c;
import java.lang.String;
import org.java_websocket.exceptions.InvalidFrameException;
import java.lang.StringBuilder;
import java.lang.Class;

public class a implements b	// class@000ff0
{

    public void a(){
       super();
    }
    public void a(c p0){
    }
    public boolean acceptProvidedExtensionAsClient(String p0){
       return true;
    }
    public boolean acceptProvidedExtensionAsServer(String p0){
       return true;
    }
    public void b(c p0){
       if (!p0.isRSV1() && (!p0.isRSV2() && !p0.isRSV3())) {
          return;
       }
       throw new InvalidFrameException("bad rsv RSV1: "+p0.isRSV1()+" RSV2: "+p0.isRSV2()+" RSV3: "+p0.isRSV3());
    }
    public void c(c p0){
    }
    public b copyInstance(){
       return new a();
    }
    public boolean equals(Object p0){
       boolean b = (this == p0 || (p0 != null && a.class == p0.getClass()))? true: false;
       return b;
    }
    public String getProvidedExtensionAsClient(){
       return "";
    }
    public String getProvidedExtensionAsServer(){
       return "";
    }
    public int hashCode(){
       return a.class.hashCode();
    }
    public void reset(){
    }
    public String toString(){
       return a.class.getSimpleName();
    }
}
