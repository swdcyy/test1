package androidx.appcompat.app.a;
import q0.e;
import android.content.Context;
import androidx.appcompat.app.AlertController;
import android.app.Dialog;
import android.view.Window;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.widget.ListView;
import android.os.Bundle;
import android.view.KeyEvent;
import java.lang.CharSequence;

public class a extends e	// class@000585
{
    public final AlertController d;

    public void a(Context p0){
       super(p0, 0);
    }
    public void a(Context p0,int p1){
       super(p0, a.f(p0, p1));
       this.d = new AlertController(this.getContext(), this, this.getWindow());
    }
    public static int f(Context p0,int p1){
       if (((p1 >> 24) & 0x00ff) >= 1) {
          return p1;
       }
       TypedValue typedValue = new TypedValue();
       p0.getTheme().resolveAttribute(R.attr.arg_RES_7f040102, typedValue, true);
       return typedValue.resourceId;
    }
    public ListView e(){
       return this.d.d();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.d.e();
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (this.d.g(p0, p1)) {
          return true;
       }
       return super.onKeyDown(p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       if (this.d.h(p0, p1)) {
          return true;
       }
       return super.onKeyUp(p0, p1);
    }
    public void setTitle(CharSequence p0){
       super.setTitle(p0);
       this.d.q(p0);
    }
}
