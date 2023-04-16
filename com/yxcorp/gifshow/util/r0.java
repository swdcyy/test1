package com.yxcorp.gifshow.util.r0;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import j8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import java.lang.Class;
import brd.t;
import lnc.h9;
import lq.f;
import erd.g;
import crd.b;
import k2b.w;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import java.lang.StringBuilder;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.List;
import com.yxcorp.gifshow.util.r0$b;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.util.r0$d;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import tkd.b;
import tkd.d;
import r16.e;
import r16.f;
import com.kwai.robust.PatchProxyResult;
import m26.a$a;
import android.os.SystemClock;
import lnc.g9;
import lq.i;
import lq.e;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import ekd.j0;
import java.lang.Boolean;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Map;
import z36.d$a;
import m26.a;
import z36.d;
import com.kuaishou.android.post.StrArg;
import voc.m;
import com.yxcorp.gifshow.util.q0;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.r0$e;

public abstract class r0	// class@001f9e
{
    public long a;
    public String b;
    public CountDownLatch c;
    public MultiplePhotosProject d;
    public String e;
    public long f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public VideoContext k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Map o;
    public final w p;
    public Bundle q;
    public FragmentActivity r;
    public boolean s;
    public boolean t;
    public r0$e u;
    public r0$c v;
    public b w;

    public void r0(FragmentActivity p0){
       super();
       this.e = "";
       this.l = true;
       boolean b = false;
       this.m = b;
       this.n = b;
       this.s = b;
       this.t = b;
       Object[] objArray = new Object[b];
       a.D().w("BaseSelectedMediasHandler", "SelectedMediasHandler", objArray);
       this.w = RxBus.f.f(MultiplePhotosWorkManager$CropPhotoWorkEvent.class).subscribe(new h9(this), f.b);
       this.p = new w();
       this.r = p0;
       if (p0.getIntent() != null) {
          this.q = this.r.getIntent().getExtras();
       }
       Object[] objArray1 = new Object[b];
       a.D().w("BaseSelectedMediasHandler", "SelectedMediasHandler mExtraInfo:"+this.q, objArray1);
       r0 tq = this.q;
       if (tq != null) {
          this.g = tq.getString("immutable_text");
          byte[] byteArray = this.q.getByteArray("VIDEO_CONTEXT");
          if (byteArray != null) {
             VideoContext videoContext = new VideoContext();
             videoContext.k0(byteArray);
             this.k = videoContext;
          }
       }
       return;
    }
    public final void a(List p0,String p1,r0$b p2,boolean p3,boolean[] p4){
       Object[] objArray1;
       r0 or0 = this;
       Object[] objArray = new Object[0];
       String str = "BaseSelectedMediasHandler";
       a.D().w(str, "cropPhotos selectedList:"+p0+",activityJson:"+p1+",needProgressDialog:"+p3, objArray);
       if (q.f(p0)) {
          i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f104622, 1));
       }else if(or0.r.isFinishing()){
          objArray1 = new Object[0];
          a.D().w(str, "cropPhotos finishing", objArray1);
          return;
       }else {
          objArray1 = new Object[0];
          a.D().w(str, "getSelectedMediaToStringArray", objArray1);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QMedia qMedia = iterator.next();
             if (qMedia != null) {
                uArrayList.add(qMedia);
             }
          }
          QMedia[] qMediaArray = new QMedia[uArrayList.size()];
          r0$d uod = new r0$d(this, uArrayList.toArray(qMediaArray), p1, or0.e, p2, p3, p4);
          Void[] voidArray = new Void[0];
          v10.c(voidArray);
       }
       return;
    }
    public abstract void b(Intent p0);
    public abstract void c(VideoContext p0);
    public void d(Intent p0,List p1){
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "finishActivity selectedList:"+p1, objArray);
       this.r.finish();
       this.r.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f0100e5);
    }
    public abstract int e();
    public abstract int f();
    public abstract String g();
    public abstract void h(List p0);
    public void i(){
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "onDestroy", objArray);
       r0 tw = this.w;
       if (tw != null) {
          tw.dispose();
       }
       return;
    }
    public void j(){
       Object[] objArray = new Object[0];
       a.D().s("BaseSelectedMediasHandler", "onPause: ", objArray);
       this.p.b();
    }
    public void k(){
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "onResume: ", objArray);
       this.p.c();
       this.t = false;
       d.a(0x6758ee6d).Gh();
    }
    public void l(List p0,boolean p1,boolean p2,String p3,String p4,String p5,boolean p6,boolean p7){
       boolean b = p7;
       boolean b1 = p1;
       boolean b2 = p2;
       String str = p3;
       String str1 = p4;
       String str2 = p5;
       boolean b3 = p6;
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", "process selectedList:"+p0+",closeIconDefault:"+b+",onlyImageSelected:"+b1+",finishAfterCrop:"+b2+",taskId:"+str+",tag:"+str1+",activityId:"+str2+",editEntry:"+b3, objArray);
       this.n(p0, b1, b2, str, str1, str2, b3, b, true, null, false, null);
    }
    public void m(List p0,boolean p1,boolean p2,String p3,String p4,String p5,boolean p6,boolean p7,boolean p8,boolean[] p9){
       this.n(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, false, null);
    }
    public void n(List p0,boolean p1,boolean p2,String p3,String p4,String p5,boolean p6,boolean p7,boolean p8,boolean[] p9,boolean p10,r0$b p11){
       r0 or0 = this;
       Object[] obj = p0;
       boolean b = p1;
       boolean b1 = p2;
       String str = p3;
       String str1 = p4;
       String str2 = p5;
       boolean b2 = p6;
       boolean b3 = p7;
       boolean b4 = p8;
       int i = p9;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a uoa = a$a.class;
       or0.m = b2;
       or0.n = b3;
       StringBuilder str3 = "process selectedList:"+obj+",closeIconDefault:"+b3;
       String str4 = ",needProgressDialog:";
       Object[] objArray = new Object[0];
       a.D().w("BaseSelectedMediasHandler", str3+",onlyImageSelected:"+b+",finishAfterCrop:"+b1+str4+b4+",taskId:"+str+",tag:"+str1+",activityId:"+str2+",editEntry:"+b2, objArray);
       if (or0.t != null) {
          obj = new Object[0];
          a.D().w("BaseSelectedMediasHandler", "process mProcessed", obj);
          return;
       }else {
          PatchProxyResult patchProxyRe1 = patchProxyRe;
          a$a uoa1 = uoa;
          or0.a = SystemClock.elapsedRealtime();
          or0.b = str1;
          or0.e = str;
          or0.s = b1;
          objArray = new Object[0];
          a.D().w("BaseSelectedMediasHandler", "process: start processing  onlyImageSelected= "+b+" mFinishAfterCrop="+or0.s+",selectedListSize:"+p0.size(), objArray);
          if (or0.s != null) {
             if (p0.size() > 1) {
                this.a(p0, p5, new g9(or0, obj), p8, p9);
             }else {
                or0.d(new Intent(), obj);
             }
          }else if(b){
             String str5 = ",activityJson:";
             if (p0.size() > 1) {
                Object[] objArray1 = new Object[0];
                a.D().w("BaseSelectedMediasHandler", "completePhotoMovie selectedList:"+obj+str5+str2+str4+b4, objArray1);
                this.a(p0, p5, p11, p8, p9);
             }else if(p0.size() == 1){
                b = 0;
                QMedia qMedia = obj.get(b);
                b = (i && (i.length > 0 && i[b]))? true: false;
                Object[] objArray2 = new Object[0];
                a.D().w("BaseSelectedMediasHandler", "editSinglePhoto media:"+qMedia+str5+str2+str4+b4, objArray2);
                QMedia[] qMediaArray = new QMedia[]{qMedia};
                boolean[] uobooleanArr = new boolean[]{b};
                r0$d uod = new r0$d(this, qMediaArray, p5, or0.e, p11, p8, uobooleanArr);
                Void[] voidArray = new Void[0];
                uoa.c(voidArray);
             }
          }else if(i.h()){
             i.m().k().x(str1);
             if (i.g().getStickerParam().get() == null) {
                i.g().getStickerParam().read(or0.r.getIntent(), false);
             }
          }
          a$a uoa2 = new a$a();
          uoa2.g(str2);
          uoa2.u(str);
          uoa2.t(str1);
          uoa2.B = or0.g;
          uoa2.m(or0.h);
          uoa2.x(or0.k);
          uoa2.p(new ArrayList(obj));
          uoa2.n(false);
          uoa2.r(false);
          uoa2.o(or0.l);
          uoa2.s(false);
          uoa2.i(false);
          uoa2.k(this.e());
          uoa2.o(j0.a(or0.r.getIntent(), "INTENT_GO_HOME_ON_POST_COMPLETE", 1));
          Boolean uBoolean = Boolean.valueOf(or0.n);
          a$a uoa3 = uoa1;
          Object obj1 = PatchProxy.applyOneRefs(uBoolean, uoa2, uoa3, "1");
          PatchProxyResult patchProxyRe2 = patchProxyRe1;
          uoa2 = (obj1 != patchProxyRe2)? obj1: uBoolean.booleanValue();
          uBoolean = Boolean.valueOf(or0.m);
          Objects.requireNonNull(uoa2);
          obj1 = PatchProxy.applyOneRefs(uBoolean, uoa2, uoa3, "2");
          uoa2 = (obj1 != patchProxyRe2)? obj1: uBoolean.booleanValue();
          uoa2 = uoa2.d(or0.o);
          uBoolean = Boolean.valueOf(p10);
          Objects.requireNonNull(uoa2);
          obj1 = PatchProxy.applyOneRefs(uBoolean, uoa2, uoa3, "3");
          uoa2 = (obj1 != patchProxyRe2)? obj1: uBoolean.booleanValue();
          a uoa4 = uoa2.f();
          uoa4.getArgs().getStartEditorParam().set(j0.f(or0.r.getIntent(), "EDIT_STATR_PARAMETER"));
          uoa4.getArgs().getPageMonitorSource().set("IMPORT");
          d.a(0x27ab2faf).g6(or0.r, this.f(), uoa4, q0.b);
          r0 u = or0.u;
          if (u != null) {
             u.M();
          }
          return;
       }
    }
    public void o(r0$e p0){
       this.u = p0;
    }
}
