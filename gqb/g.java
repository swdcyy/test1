package gqb.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import kotlin.jvm.internal.a;
import gqb.g$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.android.model.music.Music;
import crd.b;
import java.lang.Boolean;
import android.content.Context;
import lnc.a1;
import android.graphics.drawable.Drawable;
import r0.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class g extends PresenterV2	// class@002b78
{
    public ImageView p;
    public MusicRadioFeed q;
    public b r;
    public QPhoto s;
    public BaseFragment t;
    public int u;

    public void g(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "3")) {
          return;
       }
       g ts = this.s;
       QPhoto mEntity = (ts != null)? ts.mEntity: objArray;
       if (mEntity instanceof MusicRadioFeed) {
          objArray = mEntity;
       }
       this.q = objArray;
       ts = this.p;
       if (ts == null) {
          a.S("mCollectBtn");
       }
       ts.setOnClickListener(new g$a(this));
       ts = this.q;
       boolean b = true;
       if (ts != null) {
          MusicRadioFeed mRaveView = ts.mRaveView;
          if (mRaveView != null && mRaveView.isFavorited() == b) {
          label_0040 :
             this.P8(b);
             return;
          }
       }
       b = false;
       goto label_0040 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          tr.dispose();
       }
       return;
    }
    public final void P8(boolean p0){
       g tp;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       String str = "mCollectBtn";
       if (p0) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setImageDrawable(a.d(a1.c(), R.drawable.arg_RES_7f0809ff));
       }else {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setImageDrawable(a.d(a1.c(), R.drawable.arg_RES_7f0809fe));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.music_radio_collect);
       a.o(p0, "ViewBindUtils.bindWidget¡­R.id.music_radio_collect\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.s = this.s8(QPhoto.class);
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.t = obj;
       return;
    }
}
