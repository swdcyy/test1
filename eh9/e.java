package eh9.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.tab.c;
import android.app.Activity;
import java.lang.Object;
import java.util.Objects;
import sm6.b;
import bn8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import android.view.View;

public final class e implements Runnable	// class@00214c
{
    public final c b;
    public final Activity c;
    public final int d;

    public void e(c p0,Activity p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       int i = b.j(this.c);
       if (this.d != i) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt("camera_tab_margin_bottom", i);
          g.a(uEditor);
          b.v(tb.h, i);
       }
       return;
    }
}
