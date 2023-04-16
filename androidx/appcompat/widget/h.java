package androidx.appcompat.widget.h;
import androidx.appcompat.widget.e;
import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import w0.q;

public class h extends e	// class@00064c
{
    public final WeakReference b;

    public void h(Context p0,Resources p1){
       super(p1);
       this.b = new WeakReference(p0);
    }
    public Drawable getDrawable(int p0){
       Drawable drawable = super.getDrawable(p0);
       Context uContext = this.b.get();
       if (drawable != null && uContext != null) {
          q.h().x(uContext, p0, drawable);
       }
       return drawable;
    }
}
