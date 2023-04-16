package com.kwai.component.photo.detail.slide.negative.operation.d;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import brd.t;
import kf5.h0;
import erd.a;
import kf5.i0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kwai.component.photo.detail.slide.negative.operation.c;
import crd.b;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import mhc.j2;

public final class d	// class@000a82
{

    public void d(){
       super();
    }
    public static void a(String p0,QPhoto p1,GifshowActivity p2,PublishSubject p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "3")) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       progressFrag.show(p2.getSupportFragmentManager(), "share_snap_shot");
       t.just(p0).doFinally(new h0(progressFrag, p3)).doOnNext(new i0(p1, p2)).subscribe(Functions.d(), c.b);
       return;
    }
    public static void b(int p0,boolean p1,QPhoto p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, null, d.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_VIDEO_SHARE_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("button_type", Integer.valueOf(p0));
       oi3.c("is_simplify_screen", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       j2.f(1, "POPUP_MORE_OPERATION", uElementPack, p2.mEntity);
       return;
    }
    public static void c(int p0,QPhoto p1){
       d uod = d.class;
       QPhoto qPhoto = null;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, qPhoto, uod, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_VIDEO_SHARE_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("button_type", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       if (p1 != null) {
          qPhoto = p1.mEntity;
       }
       j2.h(3, "POPUP_MORE_OPERATION", uElementPack, qPhoto);
       return;
    }
    public static void d(QPhoto p0,GifshowActivity p1,boolean p2,boolean p3,PublishSubject p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uod, "1")) {
             return;
          }
       }
       if (p0 != null && p1 != null) {
          if (p3) {
             d.b(3, p2, p0);
             d.a("wechat", p0, p1, p4);
          }else {
             d.b(4, p2, p0);
             d.a("qq2.0", p0, p1, p4);
          }
       }
       return;
    }
}
