package ny1.d;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.CharSequence;
import java.lang.Object;
import android.widget.TextView;

public final class d implements Runnable	// class@00342c
{
    public final LiveTempEnhanceView b;
    public final CharSequence c;

    public void d(LiveTempEnhanceView p0,CharSequence p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       tb.c();
       tb.e();
       tb.c.setText(this.c);
    }
}
