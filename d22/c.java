package d22.c;
import android.content.DialogInterface$OnKeyListener;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Objects;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements DialogInterface$OnKeyListener	// class@002426
{
    public final LiveDialogContainerFragment b;

    public void c(LiveDialogContainerFragment p0){
       this.b = p0;
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       c tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = false;
       if (p1 == 4) {
          if (!p2.getAction()) {
             tb.y = true;
          }else if(p2.getAction() == 1 && tb.y != null){
             LiveDialogContainerFragment w = tb.w;
             if (w == null || !w.a()) {
                if (tb.getChildFragmentManager().getBackStackEntryCount() > 0) {
                   try{
                      tb.getChildFragmentManager().popBackStackImmediate();
                   }catch(java.lang.IllegalStateException e5){
                      b.B(LiveLogTag.LIVE_EXCEPTION, "LiveDialogContainerFragment failed to pop back stack in "+tb+" for:"+e5.getLocalizedMessage());
                   }
                }
             }
          }
       }
       return b;
    }
}
