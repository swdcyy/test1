package c24.s$c;
import erd.g;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class s$c implements g	// class@000499
{
    public final DialogContainerFragment b;

    public void s$c(DialogContainerFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "1")) {
       }else if(p0 == FragmentEvent.DESTROY){
          this.b.dismiss();
       }
       return;
    }
}
