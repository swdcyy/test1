package dpb.f;
import com.kwai.feature.component.searchhistory.SearchLayout$f;
import dpb.b;
import java.lang.Object;
import com.kwai.feature.component.searchhistory.SearchLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.widget.search.SearchMusicSuggestFragment;
import android.os.Bundle;
import dpb.i;
import androidx.fragment.app.Fragment;
import ty5.b;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import g06.q;

public final class f implements SearchLayout$f	// class@0024dd
{
    public final b a;

    public void f(b p0){
       this.a = p0;
       super();
    }
    public final BaseFragment a(SearchLayout p0){
       SearchMusicSuggestFragment obj = PatchProxy.applyOneRefsWithListener(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "searchLayout");
       obj = new SearchMusicSuggestFragment();
       Bundle uBundle = new Bundle();
       uBundle.putInt("enter_type", this.a.f.b());
       uBundle.putString("photo_task_id", this.a.f.f());
       obj.setArguments(uBundle);
       obj.Gh(p0);
       obj.I = this.a.d();
       p0.setSearchSuggestListener(obj);
       PatchProxy.onMethodExit(f.class, "1");
       return obj;
    }
}
