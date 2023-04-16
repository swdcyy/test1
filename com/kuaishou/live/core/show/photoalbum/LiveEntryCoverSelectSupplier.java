package com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lc2.c;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.String;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import w69.b;
import w69.i;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier$SelectType;
import x79.e;
import com.kuaishou.live.core.show.photoalbum.a;
import n3d.a$a;
import n3d.a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.photoalbum.c;
import erd.o;
import com.kuaishou.live.core.show.photoalbum.d;
import com.kwai.framework.ui.popupmanager.dialog.a;
import fd2.d;
import android.net.Uri;
import java.lang.Boolean;
import com.kuaishou.live.entry.photoalbum.LiveEntryCoverCropActivity;
import android.content.Context;
import android.os.Parcelable;

public class LiveEntryCoverSelectSupplier	// class@000d51
{
    public final GifshowActivity a;
    public final g b;
    public c c;
    public PublishSubject d;
    public i e;
    public LiveEntryCoverSelectSupplier$SelectType f;
    public File g;
    public int h;
    public int i;
    public float j;
    public static final Object k;

    static {
       LiveEntryCoverSelectSupplier.k = new Object();
    }
    public void LiveEntryCoverSelectSupplier(GifshowActivity p0,c p1){
       super();
       this.d = PublishSubject.g();
       this.h = 9;
       this.i = 16;
       this.j = 85.00f;
       this.a = p0;
       this.c = p1;
       this.g = new File(b.a(-1504323719).o(), "live_photo_album_cover.jpg");
       this.b = new g(p0);
    }
    public static void a(LiveEntryCoverSelectSupplier p0,int p1,int p2,Intent p3){
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(LiveEntryCoverSelectSupplier.class) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Integer.valueOf(p2), p3, p0, LiveEntryCoverSelectSupplier.class, "6") && p1 == 258)) {
          if (p2 == -1) {
             p0.d.onNext(p0.g);
             p0.c.a(p0.g);
          }else if(p2 || PatchProxy.applyVoid(null, p0, LiveEntryCoverSelectSupplier.class, "9")){
             p0.e.a().f(0);
             p0.e.a().g(R.anim.arg_RES_7f010112);
             p0.b(p0.e, p0.f);
          }
       }
       return;
    }
    public final void b(i p0,LiveEntryCoverSelectSupplier$SelectType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEntryCoverSelectSupplier.class, "3")) {
          return;
       }
       this.f = p1;
       this.e = p0;
       if (p1 == LiveEntryCoverSelectSupplier$SelectType.CAMERA) {
          this.c.b();
       }else {
          e.f().i(this.a, this.e, 257, new a(this));
       }
       return;
    }
    public t c(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveEntryCoverSelectSupplier.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(LiveEntryCoverSelectSupplier.k).flatMap(new c(this)).flatMap(new d(this, p0));
    }
    public t d(i p0,LiveEntryCoverSelectSupplier$SelectType p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveEntryCoverSelectSupplier.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p1 == LiveEntryCoverSelectSupplier$SelectType.CAMERA)? "android.permission.CAMERA": "android.permission.WRITE_EXTERNAL_STORAGE";
       return a.h(this.b, this.a, obj).flatMap(new d(this, p0, p1));
    }
    public void e(int p0,int p1){
       this.h = p0;
       this.i = p1;
    }
    public void f(int p0){
       this.j = (float)p0;
    }
    public final void g(Uri p0,int p1,boolean p2,int p3,int p4,a p5){
       LiveEntryCoverSelectSupplier liveEntryCov = LiveEntryCoverSelectSupplier.class;
       if (PatchProxy.isSupport(liveEntryCov)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, liveEntryCov, "11")) {
             return;
          }
       }
       Intent intent = new Intent(this.a, LiveEntryCoverCropActivity.class);
       intent.setData(p0);
       intent.putExtra("output", Uri.fromFile(this.g));
       intent.putExtra("KEY_PREVIEW_IMAGE_MODE", p2);
       intent.putExtra("KEY_LIVE_COVER_ORIGINAL_WIDTH", p3);
       intent.putExtra("KEY_LIVE_COVER_ORIGINAL_HEIGHT", p4);
       intent.putExtra("KEY_LIVE_COVER_ASPECT_RATIO_X", this.h);
       intent.putExtra("KEY_LIVE_COVER_ASPECT_RATIO_Y", this.i);
       intent.putExtra("KEY_LIVE_MIN_CROP_HEIGHT", this.j);
       this.a.t1(intent, p1, p5);
       return;
    }
}
