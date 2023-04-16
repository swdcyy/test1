package ga2.b;
import androidx.lifecycle.Observer;
import ga2.f;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import java.lang.String;
import va1.l0;

public final class b implements Observer	// class@002aec
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       tb.b.setText(p0.content);
       tb.b.setTextColor(l0.j(p0.color, a1.a(R.color.arg_RES_7f061d77)));
    }
}
