package bua.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Boolean;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ok.o;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.component.feedstaggercard.helper.LiveAudienceUpdateHelper;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.utility.n;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@000471
{
    public LiveStreamModel p;
    public f q;
    public o r;
    public TextView s;
    public ImageView t;
    public BaseFragment u;
    public QPhoto v;
    public LifecycleObserver w;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (this.q.get().booleanValue()) {
          if (!PatchProxy.applyVoid(objArray, this, uoa, "7") && (this.s != null && (this.t != null && !TextUtils.x(this.p.mAudienceCount)))) {
             a tr = this.r;
             if (tr == null || tr.apply(this.p.mAudienceCount)) {
                this.t.setImageResource(R.drawable.arg_RES_7f080a16);
                this.s.setText(this.p.mAudienceCount);
                this.P8();
                if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
                   LifecycleObserver lifecycleObs = LiveAudienceUpdateHelper.a(this.s, this.v);
                   this.w = lifecycleObs;
                   if (lifecycleObs != null) {
                      this.u.getLifecycle().addObserver(this.w);
                   }
                }
                View[] viewArray = new View[]{this.s,this.t};
                n.Z(0, viewArray);
             }
          }
       }else {
          View[] viewArray1 = new View[]{this.s,this.t};
          n.Z(8, viewArray1);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.w != null) {
          this.u.getLifecycle().removeObserver(this.w);
          this.w = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3641);
       this.t = m1.f(p0, 0x7f0a3642);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(LiveStreamModel.class);
       this.q = this.x8("HOME_ENABLE_LIVE_AUTO_PLAY");
       this.r = this.t8("HOME_LIVE_AUDIENCE_PREDICATE");
       this.u = this.r8("FRAGMENT");
       this.v = this.q8(QPhoto.class);
       return;
    }
}
