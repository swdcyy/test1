package ga2.c;
import androidx.lifecycle.Observer;
import ga2.f;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import java.lang.String;
import va1.l0;

public final class c implements Observer	// class@002aed
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       c tb = this.b;
       tb.c.setText(p0.content);
       tb.c.setTextColor(l0.j(p0.color, a1.a(R.color.arg_RES_7f0601b6)));
    }
}
