package gqb.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gqb.u$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import gqb.s;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;

public class u extends PresenterV2	// class@002b94
{
    public View p;
    public QPhoto q;
    public Music r;
    public n1 s;

    public void u(){
       super();
       this.s = new u$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       if (this.q.getEntity() instanceof MusicRadioFeed) {
          QPhoto mEntity = this.q.mEntity;
          if (mEntity != null) {
             this.r = mEntity.mRaveView;
          }
       }
       this.p.setOnClickListener(new s(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2cc0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       return;
    }
}
