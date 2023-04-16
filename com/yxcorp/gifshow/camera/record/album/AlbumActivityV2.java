package com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import ml8.d;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import w69.i$a;
import w69.i;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import lnc.m;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import pi9.a;
import android.util.Pair;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import lnc.a1;
import java.lang.Long;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import w69.b$a;
import w69.b;
import w69.f$a;
import sb9.b0;
import o79.a;
import java.util.Objects;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import ra0.d;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.gifshow.smartalbum.SmartAlbumTab;
import java.util.Collection;
import com.kwai.framework.model.user.QCurrentUser;
import gq.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k$a;
import w69.k;
import ga9.c;
import w69.d;
import w69.d$b;
import w69.e0;
import w69.h;
import j79.a$a;
import j79.a;
import j46.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder;
import c16.c;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.models.QMedia;
import r79.c;
import o79.q;
import kuaishou.perf.page.impl.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.kwai.library.widget.popup.common.f;
import e17.i;
import com.yxcorp.gifshow.camera.record.album.s;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.album.r;
import ekd.q$a;
import ekd.q;
import com.yxcorp.gifshow.camera.record.album.s$c;
import sb9.e0;
import com.yxcorp.gifshow.camera.record.album.s$b;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import java.util.Arrays;
import com.kwai.horae.a;
import sb9.d;
import java.lang.Runnable;
import sb9.e;
import com.yxcorp.gifshow.camera.record.album.x;
import android.content.Context;
import sb9.c;
import com.yxcorp.gifshow.camera.record.album.x$a;
import d16.a;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import android.view.MotionEvent;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.view.View;
import com.yxcorp.gifshow.album.IAlbumMainFragment$a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import ga9.a;
import x79.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.horae.lifecycle.a;
import android.view.Window;
import sb9.a0;
import androidx.fragment.app.FragmentActivity;
import oa0.a;
import android.content.SharedPreferences;
import com.kuaishou.android.model.music.MusicType;
import android.net.Uri;
import lnc.c7;
import lnc.d7;
import h69.b;
import k2b.u1;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$a;
import com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$b;
import sb9.a;
import com.yxcorp.gifshow.album.IAlbumMainFragment$b;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$c;
import dc7.e;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$d;
import com.yxcorp.gifshow.album.IAlbumMainFragment$g;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2$e;
import com.yxcorp.gifshow.album.IAlbumMainFragment$h;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.gifshow.post.api.feature.pendant.PendingSelectMediaInfo;
import sb9.b;
import g56.a;
import com.yxcorp.gifshow.util.r0;
import crd.b;
import com.yxcorp.gifshow.album.selected.interact.a;
import m79.d;
import m79.e;

public class AlbumActivityV2 extends BasePostActivity implements d	// class@001ca4
{
    public IAlbumMainFragment O;
    public String P;
    public String Q;
    public a0 R;
    public s S;
    public boolean T;
    public String U;
    public boolean U0;
    public d V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public String X;
    public Boolean X0;
    public String Y;
    public int Y0;
    public MusicType Z;
    public int Z0;
    public String a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public long e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public String i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public String o1;
    public QMedia p1;
    public static final int q1;

    public void AlbumActivityV2(){
       super();
       this.T = false;
       this.U = "";
       this.W = true;
       this.Z = null;
       this.U0 = false;
       this.V0 = false;
       this.W0 = false;
       this.Y0 = 0;
       this.Z0 = 0;
       this.a1 = "";
       this.b1 = true;
       this.c1 = true;
       this.d1 = false;
       this.e1 = 0;
       this.f1 = false;
       this.g1 = false;
       this.h1 = false;
       this.i1 = null;
       this.j1 = false;
       this.m1 = false;
       this.n1 = false;
       this.o1 = "";
       this.p1 = null;
    }
    public static int K3(int p0,int p1){
       AlbumActivityV2 uAlbumActivi = AlbumActivityV2.class;
       if (PatchProxy.isSupport(uAlbumActivi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uAlbumActivi, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < p1) {
          return p0;
       }else {
          return AlbumActivityV2.K3((p0 / 2), p1);
       }
    }
    public String E7(){
       return "Album";
    }
    public i G3(i$a p0){
       int[] a1;
       int booleanx;
       boolean b = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Intent obj1 = PatchProxy.applyOneRefs(obj, b, AlbumActivityV2.class, "19");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = this.getIntent();
       Pair obj2 = null;
       Bundle extras = (obj1 != null)? obj1.getExtras(): obj2;
       m a = m.a;
       b.j1 = m.b(extras);
       boolean i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AlbumActivityV2", "enableAlbumTabs= "+b.j1, objArray);
       boolean b1 = i.g().getClipShowFullVideo().get(Boolean.TRUE).booleanValue();
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj2 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), obj2, uoa, "1");
          if (obj2 != patchProxyRe) {
          label_00af :
             if (PostExperimentUtils.g() && extras != null) {
                String str = "album_tab_list";
                if (extras.containsKey(str)) {
                   extras.putIntArray(str, a.a(extras.getIntArray(str)));
                }
             }
             b$a uoa1 = new b$a();
             uoa1.b(extras);
             b uob = uoa1.a();
             f$a uoa2 = b0.a(b.P, b.i1, b.Q);
             a1 = a.a;
             if (PostExperimentUtils.g()) {
                uoa2.g(a.a(a1));
             }else {
                uoa2.g(a1);
             }
             if (b.j1 != null) {
                Objects.requireNonNull(a);
                boolean i1 = 0x1bf6ff1d;
                b uob1 = d.a(i1);
                String str1 = "PluginManager.get\(SmartA¡­ternalPlugin::class.java\)";
                a.o(uob1, str1);
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = uob1.u2().iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(iterator.next().mId);
                }
                Objects.requireNonNull(uoa2);
                uoa2.d = uArrayList;
                Objects.requireNonNull(m.a);
                b uob2 = d.a(i1);
                a.o(uob2, str1);
                List list = uob2.u2();
                i1 = (list != null && (list.isEmpty() ^ 1) == 1)? true: false;
                booleanx = (extras != null)? extras.getBoolean("ALBUM_ENABLE_SCENE_CLASSIFY", 1): true;
                boolean b2 = PostExperimentUtils.s1();
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                int i2 = mE.isDisableSmartAlbumTabs() ^ 1;
                Object[] objArray1 = new Object[i];
                a.D().w("AlbumUtil", "isSceneClassifyEnable, tabReady="+i1+", "+"enableFromExtras="+booleanx+", experimentEnable="+b2+", userSet="+i2, objArray1);
                i = (i1 && (booleanx && (b2 && i2)))? true: false;
                uoa2.t = i;
             }
             f uof = uoa2.a();
             AlbumLimitOption$Builder uBuilder = o.a();
             if (extras != null) {
                String str2 = "ALBUM_BIZ_CODE";
                if (extras.containsKey(str2)) {
                   str2 = extras.getString(str2);
                   if (!TextUtils.x(str2)) {
                      uBuilder.a(str2);
                   }
                }
             }
             AlbumLimitOption uAlbumLimitO = uBuilder.d();
             b.H3(uAlbumLimitO);
             booleanx = 4;
             if (obj1 != null) {
                booleanx = this.getIntent().getIntExtra("album_list_column_count", booleanx);
             }
             k$a uoa3 = b0.c(b.i1);
             uoa3.C = obj2.first.longValue();
             uoa3.e(booleanx);
             String str3 = (this.L3())? " ": obj2.second;
             uoa3.D = str3;
             AlbumActivityV2 x0 = b.X0;
             if (x0 != null) {
                uoa3.n(x0.booleanValue());
             }
             b.I3(uoa3);
             k ok = uoa3.b();
             c uoc = b0.d(extras, b.g1);
             b.J3(uoc);
             d uod = p0.e();
             if (extras != null) {
                d uod1 = d.h.b(extras);
                if (uod1.b() != null) {
                   uod.g(uod1.b());
                }
                if (uod1.a() != null) {
                   uod.f(uod1.a());
                }
             }
             if (b.j1 != null) {
                ArrayList uArrayList1 = h.a.a();
                Objects.requireNonNull(uod);
                if (!PatchProxy.applyVoidOneRefs(uArrayList1, uod, d.class, "3")) {
                   a.q(uArrayList1, "<set-?>");
                   uod.c = uArrayList1;
                }
             }
             if (b.g1 != null && PostExperimentUtils.f()) {
                a$a uoa4 = new a$a();
                uoa4.d(1);
                obj.g(uoa4.a());
             }
             return obj.a(uob).d(uof).n(uoc).c(uod).m(ok).f(uAlbumLimitO).b();
          }
       }
       int i3 = (b1 && LongVideoLocalProject.a())? 1: 0;
       long l = (i3)? (long)((float)(LongVideoLocalProject.f() * 60) * 1000.00f): 0xdea8;
       int i4 = (i3)? 0x7f10164f: 0x7f10164e;
       i3 = (i3)? LongVideoLocalProject.f(): 57;
       obj2 = new Pair(Long.valueOf(l), a1.q(i4, i3));
       goto label_00af ;
    }
    public void H3(AlbumLimitOption p0){
    }
    public void I3(k$a p0){
    }
    public void J3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumActivityV2.class, "20")) {
          return;
       }
       if (p0 != null && a.a.b(this)) {
          p0.e(AbsAlbumAssetFragmentViewBinder.class, PotentialAlbumAssetFragmentViewBinder.class);
       }
       return;
    }
    public boolean L3(){
       Object obj = PatchProxy.apply(null, this, AlbumActivityV2.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.U0 == null && (this.V0 != null || (this.W0 != null && (!i.g().getHideAICutEntrance().get(Boolean.FALSE).booleanValue() && c.c()))))? true: false;
       return b;
    }
    public int M(){
       return 4;
    }
    public void M3(List p0,boolean p1,String p2,String p3,String p4,boolean p5){
       String str1;
       String str2;
       Object[] objArray3;
       Object[] objArray4;
       QMedia qMedia = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       AlbumActivityV2 uAlbumActivi = AlbumActivityV2.class;
       int i = 2;
       if (PatchProxy.isSupport(uAlbumActivi)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),oobject1,oobject2,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, qMedia, uAlbumActivi, "2")) {
             return;
          }
       }
       QMedia qMedia1 = null;
       qMedia.p1 = qMedia1;
       Serializable serializable = j0.e(this.getIntent(), "album_passthrough_qmedias");
       String str = "AlbumActivityV2";
       if (serializable instanceof QMedia[]) {
          Object[] objArray1 = new Object[0];
          a.D().w(str, "onClickNextStep KEY_ALBUM_PASSTHROUGH_QMEDIAS valid", objArray1);
       }else {
          serializable = qMedia1;
       }
       if (serializable != null) {
          int len = serializable.length;
          boolean i1 = 0;
          while (true) {
             if (i1 < len) {
                if (q.j(serializable[i1])) {
                   str1 = 1;
                label_006c :
                   i1 = (p1 && !str1)? true: false;
                   str1 = "postLoadToEditorMonitor";
                   d.d(str1).n();
                   d uod = d.d(str1);
                   if (i1) {
                      if (qMedia.c1 != null) {
                      label_008b :
                         str2 = "cold";
                      label_0090 :
                         uod.k(str2);
                         d.d(str1).g("clickToPause");
                         d.d(str1).a("selectCount", String.valueOf(p0.size()));
                         d.d(str1).a("onlyImageSelected", String.valueOf(i1));
                         PageMonitor.INSTANCE.onInit(VideoEditPreviewV3Fragment.class);
                         Object[] objArray2 = new Object[0];
                         a.D().w(str, "onClickNextStep: onlyImageSelected="+i1, objArray2);
                         d.a(0x1bf6ff1d).P2();
                         len = 0x7f11066a;
                         if (qMedia.e1 > 0) {
                            AlbumActivityV2 e1 = qMedia.e1;
                            if (q.a.a(0, oobject) - e1 < 0) {
                               objArray3 = new Object[]{Long.valueOf((e1 / 1000))};
                               i.d(len, f.n(R.string.arg_RES_7f104a2d, objArray3));
                               return;
                            }
                         }
                         if ((a1.p(0x7f100b70)).equals(oobject2) && j0.e(this.getIntent(), "album_selected_data") != null) {
                            if (p0.size() < 2) {
                               i.a(len, R.string.arg_RES_7f100b78);
                            }else if(qMedia.S == null){
                               qMedia.S = new s(qMedia);
                            }
                            uAlbumActivi = qMedia.S;
                            List list = q.f(p0);
                            Objects.requireNonNull(uAlbumActivi);
                            if (!PatchProxy.applyVoidOneRefs(list, uAlbumActivi, s.class, "1")) {
                               List list1 = q.g(uAlbumActivi.e, r.a);
                               ArrayList uArrayList = new ArrayList();
                               int i2 = 0;
                               while (i2 < list.size()) {
                                  if (!list1.contains(list.get(i2).path)) {
                                     uArrayList.add(list.get(i2));
                                  }
                                  i2 = i2 + 1;
                               }
                               QMedia[] qMediaArray = new QMedia[0];
                               Void[] voidArray = new Void[0];
                               new s$c(uAlbumActivi, uArrayList.toArray(qMediaArray), new e0(uAlbumActivi, list)).c(voidArray);
                            }
                            objArray3 = new Object[0];
                            a.D().w(str, "onClickNextStep edit_image_reorder", objArray3);
                         }else {
                            ArrayList uArrayList1 = new ArrayList();
                            if (serializable != null) {
                               uArrayList1.addAll(Arrays.asList(serializable));
                            }
                            uArrayList1.addAll(oobject);
                            List list2 = q.f(uArrayList1);
                            if (!list2.isEmpty()) {
                               String str3 = "loadOpt";
                               if (!PatchProxy.applyVoidOneRefs(list2, null, uAlbumActivi, "25")) {
                                  objArray4 = new Object[0];
                                  a.D().w(str3, "fetchSize start:"+list2, objArray4);
                                  a.d.c(new d(list2));
                                  objArray4 = new Object[0];
                                  a.D().w(str3, "fetchSize end:"+list2, objArray4);
                               }
                               QMedia path = list2.get(0).path;
                               if (!PatchProxy.applyVoidOneRefs(path, null, uAlbumActivi, "26")) {
                                  objArray4 = new Object[0];
                                  a.D().w(str3, "fetchBitmap start:"+path, objArray4);
                                  if (!TextUtils.x(path)) {
                                     a.d.c(new e(path));
                                     Object[] objArray5 = new Object[0];
                                     a.D().w(str3, "fetchBitmap end:"+path, objArray5);
                                  }
                               }
                            }
                         label_0269 :
                            c uoc = new c(this, i1, p2, p3, p4, p5);
                            new x(qMedia).a(list2, oobject1, objArray2);
                         }
                         if (qMedia.b1 != null && !i1) {
                            qMedia.b1 = false;
                         }
                         if (qMedia.c1 != null && i1) {
                            qMedia.c1 = false;
                            break ;
                         }
                         break ;
                      }
                   }else if(qMedia.b1 != null){
                      goto label_008b ;
                   }
                   str2 = "warm";
                   goto label_0090 ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
          qMedia.m1 = true;
          return;
       }
       str1 = null;
       goto label_006c ;
    }
    public boolean N3(){
       boolean b = (this.n1 != null && this.k1 != null)? true: false;
       return b;
    }
    public a O3(){
       return null;
    }
    public void Of(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "22")) {
          return;
       }
       super.Of();
       d.d("postAlbumMonitor").h("loadDataToRenderFinish");
       d.d("postAlbumMonitor").c();
       return;
    }
    public int P2(){
       return 1;
    }
    public boolean P3(){
       return this.n1;
    }
    public boolean R3(){
       return this.k1;
    }
    public void S3(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "6")) {
          return;
       }
       if (this.V0 != null) {
          this.O.fa().setPadding(0, 0, 0, 0);
       }
       return;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "23")) {
          return;
       }
       super.Z();
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AlbumActivityV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          b = super.dispatchTouchEvent(p0);
       }catch(java.lang.Exception e4){
          PostUtils.D("AlbumActivityV2", "dispatchTouchEvent error", e4);
       }
       return b;
    }
    public void doBindView(View p0){
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "13")) {
          return;
       }
       super.finish();
       if (!j0.g(this.getIntent(), "goto_page_list_when_finish")) {
          AlbumActivityV2 tZ0 = this.Z0;
          if (tZ0 == null) {
             this.overridePendingTransition(0, R.anim.arg_RES_7f01010d);
          }else {
             this.overridePendingTransition(0, tZ0);
          }
       }
       if (this.d1 != null) {
          this.O.f6(null);
       }
       return;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, AlbumActivityV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.O.isAdded() && this.O.Sc()) {
          return 187;
       }
       return 313;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, AlbumActivityV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.Q)) {
          obj = "task_id="+this.P;
       }else {
          Object[] objArray = new Object[]{this.P,this.Q};
          obj = String.format("task_id=%s&entrance_type=%s", objArray);
       }
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AlbumActivityV2.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return 0xff000000;
    }
    public String getUrl(){
       return "ks://camera/normal/album_or_photo_record";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "9")) {
          return;
       }
       AlbumActivityV2 tO = this.O;
       if (tO != null && !tO.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       View view;
       Object[] obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AlbumActivityV2 uAlbumActivi = AlbumActivityV2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAlbumActivi, "1")) {
          return;
       }
       e.e();
       super.onCreate(p0);
       boolean i = 0x7f0d00ab;
       BasePostActivity uBasePostAct = BasePostActivity.class;
       if (PatchProxy.isSupport(uBasePostAct)) {
          view = PatchProxy.applyOneRefs(Integer.valueOf(i), this, uBasePostAct, "29");
          if (view != patchProxyRe) {
          label_003c :
             this.setContentView(view);
             this.doBindView(this.getWindow().getDecorView());
             this.R = new a0(this);
             this.P = j0.f(this.getIntent(), "photo_task_id");
             this.Q = j0.f(this.getIntent(), "album_entrance_type");
             this.T = j0.a(this.getIntent(), "album_select_result_code", false);
             String str = j0.f(this.getIntent(), "album_enter_toast_string");
             this.U = str;
             int i1 = 1;
             i = TextUtils.x(str) ^ i1;
             if (PatchProxy.isSupport(uAlbumActivi)) {
                obj = PatchProxy.applyOneRefs(Boolean.valueOf(i), this, uAlbumActivi, "18");
                if (obj != patchProxyRe) {
                   i = obj.booleanValue();
                }else if(i && !a.a.getBoolean("publish_reedit_atlas_tip_shown", false)){
                   i = true;
                }else {
                   i = false;
                }
             }else {
                goto label_00a1 ;
             }
             this.d1 = j0.a(this.getIntent(), "ALBUM_BOTTOM_BAR_SHOW_HIDE_WHEN_ALBUM_LIST_SHOW_HIDE", false);
             this.X = j0.f(this.getIntent(), "album_aicut_them_id");
             this.Y = j0.f(this.getIntent(), "album_aicut_them_music_id");
             Serializable serializable = j0.e(this.getIntent(), "album_aicut_them_music_type");
             if (serializable instanceof MusicType) {
                this.Z = serializable;
                obj = new Object[false];
                a.D().w("AlbumActivityV2", "onCreate ALBUM_AICUT_THEM_MUSIC_TYPE valid", obj);
             }
             this.V0 = j0.a(this.getIntent(), "hideNextButton", false);
             this.Y0 = j0.b(this.getIntent(), "albumBackButtonRes", false);
             this.Z0 = j0.b(this.getIntent(), "albumQuitAnimation", false);
             this.a1 = j0.f(this.getIntent(), "tag");
             this.e1 = j0.c(this.getIntent(), "album_min_total_duration", 0);
             this.g1 = j0.a(this.getIntent(), "albumEnablePreviewNextStep", false);
             this.i1 = j0.f(this.getIntent(), "albumDirectToPreviewPath");
             int i2 = -873393519;
             if (!PatchProxy.applyVoid(null, this, uAlbumActivi, "21") && (this.getIntent() != null && this.getIntent().getData() != null)) {
                Uri data = this.getIntent().getData();
                if (data != null && (data.isHierarchical() && ("aicut").equals(data.getHost()))) {
                   try{
                      c7.a.c(data, this.getIntent());
                      this.X = data.getQueryParameter("themeId");
                      this.Y = data.getQueryParameter("musicId");
                      String queryParamet = data.getQueryParameter("musicType");
                      Object[] objArray2 = (queryParamet == null)? null: MusicType.valueOf(Integer.parseInt(queryParamet));
                      this.Z = objArray2;
                   }catch(java.lang.NumberFormatException e7){
                      PostUtils.D("AlbumActivityV2", "wrong musicType format", e7);
                      this.Z = null;
                   }
                   this.V0 = data.getBooleanQueryParameter("showNextButton", false) ^ i1;
                   this.W0 = data.getBooleanQueryParameter("showAICutButton", false);
                   this.g1 = i1;
                   d7.a.h(this.getIntent());
                   this.X0 = Boolean.valueOf((PostExperimentUtils.e() ^ i1));
                }
             label_01df :
                if (this.V0 != null) {
                   d.a(i2).tm(this, "", a1.p(R.string.arg_RES_7f100b0b), false);
                }
             }
          label_01f5 :
             Object[] objArray = new Object[false];
             a.D().w("AlbumActivityV2", "ThemeId = "+this.X+", ThemeMusicId = "+this.Y+", ThemeMusicType = "+this.Z, objArray);
             if (TextUtils.x(this.P)) {
                this.P = u1.f();
             }
             i oi = this.G3(new i$a());
             IAlbumMainFragment iAlbumMainFr = e.f().d(oi);
             this.O = iAlbumMainFr;
             PostBubbleManager.d(iAlbumMainFr.b()).q(i1);
             this.O.C8(new AlbumActivityV2$a(this));
             b uob = d.a(i2);
             if (this.d1 != null) {
                this.O.f6(new AlbumActivityV2$b(this));
             }
             this.O.v5(new a(this));
             this.O.I3(new AlbumActivityV2$c(this, oi, uob, i));
             this.O.u3(new AlbumActivityV2$d(this));
             this.O.ta(new AlbumActivityV2$e(this));
             e uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(R.id.ksa_container_layout, this.O.b());
             uoe.o();
             if (this.getIntent() != null && j0.e(this.getIntent(), "pending_select_media") instanceof PendingSelectMediaInfo) {
                Object[] objArray1 = new Object[false];
                a.D().w("AlbumActivityV2", "onPreviewPageFinished KYE_PENDING_SELECT_MEDIA valid", objArray1);
             }
             d.b("task_id", this.P);
             d.d("postAlbumMonitor").h("clickToLoadData");
             d.d("postAlbumMonitor").g("loadDataToRenderFinish");
             if (j0.a(this.getIntent(), "has_pic_template", false) && !PatchProxy.applyVoid(null, this, uAlbumActivi, "3")) {
                this.O.v5(new b(this, j0.e(this.getIntent(), "album_selected_data")));
             }
             return;
          }
       }
       view = this.J.g(this.getLayoutInflater().inflate(i, null));
       goto label_003c ;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumActivityV2.class, "10")) {
          return;
       }
       super.onDestroy();
       a.c().b();
       d.a(-873393519).q5();
       this.R.i();
       AlbumActivityV2 tS = this.S;
       if (tS != null) {
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoid(objArray, tS, s.class, "3")) {
             s g = tS.g;
             if (g != null) {
                g.dispose();
             }
          }
       }
       if (this.V != null && this.O.m8() != null) {
          this.O.m8().a0(this.V);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "12")) {
          return;
       }
       super.onPause();
       this.R.j();
       d.d("postLoadToEditorMonitor").h("clickToPause");
       d.d("postLoadToEditorMonitor").g("pauseToCreate");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "11")) {
          return;
       }
       super.onResume();
       boolean booleanExtra = this.getIntent().getBooleanExtra("SUPPORT_CLASSIFY", false);
       if (PostExperimentUtils.s1() && (booleanExtra && !b0.e())) {
          m.a(this, this.O, this.O3());
       }
    label_0031 :
       this.R.k();
       if (!i.g().getHideAICutEntrance().get(Boolean.FALSE).booleanValue()) {
          d.a(-873393519).uj();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, AlbumActivityV2.class, "24")) {
          return;
       }
       super.onStop();
       Object[] objArray = new Object[0];
       a.D().s("loadOpt", "onStop", objArray);
       a.d.e("tag_album_load_splash_bitmap");
       a.d.e("tag_album_load_splash_size");
       return;
    }
}
