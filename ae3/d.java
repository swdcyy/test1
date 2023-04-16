package ae3.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.liteend.baseinfo.d;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class d implements Observer	// class@00009f
{
    public final d b;

    public void d(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       d tb = this.b;
       tb.c.setText(p0.mName);
       tb.d.U(p0.mAvatars);
    }
}
