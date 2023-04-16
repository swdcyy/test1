package i6.c;
import i6.b;
import java.lang.String;

public final class c extends b	// class@002185
{
    public final String d;

    public void c(String p0){
       super();
       this.d = p0;
    }
    public void a(){
       this.a = 1;
       byte[] bytes = (this.d).getBytes("UTF-8");
       this.c = bytes;
       this.b = (byte)bytes.length;
    }
}
