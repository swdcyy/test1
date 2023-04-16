package e8a.z0;
import lnc.j1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter;
import lnc.j1$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.q;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;

public class z0 extends j1	// class@0020e6
{
    public final NasaUploadClick2EventPresenter f;

    public void z0(NasaUploadClick2EventPresenter p0,j1$b p1){
       this.f = p0;
       super(p1);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z0.class, "1")) {
          return;
       }
       z0 tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, NasaUploadClick2EventPresenter.class, "5")) {
          ClientEvent$ExpTagTrans uExpTagTrans = new ClientEvent$ExpTagTrans();
          uExpTagTrans.serverExpTag = TextUtils.I(tf.q.getServerExpTag());
          uExpTagTrans.clientExpTag = String.valueOf(1);
          q.m().k(tf.q, uExpTagTrans, objArray, objArray);
          c.a(2, tf.q.mEntity);
       }
       return;
    }
}
