package a8c.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a8c.p;
import a8c.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;

public class m extends Accessor	// class@0000a7
{
    public final h c;
    public final p d;

    public void m(p p0,h p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
