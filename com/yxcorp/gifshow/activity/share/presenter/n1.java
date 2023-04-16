package com.yxcorp.gifshow.activity.share.presenter.n1;
import com.yxcorp.gifshow.activity.share.presenter.r1;
import crd.a;
import com.yxcorp.gifshow.activity.share.presenter.n1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.e;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import xw8.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import zw8.u2;
import zw8.t2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.CoverMeta;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import xw8.c;
import g9c.a;
import vw8.a;
import maa.a;
import qaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace;
import wba.z;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Asset;
import java.io.File;
import java.lang.IllegalArgumentException;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.PictureCoverParam;
import java.lang.Integer;
import xw8.p0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.v2;
import com.yxcorp.gifshow.activity.share.presenter.h1;
import erd.g;
import crd.b;
import java.util.Set;
import zw8.q2;
import android.view.View$OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import y26.a;
import com.yxcorp.gifshow.activity.share.presenter.m1;
import com.yxcorp.gifshow.activity.share.presenter.j1;
import zw8.r2;
import android.widget.LinearLayout;
import zw8.w2;
import com.yxcorp.gifshow.activity.share.presenter.i1;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.widget.PicturesContainer;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.activity.share.presenter.n1$b;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Float;
import im8.f;
import ekd.m1;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Boolean;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import ekd.j0;
import java.util.Collection;
import ekd.q;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lq.i;
import lq.a;
import com.yxcorp.gifshow.model.MultiplePhotosProject;
import java.util.Collections;
import haa.a;
import com.yxcorp.gifshow.activity.share.presenter.k1;
import ok.h;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Iterator;
import com.kuaishou.edit.draft.Template;
import gba.a;
import com.yxcorp.gifshow.activity.BasePostActivity;
import p16.b;
import r16.a;
import r16.d;
import lnc.pb;
import lnc.pb$a;
import qr4.i;
import qr4.m$k0;
import qr4.m$j0;
import laa.e;
import mba.m0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import kotlin.jvm.internal.a;
import eba.a;
import hba.a;
import java.lang.Iterable;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.previewer.AssetSubAssetAssociation;
import saa.c;
import saa.e;
import java.util.Objects;
import qr4.e$h;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset$Type;
import km6.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class n1 extends r1	// class@001417
{
    public int U0;
    public VideoContext V0;
    public boolean W0;
    public RecyclerView X0;
    public View Y0;
    public p0 Z;
    public ScrollViewEx Z0;
    public View a1;
    public LinearLayout b1;
    public b c1;
    public a d1;
    public int e1;
    public int f1;
    public e g1;
    public static String h1 = "UPDATE_PICTURES_WHEN_RESUME";

    public void n1(){
       super();
       this.d1 = new a();
       this.f1 = -1;
       this.g1 = new n1$a(this);
    }
    public void E8(){
       c0 g;
       int i;
       Object[] objArray1;
       int i1;
       String str1;
       c uoc1;
       int i2;
       Object[] objArray4;
       c uoc3;
       b uob = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uob, n1.class, "3")) {
          return;
       }
       super.E8();
       d.a(-273232199).a20().V3(uob.g1);
       if (!PatchProxy.applyVoid(objArray, uob, n1.class, "15")) {
          uob.X0.setItemAnimator(objArray);
          uob.X0.setLayoutManager(new LinearLayoutManager(this.getActivity(), 0, 0));
          b uob1 = new b();
          uob.c1 = uob1;
          uob.X0.setAdapter(uob1);
          uob.X0.addItemDecoration(new b(0, a1.d(R.dimen.arg_RES_7f07054b), a1.d(R.dimen.arg_RES_7f070549), a1.d(R.dimen.arg_RES_7f07034b)));
          n1 c1 = uob.c1;
          c1.w = new u2(uob);
          c1.x = new t2(uob);
       }
       if (!PatchProxy.applyVoid(objArray, uob, n1.class, "10")) {
          n1 on1 = -1;
          String str = "SharePhotosPreviewPresenter";
          if (DraftUtils.W(uob.G, uob.y)) {
             g = uob.G;
             if (!PatchProxy.applyVoidOneRefs(g, uob, n1.class, "13")) {
                ArrayList uArrayList = new ArrayList();
                if (g.isSinglePhoto()) {
                   ImageMeta$SinglePicture mCdnList = g.getSinglePicture().mCdnList;
                   if (mCdnList != null && mCdnList.length > 0) {
                      uArrayList.add(mCdnList[0].mCdn);
                   }
                   i = 1;
                }else {
                   List atlasList = g.getAtlasList();
                   for (i1 = 0; i1 < atlasList.size(); i1 = i1 + 1) {
                      uArrayList.add(g.getAtlasPhotosCdn(i1).get(0).mUrl);
                   }
                   i = 0;
                }
                ArrayList uArrayList1 = new ArrayList();
                CDNUrl mUrl = (g.getCoverMeta() != null && g.getCoverMeta().mCoverThumbnailUrls != null)? g.getCoverMeta().mCoverThumbnailUrls[0].mUrl: objArray;
                objArray1 = new Object[0];
                a.b().w(str, "setDataFromQPhoto cover imageUrl: "+mUrl, objArray1);
                if (!i) {
                   for (i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
                      str1 = uArrayList.get(i1);
                      c uoc = new c(0);
                      uoc.i(i1);
                      uoc.j(str1);
                      uoc.g(str1);
                      uArrayList1.add(uoc);
                   }
                   uoc1 = new c(5);
                   uoc1.i(on1);
                   uoc1.j(mUrl);
                   uArrayList1.add(0, uoc1);
                }else {
                   uoc1 = new c(3);
                   uoc1.i(on1);
                   uoc1.j(mUrl);
                   uArrayList1.add(0, uoc1);
                }
                uob.c1.W0(uArrayList1);
                uob.c1.k0();
             }
             a.t(uob.G);
          }else {
             g = uob.y;
             if (g != null && g.o0() != null) {
                a uoa = uob.y.s0();
                a uoa1 = uob.y.o0();
                List list = uoa1.z();
                str1 = "buildPhotoList origin file is null";
                String str2 = "mWorkspaceDraft is null";
                if (uob.V8(uob.y)) {
                   if (!PatchProxy.applyVoidTwoRefs(uoa1, list, uob, n1.class, "12")) {
                      g = uob.y;
                      if (g != null && g.v() != null) {
                         List list1 = z.t(uob.y.v());
                         i2 = 0;
                         while (i2 < list.size()) {
                            File uFile = DraftFileManager.E().B(list.get(i2).getFile(), uoa1);
                            if (uFile == null) {
                               Object[] objArray2 = new Object[0];
                               a.b().w(str, str1, objArray2);
                            }else {
                               objArray1 = new Object[0];
                               a.b().w(str, "buildPhotoList origin file path: "+uFile.getAbsolutePath(), objArray1);
                               c uoc2 = new c(0);
                               uoc2.i(i2);
                               uoc2.j(uFile.getAbsolutePath());
                               uoc2.g(list1.get(i2).getAbsolutePath());
                               uob.c1.K0(uoc2);
                            }
                            i2 = i2 + 1;
                         }
                         uoc1 = new c(2);
                         uoc1.i(on1);
                         uoc1.g(this.W8());
                         uob.c1.J0(0, uoc1);
                      }else {
                         throw new IllegalArgumentException(str2);
                      }
                   }
                   a.t(objArray);
                }else {
                   String str3 = str2;
                   String str4 = str1;
                   if (!PatchProxy.applyVoidThreeRefs(uoa, uoa1, list, this, n1.class, "11")) {
                      g = uob.y;
                      if (g != null && g.v() != null) {
                         PictureCoverParam pictureCover = (uoa != null && uoa.v() != null)? uoa.v().getPictureCoverParam(): null;
                         List list2 = z.t(uob.y.v());
                         if (pictureCover == null || pictureCover.getIndexesList().isEmpty()) {
                            int i3 = 0;
                            while (i3 < list.size()) {
                               File uFile1 = DraftFileManager.E().B(list.get(i3).getFile(), uoa1);
                               if (uFile1 == null) {
                                  Object[] objArray3 = new Object[0];
                                  a.b().w(str, str4, objArray3);
                               }else {
                                  objArray4 = new Object[0];
                                  a.b().w(str, "buildPhotoList origin file path: "+uFile1.getAbsolutePath(), objArray4);
                                  uoc3 = new c(0);
                                  uoc3.i(i3);
                                  uoc3.j(uFile1.getAbsolutePath());
                                  uoc3.g(list2.get(i3).getAbsolutePath());
                                  uob.c1.K0(uoc3);
                               }
                               i3 = i3 + 1;
                            }
                         }else {
                            i2 = 0;
                            uoc3 = null;
                            while (i2 < list.size()) {
                               File uFile2 = DraftFileManager.E().B(list.get(i2).getFile(), uoa1);
                               if (uFile2 == null) {
                                  objArray4 = new Object[0];
                                  a.b().w(str, str4, objArray4);
                               }else {
                                  objArray1 = new Object[0];
                                  a.b().w(str, "buildPhotoList origin file name"+uFile2.getName(), objArray1);
                                  if (pictureCover.getIndexesList().contains(Integer.valueOf(i2))) {
                                     if (uoc3 == null) {
                                        uoc3 = new c(4);
                                        uoc3.i(i2);
                                        uoc3.j(uFile2.getAbsolutePath());
                                        uoc3.g(this.W8());
                                        i1 = 1;
                                     }
                                  }else {
                                     c uoc4 = new c(0);
                                     uoc4.i(i2);
                                     uoc4.j(uFile2.getAbsolutePath());
                                     uoc4.g(list2.get(i2).getAbsolutePath());
                                     c uoc5 = uoc3;
                                     uoc3 = uoc4;
                                  }
                                  uob.c1.K0(uoc3);
                                  uoc3 = i1;
                               }
                               i2 = i2 + 1;
                            }
                         }
                      }else {
                         throw new IllegalArgumentException(str3);
                      }
                   }
                }
             }
             if (uob.W0 == null) {
                uob.c1.K0(new c(1));
             }
          }
       }
       uob.d1.c(uob.Z.d.compose(c.c(uob.x.m(), ActivityEvent.DESTROY)).subscribe(new v2(uob), h1.b));
       uob.Z.s.add(uob);
       if (!PatchProxy.applyVoid(null, uob, n1.class, "6")) {
          uob.Y0.setOnTouchListener(new q2(uob));
       }
       if (!PatchProxy.applyVoid(null, uob, n1.class, "7")) {
          uob.X7(uob.Z.e.a.subscribe(new m1(uob, ViewConfiguration.get(uob.x).getScaledTouchSlop()), j1.b));
       }
       if (!PatchProxy.applyVoid(null, uob, n1.class, "8")) {
          uob.b1.setOnTouchListener(new r2(uob));
       }
       uob.X7(uob.x.m().subscribe(new w2(uob), i1.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n1.class, "9")) {
          return;
       }
       super.J8();
       d.a(-273232199).a20().K3(this.g1);
       return;
    }
    public void R8(){
    }
    public void Z8(Workspace$Type p0,PicturesContainer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n1.class, "30")) {
          return;
       }
       super.Z8(p0, p1);
       p1.findViewById(R.id.picture_recycler_view).addOnScrollListener(new n1$b(this));
       return;
    }
    public void d9(float p0){
       n1 on1 = n1.class;
       if (PatchProxy.isSupport(on1) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, on1, "16")) {
          return;
       }
       i oi = a.b();
       StringBuilder str = "setCoverView ratio: "+p0+"cover file is null?";
       boolean b = (this.z.get() == null)? true: false;
       Object[] objArray = new Object[0];
       oi.w("SharePhotosPreviewPresenter", str+b, objArray);
       List list = this.c1.Q0();
       if (list.size() > 0 && this.z.get() != null) {
          c uoc = list.get(0);
          uoc.g(this.W8());
          uoc.j(this.W8());
          this.c1.l0(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n1.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.a1 = m1.f(p0, 0x7f0a13cc);
       this.Z0 = m1.f(p0, 0x7f0a374c);
       this.Y0 = m1.f(p0, 0x7f0a31f3);
       this.X0 = m1.f(p0, 0x7f0a305a);
       this.b1 = m1.f(p0, 0x7f0a2ef6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n1.class, "1")) {
          return;
       }
       super.j8();
       this.Z = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.U0 = this.r8("SHARE_PRE_ENCODE_ID").intValue();
       this.V0 = this.t8("SHARE_VIDEO_CONTEXT");
       this.W0 = this.r8("SHARE_HIDE_PHOTOS_ADD_ENTRANCE").booleanValue();
       return;
    }
    public void m9(){
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       boolean b2;
       int i1;
       c0 this;
       c0 uoc0;
       int i2;
       Intent intent2;
       Intent intent3;
       m$l ol;
       int b3;
       Object[] objArray2;
       Workspace$Type objArray3;
       int objArray3;
       c0 objArray31;
       i d;
       n1 on1 = this;
       Intent intent = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(n1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, n1.class, "20")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 != 264 || (p1 != 265 || (this.getActivity() != null && this.getContext() != null))) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.b().w("SharePhotosPreviewPresenter", "on activity result", objArray);
          d.a(-273232199).a20().cancel(on1.U0);
          Serializable serializable = j0.e(intent, "album_data_list");
          if (q.f(serializable)) {
             i1.c(new RuntimeException("SharePhotosPreviewPresenter openImageSelectPage: medias is empty "+serializable));
             return;
          }else {
             c0 y = on1.y;
             if (y == null || y.o0() == null) {
                i1.c(new RuntimeException("SharePhotosPreviewPresenter openImageSelectPage: Work space draft = "+on1.y));
             }else {
                boolean b = true;
                boolean b1 = (serializable.size() == b && TextUtils.x(j0.f(intent, "photoCropId")))? true: false;
                MultiplePhotosProject multiplePhot = i.m().p().k();
                if (multiplePhot == null && !b1) {
                   i1.c(new RuntimeException("SharePhotosPreviewPresenter openImageSelectPage: MultiplePhotosProject is null"));
                   return;
                }else {
                   n1 obj = PatchProxy.applyOneRefs(serializable, on1, n1.class, "21");
                   Object[] objArray1 = null;
                   if (obj != patchProxyRe) {
                      b2 = obj.booleanValue();
                   }else {
                      List list4 = PatchProxy.apply(objArray1, on1, n1.class, "19");
                      if (list4 != patchProxyRe) {
                      }else {
                         y = on1.y;
                         list4 = (y == null)? Collections.emptyList(): Lists.h(a.c(y).z(), k1.b);
                      }
                      if (list4.size() == serializable.size()) {
                         objArray3 = 0;
                         while (true) {
                            if (objArray3 < serializable.size()) {
                               if (TextUtils.n(list4.get(objArray3), serializable.get(objArray3).path)) {
                                  objArray3 = objArray3 + 1;
                               }
                            }else {
                               b2 = true;
                            }
                         }
                      }
                      b2 = false;
                   }
                   if (b2) {
                      obj = PatchProxy.apply(objArray1, on1, n1.class, "22");
                      if (obj != patchProxyRe) {
                         b2 = obj.booleanValue();
                      }else {
                         Iterator obj1 = PatchProxy.apply(objArray1, on1, n1.class, "18");
                         if (obj1 != patchProxyRe) {
                            b2 = obj1.booleanValue();
                         }else {
                            y = on1.y;
                            if (y != null) {
                               obj1 = a.c(y).z().iterator();
                               while (true) {
                                  if (obj1.hasNext()) {
                                     if (TextUtils.x(obj1.next().getAtlasTemplate().getTemplateId())) {
                                        continue ;
                                     }
                                  }else {
                                     obj1 = a.o(on1.y).z().iterator();
                                     while (true) {
                                        if (obj1.hasNext()) {
                                           if (TextUtils.x(obj1.next().getTemplateId())) {
                                              continue ;
                                           }
                                        }
                                     }
                                  }
                                  b2 = true;
                               }
                            }
                            b2 = false;
                         }
                         if (!b2 || this.getActivity() == null) {
                            b2 = false;
                         }else if(i.h()){
                            obj1 = i.m().v().iterator();
                            while (true) {
                               if (obj1.hasNext()) {
                                  if (obj1.next() instanceof b) {
                                     obj = 1;
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  obj = null;
                               }
                               if (!obj) {
                               label_01d3 :
                                  b2 = true;
                               }
                            }
                         }
                         on1.Z.a(3);
                         goto label_01d3 ;
                      }
                      if (b2) {
                         return;
                      }
                   }
                   Intent intent1 = d.a(0x14d6f666).zM(this.getActivity());
                   y = on1.y;
                   if (PatchProxy.applyVoidTwoRefs(y, serializable, objArray1, n1.class, "23") || (y == null || (y.o0() != null && (y.o0().v() != null && pb.e.f(y))))) {
                      String albumId1 = y.o0().v().getAlbumId();
                      b3 = 0;
                      this = null;
                      while (b3 < serializable.size()) {
                         if (albumId1.equals(serializable.get(b3).getPath())) {
                            this = 1;
                         }
                         b3 = b3 + 1;
                      }
                      if (!this && (y.d1().F().b != null && y.d1().F().b.w != null)) {
                         y.d1().F().b.w.c = "";
                      }
                   }
                label_0266 :
                   i1 = on1.y.p();
                   this = on1.y;
                   if (PatchProxy.isSupport(n1.class)) {
                      uoc0 = this;
                      i2 = i1;
                      intent2 = intent1;
                      if (PatchProxy.applyVoidFourRefs(serializable, this, Boolean.valueOf(b1), intent1, this, n1.class, "25")) {
                      label_0291 :
                         intent3 = intent2;
                      label_0293 :
                         ol = null;
                      label_0533 :
                         obj = on1.V0;
                         if (!PatchProxy.applyVoidTwoRefs(obj, serializable, on1, n1.class, "24")) {
                            obj.A1(serializable.size());
                            obj.b1(true);
                            a.b(obj.F(), serializable);
                            if (obj.F() != null && obj.F().b != null) {
                               obj.F().b.e = ol;
                            }
                         }
                         intent.putExtra("SOURCE", "share_photos");
                         intent.putExtra("photo_task_id", on1.y.v().getTaskId());
                         b3 = (serializable.size() == 1)? true: false;
                         intent.putExtra("single_picture", b3);
                         i.m().s().Z(on1.y).p().o(multiplePhot);
                         objArray2 = new Object[0];
                         a.b().w("SharePhotosPreviewPresenter", "start editor activity, selected media count = "+serializable.size()+", previous media count = "+i2, objArray2);
                         intent3.fillIn(intent, 2);
                         intent3.setFlags(0x4000000);
                         intent3.putExtra("INTENT_SET_POST_SESSION_ENTRY", true);
                         on1.x.startActivityForResult(intent3, 263);
                         on1.x.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01010f);
                         return;
                      }
                   }else {
                      uoc0 = this;
                      i2 = i1;
                      intent2 = intent1;
                   }
                   objArray = new Object[i];
                   a.b().w("SharePhotosPreviewPresenter", "change draft assets", objArray);
                   uoc0.u().q(b);
                   Workspace$Type type = uoc0.a1();
                   objArray3 = Workspace$Type.SINGLE_PICTURE;
                   if (type == objArray3 && serializable.size() > b) {
                      uoc0.k().t(Workspace$Type.ATLAS);
                      objArray2 = new Object[i];
                      a.b().w("SharePhotosPreviewPresenter", "change draft assets, switch to atlas", objArray2);
                   }else if(type == Workspace$Type.ATLAS && serializable.size() == b){
                      uoc0.k().t(objArray3);
                      objArray2 = new Object[i];
                      a.b().w("SharePhotosPreviewPresenter", "change draft assets, switch to single picture", objArray2);
                   }else {
                      a objArray32 = a.c(uoc0);
                      if (serializable.size() == objArray32.z().size()) {
                         b3 = 0;
                         while (true) {
                            if (b3 < objArray32.z().size()) {
                               String albumId = objArray32.y(b3).getAlbumId();
                               if (!TextUtils.x(albumId) && albumId.equals(serializable.get(b3).path)) {
                                  b3 = b3 + 1;
                               }
                            }else {
                               objArray3 = false;
                            label_0337 :
                               List Object[] objArray4 = new Object[i];
                               a.b().w("SharePhotosPreviewPresenter", "change draft assets, is photos changed = "+objArray3+", is single picture = "+b1, objArray4);
                               if (!objArray3) {
                                  if (type == Workspace$Type.ATLAS) {
                                     objArray31 = uoc0;
                                     a.p(objArray31, "workspaceDraft");
                                     ArrayList uArrayList = new ArrayList();
                                     List list = a.q(objArray31).z();
                                     a.o(list, "getStickerDraft\(workspaceDraft\).messages");
                                     List list1 = a.r(objArray31).z();
                                     a.o(list1, "getTextDraft\(workspaceDraft\).messages");
                                     objArray4 = a.c(objArray31).z();
                                     a.o(objArray4, "getAssetDraft\(workspaceDraft\).messages");
                                     Iterator objArray41 = objArray4.iterator();
                                     while (objArray41.hasNext()) {
                                        Asset uAsset = objArray41.next();
                                        a.o(uAsset, "it");
                                        List list2 = d.c(objArray31, uAsset.getIdentifier(), i, b);
                                        List list3 = d.c(objArray31, uAsset.getIdentifier(), b, i);
                                        ArrayList uArrayList1 = new ArrayList();
                                        ArrayList uArrayList2 = new ArrayList();
                                        a.o(list2, "stickerList");
                                        Iterator iterator = list2.iterator();
                                        while (iterator.hasNext()) {
                                           uArrayList1.add(Integer.valueOf(CollectionsKt___CollectionsKt.M2(list, iterator.next())));
                                        }
                                        a.o(list3, "textList");
                                        Iterator iterator1 = list3.iterator();
                                        while (iterator1.hasNext()) {
                                           uArrayList2.add(Integer.valueOf(CollectionsKt___CollectionsKt.M2(list1, iterator1.next())));
                                        }
                                        uArrayList.add(new AssetSubAssetAssociation(uArrayList1, uArrayList2));
                                        i = false;
                                        b = true;
                                     }
                                     intent3 = intent2;
                                     intent3.putParcelableArrayListExtra("INTENT_ASSET_SUB_ASSET_ASSOCIATION", uArrayList);
                                     on1.q9(a.c(objArray31));
                                     goto label_0293 ;
                                  }else {
                                     goto label_0291 ;
                                  }
                               }else {
                                  objArray31 = uoc0;
                                  intent3 = intent2;
                                  on1.q9(a.c(objArray31));
                                  on1.q9(a.f(objArray31));
                                  on1.q9(a.q(objArray31));
                                  on1.q9(a.r(objArray31));
                                  on1.q9(a.i(objArray31));
                                  on1.q9(a.j(objArray31));
                                  if (PatchProxy.applyVoidOneRefs(objArray31, on1, n1.class, "28")) {
                                  label_0494 :
                                     ol = null;
                                  }else {
                                     on1.q9(a.o(objArray31));
                                     if (objArray31.d1().F() != null && objArray31.d1().F().d != null) {
                                        VideoContext videoContext = objArray31.d1();
                                        Objects.requireNonNull(videoContext);
                                        ol = null;
                                        if (!PatchProxy.applyVoid(ol, videoContext, VideoContext.class, "218")) {
                                           VideoContext.b();
                                           videoContext.X();
                                           d = videoContext.a.d;
                                           if (d != null) {
                                              d.P = ol;
                                           }
                                        }
                                     }else {
                                        goto label_0494 ;
                                     }
                                  }
                                  if (!PatchProxy.applyVoidOneRefs(objArray31, on1, n1.class, "27")) {
                                     on1.q9(objArray31.y0());
                                     if (objArray31.d1().F() != null && objArray31.d1().F().d != null) {
                                        objArray31.d1().F().d.w = ol;
                                        objArray31.d1().F().d.z = ol;
                                     }
                                  }
                                  if (b1) {
                                     a uoa = a.c(objArray31);
                                     uoa.c0();
                                     b0 objArray42 = BitmapUtil.E(serializable.get(0).path);
                                     Asset$b uob = uoa.b();
                                     uob.w(Asset$Type.PICTURE);
                                     uob.k(uoa.Q(serializable.get(0).path));
                                     uob.d(serializable.get(0).path);
                                     uob.p((double)objArray42.a);
                                     uob.o((double)objArray42.b);
                                     uoa.f();
                                     objArray4 = new Object[0];
                                     a.b().w("SharePhotosPreviewPresenter", "changeDraftAssets @PhotosAtlasPlayer append asset", objArray4);
                                  }
                                  objArray31.u().q(true);
                                  goto label_0533 ;
                               }
                            }
                         }
                      }
                   }
                   objArray3 = true;
                   goto label_0337 ;
                }
             }
          }
       }
       return;
    }
    public final void q9(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n1.class, "26")) {
          return;
       }
       p0.c0();
       p0.d();
       p0.f();
       return;
    }
}
