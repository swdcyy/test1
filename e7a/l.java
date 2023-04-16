package e7a.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e7a.l$a;
import e7a.l$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.f0;
import android.content.Context;
import w4.h;
import xf6.d;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import java.lang.Integer;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import dd.d;
import android.graphics.drawable.Drawable;
import wb5.g;
import lnc.a1;
import je5.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import g9c.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import y8c.a;
import y8c.g;
import brd.y;

public class l extends PresenterV2	// class@00208e
{
    public KwaiImageView p;
    public KwaiLoadingView q;
    public QPhoto r;
    public a s;
    public g t;
    public f u;
    public y v;
    public int w;
    public final a x;
    public final d y;

    public void l(){
       super();
       this.x = new l$a(this);
       this.y = new l$b(this);
    }
    public void E8(){
       int i = this;
       if (PatchProxy.applyVoid(null, i, l.class, "3")) {
          return;
       }
       i.w = i.w + 1;
       f0 uof0 = new f0(this.getContext(), 0x7f0f0044);
       uof0.D(-1);
       uof0.E(0.27f);
       if (d.f()) {
          g.v(i.p, i.r.mEntity, i.u.get().intValue(), "", ImageSource.DETAIL_ATLAS, n.y(this.getContext()), true, i.x, i.y, uof0);
       }else {
          g.t(i.p, i.r.mEntity, i.u.get().intValue(), n.y(this.getContext()), true, i.x, a1.f(R.color.arg_RES_7f062057), ImageSource.DETAIL_ATLAS);
       }
       a.a(i.u.get().intValue(), i.r);
       i.q.setVisibility(0);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       PhotoDetailLogger.reportAtlas(2, (long)this.t.getItemCount(), (long)this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a130c);
       this.q = m1.f(p0, 0x7f0a28fe);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.t = this.r8("SLIDE_PLAY_PHOTO_LONG_ATLAS_ADAPTER");
       this.u = this.x8("ADAPTER_POSITION");
       this.v = this.r8("DETAIL_IMAGE_LOAD_OBSERVER");
       return;
    }
}
