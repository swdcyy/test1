package com.yxcorp.gifshow.v3.previewer.f1;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import mq.d;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r1c.h;
import com.kwai.robust.PatchProxyResult;
import r1c.x$b;
import ekd.k1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.s;
import lq.i;
import java.util.Objects;
import faa.a;
import q87.c;
import brd.t;
import r1c.a0$b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import t45.d;
import brd.z;
import lwc.r2;
import erd.o;
import lwc.o2;
import lwc.j2;
import erd.g;
import crd.b;
import r1c.b0$b;
import y26.b$a;
import y26.b;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import w26.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import w26.c;
import o56.c;
import o56.a;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import android.content.Intent;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$From;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import bba.b;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Collection;
import ekd.q;
import lnc.a1;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Workspace;
import yaa.c;
import prc.d;
import com.kuaishou.android.post.IntArg;
import com.kuaishou.android.post.PostPageArg;
import xnc.a;
import lwc.a;
import java.lang.Number;
import android.os.Parcelable;
import android.net.Uri;
import android.app.Application;
import android.content.ContentResolver;
import xkd.b;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.kuaishou.android.post.SerialArg;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import com.kuaishou.android.post.BoolArg;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.upload.UploadRequest;
import java.lang.System;
import com.kuaishou.android.post.StrArg;
import k2b.u1;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.ArrayList;
import java.io.File;
import r26.a;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import f0c.w0;
import com.yxcorp.gifshow.encode.EncodeRequest;
import r26.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import wwc.n0;
import kuaishou.perf.page.impl.d;
import qvb.s;
import android.app.Activity;
import com.yxcorp.gifshow.v3.previewer.w0;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.previewer.f1$a;
import t36.f$a;

public class f1 implements GraphTaskExecuteManager$b	// class@00159b
{
    public final boolean a;
    public final VideoEditPreviewV3Fragment b;

    public void f1(VideoEditPreviewV3Fragment p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       d.c(this);
    }
    public void b(){
       d.d(this);
    }
    public void c(GraphTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "3")) {
          return;
       }
       this.b.H1.h(this);
       this.b.H1.e();
       this.b.Ih();
       return;
    }
    public void d(){
       f1 b;
       Intent intent;
       boolean b2;
       b uob4;
       String str3;
       Object[] objArray2;
       boolean intExtra;
       Object[] objArray3;
       QCurrentUser qCurrentUser;
       Serializable serializable;
       Serializable serializable1;
       Object obj4;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, obj, f1.class, str)) {
          return;
       }
       x$b uob = obj.b.H1.b("StartGraphMTNSTask");
       if (uob != null) {
          s.f(7, 445, k1.t(uob.d()), new ClientContent$ContentPackage(), "success", null, null);
       }
       obj.b.H1.h(obj);
       int i = -273232199;
       String str1 = "nextOnTaskGraph error graph result is null";
       int i1 = 0;
       if (i.m().M() && obj.a == null) {
          b = obj.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, VideoEditPreviewV3Fragment.class, "59")) {
             objArray = new Object[i1];
             a.D().w("EditCostVideoEditPreviewV3Fragment", "finishForDataWhenTaskDone\(\) called", objArray);
             t ot = t.just(b.M);
             a0$b uob1 = b.H1.b("VideoEncodeRequestBuildMTNSTask");
             if (uob1 == null) {
                b.Ih();
                b.l1 = i1;
                i1.c(new RuntimeException(str1));
             }else {
                a uoa = d.a(i).a20();
                ot.observeOn(d.c).map(new r2(b, uoa)).observeOn(d.a).subscribe(new o2(b, uoa, uob1.a()), new j2(b));
             }
          }
          return;
       }else {
          b0$b uob2 = obj.b.H1.b("VideoShareParamBuildMTNSTask");
          if (uob2 == null) {
             i1.c(new RuntimeException(str1));
             return;
          }else {
             b$a uoa1 = uob2.a();
             String str2 = "video_file_upload_id";
             int i2 = 0x27e26f6e;
             int i3 = -1;
             int i4 = 1;
             if (obj.a != null) {
                b = obj.b;
                b uob3 = uoa1.g();
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(uob3, b, VideoEditPreviewV3Fragment.class, "65")) {
                   objArray = new Object[i1];
                   a.D().w("EditCostVideoEditPreviewV3Fragment", "editorDirectlyPublish", objArray);
                   uob3.setArgs(i.g());
                   int i5 = d.a(i2).lS(b.getActivity(), uob3, false, b.M, null);
                   i.m().Q("POST_WORK_INFO_ID", Integer.valueOf(i5));
                   if (a.a().c() && i5 == i3) {
                      Toast.makeText(b.getContext(), "直接发布作品失败", i1).show();
                   }
                   intent = new Intent();
                   intent.putExtra(str2, i5);
                   if (i.h()) {
                      intent.putExtra("conversionTaskList", i.m().z("conversionTaskList"));
                   }
                   b.Jh(i4, intent, i4);
                }
                obj.b.Ih();
                return;
             }else {
                f1 b1 = obj.b;
                Objects.requireNonNull(b1);
                Object[] obj1 = PatchProxy.apply(objArray, b1, VideoEditPreviewV3Fragment.class, "56");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                }else if(b1.M.B0() == Workspace$From.NEW_USER_WIDGET && q.f(b1.M.Q0().o())){
                   b2 = true;
                }else {
                   b2 = false;
                }
                if (b2) {
                   uoa1.f(a1.p(R.string.arg_RES_7f1037ec), i1);
                }
                if (obj.b.getActivity() != null && d.a(obj.b.M.v(), obj.b.M.J0())) {
                   uoa1.f(a1.p(R.string.arg_RES_7f100b17), i1);
                }
                if (i.g().getUploadPage().get(Integer.valueOf(i1)).intValue() == 2) {
                   b1 = obj.b;
                   uob4 = uoa1.g();
                   Objects.requireNonNull(b1);
                   if (!PatchProxy.applyVoidOneRefs(uob4, b1, VideoEditPreviewV3Fragment.class, "66")) {
                      Object[] objArray1 = new Object[i1];
                      a.D().w("EditCostVideoEditPreviewV3Fragment", "shareDirectlyPublish", objArray1);
                      Intent intent1 = d.a(i2).Z00(uob4);
                      if (intent1 != null) {
                         a.f(b1.Qh(), intent1);
                         a uoa2 = a.class;
                         String obj2 = PatchProxy.applyOneRefs(intent1, objArray, uoa2, "1");
                         if (obj2 != patchProxyRe) {
                            i3 = obj2.intValue();
                            str3 = str2;
                         }else {
                            obj2 = b.a(a.a().a().getContentResolver(), intent1.getParcelableExtra("android.intent.extra.STREAM"));
                            String str4 = "DirectlyUpload";
                            if (TextUtils.x(obj2)) {
                               objArray = new Object[i1];
                               a.D().A(str4, "the path of file to upload is null", objArray);
                               str3 = str2;
                            label_0266 :
                               b uob5 = -1;
                            }else {
                               RickonWholeUploadParams obj3 = PatchProxy.applyOneRefs(intent1, objArray, uoa2, str);
                               if (obj3 != patchProxyRe) {
                                  str3 = str2;
                               }else {
                                  intExtra = i.g().getUploadStrictMode().get(Integer.valueOf(i1)).intValue();
                                  obj3 = i.g().getUploadParamArg().get();
                                  i2 = i.g().getUploadMockFeedOption().get(Integer.valueOf(i1)).intValue();
                                  boolean b3 = i.g().getUploadNoSystemNotification().get(Boolean.FALSE).booleanValue();
                                  obj1 = new Object[i1];
                                  a.D().w(str4, "getUploadBuilderByIntent\(\) params="+obj3+" mockFeedOption="+i2+" uploadLimit="+intExtra+" noSystemNote="+b3, obj1);
                                  if (obj3 != null) {
                                     RickonWholeUploadParams mServerInfoL = obj3.mServerInfoList;
                                     if (mServerInfoL != null && (!mServerInfoL.isEmpty() && (!TextUtils.x(obj3.mTaskId) && !TextUtils.x(obj3.mUploadToken)))) {
                                        qCurrentUser = 1;
                                     label_0313 :
                                        if (intExtra == 1 && !qCurrentUser) {
                                           objArray = new Object[i1];
                                           a.D().A(str4, "the params of whole upload is invalid", objArray);
                                           str3 = str2;
                                           obj3 = null;
                                        }else {
                                           qCurrentUser = QCurrentUser.me();
                                           UploadRequest$a uoa5 = UploadRequest.newBuilder();
                                           uoa5.U(qCurrentUser.getId());
                                           uoa5.b(qCurrentUser.getName());
                                           str3 = str2;
                                           uoa5.E(System.currentTimeMillis());
                                           uoa5.K(i.g().getThirdPartyPubInfo().get());
                                           uoa5.J(i.g().getThirdPartyAppPackage().get());
                                           uoa5.H(obj3);
                                           uoa5.i(intent1.getLongExtra("encode_config_id", 0));
                                           uoa5.w(i2);
                                           uoa5.A(b3);
                                           uoa5.R(intExtra);
                                           b3 = (i.h() && i.m().B())? true: false;
                                           uoa5.G(b3);
                                           b3 = 1;
                                           if (intExtra == b3) {
                                              uoa5.I(obj3.mTaskId);
                                           }else {
                                              uoa5.I(u1.f());
                                           }
                                           if (intExtra != b3) {
                                              b3 = 2;
                                              if (intExtra != b3) {
                                                 intExtra = true;
                                              label_03ad :
                                                 uoa5.o(intExtra);
                                                 intExtra = intent1.getIntExtra("camera_page_source", 0);
                                                 if (intExtra == b3) {
                                                    uoa5.Q(IUploadRequest$UploadPostType.INTOWN);
                                                 }else if(intExtra == 3){
                                                    uoa5.Q(IUploadRequest$UploadPostType.SHOP);
                                                 }else {
                                                    uoa5.Q(IUploadRequest$UploadPostType.NORMAL);
                                                 }
                                                 try{
                                                    serializable = SerializableHook.getSerializableExtra(intent1, "magic_emoji");
                                                    try{
                                                       serializable1 = SerializableHook.getSerializableExtra(intent1, "music");
                                                       try{
                                                          obj4 = i.g().getPublishLocation().get();
                                                          try{
                                                             Object[] objArray5 = new Object[0];
                                                             a.D().w(str4, "PostArg getPublishLocation\(\) location="+obj4, objArray5);
                                                          label_041a :
                                                             if (obj4 != null) {
                                                                uoa5.t(obj4.mId);
                                                             }
                                                             if (serializable1 != null) {
                                                                uoa5.y(serializable1);
                                                             }
                                                             if (serializable != null) {
                                                                ArrayList uArrayList = new ArrayList();
                                                                uArrayList.add(serializable);
                                                                uoa5.u(uArrayList);
                                                             }
                                                             String stringExtra = intent1.getStringExtra("cover_path");
                                                             if (!TextUtils.x(stringExtra)) {
                                                                uoa5.f(new File(stringExtra));
                                                             }
                                                             stringExtra = "share_video_duration";
                                                             if (intent1.hasExtra(stringExtra)) {
                                                                uoa5.W(intent1.getLongExtra(stringExtra, -1));
                                                             }
                                                             obj3 = uoa5;
                                                          }catch(java.lang.Exception e0){
                                                          }
                                                          PostUtils.D(str4, "get magicFace", e0);
                                                          goto label_041a ;
                                                       }catch(java.lang.Exception e0){
                                                       }
                                                       obj4 = null;
                                                       goto label_0415 ;
                                                    }catch(java.lang.Exception e0){
                                                    }
                                                    serializable1 = null;
                                                    goto label_0414 ;
                                                 }catch(java.lang.Exception e0){
                                                    serializable = null;
                                                    goto label_0413 ;
                                                 }
                                              }
                                           }else {
                                              serializable = 2;
                                           }
                                           intExtra = false;
                                           goto label_03ad ;
                                        }
                                     }
                                  }
                                  qCurrentUser = null;
                                  goto label_0313 ;
                               }
                               if (obj3 == null) {
                                  goto label_0266 ;
                               }else {
                                  obj3.q(true);
                                  obj3.j(obj2);
                                  intExtra = intent1.getIntExtra("pre_encode_id", -1);
                                  if (intExtra < 0) {
                                     objArray3 = new Object[0];
                                     a.D().A(str4, "has no PRE_ENCODE_ID, not start encode ? ", objArray3);
                                  }else {
                                     a uoa3 = d.a(-273232199).a20();
                                     a uoa4 = uoa3.L0(intExtra);
                                     if (uoa4 != null) {
                                        uoa4.setIsPublished(true);
                                     }
                                     if (uoa4 != null && (uoa4.getStatus() == PostStatus.ENCODE_PENDING || uoa4.getStatus() == PostStatus.ENCODING)) {
                                        uoa3.l3(uoa4.getId(), false);
                                        if (!uoa3.X3(obj3.a(), uoa4.getId())) {
                                           objArray3 = new Object[false];
                                           a.D().A(str4, "execute upload task fail id="+uoa4.getId(), objArray3);
                                        }else {
                                           i3 = uoa4.getId();
                                        }
                                     }else if(!new File(obj2).exists()){
                                        objArray2 = new Object[0];
                                        a.D().A(str4, "encoded file is lost, check if there exist delete logic ? ", objArray2);
                                     }else {
                                        intExtra = uoa3.q0(new w0(null, obj3.a()));
                                        if (intExtra < 0) {
                                           Object[] objArray4 = new Object[0];
                                           a.D().A(str4, "add upload task fail id="+intExtra, objArray4);
                                        }else {
                                           i3 = intExtra;
                                        }
                                     }
                                  }
                               }
                            }
                            i3 = -1;
                         }
                         Intent intent2 = new Intent();
                         intent2.putExtra("video_cover_file_path", uob4.f);
                         intent2.putExtra("video_file_path", uob4.f);
                         intent2.putExtra(str3, i3);
                         b1.M.j1(Phase.POST);
                         objArray2 = new Object[0];
                         a.D().w("EditCostVideoEditPreviewV3Fragment", "Publish INTOWN video, finish PostSession.", objArray2);
                         i oi = i.m();
                         oi.b0(0);
                         oi.d0(1);
                         b1.Jh(1, intent2, 0);
                      }
                   }
                   obj.b.Ih();
                   return;
                }else {
                   long l = System.currentTimeMillis();
                   b = obj.b;
                   uob4 = uoa1.g();
                   Objects.requireNonNull(b);
                   n0 on0 = n0.class;
                   if (!PatchProxy.applyVoidOneRefs(uob4, b, VideoEditPreviewV3Fragment.class, "67")) {
                      Object[] objArray7 = new Object[0];
                      a.D().w("EditCost", "publish start......", objArray7);
                      VideoEditPreviewV3Fragment w0 = b.W0;
                      Objects.requireNonNull(w0);
                      if (!PatchProxy.applyVoid(null, w0, on0, "10")) {
                         d.d("postEditNextMonitor").h("coverToDraft");
                         d.d("postEditNextMonitor").g("draftToFinish");
                      }
                      s.b().c(1, uob4, b.getActivity(), 529, null);
                      b.getActivity().overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
                      VideoEditPreviewV3Fragment g = b.G;
                      if (g != null) {
                         g.releaseThumbnailGenerator(w0.b);
                         Object[] objArray8 = new Object[0];
                         a.D().w("EditCost", "releaseThumbnailGenerator", objArray8);
                      }
                      VideoEditPreviewV3Fragment w01 = b.W0;
                      Objects.requireNonNull(w01);
                      if (!PatchProxy.applyVoid(null, w01, on0, "13")) {
                         d.d("postEditNextMonitor").h("draftToFinish");
                         d.d("postEditNextMonitor").g("finishToPause");
                      }
                      objArray3 = new Object[0];
                      a.D().w("EditCost", "publish end......", objArray3);
                   }
                   objArray2 = new Object[0];
                   a.D().w("EditCostVideoEditPreviewV3Fragment", "onRunSuccess: publish cost="+k1.t(l), objArray2);
                   obj.b.Ih();
                   long l1 = System.currentTimeMillis();
                   if (PostExperimentUtils.m()) {
                      obj.b.H1.c();
                   }else {
                      obj.b.H1.e();
                   }
                   objArray2 = new Object[0];
                   a.D().w("EditCostVideoEditPreviewV3Fragment", "onRunSuccess: reUse="+k1.t(l1), objArray2);
                   Object[] objArray6 = new Object[0];
                   a.D().w("EditCostVideoEditPreviewV3Fragment", "nextstep cost nextOnTaskGraph end", objArray6);
                   return;
                }
             }
          }
       }
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "nextOnTaskGraph onRunProcess isDirectlyPublish:"+this.a+",taskKey:"+p0, objArray);
       this.b.F1.o0().s0(new f1$a(this, p0));
       return;
    }
}
