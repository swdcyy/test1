package ag9.f;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import qc9.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qxc.b;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.bubble.b;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import ag9.f$a;
import com.yxcorp.gifshow.bubble.b$c;
import android.app.Application;
import o56.a;
import ag9.f$b;
import com.yxcorp.gifshow.camera.bubble.b$d;
import ag9.f$c;
import com.yxcorp.gifshow.camera.bubble.b$c;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class f extends BaseRecoCollectMusicController	// class@0000c0
{
    public b A;
    public View y;
    public AbsRecordBottomBarViewBinder z;

    public void f(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       d tf = this.f;
       if (tf instanceof a) {
          Objects.requireNonNull(tf, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.bottombar.IRecordBottomBarOwner");
          this.z = tf.zb();
       }
       return;
    }
    public String h2(){
       return "COLLECT_MUSIC_USE_GUIDE_BUBBLE";
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.k(p0);
       f tz = this.z;
       View view = null;
       if (tz != null && tz != null) {
          view = tz.G();
       }
       this.y = b.a(view, p0, 0x7f0a05de);
       return;
    }
    public void m2(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       a.p(p0, "panelShowEvent");
       super.m2(p0);
       if (p0.a != null && p0.c == PanelShowEvent$PanelType.MUSIC) {
          f tA = this.A;
          if (tA != null) {
             tA.dismiss();
          }
       }
       return;
    }
    public void r2(Music p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       a.p(p0, "music");
       a.p(p1, "intent");
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "showMusicBubble", objArray);
       b uob = new b(RecordBubbleItem.RECO_COLLECT_MUSIC);
       uob.p(true);
       uob = uob.n(this.y);
       uob.y(BubbleInterface$Position.TOP);
       uob = uob.z(new f$a(this));
       uob.s(R.layout.arg_RES_7f0d12c0);
       uob.B(a.b().getString(R.string.arg_RES_7f1041d9));
       uob.q((long)5000);
       uob.w(new f$b(this, p0, p1));
       uob.v(new f$c(this, p0));
       this.A = uob;
       d td = this.d;
       a.o(td, "mCallerContext");
       w ow = td.b();
       a.o(ow, "mCallerContext.controllerManager");
       f tA = this.A;
       a.m(tA);
       ow.V7().n(tA);
       return;
    }
}
