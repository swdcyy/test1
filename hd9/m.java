package hd9.m;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.camera.record.followshoot.d;

public final class m implements g	// class@00261d
{
    public final b b;

    public void m(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uob, "6")) {
       }else if(p0.c != PanelShowEvent$PanelType.IMMERSE_MODE || (PatchProxy.applyVoidOneRefs(p0, tb, uob, "9") || !tb.r2())){
          if (p0.a != null) {
             if (tb.u2()) {
                tb.I2();
             }
             tb.y2();
          }else {
             tb.z2();
          }
       }
       return;
    }
}
