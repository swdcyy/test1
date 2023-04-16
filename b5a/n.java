package b5a.n;
import android.view.View$OnClickListener;
import b5a.q;
import java.lang.Object;
import android.view.View;
import android.app.Activity;

public final class n implements View$OnClickListener	// class@000373
{
    public final q b;

    public void n(q p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.k.onBackPressed();
    }
}
