package com.yxcorp.gifshow.upload.z1;
import erd.o;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.util.Map;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.yxcorp.gifshow.upload.b2;
import com.kwai.robust.PatchProxyResult;
import qq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qr4.i;
import qr4.m$k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import org.json.JSONArray;
import qr4.k$j;
import org.json.JSONObject;
import qr4.k$m;
import org.json.JSONException;
import com.yxcorp.utility.Log;
import com.kuaishou.android.model.music.Music;
import qr4.e$h;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.android.model.music.MusicType;
import lnc.la;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import jn6.c;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import qr4.e$m;
import qr4.e$m$a;
import com.kuaishou.edit.draft.RelayStickerParam;
import com.kuaishou.edit.draft.Friend;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo$AttachData;
import qr4.e$m$b;
import com.kuaishou.edit.draft.FeatureId;
import gq.a;
import qr4.m$p;
import qr4.k$e;
import java.lang.Double;
import qr4.k$e$b;
import qr4.k$e$f;
import qr4.k$e$c;
import java.util.ArrayList;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import haa.f;
import qr4.m$n;
import kotlin.jvm.internal.a;
import java.lang.IllegalArgumentException;
import qr4.m$c0;
import w46.b;
import km6.e;
import cq.a;
import qr4.e$e;
import dnc.s2;
import java.lang.Runnable;
import t45.c;

public final class z1 implements o	// class@001ebe
{
    public final UploadInfo b;
    public final Map c;

    public void z1(UploadInfo p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       JSONArray jSONArray;
       long l1;
       String str3;
       String str4;
       String str6;
       Object[] objArray1;
       InteractStickerInfo interactStic;
       int type;
       z1 oz12;
       VideoContext videoContext1;
       JSONArray jSONArray1;
       JSONArray obj4;
       DraftFileGuard b2;
       String workspaceId;
       i oi;
       k$j obj5;
       i b3;
       e$h h;
       int i;
       Object[] objArray6;
       boolean len;
       int i2;
       JSONObject jSONObject1;
       object oobject;
       k$j oj;
       String str10;
       int i4;
       e$m$b obj6;
       Music music;
       JSONObject jSONObject4;
       int b4;
       JSONObject jSONObject5;
       JSONObject jSONObject6;
       int i8;
       int i9;
       z1 oz1 = this;
       z1 b = oz1.b;
       z1 c = oz1.c;
       object obj = p0;
       b uob = b.class;
       VideoContext videoContext = VideoContext.class;
       long locationId = b.getLocationId();
       Object[] objArray = new Object[0];
       String str = "UploadParamUtils";
       a.D().w(str, "generateFields\(\) poiId: "+locationId, objArray);
       boolean b1 = b.isEnablePipelineUpload();
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Boolean.valueOf(b1), obj, videoContext, "177") != PatchProxyResult.class) {
       }else {
          VideoContext.b();
          obj.a.b.j = b1;
       }
       String str1 = "";
       if (!PatchProxy.applyVoidOneRefs(obj, null, b2.class, "14")) {
          b3 = obj.a.b;
          m$k0 h1 = (b3 != null)? b3.h: str1;
          m$k0 i10 = (b3 != null)? b3.i: str1;
          if (!TextUtils.x(h1) && (!TextUtils.x(i10) && !h1.equals(i10))) {
             PostUtils.D(str, "encode_upload_crc_error", new IllegalStateException(" encodeCrc="+h1+" uploadCer="+i10));
          }
       }
    label_00a9 :
       long l = obj.p();
       Object obj1 = null;
       if (l - obj1 > 0) {
          c.put("encode_config_id", String.valueOf(l));
       }
       String str2 = "duration";
       if (!b.M(b.getFilePath())) {
          jSONArray = PatchProxy.apply(null, obj, videoContext, "148");
          if (jSONArray != PatchProxyResult.class) {
             l1 = locationId;
             str3 = str1;
             str4 = str;
          }else {
             b3 = obj.a.c;
             if (b3 != null) {
                k$j s1 = b3.s;
                if (s1 != null && s1.length > 0) {
                   JSONArray jSONArray2 = new JSONArray();
                   k$j s2 = obj.a.c.s;
                   b4 = s2.length;
                   str3 = str1;
                   int i6 = 0;
                   while (i6 < b4) {
                      oobject = s2[i6];
                      int i7 = b4;
                      jSONObject5 = new JSONObject();
                      try{
                         k$j oj1 = s2;
                         String str12 = "start";
                         l1 = locationId;
                         try{
                            jSONObject5.put(str12, oobject.a);
                            jSONObject5.put(str2, oobject.b);
                            workspaceId = "scale";
                            k$m c1 = oobject.c;
                            i9 = str;
                            try{
                               double d = (double)c1;
                               jSONObject5.put(workspaceId, d);
                               jSONArray2.put(jSONObject5);
                            label_0146 :
                               i6 = i6 + 1;
                               b4 = i7;
                               s2 = oj1;
                               locationId = i8;
                               str = i9;
                            }catch(org.json.JSONException e0){
                            }
                            Log.d("VideoContext", "getSpeedParts error:"+e0.getMessage());
                            goto label_0146 ;
                         }catch(org.json.JSONException e0){
                         }
                         i9 = str;
                         goto label_012c ;
                      }catch(org.json.JSONException e0){
                         i8 = locationId;
                         goto label_0125 ;
                      }
                   }
                   l1 = locationId;
                   str4 = str;
                   jSONArray = jSONArray2;
                }
             }
             l1 = locationId;
             str3 = str1;
             str4 = str;
             jSONArray = null;
          }
          if (jSONArray != null) {
             c.put("durationScale", jSONArray.toString());
          }
       }else {
          l1 = locationId;
          str3 = str1;
          str4 = str;
       }
       List obj2 = PatchProxy.applyTwoRefs(obj, b, null, b2.class, "10");
       String str5 = 2;
       if (obj2 != PatchProxyResult.class) {
          str6 = obj2;
          str = str4;
       }else {
          try{
             music = obj.B();
             if (music == null) {
                music = b.getMusic();
                jSONObject4 = null;
             }else {
                e$h obj7 = PatchProxy.applyOneRefs(obj, null, b2.class, "15");
                if (obj7 != PatchProxyResult.class) {
                   len = obj7.booleanValue();
                }else {
                   obj7 = obj.E();
                   len = (obj7 == null || (PostExperimentUtils.e1() && (obj7.f == null && (obj7.g > null && !obj.V()))))? true: false;
                }
                if (len && b.getMusic() != null) {
                   music = b.getMusic();
                }
             }
             workspaceId = "musicName";
             String str11 = "recordType";
             str6 = "musicType";
             str1 = "musicId";
             if (music != null) {
                jSONObject4 = new JSONObject();
                jSONObject4.put(str1, music.mId);
                jSONObject4.put(str6, music.mType.getValue());
                jSONObject4.put(str11, str5);
                b2.b(obj, jSONObject4, music);
                if (music.mType.getValue() == MusicType.BAIDU.mValue) {
                   jSONObject4.put(workspaceId, music.mName);
                }
                b4 = true;
             }else {
                b4 = true;
                jSONObject4 = null;
             }
             music = la.c(obj, b4, false);
             if (music != null) {
                jSONObject5 = new JSONObject();
                jSONObject5.put(str1, music.mId);
                jSONObject5.put(str6, music.mType.getValue());
                jSONObject5.put(str11, 1);
                b2.b(obj, jSONObject5, music);
                if (music.mType.getValue() == MusicType.BAIDU.mValue) {
                   jSONObject5.put(workspaceId, music.mName);
                }
                if (!TextUtils.x(music.mTagSourcePhotoId)) {
                   jSONObject5.put("tagSourcePhotoId", music.mTagSourcePhotoId);
                }
                jSONObject6 = jSONObject5;
             }else {
                jSONObject6 = null;
             }
             try{
                if (jSONObject4 == null && jSONObject6 == null) {
                   a uoa = a.D();
                   str5 = "generateMusicParam recordMusicParam and editMusicParam is null";
                   objArray1 = new Object[0];
                   str = str4;
                   uoa.s(str, str5, objArray1);
                label_02a7 :
                   str6 = null;
                }else {
                   str = str4;
                   jSONArray = new JSONArray();
                   b4 = obj.i0();
                   if (!PatchProxy.isSupport(b2.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b4), jSONArray, jSONObject6, jSONObject4, null, b2.class, "11")) {
                      if (b4) {
                         if (jSONObject6 != null) {
                            jSONArray.put(jSONObject6);
                         }else if(jSONObject4 != null){
                            jSONArray.put(jSONObject4);
                         }
                      }else if(jSONObject6 != null){
                         jSONArray.put(jSONObject6);
                      }
                      if (jSONObject4 != null) {
                         jSONArray.put(jSONObject4);
                      }
                   }
                   str6 = jSONArray.toString();
                }
             }catch(java.lang.Exception e0){
             }
             PostUtils.D(str, "generateMusicParam", e0);
             goto label_02a7 ;
          }catch(java.lang.Exception e0){
             str = str4;
             goto label_02a2 ;
          }
       }
       objArray1 = new Object[0];
       a.D().w(str, "musicParam: "+str6, objArray1);
       if (!TextUtils.x(str6)) {
          c.put("music", str6);
       }
       if (l1 - obj1 > 0) {
          c.put("poi", String.valueOf(l1));
       }
       if (!TextUtils.x(obj.i())) {
          c.put("activity", obj.i());
       }
       obj2 = b.getInteractStickerInfos();
       if (!q.f(obj2)) {
          Iterator iterator = obj2.iterator();
          while (iterator.hasNext()) {
             interactStic = iterator.next();
             type = interactStic.getType();
             str6 = "vote";
             if (type != 1) {
                if (type != 2) {
                   continue ;
                }else {
                   VoteResultResponse voteResultRe = c.e(interactStic);
                   if (voteResultRe != null) {
                      voteResultRe = voteResultRe.mVoteInfo;
                      if (voteResultRe != null) {
                         c.put(str6, voteResultRe.toString());
                      }
                   }
                }
             }else {
                VoteInfo voteInfo = c.f(interactStic);
                if (voteInfo != null) {
                   c.put(str6, voteInfo.toString());
                }
             }
          }
       }
       String str7 = str3;
       str5 = str;
       z1 oz11 = c;
       String str8 = 1;
       if (!PatchProxy.applyVoidThreeRefs(b, obj, obj2, null, b2.class, "4")) {
          UploadInfo mWorkspace = b.mWorkspace;
          if (mWorkspace != null) {
             Iterator iterator2 = mWorkspace.getStickersList().iterator();
             e$m om = null;
             while (iterator2.hasNext()) {
                Sticker sticker = iterator2.next();
                if (sticker.getStickerType() == Sticker$Type.RELAY_STICKER) {
                   if (om == null) {
                      om = new e$m();
                   }
                   om.a = str8;
                   e$m$a om$a = new e$m$a();
                   om$a.a = sticker.getRelayStickerParam().getText();
                   om$a.b = sticker.getRelayStickerParam().getFromPhotoid();
                   List friendsList = sticker.getRelayStickerParam().getFriendsList();
                   long[] olongArray = new long[friendsList.size()];
                   Iterator iterator3 = iterator2;
                   for (i4 = 0; i4 < friendsList.size(); i4 = i4 + 1) {
                      olongArray[i4] = Long.parseLong(friendsList.get(i4).getId());
                   }
                   om$a.c = olongArray;
                   len = 3;
                   if (PatchProxy.isSupport(b2.class)) {
                      obj6 = PatchProxy.applyTwoRefs(obj2, Integer.valueOf(len), null, b2.class, "5");
                      if (obj6 != PatchProxyResult.class) {
                         interactStic = obj6;
                      }else if(obj2 == null){
                         Iterator iterator4 = obj2.iterator();
                         while (true) {
                            if (iterator4.hasNext()) {
                               InteractStickerInfo interactStic1 = iterator4.next();
                               if (interactStic1.getType() == len) {
                                  interactStic = interactStic1;
                               }else {
                                  i4 = 0;
                               }
                            }
                         }
                      }
                      interactStic = null;
                   }else {
                      i4 = 0;
                      goto label_03db ;
                   }
                   InteractStickerInfo$AttachData attachData = (interactStic != null)? interactStic.getAttachData(): null;
                   obj6 = new e$m$b();
                   if (attachData != null) {
                      obj6.a = sticker.getFeatureId().getExternal();
                      obj6.e = attachData.getLeft();
                      obj6.d = attachData.getTop();
                      obj6.f = attachData.getRight();
                      obj6.g = attachData.getBottom();
                      oz12 = b;
                      obj6.b = (float)attachData.getStartTime();
                      obj6.c = (float)attachData.getEndTime();
                      obj6.h = attachData.getScale();
                      obj6.i = attachData.getPhotoAspectRatio();
                   }else {
                      oz12 = b;
                   }
                   om$a.d = obj6;
                   om.b = om$a;
                   b = oz12;
                   iterator2 = iterator3;
                   i4 = true;
                }
             }
             oz12 = b;
             obj.F().d.Y = om;
          label_045c :
             Iterator iterator1 = obj.t().iterator();
             str6 = "VideoContextReadHelper";
             while (iterator1.hasNext()) {
                videoContext1 = iterator1.next();
                if (videoContext1 == obj) {
                   break ;
                }else if(videoContext1.F().c.u != null && videoContext1.F().c.u.length > 0){
                   objArray6 = new Object[0];
                   a.D().w(str6, "refreshMagicEmojiJsonArrayRecursive: set magicEmoji size="+videoContext1.F().c.u.length, objArray6);
                   obj5 = videoContext1.F().c.u;
                   if (PatchProxy.applyOneRefs(obj5, obj, videoContext, "72") != PatchProxyResult.class) {
                   }else {
                      VideoContext.b();
                      obj.a.c.u = obj5;
                   }
                }
             }
             iterator1 = obj.t().iterator();
             while (iterator1.hasNext()) {
                videoContext1 = iterator1.next();
                if (videoContext1 == obj) {
                   break ;
                }else if(videoContext1.F().b.I != null){
                   objArray6 = new Object[0];
                   a.D().w(str6, "refreshKuaishanVideoJsonArrayRecursive: set kuaishanVideo="+videoContext1.F().b.I.d, objArray6);
                   obj.h1(videoContext1.F().b.I);
                }
             }
             Object[] objArray2 = null;
             String obj3 = PatchProxy.apply(objArray2, obj, videoContext, "76");
             str6 = "magicEmojiId";
             if (obj3 != PatchProxyResult.class) {
             label_053b :
                jSONArray1 = obj3;
             }else {
                k$j u = obj.a.c.u;
                obj3 = PatchProxy.applyOneRefs(u, objArray2, uob, "1");
                if (obj3 != PatchProxyResult.class) {
                   goto label_053b ;
                }else {
                   jSONArray1 = new JSONArray();
                   if (u != null && u.length) {
                      i2 = 0;
                      while (i2 < u.length) {
                         oobject = u[i2];
                         str = "name";
                         JSONObject jSONObject2 = PatchProxy.applyOneRefs(oobject, null, uob, "7");
                         if (jSONObject2 != PatchProxyResult.class) {
                            oj = u;
                            obj1 = obj;
                         label_066e :
                            str10 = str2;
                         }else {
                            try{
                               jSONObject2 = new JSONObject();
                               jSONObject2.put(str, oobject.a);
                               jSONObject2.put(str6, oobject.b);
                               str8 = "activityId";
                               try{
                                  oj = u;
                                  jSONObject2.put(str8, oobject.r);
                                  jSONObject2.put("type", oobject.c);
                                  jSONObject2.put("magicFaceTag", oobject.d);
                                  jSONObject2.put("image", oobject.e);
                                  jSONObject2.put("imageUrls", oobject.f);
                                  jSONObject2.put("resource", oobject.g);
                                  jSONObject2.put("groupId", oobject.n);
                                  jSONObject2.put("resourceUrls", oobject.h);
                                  str1 = "location";
                                  try{
                                     obj1 = obj;
                                     jSONObject2.put(str1, oobject.i);
                                     jSONObject2.put(str2, oobject.j);
                                     jSONObject2.put(str2, oobject.j);
                                     if (!Double.isNaN((double)oobject.k)) {
                                        jSONObject2.put("slimmingIntensity", (double)oobject.k);
                                        jSONObject2.put("sliderType", oobject.p);
                                        jSONObject2.put("sliderModified", oobject.q);
                                     }
                                     k$e s = oobject.s;
                                     if (s != null && !Double.isNaN((double)s.a)) {
                                        jSONObject2.put("FilterIntensity", (double)oobject.s.a);
                                        jSONObject2.put("FilterSliderModified", oobject.s.c);
                                     }
                                     jSONObject2.put("magic_user_info", oobject.o);
                                     if (oobject.l != null) {
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(str, oobject.l.a);
                                        jSONObject3.put("embed", oobject.l.b);
                                        jSONObject2.put("detail", jSONObject3);
                                     }
                                     s = oobject.t;
                                     if (s != null && s.length > 0) {
                                        obj4 = new JSONArray();
                                        k$e t = oobject.t;
                                        i = t.length;
                                        i4 = 0;
                                        try{
                                           while (i4 < i) {
                                              obj = t[i4];
                                              k$e uoe = t;
                                              jSONObject1 = new JSONObject();
                                              int i5 = i;
                                              str = "customWord";
                                              str10 = str2;
                                              jSONObject1.put(str, obj.a);
                                              jSONObject1.put("isManualWord", obj.b);
                                              jSONObject1.put("wordTitle", obj.c);
                                              obj4.put(jSONObject1);
                                              i4 = i4 + 1;
                                              t = uoe;
                                              i = i5;
                                              str2 = str10;
                                           }
                                           str10 = str2;
                                           jSONObject2.put("magicFaceWord", obj4);
                                        }catch(org.json.JSONException e0){
                                        }
                                        Log.n("PhotoMetaUtils", "transformMagicEmoji e: "+e0.getMessage());
                                        jSONObject2 = null;
                                     }else {
                                        goto label_066e ;
                                     }
                                  }catch(org.json.JSONException e0){
                                  }
                                  str10 = str2;
                                  goto label_067d ;
                               }catch(org.json.JSONException e0){
                               }
                               int i3 = obj;
                               goto label_0672 ;
                            }catch(org.json.JSONException e0){
                               oj = u;
                               goto label_067a ;
                            }
                         }
                         if (jSONObject2 != null) {
                            jSONArray1.put(jSONObject2);
                         }
                         i2 = i2 + 1;
                         u = oj;
                         obj = obj1;
                         str2 = str10;
                      }
                   }
                }
             }
             obj1 = obj;
             jSONArray = PatchProxy.applyOneRefs(jSONArray1, null, uob, "21");
             if (jSONArray != PatchProxyResult.class) {
             }else {
                obj4 = new JSONArray();
                if (jSONArray1 != null) {
                   ArrayList uArrayList = new ArrayList();
                   i = 0;
                   while (i < jSONArray1.length()) {
                      try{
                         jSONObject1 = jSONArray1.getJSONObject(i);
                         String str9 = jSONObject1.getString(str6);
                         if (!uArrayList.contains(str9)) {
                            obj4.put(jSONObject1);
                            uArrayList.add(str9);
                         }
                      }catch(org.json.JSONException e0){
                         e0.printStackTrace();
                      }
                      i = i + 1;
                   }
                }
                jSONArray = obj4;
             }
             obj3 = jSONArray.toString();
             Object[] objArray3 = new Object[0];
             a.D().w(str5, "magicEmoji: "+obj3, objArray3);
             z1 oz13 = oz11;
             oz13.put("magicEmoji", obj3);
             objArray3 = new Object[0];
             a.D().w(str5, "UploadCrc: "+oz12.getUploadFileCrc(), objArray3);
             obj3 = oz12.getUploadFileCrc();
             obj4 = obj1;
             if (PatchProxy.applyOneRefs(obj3, obj4, videoContext, "58") != PatchProxyResult.class) {
             }else {
                VideoContext.b();
                obj4.Z();
                obj4.a.b.i = TextUtils.k(obj3);
             }
             long l2 = new File(oz12.getFilePath()).lastModified();
             if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Long.valueOf(l2), obj4, videoContext, "29") != PatchProxyResult.class) {
             }else {
                VideoContext.b();
                obj4.a.b.b = (long)(int)(l2 / 1000);
             }
             if (oz12.getWorkspaceId() != null) {
                b2 = DraftFileGuard.b;
                workspaceId = oz12.getWorkspaceId();
                oi = obj4.F();
                Objects.requireNonNull(b2);
                if (!PatchProxy.applyVoidTwoRefs(workspaceId, oi, b2, DraftFileGuard.class, "23")) {
                   Object[] objArray5 = new Object[0];
                   f.D().w("DraftFileGuard", "fillCheckResultIntoPhotoMeta\(\) workspaceId "+workspaceId, objArray5);
                   i oi1 = (workspaceId == null || !workspaceId.length())? 1: null;
                   if (!oi1 && (oi == null || oi.d == null)) {
                      PostUtils.D("DraftFileGuard", "fillCheckResultIntoPhotoMeta\(\) ", new IllegalArgumentException("workspaceId="+workspaceId));
                   }else if(!b2.j(workspaceId)){
                      b3 = oi.d;
                      if (b3 != null) {
                         h = b3.H;
                         if (h != null) {
                            f uof = (!h.length)? 1: null;
                            i = 1;
                            if (uof == i) {
                               int i1 = 0;
                               objArray5 = new Object[i1];
                               f.D().w("DraftFileGuard", "fillCheckResultIntoPhotoMeta\(\) no importPartEdit", objArray5);
                               m$n[] onArray = new m$n[i];
                               onArray[i1] = new m$n();
                               oi.d.H = onArray;
                            }
                         }
                      }
                      objArray6 = new Object[0];
                      f.D().A("DraftFileGuard", "fillCheckResultIntoPhotoMeta\(\) workspaceId "+workspaceId+" has "+"replaced file", objArray6);
                      h = oi.d.H;
                      a.o(h, "photoMeta.edit.importPartEdit");
                      len = h.length;
                      for (i2 = 0; i2 < len; i2 = i2 + 1) {
                         h[i2].c = "{\"hasReplaceAssetInBackground\" : true }";
                      }
                   }
                }
             }
             oi = obj4.d2(false);
             obj5 = null;
             obj3 = PatchProxy.applyOneRefs(obj4, obj5, b2.class, "9");
             if (obj3 != PatchProxyResult.class) {
             }else {
                JSONObject jSONObject = new JSONObject();
                if (obj4.F().b.t != null) {
                   try{
                      jSONObject.put("hasLrc", obj4.F().b.t.e);
                   }catch(org.json.JSONException e0){
                      a.D().e(str5, "generateSameFrameParam\(\) hasLrc", e0);
                   }
                   if (!TextUtils.x(obj4.F().b.t.b)) {
                      try{
                         jSONObject.put("photoId", obj4.F().b.t.b);
                      }catch(org.json.JSONException e0){
                         a.D().e(str5, "generateSameFrameParam\(\) photoId", e0);
                      }
                   }
                }else {
                   obj3 = obj5;
                }
             }
             if (!TextUtils.x(obj3)) {
                oz13.put("sameFrame", obj3);
             }
             objArray2 = new Object[]{oz13};
             a.D().w(str5, "generateFields\(\)", objArray2);
             if (oi != null) {
                b3 = oi.b;
                if (b3 != null) {
                   b3.d0 = TextUtils.k(oz12.mGoldCoinTaskId);
                   Object[] objArray4 = new Object[0];
                   a.D().w(str5, "judge assist: "+oi.b.a1, objArray4);
                }
                b3 = oi.d;
                if (b3 != null && b3.k != null) {
                   oi.d.k.u = (TextUtils.x(oz12.getOriginCoverKey()))? str7: oz12.getOriginCoverKey();
                }
                obj3 = b.c(oi);
                b2.a(obj3, oi);
                oz13.put("photoMeta", obj3);
                oz12.mPhotoMeta = obj3;
             }
             c.a(new s2(oz12, obj4.m()));
             return oz13;
          }
       }
       oz12 = b;
       goto label_045c ;
    }
}
