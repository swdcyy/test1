package jmd.b$d;
import nmd.a$b;
import jmd.b;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import mn6.a;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.kwai.framework.model.feed.BaseFeed;
import jmd.b$d$c;
import n3d.a;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteDetailActivity;
import java.lang.Integer;
import java.lang.StringBuilder;
import jmd.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResult;
import crd.b;
import psb.e;
import psb.f;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import jmd.b$d$a;
import jmd.b$d$b;
import erd.g;

public final class b$d implements a$b	// class@00170e
{
    public final b a;
    public final VoteResultResponse b;
    public final a c;
    public final Context d;

    public void b$d(b p0,VoteResultResponse p1,a p2,Context p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "onVoteResultPanelClicked: ", objArray);
       VoteDetailActivity.u3(this.d, this.a.d.getId(), this.b, 1, new b$d$c(this));
       return;
    }
    public void b(int p0){
       a a;
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "onOptionVoted: optionIndex = ["+p0+']', objArray);
       a = a.a;
       Objects.requireNonNull(a);
       objArray = null;
       if (!PatchProxy.applyVoid(objArray, a, a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "THREE_VOTE_STICKER_DIALOG";
          u1.L("", objArray, 1, uElementPack, objArray);
       }
       this.b.mVoteResult.setIndexCountInc(p0);
       b a1 = this.a.a;
       if (a1 != null) {
          a1.dispose();
       }
       this.a.a = f.a().b(this.a.d.getId(), p0).delay(3000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b$d$a(this), b$d$b.b);
       return;
    }
    public void onCloseIconClicked(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ThreeOptionsVote", "onCloseIconClicked: ", objArray);
       this.c.c();
       return;
    }
}
