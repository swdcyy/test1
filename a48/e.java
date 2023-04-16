package a48.e;
import android.view.View$OnClickListener;
import com.mini.about.ui.AboutMainInfoFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;

public final class e implements View$OnClickListener	// class@000029
{
    public final AboutMainInfoFragment b;

    public void e(AboutMainInfoFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.getFragmentManager().popBackStack();
    }
}
