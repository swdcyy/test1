package e2.d;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;

public class d	// class@001ed3
{

    public static ColorStateList a(ImageView p0){
       return p0.getImageTintList();
    }
    public static PorterDuff$Mode b(ImageView p0){
       return p0.getImageTintMode();
    }
    public static void c(ImageView p0,ColorStateList p1){
       p0.setImageTintList(p1);
       if (Build$VERSION.SDK_INT == 21) {
          Drawable drawable = p0.getDrawable();
          if (drawable != null && p0.getImageTintList() != null) {
             if (drawable.isStateful()) {
                drawable.setState(p0.getDrawableState());
             }
             p0.setImageDrawable(drawable);
          }
       }
       return;
    }
    public static void d(ImageView p0,PorterDuff$Mode p1){
       p0.setImageTintMode(p1);
       if (Build$VERSION.SDK_INT == 21) {
          Drawable drawable = p0.getDrawable();
          if (drawable != null && p0.getImageTintList() != null) {
             if (drawable.isStateful()) {
                drawable.setState(p0.getDrawableState());
             }
             p0.setImageDrawable(drawable);
          }
       }
       return;
    }
}
