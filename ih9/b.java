package ih9.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment;
import java.lang.Object;
import android.view.View;

public final class b implements View$OnClickListener	// class@002819
{
    public final PostTemplateTabHostFragment b;

    public void b(PostTemplateTabHostFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.onBackPressed();
    }
}
