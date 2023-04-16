package androidx.appcompat.widget.j;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.content.Context;
import w0.q;

public class j extends Resources	// class@000650
{
    public final WeakReference a;
    public static boolean b;

    public static boolean a(){
       return j.b;
    }
    public final Drawable b(int p0){
       return super.getDrawable(p0);
    }
    public Drawable getDrawable(int p0){
       Context uContext = this.a.get();
       if (uContext != null) {
          return q.h().t(uContext, this, p0);
       }
       return super.getDrawable(p0);
    }
}
