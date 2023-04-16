package androidx.fragment.app.CommitSafeDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.String;
import androidx.fragment.app.e;

public class CommitSafeDialogFragment extends DialogFragment	// class@000772
{

    public void CommitSafeDialogFragment(){
       super();
    }
    public void dismiss(){
       if (this.getFragmentManager() != null) {
          super.dismissAllowingStateLoss();
       }
       return;
    }
    public void show(c p0,String p1){
       this.mDismissed = false;
       this.mShownByMe = true;
       e uoe = p0.beginTransaction();
       uoe.h(this, p1);
       uoe.m();
    }
}
