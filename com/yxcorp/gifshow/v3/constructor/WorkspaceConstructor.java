package com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import crd.a;
import android.content.Intent;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$a;
import java.lang.Enum;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import qoc.g;
import qoc.e;
import qoc.a0;
import qoc.s;
import qoc.i0;
import qoc.k;
import qoc.y;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import java.lang.System;
import vl8.c;
import com.yxcorp.gifshow.v3.constructor.m;
import crd.b;
import ok.h;
import lnc.b9;
import ekd.j0;
import com.yxcorp.gifshow.v3.f;
import android.util.Pair;
import qba.d;
import com.yxcorp.gifshow.activity.preview.f;
import qoc.g0;
import qoc.w;
import qoc.e0;
import qoc.q;
import qoc.a;
import qoc.c;
import com.yxcorp.gifshow.v3.constructor.k;
import com.yxcorp.gifshow.v3.constructor.l;
import qoc.m;
import qoc.c0;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import k2b.u1;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.edit.draft.Workspace$From;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import qr4.i;
import qr4.m$k0;
import com.kuaishou.edit.draft.EditConfig;
import com.kuaishou.edit.draft.EditConfig$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Workspace$Source;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import com.yxcorp.gifshow.v3.v;
import java.util.Collection;
import com.yxcorp.gifshow.v3.constructor.ConstructorException;
import java.lang.Integer;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class WorkspaceConstructor	// class@000d3e
{
    public g[] a;
    public PublishSubject b;
    public PublishSubject c;
    public b d;
    public a e;

    public void WorkspaceConstructor(){
       super();
       this.a = null;
       this.b = PublishSubject.g();
       this.c = PublishSubject.g();
       this.e = new a();
    }
    public static WorkspaceConstructor a(Intent p0,c p1,Object p2){
       int i3;
       WorkspaceConstructor workspaceCon;
       Object[] objArray;
       Object[] objArray1;
       WorkspaceConstructor a;
       int i8;
       long l1;
       Object obj = p0;
       object obj1 = p1;
       g[] obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, null, WorkspaceConstructor.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       Workspace$Type type = p1.a1();
       int i = 6;
       int i1 = 3;
       switch (WorkspaceConstructor$a.a[type.ordinal()]){
           case 1:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 2:
             int i2 = 1;
             i3 = 0;
             workspaceCon = new WorkspaceConstructor();
             if (!PatchProxy.applyVoidTwoRefs(obj, obj1, workspaceCon, WorkspaceConstructor.class, "2")) {
                workspaceCon.d = b9.c(workspaceCon.d, new m(workspaceCon, obj1));
                int i4 = j0.b(obj, "VIDEO_WIDTH", i3);
                int i5 = j0.b(obj, "VIDEO_HEIGHT", i3);
                int i6 = j0.b(obj, "VIDEO_CAPTURE_ROTATION", i3);
                WorkspaceConstructor$b uob = new WorkspaceConstructor$b(workspaceCon);
                uob.b = obj1;
                uob.c = obj;
                int i7 = (i6 + 360) % 360;
                Pair pair = (i7 == 90 || i7 == 270)? 1: null;
                uob.d = (pair)? WorkspaceConstructor.c(i5, i4): WorkspaceConstructor.c(i4, i5);
                uob.e = f.h();
                uob.f = workspaceCon.b;
                objArray1 = new Object[i3];
                a.D().w("WorkspaceConstructor", "Start constructing videoWidth:"+i4+",videoHeight:"+i5+",videoRotation: "+i6, objArray1);
                obj2 = new g[15];
                obj2[i3] = new e();
                obj2[i2] = new g0();
                obj2[2] = new w();
                obj2[i1] = new e0();
                obj2[4] = new q();
                obj2[5] = new a();
                obj2[i] = new c();
                obj2[7] = new s();
                obj2[8] = new k();
                obj2[9] = new i0();
                obj2[10] = new l();
                obj2[11] = new m();
                obj2[12] = new k();
                obj2[13] = new c0();
                obj2[14] = new y();
                workspaceCon.a = obj2;
                long l = System.currentTimeMillis();
                a = workspaceCon.a;
                i7 = a.length;
                i8 = 0;
                while (i8 < i7) {
                   obj1 = a[i8];
                   Object[] objArray2 = new Object[i2];
                   objArray2[i3] = uob;
                   obj1.u(objArray2);
                   obj1.N();
                   l1 = System.currentTimeMillis();
                   l = l1 - l;
                   objArray1 = new Object[i3];
                   a.D().w("EditCost", "创建 "+obj1.getClass().getSimpleName()+" 耗时 "+l, objArray1);
                   i8 = i8 + 1;
                   i2 = 1;
                }
             }
             break;
           case 8:
           case 10:
           case 9:
             WorkspaceConstructor workspaceCon1 = new WorkspaceConstructor();
             if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, workspaceCon1, WorkspaceConstructor.class, "3")) {
                Object[] objArray3 = new Object[0];
                a.D().w("WorkspaceConstructor", "Start constructing pictures workspace of type "+p1.a1().name(), objArray3);
                obj2 = new g[i];
                obj2[0] = new e();
                obj2[1] = new a0();
                int i9 = 2;
                obj2[i9] = new s();
                obj2[i1] = new i0();
                obj2[4] = new k();
                obj2[5] = new y();
                WorkspaceConstructor workspaceCon2 = workspaceCon1;
                workspaceCon2.a = obj2;
                WorkspaceConstructor$b uob1 = new WorkspaceConstructor$b(workspaceCon2);
                uob1.b = obj1;
                uob1.c = obj;
                long l2 = System.currentTimeMillis();
                WorkspaceConstructor a1 = workspaceCon2.a;
                i8 = a1.length;
                int i10 = 0;
                while (i10 < i8) {
                   object oobject = a1[i10];
                   objArray1 = new Object[i9];
                   objArray1[0] = uob1;
                   objArray1[1] = p2;
                   oobject.u(objArray1);
                   oobject.N();
                   l1 = System.currentTimeMillis();
                   l2 = l1 - l2;
                   objArray = new Object[0];
                   a.D().w("EditCost", "创建 "+oobject.getClass().getSimpleName()+" 耗时 "+l2, objArray);
                   i10 = i10 + 1;
                   workspaceCon2 = workspaceCon2;
                   workspaceCon = 2;
                }
                workspaceCon1 = workspaceCon2;
             }
             workspaceCon = workspaceCon1;
             break;
           default:
             return null;
       }
       objArray = new Object[i3];
       a.D().w("WorkspaceConstructor", "construct type:"+type, objArray);
       return workspaceCon;
    }
    public static List b(Intent p0){
       Workspace$From uFrom1;
       String str6;
       Workspace$From iM_SEND_MESS;
       c uoc;
       ArrayList uArrayList2;
       Workspace$Source source;
       String str7;
       VideoContext videoContext2;
       Workspace$Type lONG_VIDEO;
       DraftFileManager uDraftFileMa;
       DraftFileManager uDraftFileMa1;
       Workspace$Type lONG_VIDEO3;
       Object[] objArray1;
       Workspace$Source obj = p0;
       WorkspaceConstructor workspaceCon = WorkspaceConstructor.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj1 = PatchProxy.applyOneRefs(obj, null, workspaceCon, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = j0.f(obj, "SOURCE");
       if (TextUtils.x(obj1)) {
          throw new ConstructorException("Unknown source.");
       }
       ArrayList uArrayList = new ArrayList();
       String str = "photo_task_id";
       String str1 = j0.f(obj, str);
       if (TextUtils.x(str1)) {
          str1 = u1.f();
          obj.putExtra(str, str1);
       }
       boolean b = false;
       boolean b1 = j0.a(obj, "INTENT_EXTRA_IS_SAME_FRAME", b);
       boolean b2 = j0.a(obj, "INTENT_EXTRA_IS_FOLLOW_SHOOT", b);
       boolean b3 = j0.a(obj, "is_long_video", b);
       int i = j0.b(obj, "camera_page_source", b);
       boolean b4 = j0.a(obj, "FROM_BACKGROUND", b);
       boolean b5 = j0.a(obj, "INTENT_EXTRA_IS_FROM_IM_MESSAGE", b);
       boolean b6 = (i == 3)? true: false;
       int b7 = (i == 16)? true: false;
       VideoContext videoContext = new VideoContext();
       byte[] byteArrayExt = obj.getByteArrayExtra("VIDEO_CONTEXT");
       if (byteArrayExt != null) {
          videoContext.k0(byteArrayExt);
       }
       ArrayList uArrayList1 = uArrayList;
       Workspace$From uFrom = Workspace$From.forNumber(j0.b(obj, "camera_page_from", 0));
       if (b4 && PostExperimentUtils.I0()) {
          videoContext.Z1(1);
          videoContext.F().b.I0 = 9;
          uFrom1 = Workspace$From.PROFILE_BACKGROUND;
       }else {
          uFrom1 = uFrom;
          objArray1 = 9;
       }
       boolean i1 = 14;
       if (b5) {
          videoContext.Y1(i1);
       }
       boolean b8 = b4;
       EditConfig uEditConfig = PatchProxy.applyOneRefs(obj, null, workspaceCon, "7");
       if (uEditConfig != patchProxyRe) {
       }else {
          EditConfig$b uob = EditConfig.newBuilder();
          uob.copyOnWrite();
          uob.instance.setDisableAddImage(j0.a(obj, "hie_photo_add_entrance", false));
          uEditConfig = uob.build();
       }
       boolean b9 = b5;
       String str2 = ",isFromSameFrame:";
       String str3 = ",isFromFollowFrame:";
       boolean b10 = b7;
       Object[] objArray = new Object[0];
       String str4 = "WorkspaceConstructor";
       a.D().w(str4, "source: "+obj1+",taskId:"+str1+",isFromSameFrame:"+b1+",isFromFollowFrame:"+b2+",isLongVideo:"+b3+",isShop:"+b6+",isJuxing:"+b7, objArray);
       String str5 = "picture";
       i1 = -1;
       switch (obj1.hashCode()){
           case 0x9872f7c9:
             if (obj1.equals("merchant_comment_recreation")) {
                b7 = 15;
             }else {
             label_0230 :
                b7 = -1;
             }
             break;
           case 0xae79c325:
             if (obj1.equals("camera")) {
                b7 = 6;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xb4359a12:
             if (obj1.equals("recreation")) {
                b7 = 12;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xb96173a5:
             if (obj1.equals("import")) {
                b7 = 4;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xbd3046fb:
             if (obj1.equals("ktv_mv")) {
                b7 = 8;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xbfc2bd01:
             if (obj1.equals("memory")) {
                b7 = 21;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xdd905cfe:
             if (obj1.equals(str5)) {
                b7 = 2;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xe4175160:
             if (obj1.equals("album_movie")) {
                b7 = 11;
             }else {
                goto label_0230 ;
             }
             break;
           case 0xea566ce1:
             if (obj1.equals("share_photos")) {
                b7 = 18;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x17a21:
             if (obj1.equals("app")) {
                b7 = 9;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x2f6e0a:
             if (obj1.equals("edit")) {
                b7 = 16;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x609c88a:
             if (obj1.equals("joint")) {
                b7 = 5;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x65b3e32:
             if (obj1.equals("photo")) {
                b7 = 1;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x22f454b3:
             if (obj1.equals("post_share_photo")) {
                b7 = 0;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x23bde417:
             if (obj1.equals("SOURCE_FANSTOP_EDITOR_IMAGE")) {
                b7 = 3;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x24734f37:
             if (obj1.equals("SOURCE_FANSTOP_EDITOR_VIDEO")) {
                b7 = 10;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x24dfda74:
             if (obj1.equals("kuaishan_mv")) {
                b7 = 17;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x323d21e7:
             if (obj1.equals("ktv_song")) {
                b7 = 7;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x4aa58d92:
             if (obj1.equals("cover_edit")) {
                b7 = 20;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x5589286c:
             if (obj1.equals("music_recreation")) {
                b7 = 14;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x6869540e:
             if (obj1.equals("cover_re_edit")) {
                b7 = 19;
             }else {
                goto label_0230 ;
             }
             break;
           case 0x773427f3:
             if (obj1.equals("picture_recreation")) {
                b7 = 13;
             }else {
                goto label_0230 ;
             }
             break;
           default:
             goto label_0230 ;
       }
       switch (b7){
           case 0:
           case 2:
           case 3:
           case 1:
             str6 = str4;
             VideoContext videoContext1 = videoContext;
             b7 = i;
             b3 = j0.a(obj, "single_picture", false);
             b6 = true;
             b5 = j0.a(obj, "ENABLE_UPLOAD_ATLAS", b6);
             videoContext = (b5 && j0.b(obj, "ATLAS_COUNT", i1) > b6)? 1: null;
             if (!b5 || j0.b(obj, "LONG_PICTURE_COUNT", i1) <= b6) {
                str7 = null;
             }
             i1 = j0.a(obj, "ONLY_PHOTO_MOVIE", false);
             if (b7 == 19) {
                iM_SEND_MESS = Workspace$From.IM_SEND_MESSAGE;
             }else if(b7 == 21){
                iM_SEND_MESS = Workspace$From.IM_SEND_MESSAGE_WHATS_UP;
             }else if(b7 == 20){
                iM_SEND_MESS = Workspace$From.IM_TAKE_IN_SAME;
             }else {
                iM_SEND_MESS = uFrom1;
             }
             if (b3) {
                obj = (str5.equals(obj1))? Workspace$Source.CAPTURE: Workspace$Source.IMPORT;
                if (b8 && PostExperimentUtils.I0()) {
                   obj = Workspace$Source.PROFILE_BACKGROUND_POST;
                }else if(b9){
                   obj = Workspace$Source.IM_MESSAGE;
                }
                uoc = DraftFileManager.E().h(Workspace$Type.SINGLE_PICTURE, obj, str1, videoContext1, iM_SEND_MESS, uEditConfig);
             label_0357 :
                uArrayList2 = uArrayList1;
             }else if(videoContext == null && b6 != null){
                obj = (b9)? Workspace$Source.IM_MESSAGE: Workspace$Source.IMPORT;
                uoc = DraftFileManager.E().h(Workspace$Type.LONG_PICTURE, obj, str1, videoContext1, iM_SEND_MESS, uEditConfig);
                goto label_0357 ;
             }else if(i1){
                uoc = DraftFileManager.E().h(Workspace$Type.PHOTO_MOVIE, Workspace$Source.IMPORT, str1, videoContext1, iM_SEND_MESS, uEditConfig);
                goto label_0357 ;
             }else {
                EditorActivity$PreviewTabInfo previewTabIn = v.d();
                if (previewTabIn == null) {
                   previewTabIn = v.e(v.g());
                }
                previewTabIn = previewTabIn.mPageKey;
                if (!TextUtils.x(previewTabIn)) {
                   obj.putExtra("DEFAULT_TAB_KEY", previewTabIn);
                }
                source = Workspace$Source.IMPORT;
                str7 = str1;
                Workspace$From uFrom2 = iM_SEND_MESS;
                Object obj2 = uEditConfig;
                c uoc1 = DraftFileManager.E().h(Workspace$Type.PHOTO_MOVIE, source, str7, videoContext1, uFrom2, obj2);
                uArrayList2 = uArrayList1;
                uArrayList2.add(DraftFileManager.E().h(Workspace$Type.ATLAS, source, str7, videoContext1.f(), uFrom2, obj2));
                DraftFileManager.d(uoc1, uArrayList2);
                uoc = uoc1;
             }
             break;
           case 4:
             str6 = str4;
             videoContext2 = videoContext;
             obj = (j0.a(obj, "edit_from_mix_preview", false))? Workspace$Source.IMPORT_MIXED: Workspace$Source.IMPORT;
             if (b6) {
                obj = Workspace$Source.SHOP;
             }else if(b10){
                obj = Workspace$Source.JUXING;
             }else if(b9){
                obj = Workspace$Source.IM_MESSAGE;
             }
             source = obj;
             lONG_VIDEO = (b3)? Workspace$Type.LONG_VIDEO: Workspace$Type.VIDEO;
             uoc = DraftFileManager.E().h(lONG_VIDEO, source, str1, videoContext2, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 5:
             str6 = str4;
             videoContext2 = videoContext;
             uDraftFileMa = DraftFileManager.E();
             Workspace$Type lONG_VIDEO1 = (b3)? Workspace$Type.LONG_VIDEO: Workspace$Type.VIDEO;
             uoc = uDraftFileMa.h(lONG_VIDEO1, Workspace$Source.JOIN, str1, videoContext2, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 6:
             str6 = str4;
             videoContext2 = videoContext;
             if (i != 2) {
                if (i != 3) {
                   if (i != 16) {
                      switch (i){
                          case 19:
                            obj = Workspace$Source.CAPTURE;
                            iM_SEND_MESS = Workspace$From.IM_SEND_MESSAGE;
                         label_0385 :
                            uFrom1 = iM_SEND_MESS;
                            break;
                          case 20:
                            obj = Workspace$Source.CAPTURE;
                            iM_SEND_MESS = Workspace$From.IM_TAKE_IN_SAME;
                            goto label_0385 ;
                            break;
                          case 21:
                            obj = Workspace$Source.CAPTURE;
                            iM_SEND_MESS = Workspace$From.IM_SEND_MESSAGE_WHATS_UP;
                            goto label_0385 ;
                            break;
                          default:
                            if (b1) {
                               obj = Workspace$Source.SAME_FRAME;
                            }else if(b2){
                               obj = Workspace$Source.FOLLOW_SHOOT;
                            }else {
                               obj = Workspace$Source.CAPTURE;
                            }
                      }
                   }else {
                      obj = Workspace$Source.JUXING;
                   }
                }else {
                   obj = Workspace$Source.SHOP;
                }
             }else {
                obj = Workspace$Source.INTOWN;
             }
             uDraftFileMa1 = DraftFileManager.E();
             Workspace$Type lONG_VIDEO2 = (b3)? Workspace$Type.LONG_VIDEO: Workspace$Type.VIDEO;
             objArray = new Object[0];
             a.D().w(str6, "create sourcePage:"+i+str2+b1+str3+b2+",workspaceSource:"+obj, objArray);
             uoc = uDraftFileMa1.h(lONG_VIDEO2, obj, str1, videoContext2, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 7:
             str6 = str4;
             uoc = DraftFileManager.E().f(Workspace$Type.KTV_SONG, WorkspaceConstructor.d(p0), str1, videoContext);
             goto label_0357 ;
             break;
           case 8:
             str6 = str4;
             videoContext2 = videoContext;
             str5 = j0.f(obj, "ktv_info");
             if (TextUtils.x(str5)) {
                uoc = DraftFileManager.E().i(str5, Workspace$Type.KTV_MV, WorkspaceConstructor.d(p0), str1, videoContext2);
                goto label_0357 ;
             }else {
                uoc = DraftFileManager.E().f(Workspace$Type.KTV_MV, WorkspaceConstructor.d(p0), str1, videoContext2);
                goto label_0357 ;
             }
             break;
           case 9:
             str6 = str4;
             videoContext2 = videoContext;
             uDraftFileMa = DraftFileManager.E();
             lONG_VIDEO3 = (b3)? Workspace$Type.LONG_VIDEO: Workspace$Type.VIDEO;
             uoc = uDraftFileMa.f(lONG_VIDEO3, Workspace$Source.SHARE, str1, videoContext2);
             goto label_0357 ;
             break;
           case 10:
             str6 = str4;
             videoContext2 = videoContext;
             uDraftFileMa = DraftFileManager.E();
             lONG_VIDEO3 = (b3)? Workspace$Type.LONG_VIDEO: Workspace$Type.VIDEO;
             uoc = uDraftFileMa.f(lONG_VIDEO3, Workspace$Source.IMPORT, str1, videoContext2);
             goto label_0357 ;
             break;
           case 11:
             str6 = str4;
             uoc = DraftFileManager.E().h(Workspace$Type.ALBUM_MOVIE, Workspace$Source.IMPORT, str1, videoContext, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 12:
             str6 = str4;
             uoc = DraftFileManager.E().h(Workspace$Type.VIDEO, Workspace$Source.VIDEO_RECREATION, str1, videoContext, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 13:
             str6 = str4;
             uoc = DraftFileManager.E().h(Workspace$Type.VIDEO, Workspace$Source.PICTURE_RECREATION, str1, videoContext, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 14:
             str6 = str4;
             uoc = DraftFileManager.E().h(Workspace$Type.VIDEO, Workspace$Source.MUSIC_RECREATION, str1, videoContext, uFrom1, uEditConfig);
             goto label_0357 ;
             break;
           case 15:
             DraftFileManager uDraftFileMa2 = DraftFileManager.E();
             lONG_VIDEO = Workspace$Type.VIDEO;
             Workspace$Source mERCHANT_COM = Workspace$Source.MERCHANT_COMMENT_RECREATION;
             uDraftFileMa1 = 1;
             Objects.requireNonNull(uDraftFileMa2);
             DraftFileManager uDraftFileMa3 = DraftFileManager.class;
             if (PatchProxy.isSupport(uDraftFileMa3)) {
                objArray1 = new Object[]{lONG_VIDEO,mERCHANT_COM,str1,videoContext,uFrom1,uEditConfig,Boolean.TRUE};
                Object obj3 = PatchProxy.apply(objArray1, uDraftFileMa2, uDraftFileMa3, "38");
                if (obj3 != patchProxyRe) {
                   uoc = obj3;
                   str6 = str4;
                   goto label_0357 ;
                }
             }
             str6 = str4;
             uoc = uDraftFileMa2.k(DraftFileManager.l(), lONG_VIDEO, mERCHANT_COM, str1, videoContext, uFrom1, uEditConfig, uDraftFileMa1);
             goto label_0357 ;
             break;
           default:
             str6 = str4;
             uArrayList2 = uArrayList1;
             String str8 = "source:"+obj1+" not support create workspace";
             PostUtils.D(str6, str8, new RuntimeException(str8));
             uoc = null;
       }
       if (uoc == null) {
          PostUtils.D(str6, "Failed to create workspace.", new ConstructorException("Failed to create workspace."));
          return uArrayList2;
       }else {
          uArrayList2.add(uoc);
          return uArrayList2;
       }
    }
    public static Pair c(int p0,int p1){
       WorkspaceConstructor workspaceCon = WorkspaceConstructor.class;
       if (PatchProxy.isSupport(workspaceCon)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, workspaceCon, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EditorSdk2UtilsV2.limitWidthAndHeight(p0, p1, 720, 1600, 16, 2);
    }
    public static Workspace$Source d(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WorkspaceConstructor.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KtvInfo ktvInfo = KtvInfo.fromIntent(p0);
       if (ktvInfo == null) {
          return Workspace$Source.CAPTURE;
       }
       Workspace$Source cAPTURE = (ktvInfo.mChorusMode == null)? Workspace$Source.CAPTURE: Workspace$Source.KTV_CHORUS;
       return cAPTURE;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, WorkspaceConstructor.class, "9")) {
          return;
       }
       WorkspaceConstructor ta = this.a;
       int len = ta.length;
       int i = 0;
       while (i < len) {
          object oobject = ta[i];
          Objects.requireNonNull(oobject);
          if (!PatchProxy.applyVoid(null, oobject, g.class, "1")) {
             b9.a(oobject.c);
          }
          i = i + 1;
       }
       b9.a(this.d);
       b9.a(this.e);
       return;
    }
}
