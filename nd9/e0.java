package nd9.e0;
import com.yxcorp.gifshow.camera.record.base.b$a;
import nd9.f0;
import java.lang.Object;
import nd9.l;
import android.view.View;
import nd9.a;

public final class e0 implements b$a	// class@003139
{
    public final f0 a;

    public void e0(f0 p0){
       this.a = p0;
    }
    public final Object getData(){
       l s = this.a.s;
       a uoa = (s != null && !s.getVisibility())? new a(true): new a(false);
       return uoa;
    }
}
