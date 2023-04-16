package nfd.s3$b;
import com.yxcorp.gifshow.widget.m;
import nfd.s3;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.j0;
import com.yxcorp.plugin.search.http.a;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import qvb.n0;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.fragment.f;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.plugin.search.utils.k;
import com.kwai.feature.component.entry.SearchSceneSource;
import com.kwai.feature.component.entry.SearchEntryParams;
import tkd.b;
import tkd.d;
import lyb.v;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class s3$b extends m	// class@001e08
{
    public final s3 c;

    public void s3$b(s3 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s3$b.class, "1")) {
          return;
       }
       this.c.M(1);
       s3$b uob = null;
       if (this.c.B.Vh() != null) {
          uob = this.c.B.Vh().L0().mEmptyResultJumpUrl;
       }
       if (!TextUtils.isEmpty(uob)) {
          k.c(this.c.g.getActivity(), uob);
       }else {
          j0 d = this.c.D;
          String str = (d == SearchSceneSource.PROFILE)? "search_entrance_profile_result": "search_entrance_my_profile_result";
          if (d == SearchSceneSource.HISTORY_PAGE) {
             str = "search_entrance_recent_browse_result_allsite";
          }
          SearchEntryParams searchEntryP = SearchEntryParams.Instance();
          searchEntryP.enableSearchHome(false).query(this.c.C).entrySource(str);
          d.a(-724669335).Yd(this.c.B.getActivity(), searchEntryP);
       }
       return;
    }
}
