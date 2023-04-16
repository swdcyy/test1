package com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper;
import java.lang.Object;
import java.io.File;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qkd.b;
import org.json.JSONObject;
import haa.f;
import java.lang.Throwable;
import q87.c;
import qr4.i;
import qr4.m$k0;
import lnc.p3;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.System;
import zaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage$b;
import com.google.protobuf.nano.MessageNano;
import com.yxcorp.gifshow.util.PostUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.VideoContextDraftHelper$VideoContextDraftException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.SessionContext;
import java.util.List;
import java.util.Objects;
import com.yxcorp.utility.Log;

public class VideoContextDraftHelper	// class@001af2
{

    public void VideoContextDraftHelper(){
       super();
    }
    public static VideoContext a(File p0,Workspace p1){
       String mvparamFile;
       i b;
       Object obj = null;
       File obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, VideoContextDraftHelper.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!TextUtils.x(p1.getLegacyMvparamFile())) {
          String legacyMvpara = p1.getLegacyMvparamFile();
          try{
             obj1 = new File(p0, legacyMvpara);
             return VideoContext.h(new JSONObject(b.g0(obj1, "UTF-8")));
          }catch(java.io.IOException e0){
          }catch(org.json.JSONException e0){
          }
          f.D().z(v3, v2, e0);
       label_0041 :
          if (!TextUtils.x(p1.getMvparamFile())) {
             mvparamFile = p1.getMvparamFile();
             try{
                obj1 = new File(p0, mvparamFile);
                byte[] uobyteArray = b.e0(obj1);
                try{
                   VideoContext videoContext = new VideoContext();
                   videoContext.k0(uobyteArray);
                }catch(java.io.IOException e5){
                }
                f.D().z(v3, v2, e5);
             }catch(java.io.IOException e5){
                mvparamFile = obj;
                goto label_0065 ;
             }
          }else {
             p1 = obj;
          }
          if (mvparamFile != null && !PatchProxy.applyVoid(obj, mvparamFile, VideoContext.class, "204")) {
             b = mvparamFile.a.b;
             if (b != null && b.k1 != null) {
                b.k1 = obj;
                Object[] objArray = new Object[0];
                p3.D().w("VideoContext", "clearUnusableData\(\) videoInfo.coRelationList set null", objArray);
             }
          }
          return mvparamFile;
       }else {
          goto label_0041 ;
       }
    }
    public static void b(c p0,boolean p1){
       VideoContextDraftHelper videoContext = VideoContextDraftHelper.class;
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, videoContext, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("VideoContextDraftHelper", "save\(\) photo meta workspace="+p0.D0(), objArray);
       long l = System.currentTimeMillis();
       VideoContextDraftHelper.d(p0);
       VideoContext videoContext1 = p0.d1();
       a uoa = p0.N0();
       if (!uoa.D()) {
          uoa.c0();
       }
       try{
          uoa.k().a(uoa.P(MessageNano.toByteArray(videoContext1.d2(p1)), "pb"));
       }catch(java.lang.Exception e8){
          PostUtils.D("VideoContextDraftHelper", "save\(\) ", e8);
       }
       uoa.g(0);
       a uoa1 = p0.G0();
       if (uoa1.v() != null) {
          if (!uoa1.D()) {
             uoa1.c0();
          }
          try{
             uoa1.k().a("");
          }catch(java.lang.Exception e8){
             f.D().z("VideoContextDraftHelper", "save set null", e8);
             ExceptionHandler.handleCaughtException(new VideoContextDraftHelper$VideoContextDraftException(e8));
          }
          uoa1.g(0);
       }
       Object[] objArray1 = new Object[0];
       f.D().s("EditCost", "VideoContextDraftHelper save cost "+(System.currentTimeMillis() - l), objArray1);
       return;
    }
    public static void c(c p0,VideoContext p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, VideoContextDraftHelper.class, "4")) {
          return;
       }
       p1.F().b.G = DraftFileManager.E().H(p0).exists();
       p1.U1(p0.V0());
       VideoContextDraftHelper.d(p0);
       return;
    }
    public static void d(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, VideoContextDraftHelper.class, "3")) {
          return;
       }
       if (!p0.E() && p0.D()) {
          Workspace$b uob = p0.k();
          if (!uob.instance.hasSessionContext()) {
             return;
          }else {
             int i = 0;
             Object[] objArray = new Object[i];
             f.D().s("VideoContextDraftHelper", "historyTaskId sync", objArray);
             List historyTaskI = uob.getSessionContext().getHistoryTaskIdList();
             int i1 = historyTaskI.size();
             m$k0 n = p0.d1().a.b.N;
             if (n == null) {
                n = new String[i];
             }
             if (i1 != n.length) {
                VideoContext videoContext = p0.d1();
                String[] stringArray = new String[i];
                String[] stringArray1 = historyTaskI.toArray(stringArray);
                Objects.requireNonNull(videoContext);
                if (PatchProxy.applyOneRefs(stringArray1, videoContext, VideoContext.class, "179") != PatchProxyResult.class) {
                }else {
                   VideoContext.b();
                   videoContext.N = stringArray1;
                   Log.b("historyTaskId", "mVideoContext.setHistoryTaskId "+stringArray1.length);
                }
             }
          }
       }
       return;
    }
}
