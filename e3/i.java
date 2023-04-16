package e3.i;
import java.lang.Object;
import android.util.Property;
import android.graphics.Path;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;

public class i	// class@001ee7
{

    public static ObjectAnimator a(Object p0,Property p1,Path p2){
       return ObjectAnimator.ofObject(p0, p1, null, p2);
    }
}
