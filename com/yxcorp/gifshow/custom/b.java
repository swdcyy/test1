package com.yxcorp.gifshow.custom.b;
import xw8.p0$c;
import xw8.p0$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.custom.ShareCustomRepo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.custom.b$b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import pt9.o;
import androidx.lifecycle.ViewModel;
import java.util.List;
import android.view.View;
import oa0.a;
import pt9.b;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import ow8.c;
import lnc.s6;
import android.content.SharedPreferences;
import oe6.n;
import com.yxcorp.gifshow.util.PostUtils;
import pt9.e;
import java.lang.Runnable;
import ekd.k1;
import xw8.p0;
import java.util.Set;
import java.lang.IllegalArgumentException;
import ekd.m1;
import com.yxcorp.gifshow.custom.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.kuaishou.android.model.music.Music;
import oe6.b;
import ow8.d;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import com.yxcorp.gifshow.custom.CustomType;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class b extends PresenterV2 implements p0$c, p0$d	// class@00129f
{
    public QPhoto A;
    public View p;
    public TextView q;
    public View r;
    public VideoContext s;
    public c t;
    public SameFrameShareConfig u;
    public GifshowActivity v;
    public Music w;
    public KtvInfo x;
    public ShareCustomRepo y;
    public p0 z;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       if (this.s == null) {
          throw new IllegalArgumentException("ShareCustomEntrancePresenter, mVideoContext is not allow is null");
       }
       this.y = new ShareCustomRepo(this.t, this.s, this.u, this.A);
       o oo = ViewModelProviders.of(this.v, new b$b(this)).get(o.class);
       if (oo.o0() != null && !oo.o0().isEmpty()) {
          this.p.setVisibility(0);
          if (a.h0() && (b.c(this.s) || (b.b(this.t) && b.d()))) {
             this.q.setVisibility(0);
             this.q.setText(a1.p(R.string.arg_RES_7f104027));
          }else if(a.g0()){
             this.q.setVisibility(0);
          }else if(c.a() && (a.i0() && (b.f(this.t) || b.a(this.A)))){
             this.q.setVisibility(0);
             this.q.setText(a1.p(R.string.arg_RES_7f104208));
          }else if(s6.d() && a.j0()){
             this.q.setVisibility(0);
             this.q.setText(a1.p(R.string.arg_RES_7f104025));
          }
       }
       if (!this.q.getVisibility() || (!a.I() || (n.b().getBoolean(PostUtils.s("enableAutoOpenHdExport"), 0) && !PatchProxy.applyVoid(objArray, this, uob, "6")))) {
          k1.r(new e(this), 1000);
       }
    label_00fe :
       this.z.q.add(this);
       this.z.r.add(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a38df);
       m1.b(p0, new b$a(this), R.id.share_custom_item_v2);
       this.q = m1.f(p0, 0x7f0a38e1);
       this.r = m1.f(p0, 0x7f0a38e0);
       return;
    }
    public void e1(UploadRequest$a p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       b = c.g(this.s, this.w);
       if (b) {
          p0.y(this.w);
       }
       String str = (b)? "1": "0";
       p0.z(str);
       if (!b.i()) {
          b ts = this.s;
          b tw = this.w;
          b tt = this.t;
          b tu = this.u;
          boolean b1 = (this.x != null)? true: false;
          b = d.a(ts, tw, tt, tu, b1);
          Object[] objArray = new Object[0];
          a.b().w("ShareCustomEntrancePresenter", "setShareSoundTrack: "+b, objArray);
          p0.L(b);
       }
       this.y.h(p0);
       return;
    }
    public void j7(VideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       p0.u1(c.g(this.s, this.w));
       CustomType recreation = CustomType.Recreation;
       if (this.y.c().get(recreation) != null) {
          p0.g(this.y.c().get(recreation).booleanValue());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.s = this.t8("SHARE_VIDEO_CONTEXT");
       this.t = this.t8("WORKSPACE");
       this.u = this.t8("SAME_FRAME_CONFIG");
       this.v = this.r8("SHARE_ACTIVITY");
       this.w = this.t8("SHARE_MUSIC");
       this.x = this.t8("SHARE_KTV_INFO");
       this.z = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.A = this.t8("SHARE_QPHOTO");
       return;
    }
}
