package androidx.appcompat.widget.i$a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.i;
import java.lang.Object;
import v0.a;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.CharSequence;
import android.view.View;
import android.view.MenuItem;
import android.view.Window$Callback;

public class i$a implements View$OnClickListener	// class@00064d
{
    public final a b;
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
       a uoa = new a(p0.a.getContext(), 0, 0x102002c, 0, 0, p0.j);
       this.b = v7;
    }
    public void onClick(View p0){
       i$a tc = this.c;
       i m = tc.m;
       if (m != null && tc.n != null) {
          m.onMenuItemSelected(0, this.b);
       }
       return;
    }
}
