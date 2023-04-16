package ekd.c$b;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public class c$b	// class@000d2c
{
    public final String a;

    public void c$b(String p0){
       super();
       if (p0 == null || p0.isEmpty()) {
          throw new IllegalArgumentException("name cant be empty");
       }
       this.a = p0;
       return;
    }
}
