package a48.g;
import android.view.View$OnClickListener;
import com.mini.about.ui.MiniInfoListFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class g implements View$OnClickListener	// class@00002b
{
    public final MiniInfoListFragment b;

    public void g(MiniInfoListFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.requireActivity().finish();
    }
}
