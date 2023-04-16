package androidx.appcompat.widget.SwitchCompat$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.Float;
import java.lang.Object;

public class SwitchCompat$a extends Property	// class@000629
{

    public void SwitchCompat$a(Class p0,String p1){
       super(p0, p1);
    }
    public Float a(SwitchCompat p0){
       return Float.valueOf(p0.y);
    }
    public void b(SwitchCompat p0,Float p1){
       p0.setThumbPosition(p1.floatValue());
    }
    public Object get(Object p0){
       return this.a(p0);
    }
    public void set(Object p0,Object p1){
       this.b(p0, p1);
    }
}
