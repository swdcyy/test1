package ekd.j1;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;

public class j1	// class@000d54
{

    public static int a(Context p0,int[] p1,int p2){
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1);
       typedArray.recycle();
       return typedArray.getResourceId(p2, 0);
    }
}
