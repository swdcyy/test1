package ld.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.Locale;

public class b	// class@002544
{
    public final int a;

    public void b(int p0){
       super();
       this.a = p0;
    }
    public int a(){
       return this.a;
    }
    public String toString(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a)};
       return String.format(null, "Status: %d", objArray);
    }
}
