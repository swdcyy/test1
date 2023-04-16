package ae9.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.live.LiveEntryWrapperFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class a implements View$OnClickListener	// class@0000ab
{
    public final LiveEntryWrapperFragment b;

    public void a(LiveEntryWrapperFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       if (tb.getActivity() != null) {
          tb.getActivity().finish();
       }
       return;
    }
}
