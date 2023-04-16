package ih9.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$Tab;

public final class c implements View$OnClickListener	// class@00281a
{
    public final PostTemplateTabHostFragment b;

    public void c(PostTemplateTabHostFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.Rh(PostTemplateTabHostFragment$Tab.FOLLOW_KRN);
    }
}
