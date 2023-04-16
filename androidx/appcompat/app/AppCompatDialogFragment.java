package androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import q0.e;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.Window;

public class AppCompatDialogFragment extends DialogFragment	// class@000583
{

    public void AppCompatDialogFragment(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       return new e(this.getContext(), this.getTheme());
    }
    public void setupDialog(Dialog p0,int p1){
       if (p0 instanceof e) {
          e uoe = p0;
          if (p1 != 1 && p1 != 2) {
             if (p1 == 3) {
                p0.getWindow().addFlags(24);
             }
          }
          uoe.d(1);
       }else {
          super.setupDialog(p0, p1);
       }
       return;
    }
}
