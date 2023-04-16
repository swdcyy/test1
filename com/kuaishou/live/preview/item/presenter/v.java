package com.kuaishou.live.preview.item.presenter.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.presenter.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import im8.f;
import java.lang.Boolean;
import android.content.Context;
import o56.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.text.TextUtils;
import vy6.a;
import java.util.List;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import w85.a;
import a95.b;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;
import a95.a;

public class v extends PresenterV2	// class@000e44
{
    public QPhoto p;
    public f q;
    public PhotoDetailParam r;
    public f s;
    public BaseFragment t;
    public List u;
    public a v;
    public boolean w;
    public final boolean x;
    public SlidePlayViewModel y;
    public final a z;

    public void v(boolean p0){
       super();
       this.z = new v$a(this);
       this.x = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.y = SlidePlayViewModel.S0(this.t.getParentFragment());
       v ts = this.s;
       boolean b = (ts != null && (!ts.get().booleanValue() && !f.b(this.getContext())))? true: false;
       this.w = b;
       if (!TextUtils.isEmpty(this.p.getKsOrderId())) {
          ts = this.y;
          if (ts != null) {
             ts.r0(this.t, this.z);
          }else {
             ts = this.u;
             if (ts != null) {
                ts.add(this.z);
             }
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       String str = "FLOW_OPERATE_LOC";
       a$a uoa = a$a.t(str, str);
       uoa.k(this.p.getKsOrderId());
       this.q.get().b(uoa);
       if (this.x != null) {
          a$a uoa1 = a$a.c(str, str);
          uoa1.k(this.p.getKsOrderId());
          uoa1.r(true);
          this.q.get().a(uoa1);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.x8("LOG_LISTENER");
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.w8("DETAIL_FROM_SLIDE");
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.t8("DETAIL_ATTACH_LISTENERS");
       a uoa = this.s8(a.class);
       this.v = (uoa == null)? DetailParamCreator.b(false, this.r).b(): uoa.j();
       return;
    }
}
