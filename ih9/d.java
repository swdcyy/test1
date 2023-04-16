package ih9.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$Tab;

public final class d implements View$OnClickListener	// class@00281b
{
    public final PostTemplateTabHostFragment b;

    public void d(PostTemplateTabHostFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.Rh(PostTemplateTabHostFragment$Tab.TEMPLATE);
    }
}
