package q90.g;
import android.view.View$OnClickListener;
import q90.f;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import t90.j;

public final class g implements View$OnClickListener	// class@002991
{
    public final f b;
    public final KSFeedGroupInfo c;
    public final int d;

    public void g(f p0,KSFeedGroupInfo p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       tb.C = true;
       g tc = this.c;
       j.d(tb.X8(), tc.mId, tc.mGroupName, this.d, false);
       return;
    }
}
