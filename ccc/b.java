package ccc.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class b implements View$OnClickListener	// class@00056f
{
    public final MissUUserProfileAndNoticeFragment b;

    public void b(MissUUserProfileAndNoticeFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.getActivity().finish();
    }
}
