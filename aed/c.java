package aed.c;
import android.widget.TextView$OnEditorActionListener;
import com.yxcorp.plugin.search.result.hashtag.page.SoundTrackRenameActivity;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.util.Objects;

public final class c implements TextView$OnEditorActionListener	// class@000100
{
    public final SoundTrackRenameActivity a;

    public void c(SoundTrackRenameActivity p0){
       this.a = p0;
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (p1 == 6) {
          ta.u3();
       }
       return false;
    }
}
