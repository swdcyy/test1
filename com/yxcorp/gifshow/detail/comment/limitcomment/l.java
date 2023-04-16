package com.yxcorp.gifshow.detail.comment.limitcomment.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dx9.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import jp.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import wb5.h;
import com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;
import android.widget.ImageView;
import java.util.Objects;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import java.util.List;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.detail.comment.limitcomment.l$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class l extends PresenterV2	// class@001386
{
    public KwaiImageView p;
    public ImageView q;
    public QPhoto r;
    public BaseFragment s;
    public CommentLimitInfo t;
    public d u;
    public final d$a v;

    public void l(){
       super();
       this.v = new i(this);
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "5")) {
          h.d(this.p, this.r.mEntity, a.c, objArray);
          ol = this.q;
          int i = (this.t.mCurrentFriendsVisible == null)? 0x7f080f5c: 0x7f080617;
          ol.setImageResource(i);
       }
       ol = this.u;
       l tv = this.v;
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoidOneRefs(tv, ol, d.class, "7") && !ol.a.contains(tv)) {
          ol.a.add(tv);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       l tu = this.u;
       l tv = this.v;
       Objects.requireNonNull(tu);
       if (!PatchProxy.applyVoidOneRefs(tv, tu, d.class, "8")) {
          tu.a.remove(tv);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3016);
       this.q = m1.f(p0, 0x7f0a157f);
       p0.setOnClickListener(new l$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("FRAGMENT");
       this.t = this.q8(CommentLimitInfo.class);
       this.u = this.r8("COMMENT_LIMIT_CONTROLLER");
       return;
    }
}
