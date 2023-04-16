package a8c.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a8c.e;
import a8c.h$b;
import java.lang.Object;
import java.lang.Boolean;

public class a extends Accessor	// class@000099
{
    public final h$b c;
    public final e d;

    public void a(e p0,h$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.c);
    }
}
