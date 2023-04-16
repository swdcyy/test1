package com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.entity.QPhoto;
import uo7.k;
import yic.g;
import java.lang.Integer;
import brd.t;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import vo7.c;
import o56.a;
import com.google.gson.JsonObject;
import yic.d;
import erd.o;
import yic.e;
import yic.f;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.share.service.b;
import com.yxcorp.gifshow.share.service.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.share.service.VideoShareObserverService$ShareObserverController$a;
import android.content.ServiceConnection;
import android.app.Activity;
import n80.b;
import java.lang.Exception;
import q87.c;

public class VideoShareObserverService$ShareObserverController	// class@001c73
{
    public final WeakReference a;
    public final File b;
    public long c;
    public boolean d;
    public VideoShareObserverService$ShareObserverController$a e;
    public d f;
    public static final Object g;
    public static VideoShareObserverService$ShareObserverController h;

    static {
       VideoShareObserverService$ShareObserverController.g = new Object();
    }
    public void VideoShareObserverService$ShareObserverController(GifshowActivity p0,File p1){
       super();
       this.c = 10;
       this.d = false;
       this.a = new WeakReference(p0);
       this.b = p1;
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, VideoShareObserverService$ShareObserverController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.t().b("videoShareObserverChooseConfig", 0))? true: false;
       return b;
    }
    public static void b(GifshowActivity p0,File p1,QPhoto p2,k p3){
       t ot;
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, null, VideoShareObserverService$ShareObserverController.class, "1")) {
          return;
       }
       Object g = VideoShareObserverService$ShareObserverController.g;
       _monitor_enter(g);
       if (VideoShareObserverService$ShareObserverController.h != null && VideoShareObserverService$ShareObserverController.h.d != null) {
          VideoShareObserverService$ShareObserverController.c();
       }
       _monitor_exit(g);
       VideoShareObserverService$ShareObserverController.h = new VideoShareObserverService$ShareObserverController(p0, p1);
       int i = 1;
       if (PatchProxy.isSupport(g.class)) {
          ot = PatchProxy.applyThreeRefs(p2, p3, Integer.valueOf(i), null, g.class, "3");
          if (ot != PatchProxyResult.class) {
          label_0096 :
             ot.subscribeOn(d.c).observeOn(d.a).subscribe(b.b, a.b);
             PatchProxy.onMethodExit(VideoShareObserverService$ShareObserverController.class, "1");
             return;
          }
       }
       a.p(p2, "photo");
       a.p(p3, "conf");
       ShareAnyResponse shareAnyResp = p3.r();
       if (shareAnyResp != null) {
          shareAnyResp = shareAnyResp.mShareAnyData;
          if (shareAnyResp != null) {
             ShareAnyResponse$ShareAnyData mShareObject = shareAnyResp.mShareObject;
             if (mShareObject != null) {
                ShareAnyResponse$ShareObject mShareId = mShareObject.mShareId;
                if (mShareId != null) {
                   ot = t.just(mShareId);
                   if (ot != null) {
                   label_0088 :
                      ot = ot.map(new f(p3, p2, i));
                      a.o(ot, "\(conf.mShareAnyData?.mSh\x20\x02this\)\n          }\n      }\x00");
                      goto label_0096 ;
                   }
                }
             }
          }
       }
       ot = c.c(c.b, "PHOTO", a.x, a.A, null, 8, null).map(d.b).onErrorReturn(e.b);
       goto label_0088 ;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, VideoShareObserverService$ShareObserverController.class, "2")) {
          return;
       }
       if (VideoShareObserverService$ShareObserverController.h != null && VideoShareObserverService$ShareObserverController.h.d != null) {
          VideoShareObserverService$ShareObserverController.h.e.a();
          GifshowActivity gifshowActiv = VideoShareObserverService$ShareObserverController.h.a.get();
          if (gifshowActiv != null) {
             try{
                gifshowActiv.unbindService(VideoShareObserverService$ShareObserverController.h.e);
             }catch(java.lang.Exception e0){
                Object[] objArray = new Object[false];
                b.C().t("ShareObserverController", e0.getMessage(), objArray);
             }
          }
       }
    label_0049 :
       return;
    }
}
