package cd9.f;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import java.lang.Object;
import java.util.Objects;
import bd9.f;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;

public final class f implements b$a	// class@0005a5
{
    public final DuetLayoutManager a;

    public void f(DuetLayoutManager p0){
       this.a = p0;
    }
    public final Object getData(){
       f ta = this.a;
       Objects.requireNonNull(ta);
       return new f(ta.v);
    }
}
