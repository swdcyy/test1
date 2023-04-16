package bu7.e0;
import jb0.a$a;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.String;
import android.graphics.Paint;

public final class e0 implements a$a	// class@000483
{
    public final TextPaint a;

    public void e0(TextPaint p0){
       this.a = p0;
    }
    public final float a(String p0){
       return this.a.measureText(p0);
    }
}
