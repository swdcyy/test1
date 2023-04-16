package ced.b1;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.w;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;

public final class b1 implements g	// class@00053f
{
    public final w b;

    public void b1(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME) {
          tb.z.k(0);
       }else if(p0 == FragmentEvent.PAUSE){
          tb.z.e();
       }
       return;
    }
}
