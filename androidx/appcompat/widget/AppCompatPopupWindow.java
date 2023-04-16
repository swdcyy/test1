package androidx.appcompat.widget.AppCompatPopupWindow;
import android.widget.PopupWindow;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import w0.x;
import android.graphics.drawable.Drawable;
import e2.f;
import android.view.View;

public class AppCompatPopupWindow extends PopupWindow	// class@0005e8
{
    public boolean a;
    public static final boolean b;

    static {
       AppCompatPopupWindow.b = false;
    }
    public void AppCompatPopupWindow(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1, p2, 0);
    }
    public void AppCompatPopupWindow(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.a(p0, p1, p2, p3);
    }
    public final void a(Context p0,AttributeSet p1,int p2,int p3){
       x ox = x.v(p0, p1, c$b.a4, p2, p3);
       int i = 2;
       if (ox.s(i)) {
          this.b(ox.a(i, false));
       }
       this.setBackgroundDrawable(ox.g(false));
       ox.w();
       return;
    }
    public final void b(boolean p0){
       if (AppCompatPopupWindow.b) {
          this.a = p0;
       }else {
          f.a(this, p0);
       }
       return;
    }
    public void showAsDropDown(View p0,int p1,int p2){
       if (AppCompatPopupWindow.b && this.a != null) {
          p2 = p2 - p0.getHeight();
       }
       super.showAsDropDown(p0, p1, p2);
       return;
    }
    public void showAsDropDown(View p0,int p1,int p2,int p3){
       if (AppCompatPopupWindow.b && this.a != null) {
          p2 = p2 - p0.getHeight();
       }
       super.showAsDropDown(p0, p1, p2, p3);
       return;
    }
    public void update(View p0,int p1,int p2,int p3,int p4){
       if (AppCompatPopupWindow.b && this.a != null) {
          p2 = p2 - p0.getHeight();
       }
       super.update(p0, p1, p2, p3, p4);
       return;
    }
}
