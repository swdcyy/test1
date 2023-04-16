package lh9.b;
import erd.g;
import android.app.Activity;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Object;
import lyb.v;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class b implements g	// class@002de8
{
    public final Activity b;
    public final SearchEntryParams c;

    public void b(Activity p0,SearchEntryParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0.Yd(this.b, this.c);
    }
}
