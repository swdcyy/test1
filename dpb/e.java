package dpb.e;
import com.kwai.feature.component.searchhistory.SearchLayout$c;
import dpb.b;
import com.kwai.feature.component.searchhistory.SearchLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.cloudmusic.search.history.MusicSearchHistoryFragment;
import android.os.Bundle;
import dpb.i;
import androidx.fragment.app.Fragment;
import g06.e;
import com.kwai.feature.component.searchhistory.SearchHistoryFragment;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;

public final class e extends SearchLayout$c	// class@0024dc
{
    public final b a;

    public void e(b p0){
       this.a = p0;
       super();
    }
    public BaseFragment a(SearchLayout p0){
       MusicSearchHistoryFragment obj = PatchProxy.applyOneRefsWithListener(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "searchLayout");
       obj = new MusicSearchHistoryFragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("photo_task_id", this.a.f.f());
       obj.setArguments(uBundle);
       obj.Ih(p0);
       obj.Jh("music");
       obj.Hh(false);
       obj.L = this.a.d();
       PatchProxy.onMethodExit(e.class, "1");
       return obj;
    }
    public String b(){
       return "music";
    }
}
