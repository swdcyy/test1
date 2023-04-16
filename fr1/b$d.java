package fr1.b$d;
import androidx.lifecycle.Observer;
import fr1.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b$d implements Observer	// class@00238d
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else if(this.b.v0()){
          this.b.w0();
       }
       return;
    }
}
