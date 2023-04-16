package com.yxcorp.gifshow.featured.detail.featured.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import wkd.b;
import bea.a;
import zda.c;
import zda.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.featured.detail.featured.pushinject.FeaturePushInjectTask$FailType;
import com.yxcorp.gifshow.featured.detail.featured.pushinject.a;

public class c extends PresenterV2	// class@000f6d
{
    public QPhoto p;
    public a q;
    public a r;
    public IMediaPlayer$OnInfoListener s;
    public IMediaPlayer$OnErrorListener t;
    public static String u = "FeaturedPushInjectLogPresenter";

    public void c(){
       super();
       this.r = b.a(0x59e14c23);
       this.s = new c(this);
       this.t = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.q.getPlayer().addOnInfoListener(this.s);
       this.q.getPlayer().addOnErrorListener(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.q.getPlayer().removeOnInfoListener(this.s);
       this.q.getPlayer().addOnErrorListener(this.t);
       return;
    }
    public final void P8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       uoc = this.r;
       if (uoc.c != null && (!TextUtils.x(uoc.a()) && (this.p != null && (this.r.a()).equals(this.p.getPhotoId())))) {
          a.a(FeaturePushInjectTask$FailType.PLAY_FAIL, this.r.a(), this.r.b, p0);
          c tr = this.r;
          tr.a = null;
          tr.b = null;
          tr.c = false;
       }
    label_0054 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       return;
    }
}
