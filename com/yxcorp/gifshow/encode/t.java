package com.yxcorp.gifshow.encode.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.encode.EncodeManager$b;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import java.lang.Enum;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.Throwable;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import com.yxcorp.gifshow.encode.EncodeException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import dq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.util.Map;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kwai.feature.post.api.feature.text.model.BubblesInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONArray;
import qr4.i;
import km6.h;
import org.json.JSONException;
import fg6.a;
import com.google.gson.Gson;
import gq.a;
import java.lang.NullPointerException;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import org.json.JSONObject;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import qr4.m$k0;
import qr4.m$k;
import java.lang.Boolean;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import java.io.File;
import pca.h0;
import t45.c;
import rca.b;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.encode.utils.EncodeFunnel$funnelEnd$$inlined$let$lambda$1;
import msd.l;
import com.kuaishou.b;
import java.lang.Number;
import java.util.Collection;
import com.yxcorp.gifshow.postwork.e;
import com.yxcorp.gifshow.postwork.e$a;
import java.util.ArrayList;
import c26.d;

public final class t implements Runnable	// class@000d4d
{
    public final EncodeManager b;
    public final PostEncodeInfo c;

    public void t(EncodeManager p0,PostEncodeInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       t ot1;
       t ot2;
       PatchProxyResult patchProxyRe1;
       EncodeManager uEncodeManag1;
       b a;
       EncodeInfo$Status status;
       t ot3;
       Object[] obj;
       int i2;
       b uob;
       String str2;
       e uoe;
       EncodeInfo uEncodeInfo;
       Iterator iterator;
       Iterator iterator1;
       int i3;
       String str3;
       VideoEncodeSDKInfo mProject;
       String encodedFileC;
       JSONArray jSONArray;
       int i4;
       JSONArray jSONArray1;
       String str4;
       JSONObject jSONObject;
       double d;
       t ot = this;
       t b = ot.b;
       t c = ot.c;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EncodeManager uEncodeManag = EncodeManager.class;
       String str = "EncodeManager";
       PostLogger postLogger = new PostLogger().c(str).e(str);
       postLogger.k(c.mSessionId);
       postLogger = postLogger.h(PostSubTaskEvent.ENCODE_EVENT).i(String.valueOf(c.getId()));
       int i = EncodeManager$b.a[c.getStatus().ordinal()];
       String str1 = 4;
       a uoa = 3;
       Object[] objArray = 2;
       if (i != 1) {
          if (i != objArray) {
             if (i != uoa) {
                if (i == str1) {
                   postLogger.j(PostLogger$Status.CANCEL).d();
                }
             }else {
                postLogger.j(PostLogger$Status.ERROR);
                if (c.getThrowable() != null) {
                   postLogger.b(str).g("statusChange fail").l(c.getThrowable()).d();
                   a.f.a().d(PostCommonBiz.PUBLISH, str, "statusChange fail", c.getThrowable());
                   Throwable throwable = c.getThrowable();
                   if (!PatchProxy.applyVoidOneRefs(throwable, b, uEncodeManag, "56") && (!throwable instanceof KwaiException && !PostWorkErrorTips.a(throwable))) {
                      if (throwable instanceof EncodeException) {
                         ExceptionHandler.handleCaughtException(throwable);
                      }else {
                         ExceptionHandler.handleCaughtException(new EncodeException(throwable));
                      }
                   }
                }
             }
          }else {
             postLogger.j(PostLogger$Status.FINISH).d();
          }
       }else {
          postLogger.j(PostLogger$Status.PROCESSING).d();
       }
       int i1 = 0;
       Object[] objArray1 = new Object[i1];
       a.D().w(str, "onStatusChanged status: "+c.getStatus(), objArray1);
       if (c.getStatus() != EncodeInfo$Status.CANCELED) {
          b.c.put(Integer.valueOf(c.getId()), c);
       }else {
          b.c.remove(Integer.valueOf(c.getId()));
       }
       if (EncodeInfo$Status.COMPLETE != c.getStatus() || PatchProxy.applyVoidOneRefs(c, b, uEncodeManag, "35")) {
       label_03af :
          ot1 = b;
          ot2 = c;
          patchProxyRe1 = patchProxyRe;
          uEncodeManag1 = uEncodeManag;
       }else if(c.getVideoContext() == null){
          Object[] objArray2 = new Object[i1];
          a.D().w(str, "appendEncodeInfoToVideoContext warning£¬videoContext is null!", objArray2);
          goto label_03af ;
       }else {
          objArray1 = new Object[i1];
          a.D().w(str, "appendEncodeInfoToVideoContext: "+c.getVideoContext().hashCode(), objArray1);
          VideoContext videoContext = c.getVideoContext();
          VideoContext videoContext1 = VideoContext.class;
          PostEncodeInfo mVideoEncode = c.mVideoEncodeSDKInfo;
          if (mVideoEncode != null) {
             VideoEncodeSDKInfo mBubblesInfo = mVideoEncode.mBubblesInfo;
             if (mBubblesInfo != null) {
                BubblesInfo mAllFrameTex = mBubblesInfo.mAllFrameTexts;
                Objects.requireNonNull(videoContext);
                if (PatchProxy.applyOneRefs(mAllFrameTex, videoContext, videoContext1, "68") != patchProxyRe) {
                }else {
                   VideoContext.b();
                   if (!TextUtils.x(mAllFrameTex)) {
                      try{
                         h.b(videoContext.a, new JSONArray(mAllFrameTex));
                      }catch(org.json.JSONException e0){
                         e0.printStackTrace();
                      }
                   }
                }
             }
          }
          ot1 = b;
          ot2 = c;
          PatchProxyResult patchProxyRe2 = patchProxyRe;
          uEncodeManag1 = uEncodeManag;
       label_02a0 :
          if (videoContext != null) {
             boolean encodedWidth = ot2.getEncodedWidth();
             if (PatchProxy.isSupport(videoContext1)) {
                patchProxyRe1 = patchProxyRe2;
                if (PatchProxy.applyOneRefs(Integer.valueOf(encodedWidth), videoContext, videoContext1, "141") != patchProxyRe1) {
                label_02cd :
                   encodedWidth = ot2.getEncodedHeight();
                   if (PatchProxy.isSupport(videoContext1) && PatchProxy.applyOneRefs(Integer.valueOf(encodedWidth), videoContext, videoContext1, "142") != patchProxyRe1) {
                   }else {
                      VideoContext.b();
                      videoContext.Z();
                      videoContext.a.b.g.b = encodedWidth;
                   }
                   encodedFileC = ot2.getEncodedFileCrc();
                   if (PatchProxy.applyOneRefs(encodedFileC, videoContext, videoContext1, "57") != patchProxyRe1) {
                   }else {
                      VideoContext.b();
                      videoContext.a.b.h = TextUtils.k(encodedFileC);
                   }
                   encodedWidth = ot2.isTranscoded();
                   if (PatchProxy.isSupport(videoContext1) && PatchProxy.applyOneRefs(Boolean.valueOf(encodedWidth), videoContext, videoContext1, "166") != patchProxyRe1) {
                   }else {
                      VideoContext.b();
                      videoContext.Z();
                      videoContext.a.b.g.e = encodedWidth;
                   }
                   videoContext.t0(ot2.getBeautySdkInfo());
                   videoContext.I0(ot2.getEncondedFileDuration());
                   EncodeConfig$ComplexEncodeProfile properComple = ot2.getProperComplexEncodeProfile();
                   if (properComple != null) {
                      encodedFileC = properComple.getKey();
                      if (PatchProxy.applyOneRefs(encodedFileC, videoContext, videoContext1, "26") != patchProxyRe1) {
                      }else {
                         VideoContext.b();
                         videoContext.Z();
                         videoContext.a.b.g.f = TextUtils.k(encodedFileC);
                      }
                   }
                }
             }else {
                patchProxyRe1 = patchProxyRe2;
             }
             VideoContext.b();
             videoContext.Z();
             videoContext.a.b.g.a = encodedWidth;
             goto label_02cd ;
          }else {
             patchProxyRe1 = patchProxyRe2;
          }
          ot2.getVideoContext().F().b.Q = ot2.isTranscodeDegrade();
          encodedFileC = ot2.getOutputPath();
          if (!TextUtils.x(encodedFileC) && new File(encodedFileC).isFile()) {
             byte[] uobyteArray = ot2.getVideoContext().m();
             if (uobyteArray != null && uobyteArray.length > 0) {
                c.a(new h0(encodedFileC, uobyteArray));
             }
          }
       }
    }
}
