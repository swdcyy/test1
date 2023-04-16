package k6a.i;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import org.json.JSONObject;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.Long;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cg5.c;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import qvb.n0;
import k6a.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class i implements View$OnClickListener	// class@002bf0
{
    public final i b;

    public void i(i p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       if (r1.i3(tb.p.f.getEntity())) {
          JSONObject jSONObject = new JSONObject();
          Iterator iterator = tb.q.getItems().iterator();
          while (iterator.hasNext()) {
             User user = iterator.next();
             try{
                jSONObject.accumulate("uids", Long.valueOf(Long.parseLong(user.getId())));
             }catch(java.lang.Exception e0){
                goto label_001f ;
             }
          }
          i w = tb.w;
          int i = (w == null)? 0: w.f();
          w = tb.w;
          String str = (w == null)? "": w.getUrl();
          c.j(null, i, 0, str, null, null, 5, "PYMK", jSONObject.toString());
       }
       i u = tb.u;
       if (u != null && !u.isAnimating()) {
          tb.t.setText(R.string.arg_RES_7f100ffd);
          tb.q.a();
       }
       if (!PatchProxy.applyVoidWithListener(null, null, u.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CHANGE_RECO_FRIENDS_BUTTON";
          u1.M(null, null, 1, uElementPack, null, null);
          PatchProxy.onMethodExit(u.class, "2");
       }
       return;
    }
}
