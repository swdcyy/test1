package com.kuaishou.post.story.publish.e;
import erd.o;
import com.kuaishou.post.story.publish.g;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.List;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Objects;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import qr4.i;
import qr4.e$h;
import qr4.m$k0;
import java.util.Collection;
import ekd.q;
import com.kuaishou.post.story.publish.b;
import ekd.q$a;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;
import lq.i;
import lq.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import im8.f;
import java.lang.Integer;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.yxcorp.gifshow.upload.StoryUploadParam$b;
import qr4.m$g0;
import com.yxcorp.gifshow.upload.StoryUploadParam;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.publish.i;
import brd.a0;
import java.lang.Boolean;
import com.kuaishou.post.story.publish.StoryEncodeRequest$a;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import java.io.File;
import qkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import com.kuaishou.post.story.publish.StoryEncodeRequest;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.activity.preview.f;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import wba.d0;
import java.util.Collections;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import wba.f0;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.FriendVisiableInfo;
import wba.f0$a;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import java.lang.Enum;
import com.kuaishou.edit.draft.Privacy;
import com.kuaishou.post.story.publish.StoryUploadRequest$a;
import com.kuaishou.post.story.publish.StoryUploadRequest;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.encode.EncodeRequest;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kwai.kcube.TabIdentifier;
import f6c.a;
import elb.x;
import czb.b;
import f6c.c;
import oq4.i;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import oq4.h;

public final class e implements o	// class@000b83
{
    public final g b;
    public final VideoContext c;
    public final List d;
    public final int e;

    public void e(g p0,VideoContext p1,List p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       StoryUploadParam$b a;
       Object[] objArray;
       a0 uoa0;
       StoryEncodeRequest$a uoa;
       PatchProxyResult patchProxyRe1;
       StoryUploadParam$b uob;
       g og;
       a uoa2;
       PhotoVisibility fRIENDS;
       String str2;
       e uoe1;
       String str3;
       e uoe = this;
       e b = uoe.b;
       e c = uoe.c;
       e d = uoe.d;
       e e = uoe.e;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       Objects.requireNonNull(b);
       boolean i = 0;
       double d1 = 100.00f;
       boolean i1 = (int)(videoEditorP.trackAssets(i).volume() * d1);
       int i2 = (videoEditorP.audioAssets().length() > 0)? (int)(videoEditorP.audioAssets(i).volume() * d1): 0;
       boolean b1 = true;
       boolean b2 = (i1 > 0 || i2 > 0)? true: false;
       c.s0(b2);
       c.F().d.g = i1;
       c.F().d.f = i2;
       c.F().b.h0 = b1;
       c.g(b1);
       if (!q.f(d)) {
          c.v0(a.a.q(q.g(d, b.a)));
       }
       c.o0(i.m().k().c());
       String str = "6";
       int i3 = 2;
       if (!PatchProxy.applyVoidOneRefs(c, b, g.class, str)) {
          e l = b.A.t.l;
          if (l != null && (l.i() && b.t.get().intValue() == b1)) {
             c.F().b.i0 = "-2000";
             c.F().b.e1 = b1;
             c.F().b.h1 = b.A.t.l.c().b();
          }else if(b.A.t.k.w() == i3){
             c.F().b.i0 = "-1000";
          }else {
             c.F().b.i0 = b.A.t.k.n();
          }
       }
       a = new StoryUploadParam$b().a;
       a.mStoryMode = c.F().b.J.a;
       g a1 = b.A;
       g y = b.y;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       int i4 = 5;
       int i5 = 4;
       int i6 = 7;
       StoryEncodeRequest$a obj = null;
       if (PatchProxy.isSupport(oi)) {
          objArray = new Object[i6];
          objArray[i] = a1;
          objArray[b1] = Integer.valueOf(e);
          objArray[2] = videoEditorP;
          objArray[3] = c;
          objArray[i5] = d;
          objArray[i4] = a;
          objArray[6] = y;
          uoa0 = PatchProxy.apply(objArray, obj, oi, "8");
          if (uoa0 != patchProxyRe) {
          label_03ae :
             return uoa0;
          }
       }
       if (PatchProxy.isSupport(oi)) {
          objArray = new Object[]{a1,Integer.valueOf(e),videoEditorP,c,Boolean.TRUE,d,y,obj};
          uoa = PatchProxy.apply(objArray, obj, oi, str);
          if (uoa != patchProxyRe) {
             patchProxyRe1 = patchProxyRe;
             uob = a;
             og = a1;
          label_025c :
             StoryEncodeRequest storyEncodeR = uoa.G();
             StoryUploadRequest$a uoa1 = PatchProxy.applyFourRefs(og, storyEncodeR, c, uob, null, i.class, "7");
             if (uoa1 != patchProxyRe1) {
             }else {
                b uob1 = og.y.Q0();
                PhotoVisibility photoVisibil = PatchProxy.applyOneRefs(uob1, null, f0.class, "4");
                if (photoVisibil != patchProxyRe1) {
                }else if(uob1 == null){
                   photoVisibil = PhotoVisibility.PUBLIC;
                }else {
                   Publish publish = uob1.v();
                   if (publish == null) {
                      photoVisibil = PhotoVisibility.PUBLIC;
                   }else if(publish.getFriendVisiableInfo() == null || q.f(publish.getFriendVisiableInfo().getUserListList())){
                      photoVisibil = f0.b(publish.getPrivacy());
                   }else {
                      i1 = f0$a.b[publish.getFriendVisiableInfo().getType().ordinal()];
                      if (i1 != 1) {
                         fRIENDS = (i1 != 2 && i1 != 3)? PhotoVisibility.FRIENDS: PhotoVisibility.PART_VISIBLE;
                      }else {
                         fRIENDS = PhotoVisibility.PART_INVISIBLE;
                      }
                      photoVisibil = fRIENDS;
                   }
                }
                uoa1 = StoryUploadRequest.newBuilder();
                uoa1.d = og;
                i = (og.t.c.intValue() != 2)? true: false;
                uoa1.l(i);
                uoa1.X(PhotoVisibility.PUBLIC);
                uoa1.U(QCurrentUser.me().getId());
                uoa1.b(QCurrentUser.me().getName());
                uoa1.j(storyEncodeR.mOutputPath);
                uoa1.I(storyEncodeR.mSessionId);
                uoa1.i(c.p());
                uoa1.W((long)(EditorSdk2UtilsV2.getDisplayDuration(storyEncodeR.mVideoEncodeSDKInfo.mProject) * 0x408f400000000000));
                uoa1.O(true);
                uoa1.o(storyEncodeR.isPipelineSupported());
                uoa1.V(c);
                uoa1.a.mStoryUploadParam = uob;
                uoa1.X(photoVisibil);
                uoa1.x(a.a(photoVisibil));
                uoa1.S(a.e());
                uoa1.C(a.d());
                x.b(uoa1);
                b.c.a(uoa1);
                d.a(-1931765893).TG(uoa1);
             }
             uoa2 = d.a(-273232199).a20();
             a t = og.t;
             uoa0 = (t.b == null && t.c.intValue() != 2)? a0.B(""): a0.y(new i(videoEditorP, uoa2)).T(d.c);
             uoa0 = uoa0.G(d.a).C(new h(uoa1, storyEncodeR, uoa2));
             goto label_03ae ;
          }
       }else {
          str2 = 3;
       }
       uoa2 = d.a(-273232199).a20();
       e b3 = a1.t.b;
       String str1 = (b3 == null)? ".jpg": ".mp4";
       File uFile = b.X(uoa2.a4(), str1);
       if (!uFile.getParentFile().exists()) {
          uFile.getParentFile().mkdirs();
       }
       str2 = c.Q();
       if (TextUtils.x(str2)) {
          str2 = u1.f();
       }
       uob = a;
       c.T0(b.c().getId());
       obj = StoryEncodeRequest.newBuilder();
       obj.T = b3;
       obj.u(str2);
       obj.r(uFile.getAbsolutePath());
       if (PatchProxy.isSupport(oi)) {
          uoe1 = b3;
          patchProxyRe1 = patchProxyRe;
          og = a1;
          str3 = PatchProxy.applyThreeRefs(Integer.valueOf(b3), Integer.valueOf(e), c, null, i.class, "1");
          if (str3 != patchProxyRe1) {
          label_020f :
             obj.e(str3);
             obj.y(new VideoEncodeSDKInfo(videoEditorP, d));
             obj.B(d0.l(videoEditorP));
             obj.j(d0.j(videoEditorP));
             uoa = 2;
             i1 = (og.t.c.intValue() != uoa)? true: false;
             obj.k(i1);
             obj.n(false);
             i1 = (uoe1 == 1 && e != uoa)? true: false;
             obj.o(i1);
             List list = (TextUtils.x(y))? null: Collections.singletonList(y);
             obj.g(list);
             obj.f(true);
             uoa = obj;
             goto label_025c ;
          }
       }else {
          uoe1 = b3;
          patchProxyRe1 = patchProxyRe;
          og = a1;
       }
       Workspace$Source iMPORT = Workspace$Source.IMPORT;
       Workspace$Type sINGLE_PICTU = (uoe1 == null)? Workspace$Type.SINGLE_PICTURE: Workspace$Type.VIDEO;
       str3 = f.g(sINGLE_PICTU, iMPORT, c);
       goto label_020f ;
    }
}
