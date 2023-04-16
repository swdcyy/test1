package ced.c1;
import java.lang.Runnable;
import com.yxcorp.plugin.search.result.hashtag.presenters.w;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView;

public final class c1 implements Runnable	// class@000543
{
    public final w b;

    public void c1(w p0){
       this.b = p0;
    }
    public final void run(){
       this.b.z.g("SEARCH_BAR_HASHTAG");
    }
}
