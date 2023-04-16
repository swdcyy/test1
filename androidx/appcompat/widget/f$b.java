package androidx.appcompat.widget.f$b;
import android.view.MenuItem$OnMenuItemClickListener;
import androidx.appcompat.widget.f;
import java.lang.Object;
import android.view.MenuItem;
import android.content.Context;
import java.lang.String;
import androidx.appcompat.widget.a;
import android.content.Intent;

public class f$b implements MenuItem$OnMenuItemClickListener	// class@000648
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public boolean onMenuItemClick(MenuItem p0){
       f$b ta = this.a;
       Intent intent = a.d(ta.f, ta.g).b(p0.getItemId());
       if (intent != null) {
          String action = intent.getAction();
          if (("android.intent.action.SEND").equals(action) || ("android.intent.action.SEND_MULTIPLE").equals(action)) {
             this.a.l(intent);
          }
          this.a.f.startActivity(intent);
       }
       return true;
    }
}
