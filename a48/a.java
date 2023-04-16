package a48.a;
import android.view.View$OnClickListener;
import com.mini.about.ui.AboutFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import zi8.c;

public final class a implements View$OnClickListener	// class@000025
{
    public final AboutFragment b;

    public void a(AboutFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       FragmentActivity activity = this.b.getActivity();
       if (!c.b(activity)) {
       }else {
          activity.finish();
       }
       return;
    }
}
