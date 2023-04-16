package em2.a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;

public final class a implements View$OnClickListener	// class@002789
{
    public final TextView b;
    public final String c;

    public void a(TextView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.setText(this.c);
    }
}
