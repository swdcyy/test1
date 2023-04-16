package nz9.i0;
import java.lang.Runnable;
import nz9.z0;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import java.lang.Object;
import qp7.x0;
import qp7.b;
import os7.a;
import z1.e;
import java.lang.Integer;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$Size;

public final class i0 implements Runnable	// class@003226
{
    public final z0 b;
    public final LiveStageProto$LayoutConfig c;

    public void i0(z0 p0,LiveStageProto$LayoutConfig p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i0 tb = this.b;
       tb.a1 = true;
       LiveStageProto$LayoutConfig canvasSize = this.c.canvasSize;
       tb.E().q(new e(Integer.valueOf(54), Integer.valueOf(((canvasSize.height * 54) / canvasSize.width))));
    }
}
