package g82.k0;
import ub.a;
import g82.v;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.image.KwaiImageView;

public class k0 extends a	// class@002aa6
{
    public final v b;

    public void k0(v p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k0.class, "1")) {
          return;
       }
       b.I(LiveLogTag.FANS_GROUP, "[LEFT_TOP] bind icon fail", p1);
       this.b.D.setImageResource(R.drawable.arg_RES_7f081479);
       return;
    }
}
