package bwc.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import bwc.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oa0.a;
import android.content.SharedPreferences;
import faa.a;
import q87.c;
import android.view.ViewTreeObserver;
import bwc.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnClickListener;
import hwc.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.lifecycle.MutableLiveData;
import hwc.d;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import im8.f;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import pb9.p;
import hwc.d$a;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.PostPageArg;
import android.content.Intent;
import ekd.j0;
import h80.c;
import h80.k;
import h80.l;
import android.view.View;
import ekd.m1;

public class h extends PresenterV2	// class@0004ab
{
    public Button p;
    public VideoSDKPlayerView q;
    public b r;
    public final f s;
    public final MixImporterFragment t;
    public m u;

    public void h(MixImporterFragment p0){
       super();
       this.u = new h$a(this);
       this.t = p0;
       this.s = p0.t;
    }
    public void E8(){
       Object[] objArray1;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       this.r = this.t.dh();
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          if (this.R8()) {
             this.p.setVisibility(8);
          }else {
             this.p.setVisibility(i);
             this.p.setBackground(a1.f(R.drawable.arg_RES_7f08186a));
             boolean b = true;
             String str = (this.r.u0() - (double)((float)LongVideoLocalProject.e(b) / 1000.00f) < 0)? 1: null;
             if (str && !PatchProxy.applyVoid(objArray, this, oh, "5")) {
                Object obj = PatchProxy.apply(objArray, this, oh, "9");
                boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a.getBoolean("HasShownNewFullVideoHint", i);
                if (!b1) {
                   Object[] objArray2 = new Object[i];
                   a.D().w("MixImport", "显示长视频tip", objArray2);
                   this.p.getViewTreeObserver().addOnGlobalLayoutListener(new g(this));
                }
             }
          label_0098 :
             this.p.setActivated(b);
             this.p.setOnClickListener(this.u);
             objArray1 = new Object[i];
             a.D().w("MixImport", "显示长视频按钮", objArray1);
          }
       }
       if (!this.R8()) {
          objArray1 = new Object[i];
          a.D().s("MixFullLongVideo", "updateFullVideoButton: logShowFullEditVideo", objArray1);
          if (!PatchProxy.applyVoid(objArray, objArray, c.class, "14")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EDIT_FULL_VIDEO";
             u1.u0(6, uElementPack, new ClientContent$ContentPackage());
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.p.setVisibility(8);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       this.r.q.setValue(Boolean.TRUE);
       h tr = this.r;
       d uod = new d(this.getActivity(), tr, true, this.q, tr.f, null, this.s.get(), 57.50f);
       Void[] voidArray = new Void[0];
       v0.c(voidArray);
       this.s.set(null);
       return;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getActivity() != null && !i.g().getClipShowFullVideo().get(Boolean.TRUE).booleanValue()) {
          return b;
       }
       if (this.getActivity() != null && j0.a(this.getActivity().getIntent(), "use_long_video_limit", false)) {
          return b;
       }
       if (!LongVideoLocalProject.a()) {
          return b;
       }
       if (k.a() != null && k.a().c().c == null) {
          return b;
       }
       if (this.r.u0() - (double)((float)LongVideoLocalProject.g(b) / 1000.00f) >= 0) {
          b = false;
       }
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a30f6);
       Button uButton = m1.f(p0, R.id.new_full_video_btn);
       this.p = uButton;
       uButton.setVisibility(0);
       p0.findViewById(R.id.full_video_btn).setVisibility(8);
       return;
    }
}
