package djc.p1;
import djc.e0;
import brd.v;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import uo7.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zic.b;
import com.yxcorp.gifshow.share.exception.ForwardCancelException;
import java.lang.Throwable;
import brd.g;
import com.yxcorp.gifshow.share.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.sharelib.exception.ForwardCancelException;
import yic.g;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import mhc.j2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController;
import java.io.File;
import com.yxcorp.gifshow.photo.download.utils.e;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class p1 implements e0	// class@002217
{
    public v a;
    public k b;
    public BaseFeed c;
    public String d;
    public int e;
    public boolean f;

    public void p1(v p0,BaseFeed p1,String p2,int p3,boolean p4,k p5){
       super();
       this.a = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.b = p5;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, p1.class, "4")) {
          return;
       }
       b.a(this.c, "PHOTO_DOWNLOAD_SHARE_DIALOG_MORE_PHOTO", this.d, this.e);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, p1.class, "2")) {
          return;
       }
       this.a.onError(new ForwardCancelException("cancel download"));
       if (!TextUtils.equals(o.c(false), this.d)) {
          b.a(this.c, "PHOTO_DOWNLOAD_SHARE_DIALOG_CANCEL", this.d, this.e);
       }else {
          this.f("CANCEL_SHARE_WECHAT_TIMELINE");
       }
       g.e(new QPhoto(this.c), this.b, this.g(this.e), new ForwardCancelException());
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, p1.class, "6")) {
          return;
       }
       b.a(this.c, "ALBUM_VIEW_DOWNLOAD_SHARE", this.d, this.e);
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p1.class, "5")) {
          return;
       }
       p1 tc = this.c;
       String str = "PHOTO_DOWNLOAD_SHARE_DIALOG_MORE_PHOTO";
       p1 td = this.d;
       p1 tf = this.f;
       p1 te = this.e;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray1 = new Object[]{tc,str,td,Boolean.valueOf(tf),Integer.valueOf(te)};
          if (PatchProxy.applyVoid(objArray1, objArray, uob, "2")) {
          label_0078 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.I(str);
       i3 oi3 = i3.f();
       oi3.c("share_platform", Integer.valueOf(te));
       oi3.c("has_more_photo_text", Integer.valueOf(tf));
       oi3.d("source", TextUtils.I(td));
       uElementPack.params = oi3.e();
       u1.u0(4, uElementPack, j2.d(tc));
       goto label_0078 ;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, p1.class, "1")) {
          return;
       }
       this.a.onComplete();
       if (!TextUtils.equals(o.c(false), this.d)) {
          b.a(this.c, "PHOTO_DOWNLOAD_SHARE_DIALOG_UPLOAD", this.d, this.e);
       }else {
          this.f("DOWNLOAD_SHARE_WECHAT_TIMELINE");
       }
       int i = this.g(this.e);
       QPhoto qPhoto = new QPhoto(this.c);
       if (VideoShareObserverService$ShareObserverController.a()) {
          File uFile = e.c(qPhoto);
          GifshowActivity gifshowActiv = this.b.k();
          if (i == 1 && e.e(uFile)) {
             VideoShareObserverService$ShareObserverController.b(gifshowActiv, uFile, qPhoto, g.a(gifshowActiv, qPhoto));
          }
       }else {
          g.d(qPhoto, this.b, i);
       }
       return;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = TextUtils.k(p0);
       i3 oi3 = i3.f();
       oi3.d("is_wx_limit", "FALSE");
       oi3.d("source", this.d);
       uElementPack.params = oi3.e();
       j2.f(1, "DOWNLOAD_SHARE_POPUP", uElementPack, this.c);
       return;
    }
    public final int g(int p0){
       int i = 1;
       if (p0 != i) {
          i = 2;
          if (p0 != i) {
             i = 4;
             if (p0 != 3) {
                if (p0 != i) {
                   if (p0 != 5) {
                      return 0;
                   }else {
                      return 5;
                   }
                }else {
                   return 3;
                }
             }
          }
       }
       return i;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "3")) {
          return;
       }
       this.a.onError(p0);
       g.e(new QPhoto(this.c), this.b, this.g(this.e), p0);
       return;
    }
}
