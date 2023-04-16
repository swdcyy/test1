package b2.a;
import android.text.style.ClickableSpan;
import b2.d;
import android.view.View;
import android.os.Bundle;
import java.lang.String;

public final class a extends ClickableSpan	// class@000ab9
{
    public final int b;
    public final d c;
    public final int d;

    public void a(int p0,d p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void onClick(View p0){
       Bundle uBundle = new Bundle();
       uBundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
       this.c.P(this.d, uBundle);
    }
}
