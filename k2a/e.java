package k2a.e;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import de5.a;
import com.yxcorp.gifshow.comment.e;
import k2a.e$a;
import java.lang.Object;
import java.lang.String;
import p5a.e;
import com.kwai.framework.player.core.b;

public class e	// class@002b9e
{
    public final Activity a;
    public final BaseFragment b;
    public final PhotoDetailParam c;
    public final QPhoto d;
    public final String e;
    public final String f;
    public final e g;
    public final e$a h;
    public x i;
    public NewPlayerFeedbackPanel j;

    public void e(Activity p0,BaseFragment p1,PhotoDetailParam p2,a p3,e p4,e$a p5){
       super();
       this.i = null;
       this.j = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p2.mPhoto;
       this.e = p3.c();
       this.f = p3.getPlayer().getCurrentTranscodeType();
       this.g = p4;
       this.h = p5;
    }
}
