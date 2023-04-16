package hc9.a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import hc9.c;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import ee9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import ke9.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class a implements b$a	// class@002582
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final Object getData(){
       a uoa = this.a.d.d(a.g);
       a b = uoa.b;
       if (b != null) {
       }else {
          b = uoa.d;
          if (b == null) {
             b = uoa.c;
             if (b == null) {
                b = null;
             }
          }
       }
       return new b(b, 2);
    }
}
