package b5a.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wd5.e$a;
import io.reactivex.subjects.PublishSubject;
import b5a.h$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import b5a.e;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.nonslide.b;
import p5a.b;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import b5a.l;
import b5a.q;
import android.app.Activity;
import b5a.i;
import b5a.k;
import java.util.Objects;
import java.util.Set;
import b5a.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.nonslide.b$b;
import android.content.Intent;
import android.net.Uri;
import je5.c;
import java.util.concurrent.TimeUnit;
import b5a.d;
import io.reactivex.internal.functions.Functions;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.Window;
import android.view.View;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.user.User;
import n3d.a;

public class h extends PresenterV2	// class@00036d
{
    public PhotoDetailParam p;
    public Runnable q;
    public b r;
    public boolean s;
    public final e$a t;
    public boolean u;
    public PublishSubject v;
    public DetailCoverInfo w;
    public l x;
    public final b$b y;

    public void h(){
       super();
       this.t = new e$a();
       this.u = false;
       this.v = PublishSubject.g();
       this.y = new h$a(this);
    }
    public void E8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new e(this)));
       h obj = PatchProxy.apply(objArray, this, oh, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.r.b() == null || b.h(this.r.b())){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          obj = this.p;
          if (obj != null) {
             this.w = obj.getDetailCommonParam().getDetailCoverInfo();
          }
          q oq = PatchProxy.apply(objArray, this, oh, "10");
          if (oq != patchProxyRe) {
          }else {
             oq = new q(this.getActivity(), this.w, new i(this));
          }
          this.x = oq;
          h tr = this.r;
          oh = this.y;
          Objects.requireNonNull(tr);
          if (!PatchProxy.applyVoidOneRefs(oh, tr, b.class, "6")) {
             tr.f.add(oh);
          }
          this.r.g(1);
          tr = this.v;
          if (tr != null) {
             this.X7(tr.subscribe(new f(this)));
          }
       }else {
          this.s = true;
          this.q.run();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.r.f(this.y);
       return;
    }
    public final void P8(){
       String str;
       String str1;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "7")) {
          return;
       }
       Uri data = this.getActivity().getIntent().getData();
       if (c.c()) {
          this.X7(t.timer(2, TimeUnit.SECONDS).subscribe(new d(this), Functions.d()));
          return;
       }else if(data != null && data.isHierarchical()){
          str = w0.a(data, "userId");
          str1 = w0.a(data, "backUri");
       }else {
          str1 = objArray;
          str = str1;
       }
       if (TextUtils.x(str) || !TextUtils.x(str1)) {
          this.getActivity().finish();
       }else if(PatchProxy.applyVoidOneRefs(str, this, oh, "8")){
          int i = -1718536792;
          if (QCurrentUser.ME.isLogined() && (QCurrentUser.ME.getId()).equals(str)) {
             if (this.getActivity() != null && this.getActivity().getWindow() != null) {
                objArray = this.getActivity().getWindow().getDecorView();
             }
             d.a(i).wT(this.getActivity(), ProfileStartParam.j(objArray));
          }else if(this.p.mPhoto != null){
             d.a(i).Y7(this.getActivity(), ProfileStartParam.l(this.p.mPhoto.getUser()));
          }else {
             d.a(i).tn(this.getActivity(), ProfileStartParam.m(str), 0, objArray);
          }
       }
       this.getActivity().finish();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       this.q = this.r8("DETAIL_FLOW_END_LISTENER");
       this.r = this.q8(b.class);
       return;
    }
}
