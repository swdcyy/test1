package ged.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.f;
import ged.b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;

public class c extends Accessor	// class@002ac1
{
    public final b c;
    public final f d;

    public void c(f p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
