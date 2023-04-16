package e3.j;
import android.util.Property;
import android.graphics.Path;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;

public class j	// class@001ee8
{

    public static PropertyValuesHolder a(Property p0,Path p1){
       return PropertyValuesHolder.ofObject(p0, null, p1);
    }
}
