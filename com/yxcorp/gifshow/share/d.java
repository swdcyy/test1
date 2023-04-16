package com.yxcorp.gifshow.share.d;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uo7.k;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import kp.r1;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.share.model.guide.ShareGuide;
import mic.b;
import com.yxcorp.gifshow.share.model.guide.ShareFloatGuide;
import com.yxcorp.gifshow.share.model.guide.ShareFinishGuide;
import brd.t;
import mhc.g;
import mhc.f;
import erd.g;
import crd.b;
import brd.v;
import mhc.h;
import wkd.b;
import nic.a;
import com.yxcorp.gifshow.share.b;
import erd.o;
import com.yxcorp.gifshow.share.a;
import java.util.concurrent.TimeUnit;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModel$c;
import com.yxcorp.gifshow.share.OperationModel$Type;

public class d	// class@001b7d
{

    public void d(){
       super();
    }
    public static void a(BaseFeed p0,boolean p1,String p2,GifshowActivity p3,k p4,l p5){
       int i = 1;
       if (PatchProxy.isSupport2(d.class, "7")) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, d.class, "7")) {
             return;
          }
       }
       if (!DownloadForwardDialog.wh(p1, r1.T1(p0))) {
          PhotoMeta obj = PatchProxy.applyOneRefs(p2, null, d.class, "10");
          if (obj != PatchProxyResult.class) {
             obj = obj.booleanValue();
          }else if(!TextUtils.n(p2, "COVER") && (TextUtils.n(p2, "POPUP_DOWNLOAD") || TextUtils.n(p2, "SAVE_ORIGINAL"))){
             obj = true;
          }else {
             obj = false;
          }
          if (obj) {
             obj = PatchProxy.applyOneRefs(p0, null, d.class, "9");
             if (obj != PatchProxyResult.class) {
                obj = obj.booleanValue();
             }else {
                obj = r1.u1(p0);
                if (obj == null || (b.a(obj) == null || (b.a(obj).mShareFloatGuide == null || (b.a(obj).mShareFloatGuide.mShareFinishGuide == null || !(b.a(obj).mShareFloatGuide.mShareFinishGuide.panelType & 4))))) {
                   i = 0;
                }
                int i1 = i;
             }
             if (obj && (p4 == null || !TextUtils.n(p4.w(), "HORIZONTAL_SCREEN_PHOTO"))) {
                d.c(p0, p3).subscribe(new g(p5), new f(p5));
             label_00c6 :
                PatchProxy.onMethodExit(d.class, "7");
                return;
             }
          }
       }
    label_00c3 :
       p5.invoke(null);
       goto label_00c6 ;
    }
    public static void b(v p0,BaseFeed p1,boolean p2,String p3,GifshowActivity p4,k p5){
       Object[] objArray;
       if (PatchProxy.isSupport2(d.class, "1")) {
          objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, d.class, "1")) {
             return;
          }
       }
       h oh = new h(p0, p1, p2, p3, p4, p5);
       d.a(p1, p2, p3, p4, p5, objArray);
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
    public static t c(BaseFeed p0,GifshowActivity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x6af2a3ec).a(p0.getId()).map(b.b).doOnNext(a.b).timeout(1, TimeUnit.SECONDS).compose(c.c(p1.m(), ActivityEvent.DESTROY));
    }
    public static OperationModel d(BaseFeed p0){
       OperationModel$c obj = PatchProxy.applyOneRefs(p0, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new OperationModel$c();
       obj.k(p0);
       obj.p(r1.T1(p0));
       obj.n(OperationModel$Type.PHOTO);
       obj.g(true);
       return obj.a();
    }
}
