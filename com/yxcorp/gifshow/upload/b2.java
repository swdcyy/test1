package com.yxcorp.gifshow.upload.b2;
import java.lang.Object;
import java.lang.String;
import qr4.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import org.json.JSONObject;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import z16.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import z16.a;
import qq.a;
import w46.b;
import com.yxcorp.gifshow.upload.UploadInfo;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import org.json.JSONArray;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import q87.c;
import com.yxcorp.gifshow.upload.UploadException;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import dnc.v2;
import java.util.Map;
import java.util.concurrent.Callable;
import brd.m;
import t45.d;
import brd.z;
import dnc.r2;
import erd.o;
import com.yxcorp.gifshow.upload.z1;
import dnc.q2;
import erd.g;
import com.yxcorp.gifshow.upload.y1;
import brd.w;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import com.yxcorp.gifshow.upload.a2;
import java.util.Objects;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import brd.q;
import ird.a;
import dnc.u2;

public final class b2	// class@001e62
{

    public void b2(){
       super();
    }
    public static void a(String p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b2.class, "6")) {
          return;
       }
       if (p0.length() > 0x100000) {
          PostUtils.D("UploadParamUtils", "checkPhotoMetaLength\(\) "+p1, new RuntimeException("photoMeta too long "));
       }
       return;
    }
    public static void b(VideoContext p0,JSONObject p1,Music p2){
       a a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b2.class, "12")) {
          return;
       }
       try{
          Music mUsedStart = p2.mUsedStart;
          long l = p2.mUsedDuration + mUsedStart;
          if (mUsedStart < 0 || l <= 0) {
             return;
          }else {
             List list = c.a(p0);
             if (!q.f(list)) {
                long l1 = p0.C();
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      a uoa = iterator.next();
                      a = uoa.a;
                      if (!a) {
                         mUsedStart = mUsedStart + uoa.b;
                      }else {
                         a b = uoa.b;
                         if (!b - l1) {
                            long l2 = b - a;
                            l = l - l2;
                         }else {
                            return;
                         }
                      }
                   }
                }
             }
             p1.put("usedBegin", mUsedStart);
             p1.put("usedEnd", l);
          }
       }catch(org.json.JSONException e12){
          a.D().e("UploadParamUtils", "fillMusicParamTime\(\)", e12);
       }
       return;
    }
    public static t c(UploadInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b2 uob2 = b2.class;
       String str = null;
       HashMap obj = PatchProxy.applyOneRefs(p0, str, uob2, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       if (!TextUtils.x(p0.getCaption())) {
          obj.put("caption", p0.getCaption());
       }
       String str1 = (p0.isCaptionPasted())? "1": "0";
       obj.put("copy", str1);
       obj.put("preid", p0.getId());
       if (p0.getEncodeConfigId() > 0) {
          obj.put("encode_config_id", String.valueOf(p0.getEncodeConfigId()));
       }
       if (!TextUtils.x(p0.getMessageGroupId())) {
          obj.put("imGroupId", p0.getMessageGroupId());
       }
       obj.put("wait", "true");
       if (p0.getVisibility() != null) {
          obj.put("to_gifshow", p0.getVisibility().mUploadParamValue);
       }
       JSONArray jSONArray = PatchProxy.applyOneRefs(p0, str, uob2, "13");
       int i = 0;
       if (jSONArray != patchProxyRe) {
       }else {
          jSONArray = new JSONArray();
          String[] forwardToken = p0.getForwardTokens();
          if (forwardToken != null && forwardToken.length > 0) {
             int len = forwardToken.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = forwardToken[i1];
                try{
                   jSONArray.put(new JSONObject(oobject));
                }catch(org.json.JSONException e11){
                   a.D().e("UploadParamUtils", "fail to put token to forward json", e11);
                }
                i1 = i1 + 1;
             }
          }
       }
       obj.put("third_platform_tokens", jSONArray.toString());
       if (p0.getKtvInfo() != null) {
          str = p0.getKtvInfo().toSimpleJson();
       }
       if (!TextUtils.x(str)) {
          obj.put("karaokeparam", str);
       }
       if (p0.getMusic() != null) {
          obj.put("musicTag", "true");
       }
       if (p0.isLiveCover()) {
          obj.put("liveCover", "true");
       }
       obj.put("magicEmojiTag", String.valueOf(p0.isMagicEmojiTag()));
       if (!TextUtils.x(p0.getCoverKey())) {
          Object[] objArray = new Object[i];
          a.D().w("UploadParamUtils", "coverKey: "+p0.getCoverKey(), objArray);
          obj.put("coverKey", p0.getCoverKey());
       }else if(p0.getCoverKeyExpireTime()){
          String str2 = "update cover key failed on share preview activity";
          PostUtils.D("UploadParamUtils", str2, new UploadException(str2));
       }
       if (p0.getCroppedCoverSize() != null) {
          i = true;
       }
       obj.put("coverCropped", String.valueOf(i));
       obj.put("disableNearbyShow", String.valueOf(p0.disableShowNearby()));
       obj.put("photoDownloadDeny", String.valueOf(p0.photoDownloadDeny()));
       obj.put("recoGenderFirst", String.valueOf(p0.getRecoGender()));
       if (!TextUtils.x(p0.mMerchantInfo)) {
          obj.put("merchantItemInfo", p0.mMerchantInfo);
       }
       if (p0.getShareSoundTrack()) {
          obj.put("shareSoundTrack", "true");
       }
       return m.r(new v2(p0, obj)).B(d.c).u(d.a).n(new r2(p0)).t(new z1(p0, obj)).C().doOnNext(new q2(p0)).doOnNext(y1.b).switchIfEmpty(t.just(obj));
    }
    public static m d(UploadInfo p0){
       m obj = PatchProxy.applyOneRefs(p0, null, b2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getVideoContext() != null) {
          return m.s(p0.getVideoContext());
       }
       Object[] objArray = new Object[0];
       a.D().w("UploadParamUtils", "getVideoContext uploadInfo no context", objArray);
       if (TextUtils.x(p0.getWorkspacePath())) {
          return b2.e(p0);
       }
       obj = DraftFileManager.E().X(new File(p0.getWorkspacePath())).firstElement().u(d.a).n(a2.b);
       m om = b2.e(p0);
       Objects.requireNonNull(obj);
       a.c(om, "next is null");
       o oo = Functions.g(om);
       a.c(oo, "resumeFunction is null");
       return a.g(new MaybeOnErrorNext(obj, oo, true));
    }
    public static m e(UploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m.r(new u2(p0)).B(d.c).u(d.a);
    }
}
