package jwd.d;
import jwd.b;
import jwd.g;
import java.lang.String;
import java.lang.IllegalArgumentException;

public class d extends g implements b	// class@00174e
{
    public String c;

    public void d(){
       super();
       this.c = "*";
    }
    public String getResourceDescriptor(){
       return this.c;
    }
    public void setResourceDescriptor(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("http resource descriptor must not be null");
       }
       this.c = p0;
       return;
    }
}
