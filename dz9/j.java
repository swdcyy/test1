package dz9.j;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import kf5.g;
import java.lang.Object;
import lm5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mm5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import crd.b;

public final class j implements g	// class@002015
{
    public final OperationDanmakuSwitch b;
    public final boolean c;
    public final g d;

    public void j(OperationDanmakuSwitch p0,boolean p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else if(p0.a != null){
          a.i(a.a, "OperationDanmakuSwitch", "订阅的 DanmakuSwitchSuccessfulEvent 收到消息，OperationDanmakuSwitch 手动点击", this.b.D, null, "switchDanmaku", null, 40, null);
          this.b.W(this.c, this.d);
          p0 = this.b.E;
          if (p0 != null) {
             p0.dispose();
          }
          if (this.c == null) {
             this.d.a();
          }
       }
       return;
    }
}
