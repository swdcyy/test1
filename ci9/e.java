package ci9.e;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ci9.l;
import java.lang.Object;
import java.util.Objects;
import ci9.m;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;

public final class e implements b$a	// class@0005f5
{
    public final l a;

    public void e(l p0){
       this.a = p0;
    }
    public final Object getData(){
       e ta = this.a;
       Objects.requireNonNull(ta);
       l p = ta.p;
       boolean b = (p != null && p.y())? true: false;
       return new m(b);
    }
}
