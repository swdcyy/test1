package com.yxcorp.gifshow.profile.album.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import com.yxcorp.gifshow.profile.album.a$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.tbruyelle.rxpermissions2.g;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import io.reactivex.subjects.PublishSubject;
import android.os.Bundle;
import n3d.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import v26.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.f0;
import com.yxcorp.gifshow.profile.album.a$b;
import com.yxcorp.gifshow.profile.album.a$c;
import erd.g;
import crd.b;
import w69.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.album.a$d;
import erd.o;
import com.yxcorp.gifshow.profile.album.a$e;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.profile.album.a$f;
import com.kwai.framework.model.user.UserStatus;

public final class a extends ImageSelectSupplier	// class@001217
{
    public UserStatus r;
    public String s;
    public boolean t;
    public boolean u;
    public static final Object v;
    public static final a$a w;

    static {
       a.w = new a$a(null);
       a.v = new Object();
    }
    public void a(GifshowActivity p0,g p1,File p2){
       a.p(p0, "activity");
       a.p(p1, "rxPermissions");
       super(p0, p1, p2);
    }
    public void d(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "1")) {
          return;
       }
       int i = (this.c == null)? 1: 0;
       switch (p0){
           case 768:
             if (!i) {
                super.d(p0, p1, p2);
             }
             break;
           case 769:
             if (!i) {
                super.d(p0, p1, p2);
             }
             break;
           case 770:
             if (i) {
                if (p0 == 770 && p1 == -1) {
                   ImageSelectSupplier ta = this.a;
                   if (ta != null && ta.exists()) {
                      Fresco.getImagePipeline().evictFromCache(w0.c(this.a));
                   }
                   if (p2 != null) {
                      this.b.onNext(p2);
                      this.b.onComplete();
                   }
                }
             }else {
                super.d(p0, p1, p2);
             }
             break;
           default:
             super.d(p0, p1, p2);
       }
    label_0067 :
       return;
    }
    public void e(GifshowActivity p0,Uri p1,Bundle p2,int p3,a p4){
       a uoa = a.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p4, "callback");
       boolean b = (this.c != null)? true: false;
       ImageSelectSupplier te = this.e;
       if (te != null) {
          i = te.getValue();
       }
       p2.putInt("selectType", i);
       SerializableHook.putSerializable(p2, "userStatus", this.r);
       if (this.t == null) {
          p2.putBoolean("from_camera_or_gallery", b);
       }
       if (this.u != null) {
          p2.putBoolean("disablePost", i1);
       }
       a$b uob = new a$b(this, p0, p1, p3, p2);
       y6.s(b.class, LoadPolicy.DIALOG).g(c.c(p0.m(), ActivityEvent.DESTROY)).R(v6, a$c.b);
       return;
    }
    public t f(i p0,ImageSelectSupplier$ImageSelectType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.just(a.v).flatMap(new a$d(this, (TextUtils.x(this.s) ^ 0x01))).flatMap(new a$e(this, p0, p1));
       a.o(ot, "Observable.just\(TRIGGER\)¡­selectType, type\)\n      }");
       return ot;
    }
    public final t k(i p0,ImageSelectSupplier$ImageSelectType p1,ImageSelectSupplier$Type p2){
       ImageSelectSupplier$Type obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p2, "type");
       obj = ImageSelectSupplier$Type.GALLERY;
       String str = (p2 == obj)? "android.permission.WRITE_EXTERNAL_STORAGE": "android.permission.CAMERA";
       String str1 = str;
       int i = (p2 == obj)? 0x7f103bd5: 0x7f100494;
       int i1 = (p2 == obj)? 0x7f103bcf: 0x7f100493;
       t ot = a.i(this.l, this.m, str1, i, i1, KwaiDialogOption.d).flatMap(new a$f(this, p0, p2, p1));
       a.o(ot, "PermissionDlgUtils\n     ¡­bservable.empty\(\)\n      }");
       return ot;
    }
    public final void l(UserStatus p0){
       this.r = p0;
    }
}
