package nj.j;
import android.view.View$OnClickListener;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.activity.ComponentActivity;

public final class j implements View$OnClickListener	// class@002716
{
    public final TunaSlidePlayFragment b;

    public void j(TunaSlidePlayFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       FragmentActivity activity = this.b.getActivity();
       if (activity != null && !activity.isFinishing()) {
          activity.onBackPressed();
       }
       return;
    }
}
