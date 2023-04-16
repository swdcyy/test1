package h99.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import k2b.u1;
import android.app.Activity;
import e3a.a;

public final class a implements View$OnClickListener	// class@00256c
{
    public final ViewGroup b;

    public void a(ViewGroup p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       u1.K0(10);
       Activity uActivity = a.a(this.b);
       if (uActivity != null) {
          uActivity.onBackPressed();
       }
       return;
    }
}
