package com.yxcorp.gifshow.detail.trigger.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Long;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.trigger.a$a;
import com.yxcorp.gifshow.detail.trigger.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;

public class a extends PresenterV2	// class@001a1d
{
    public QPhoto p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public a s;
    public List t;
    public SlidePlayViewModel u;
    public long v;
    public f w;
    public final IMediaPlayer$OnInfoListener x;
    public final a y;
    public static final Long A;
    public static final Long z;

    static {
       a.z = Long.valueOf(3000);
       a.A = Long.valueOf(7000);
    }
    public void a(){
       super();
       this.t = new ArrayList();
       this.x = new a$a(this);
       this.y = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.u = slidePlayVie;
       slidePlayVie.P(this.r, this.y);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.u.D(this.r, this.y);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.q8(a.class);
       return;
    }
}
