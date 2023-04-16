package androidx.appcompat.widget.ActionBarContextView$a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.ActionBarContextView;
import u0.b;
import java.lang.Object;
import android.view.View;

public class ActionBarContextView$a implements View$OnClickListener	// class@0005be
{
    public final b b;
    public final ActionBarContextView c;

    public void ActionBarContextView$a(ActionBarContextView p0,b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       this.b.c();
    }
}
