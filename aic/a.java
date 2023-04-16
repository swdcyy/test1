package aic.a;
import zhc.b;
import aic.a$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment$a;
import aic.a$b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import mhc.f0;
import yhc.a;
import com.yxcorp.gifshow.entity.QPhoto;
import msd.a;
import com.kwai.sharelib.a;
import wkd.b;
import psb.c;
import brd.t;
import aic.a$c;
import erd.o;
import aic.a$d;
import aic.a$e;
import erd.g;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog;
import java.lang.Exception;

public final class a implements b	// class@000126
{
    public ForwardPopSectionFragment a;
    public AuthorShareGuideDialog b;
    public b c;
    public final GifshowActivity d;
    public final PhotoDetailParam e;
    public static final a$a f;

    static {
       a.f = new a$a(null);
    }
    public void a(GifshowActivity p0,PhotoDetailParam p1){
       a.p(p0, "activity");
       a.p(p1, "param");
       super();
       this.d = p0;
       this.e = p1;
    }
    public final GifshowActivity a(){
       return this.d;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       b9.a(this.c);
       return;
    }
    public final PhotoDetailParam c(){
       return this.e;
    }
    public final void d(GifshowActivity p0,PhotoDetailParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       int i = 2;
       int i1 = (p1.isThanos() || 90 == p1.getSource())? 1: 2;
       ForwardPopSectionFragment uForwardPopS = ForwardPopSectionFragment.Z0.a(p0, i1);
       this.a = uForwardPopS;
       if (uForwardPopS != null) {
          ForwardGridSectionFragment.Mh(uForwardPopS, new a$b(), 0, i, null);
       }
       QPhoto photo = p1.getPhoto();
       a.o(photo, "param.photo");
       a.a.c(p0, photo, this.a, null).l();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       QPhoto photo = this.e.getPhoto();
       a.o(photo, "param.photo");
       this.c = b.a(0x1e7ef171).t(photo.getPhotoId()).map(a$c.b).subscribe(new a$d(this), new a$e(this));
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       try{
          a tb = this.b;
          if (tb != null) {
             c uoc = tb.e();
             if (uoc != null) {
                uoc.o();
             }
          }
          tb = this.a;
          if (tb != null) {
             tb.dismissAllowingStateLoss();
          }
          this.a = null;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
