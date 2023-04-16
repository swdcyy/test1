package ip8.e;
import android.text.style.CharacterStyle;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e extends CharacterStyle	// class@002708
{
    public float a;
    public float b;
    public float c;
    public final int d;

    public void e(float p0,float p1,float p2,int p3){
       super();
       this.a = 0x3f800000;
       this.b = 0x3f800000;
       this.c = 0x3f800000;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void e(int p0){
       super();
       this.a = 0x3f800000;
       this.b = 0x3f800000;
       this.c = 0x3f800000;
       this.d = p0;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       p0.setShadowLayer(this.a, this.b, this.c, this.d);
       return;
    }
}
