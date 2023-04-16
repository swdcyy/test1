package ae3.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.liteend.baseinfo.d;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;

public final class e implements Observer	// class@0000a0
{
    public final d b;

    public void e(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       Object[] objArray = new Object[]{p0};
       this.b.b.setText(String.format("%dsºó×Ô¶¯ÇÐ»»", objArray));
    }
}
