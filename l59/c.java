package l59.c;
import android.view.View$OnClickListener;
import android.app.Activity;
import java.lang.Object;
import android.view.View;

public final class c implements View$OnClickListener	// class@002c86
{
    public final Activity b;

    public void c(Activity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (tb != null) {
          tb.finish();
       }
       return;
    }
}
