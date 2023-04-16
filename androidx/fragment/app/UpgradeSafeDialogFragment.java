package androidx.fragment.app.UpgradeSafeDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.lang.String;

public class UpgradeSafeDialogFragment extends DialogFragment	// class@0007a0
{

    public void UpgradeSafeDialogFragment(){
       super();
    }
    public void dismiss(){
       if (!this.requireFragmentManager().isStateSaved()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public int show(e p0,String p1){
       this.mDismissed = false;
       this.mShownByMe = true;
       p0.h(this, p1);
       this.mViewDestroyed = false;
       int i = p0.m();
       this.mBackStackId = i;
       return i;
    }
}
