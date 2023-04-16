package gg9.i;
import com.yxcorp.gifshow.camera.bubble.b$b;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;

public final class i implements b$b	// class@00247b
{
    public final b a;

    public void i(b p0){
       this.a = p0;
    }
    public final void a(){
       i ta = this.a;
       ta.z = false;
       ta.d.b().V7().s(RecordBubbleItem.PERMISSION_MASK);
    }
}
