package hg9.z;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class z implements View$OnLongClickListener	// class@002684
{
    public final m b;

    public void z(m p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       boolean b;
       z tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, m.class, "20");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          tb.k2();
          b = true;
       }
       return b;
    }
}
