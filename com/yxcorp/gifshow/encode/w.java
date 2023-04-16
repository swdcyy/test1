package com.yxcorp.gifshow.encode.w;
import pca.a2;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import zxa.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.String;
import com.kwai.video.editorsdk2.ExportTask;
import com.yxcorp.gifshow.encode.EncodeManager$d;
import com.kwai.video.editorsdk2.EncodedByteStreamInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.i1;
import dq.a;
import java.lang.StringBuilder;
import q87.c;
import d26.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import dnc.x0;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.Boolean;
import com.yxcorp.gifshow.encode.v0;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import java.lang.Integer;
import java.util.Map;
import java.util.Objects;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$EncodeParams;
import pca.g0;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips$NoSpaceLeftException;
import java.lang.Throwable;
import com.yxcorp.gifshow.encode.EncodeException;
import java.io.IOException;
import d26.b;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Arrays;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import mca.a;
import com.kwai.feature.post.api.feature.text.model.BubblesInfo;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import b36.b;
import java.lang.Long;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail;
import com.kwai.feature.post.api.feature.text.model.TextBubbleDetail$Frame;
import android.util.SparseArray;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;
import java.util.HashSet;
import java.util.Collections;
import lnc.ma$a;
import lnc.ma;
import org.json.JSONObject;
import org.json.JSONException;
import lnc.ma$b;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import wba.a;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextInfoModel;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$CompTextLayerInfoModel;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.TimeRange;
import java.io.File;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import w46.b;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.yxcorp.gifshow.encode.v;
import com.kwai.video.editorsdk2.Mp4OverWriteDataInfo;
import com.kwai.video.editorsdk2.ExportedPipelineTempFilesState;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import com.yxcorp.gifshow.encode.s0;
import java.lang.Double;

public class w extends a2	// class@000d56
{
    public String a;
    public final PostEncodeInfo b;
    public final PostWorkInfo c;
    public final b d;
    public final EditorSdk2V2$VideoEditorProject e;
    public final EditorSdk2$ExportOptions f;
    public final String g;
    public final ExportTask h;
    public final boolean i;
    public final EncodeManager$d j;
    public final EncodeManager k;

    public void w(EncodeManager p0,PostEncodeInfo p1,PostWorkInfo p2,b p3,EditorSdk2V2$VideoEditorProject p4,EditorSdk2$ExportOptions p5,String p6,ExportTask p7,boolean p8,EncodeManager$d p9){
       this.k = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       super();
       this.a = null;
    }
    public void onByteStreamEncoded(ExportTask p0,EncodedByteStreamInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "1")) {
          return;
       }
       String str = "EncodeManager";
       if (!PostExperimentUtils.h()) {
          i1.a(str, "not open byteStreamEncode");
          return;
       }else {
          int i = (int)(p1.getEncodedDuration() * 0x408f400000000000);
          Object[] objArray = new Object[0];
          a.D().w(str, "encode info: "+p1.getEncodedLength()+" : "+i, objArray);
          this.b.getByteStreamEncodeInfo().a = p1.getEncodedLength();
          p1.b = i;
          if (this.c != null) {
             this.k.q().o(this.c.getId());
          }
          return;
       }
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "8")) {
          return;
       }
       this.d.a();
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "exportTask is canceled", objArray);
       PostLogger postLogger = new PostLogger().m("EncodeManager").e("EncodeManager");
       postLogger.k(this.b.getSessionId());
       postLogger.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(this.b.getId())).j(PostLogger$Status.CANCEL).d();
       this.b.d(p0, this.b, 9, Boolean.FALSE);
       this.k.A(p0);
       w tb = this.b;
       tb.mStatus = EncodeInfo$Status.CANCELED;
       this.k.d.remove(Integer.valueOf(tb.getId()));
       if (p0 != null) {
          p0.release();
       }
       this.k.z(this.b);
       return;
    }
    public void onError(ExportTask p0){
       int i2;
       PostLogger postLogger;
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "7")) {
          return;
       }
       this.d.a();
       w tk = this.k;
       w tc = this.c;
       Objects.requireNonNull(tk);
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(tc, tk, EncodeManager.class, "37")) {
          if (tc == null) {
             Object[] objArray1 = new Object[i];
             a.D().w("EncodeManager", "removeTempFiles postWorkInfo is null", objArray1);
          }else {
             PostEncodeInfo encodeInfo = tc.getEncodeInfo();
             if (encodeInfo != null) {
                EncodeInfo mEncodeParam = encodeInfo.mEncodeParams;
                EncodeInfo$EncodeParams mEncodedFile = mEncodeParam.mEncodedFileOutputTempPath;
                if (mEncodedFile != null) {
                   EncodeInfo$EncodeParams mEncodingTem = mEncodeParam.mEncodingTemporaryFilePath;
                   String str1 = null;
                   mEncodeParam.mEncodingTemporaryFilePath = str1;
                   mEncodeParam.mEncodedFileOutputTempPath = str1;
                   c.a(new g0(mEncodedFile, mEncodingTem));
                }
             }
          }
       }
       tk = this.b;
       tk.mStatus = EncodeInfo$Status.FAILED;
       String str = "";
       if (p0 != null) {
          tk.mWorkspace.c(this.h, tk.mSessionId, tk.mWorkspace);
          tk = this.h;
          w tb = this.b;
          int i1 = 8;
          Boolean tRUE = Boolean.TRUE;
          try{
             tk.d(tk, tb, i1, tRUE);
             if (p0.getError().code() == -28) {
                this.b.setThrowable(new PostWorkErrorTips$NoSpaceLeftException(p0.getError().message()));
             }else {
                this.b.setThrowable(new EncodeException(p0.getError().code(), p0.getError().message()));
             }
             try{
                EditorSdk2$EditorSdkError error = p0.getError();
                if (error != null) {
                   i2 = error.code();
                   str = " type:"+error.type()+", code="+error.code()+" msg="+error.message();
                }else {
                   i2 = 0;
                }
                postLogger = new PostLogger().b("EncodeManager").e("EncodeManager");
                postLogger.k(this.b.getSessionId());
                postLogger.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(this.b.getId())).j(PostLogger$Status.ERROR).g("exportTask run exception").l(this.b.getThrowable()).d();
             }catch(java.lang.Exception e0){
             }
             i1.c(e0);
          }catch(java.lang.Exception e0){
             i2 = 0;
             goto label_0126 ;
          }
       }else {
          i2 = 0;
       }
       if (this.a != null) {
          this.b.setThrowable(new IOException(this.a));
          str = "Rename failed: "+this.a+", isSkipEncode: "+this.h.isTranscodeSkipped();
          postLogger = new PostLogger().b("EncodeManager").e("EncodeManager");
          postLogger.k(this.b.getSessionId());
          postLogger.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(this.b.getId())).j(PostLogger$Status.ERROR).g("export rename exception").l(this.b.getThrowable()).d();
       }
       this.k.d.remove(Integer.valueOf(this.b.getId()));
       this.k.A(p0);
       this.k.z(this.b);
       Object[] objArray = new Object[i];
       a.D().w("EncodeManager", "onError: "+str, objArray);
       this.k.E(this.j.c, str, i2);
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       BubblesInfo uBubblesInfo;
       int len;
       int i1;
       w ow1;
       b uob1;
       boolean i2;
       String str3;
       SparseArray sparseArray1;
       String str5;
       String str6;
       ArrayList uArrayList2;
       int i4;
       w ow2;
       String obj3;
       ma$a uoa;
       ma$a c;
       boolean i5;
       int i6;
       w b;
       Text text;
       List list;
       Object obj5;
       Object[] obj7;
       v obj8;
       Object obj = this;
       Object obj1 = p0;
       Iterator obj2 = p1;
       w ow = w.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, ow, "4")) {
          return;
       }
       obj.d.a();
       Object[] objArray = new Object[0];
       String str = "EncodeManager";
       a.D().w(str, "onFinished trackAssets:"+Arrays.toString(obj.e.trackAssets().toNormalArray()), objArray);
       PostEncodeInfo mVideoEncode = obj.b.mVideoEncodeSDKInfo;
       TextBubbleDetail$Frame uFrame = 0x408f400000000000;
       if (mVideoEncode != null) {
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = obj.e.animatedSubAssets().toNormalArray();
          VideoEncodeSDKInfo mTextBubbleU = obj.b.mVideoEncodeSDKInfo.mTextBubbleUploadInfoList;
          a.u();
          String str1 = "text";
          if (obj2 != null) {
             uBubblesInfo = new BubblesInfo();
             HashMap hashMap = new HashMap();
             uBubblesInfo.mTextBubbleDetails = new ArrayList();
             Iterator iterator = mTextBubbleU.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                hashMap.put(Long.valueOf(uob.mAssetId), uob);
                str1 = str1;
             }
             String str2 = str1;
             HashMap hashMap1 = new HashMap();
             len = uAnimatedSub.length;
             int i = 0;
             while (i < len) {
                object oobject = uAnimatedSub[i];
                hashMap1.put(Long.valueOf(oobject.assetId()), oobject.displayRange());
                i = i + 1;
                i1 = 0;
             }
             int len1 = obj2.length;
             i1 = 0;
             len = 0;
             while (true) {
                if (i1 < len1) {
                   object oobject1 = obj2[i1];
                   ow1 = ow;
                   if ((double)len - uFrame >= 0) {
                   label_0126 :
                      SparseArray sparseArray = new SparseArray();
                      obj2 = hashMap.values().iterator();
                      while (obj2.hasNext()) {
                         uob1 = obj2.next();
                         if (!TextUtils.isEmpty(uob1.mTextBubbleDetail.mText)) {
                            Iterator iterator1 = uob1.mTextBubbleDetail.mFrames.iterator();
                            while (iterator1.hasNext()) {
                               TextBubbleDetail$Frame uFrame1 = iterator1.next();
                               for (uFrame = uFrame1.mStart; uFrame < uFrame1.mEnd; i2 = uFrame + 1) {
                                  if (sparseArray.get(uFrame) == null) {
                                     sparseArray.put(uFrame, new ArrayList());
                                  }
                                  sparseArray.get(uFrame).add(uob1);
                               }
                            }
                         }else {
                            continue ;
                         }
                      }
                      len1 = 0;
                      str3 = "\n";
                      if (sparseArray.get(len1) != null) {
                         obj2 = sparseArray.get(len1).iterator();
                         while (obj2.hasNext()) {
                            uob1 = obj2.next();
                            if (!TextUtils.isEmpty(uob1.mTextBubbleDetail.mText)) {
                               if (uBubblesInfo.mFirstFrameText == null) {
                                  uBubblesInfo.mFirstFrameText = uob1.mTextBubbleDetail.mText;
                               }else {
                                  uBubblesInfo.mFirstFrameText = uBubblesInfo.mFirstFrameText+str3+uob1.mTextBubbleDetail.mText;
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                      ArrayList uArrayList = new ArrayList();
                      JSONArray jSONArray = new JSONArray();
                      HashSet hashSet = new HashSet();
                      i2 = sparseArray.size();
                      for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                         hashSet.add(Integer.valueOf(sparseArray.keyAt(i3)));
                      }
                      ArrayList uArrayList1 = new ArrayList(hashSet);
                      Collections.sort(uArrayList1);
                      i3 = uArrayList1.size();
                      len = 0;
                      String str4 = "frame";
                      while (len < i3) {
                         i = uArrayList1.get(len).intValue();
                         if (sparseArray.get(i) == null) {
                            sparseArray1 = sparseArray;
                            str5 = str3;
                            str6 = str;
                            uArrayList2 = uArrayList1;
                            i4 = i3;
                         label_021b :
                            ow2 = ow1;
                            str = str2;
                         }else {
                            uArrayList2 = uArrayList1;
                            StringBuilder str7 = "";
                            Iterator iterator2 = sparseArray.get(i).iterator();
                            while (iterator2.hasNext()) {
                               sparseArray1 = sparseArray;
                               obj3 = iterator2.next();
                               if (!str7.length()) {
                                  str7 = str7+obj3.mTextBubbleDetail.mText;
                               }else {
                                  str7 = str7+str3+obj3.mTextBubbleDetail.mText;
                                  i3 = i3;
                               }
                               sparseArray = sparseArray1;
                            }
                            sparseArray1 = sparseArray;
                            i4 = i3;
                            obj3 = str7;
                            if (!TextUtils.isEmpty(obj3)) {
                               if (uArrayList.size() > 0) {
                                  i2 = uArrayList.size() - 1;
                                  uoa = uArrayList.get(i2);
                               }else {
                                  uoa = null;
                               }
                               if (uoa != null && !(uoa.c).equals(obj3)) {
                                  String str8 = ma.a(uArrayList);
                                  uArrayList.clear();
                                  str5 = str3;
                                  JSONObject jSONObject = new JSONObject();
                                  try{
                                     ow2 = ow1;
                                     c = uoa.c;
                                     str6 = str;
                                     str = str2;
                                     try{
                                        jSONObject.put(str, c);
                                        jSONObject.put(str4, str8);
                                        jSONArray.put(jSONObject);
                                     }catch(org.json.JSONException e0){
                                     }
                                     e0.printStackTrace();
                                  }catch(org.json.JSONException e0){
                                     str6 = str;
                                     i5 = str2;
                                     goto label_02c1 ;
                                  }
                               }else {
                                  str5 = str3;
                                  str6 = str;
                                  ow2 = ow1;
                                  i5 = str2;
                               }
                               if (uoa != null && (uoa.c).equals(obj3)) {
                                  i6 = uoa.b + 1;
                                  if (i6 == i) {
                                     uoa.b = i;
                                  }
                               }
                               uArrayList.add(new ma$a(obj3, i, i));
                            }else {
                               str5 = str3;
                               str6 = str;
                               goto label_021b ;
                            }
                         }
                         len = len + 1;
                         uArrayList1 = uArrayList2;
                         str2 = str;
                         str3 = str5;
                         i3 = i4;
                         sparseArray = sparseArray1;
                         ow1 = ow2;
                         str = str6;
                      }
                      str6 = str;
                      ow2 = ow1;
                      str = str2;
                      if (!uArrayList.isEmpty()) {
                         try{
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put(str, uArrayList.get(0).c);
                            jSONObject1.put(str4, ma.a(uArrayList));
                            jSONArray.put(jSONObject1);
                         }catch(org.json.JSONException e0){
                            e0.printStackTrace();
                         }
                      }
                   }else {
                      b uob2 = hashMap.get(Long.valueOf(oobject1.assetId()));
                      if (uob2 != null) {
                         b mTextBubbleD1 = uob2.mTextBubbleDetail;
                         if (mTextBubbleD1.mFrames == null) {
                            mTextBubbleD1.mFrames = new ArrayList();
                         }
                         EditorSdk2$TimeRange timeRange = hashMap1.get(Long.valueOf(oobject1.assetId()));
                         if (timeRange == null) {
                            timeRange = new EditorSdk2$TimeRange();
                         }
                         double d2 = timeRange.start() + timeRange.duration();
                         TextBubbleDetail$Frame uFrame3 = new TextBubbleDetail$Frame(oobject1.startFrame(), oobject1.endFrame(), timeRange.start(), d2);
                         uob2.mTextBubbleDetail.mFrames.add(uFrame);
                      }
                      len = len + 1;
                      i1 = i1 + 1;
                      i6 = p1;
                      ow = ow1;
                      uFrame = 0x408f400000000000;
                   }
                }else {
                   ow1 = ow;
                   goto label_0126 ;
                }
             }
          }else {
             ow2 = ow;
             str6 = str;
             str = str1;
             uBubblesInfo = null;
          }
          mVideoEncode.mBubblesInfo = uBubblesInfo;
          b = obj.b;
          VideoEncodeSDKInfo mBubblesInfo = b.mVideoEncodeSDKInfo.mBubblesInfo;
          if (mBubblesInfo != null && b.mWorkspace != null) {
             if (q.f(mBubblesInfo.mTextBubbleDetails)) {
                mBubblesInfo.mTextBubbleDetails = new ArrayList();
             }
             BubblesInfo mTextBubbleD = mBubblesInfo.mTextBubbleDetails;
             List textsList = obj.b.mWorkspace.getTextsList();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             a uoa1 = a.class;
             ArrayList uArrayList3 = new ArrayList();
             int i7 = 0;
             while (i7 < textsList.size()) {
                text = textsList.get(i7);
                if (text.hasCompTextIndoModel()) {
                   TextBubbleDetail textBubbleDe = new TextBubbleDetail();
                   textBubbleDe.mBubbleName = text.getFeatureId().getExternal();
                   textBubbleDe.mFontName = text.getContentFontName();
                   textBubbleDe.mText = text.getText();
                   CommonDraftTextAssetModel$CompTextInfoModel obj4 = PatchProxy.applyOneRefs(text, null, uoa1, "13");
                   str1 = "text.compTextIndoModel";
                   if (obj4 != patchProxyRe) {
                      len = obj4.intValue();
                      list = textsList;
                   }else {
                      a.p(text, str);
                      obj4 = text.getCompTextIndoModel();
                      a.o(obj4, str1);
                      List layerInfosLi = obj4.getLayerInfosList();
                      a.o(layerInfosLi, "text.compTextIndoModel.layerInfosList");
                      Iterator iterator3 = layerInfosLi.iterator();
                      String str9 = -1;
                      int i8 = 0;
                      double d1 = Double.MIN_VALUE;
                      while (iterator3.hasNext()) {
                         Iterator obj9 = iterator3.next();
                         int i9 = i8 + 1;
                         if (i8 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         list = textsList;
                         obj8 = obj9;
                         obj9 = iterator3;
                         a.o(obj8, "compTextLayerInfoModel");
                         if (!obj8.getIsLock() && d1) {
                            str9 = i8;
                            d1 = 0;
                         }
                         textsList = list;
                         iterator3 = obj9;
                         i8 = i9;
                      }
                      list = textsList;
                      len = str9;
                   }
                   if (PatchProxy.isSupport(uoa1)) {
                      obj5 = null;
                      CommonDraftTextAssetModel$CompTextInfoModel obj6 = PatchProxy.applyTwoRefs(text, Integer.valueOf(len), obj5, uoa1, "14");
                      if (obj6 != patchProxyRe) {
                         obj7 = obj6;
                      }else {
                      label_043e :
                         a.p(text, str);
                         if (len < 0) {
                            obj7 = obj5;
                         }else {
                            obj6 = text.getCompTextIndoModel();
                            a.o(obj6, str1);
                            obj8 = obj6.getLayerInfosList().get(len);
                            a.o(obj8, "text.compTextIndoModel.l¡­InfosList[textLayerIndex]");
                            obj7 = obj8.getTextInfo();
                         }
                      }
                   }else {
                      obj5 = null;
                      goto label_043e ;
                   }
                   if (TextUtils.x(textBubbleDe.mText) && obj7 != null) {
                      textBubbleDe.mText = obj7.getText();
                   }
                   boolean b1 = true;
                   textBubbleDe.mInSafeArea = b1;
                   textBubbleDe.mIsManual = b1;
                   textBubbleDe.mFrames = new ArrayList();
                   TimeRange range = text.getResult().getRange();
                   double d = range.getStart() + range.getDuration();
                   TextBubbleDetail$Frame uFrame2 = new TextBubbleDetail$Frame(0, 0, range.getStart(), d);
                   textBubbleDe.mFrames.add(obj7);
                   uArrayList3.add(textBubbleDe);
                }else {
                   list = textsList;
                   obj5 = null;
                }
                i7 = i7 + 1;
                textsList = list;
             }
             mTextBubbleD.addAll(uArrayList3);
          }
       }else {
          ow2 = ow;
          str6 = str;
       }
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ow2, "5")) {
       label_04c1 :
          obj8 = obj;
       }else {
          i5 = p0.isTranscodeSkipped();
          i2 = p0.isWholeFileSegment();
          b = obj.b;
          if (b.mStatus == EncodeInfo$Status.CANCELED) {
             goto label_04c1 ;
          }else {
             b.setSkipTranscodeInExportTask(i5);
             File uFile = new File(p0.getFilePath());
             long l = uFile.length();
             long l1 = (long)(EditorSdk2UtilsV2.getComputedDuration(obj.e) * 0x408f400000000000);
             Object[] objArray1 = new Object[0];
             String str10 = str6;
             a.D().w(str10, obj.f.width()+" "+obj.f.height()+" "+obj.g+" size "+uFile.length()+", isTrancodeSkipped: "+i5, objArray1);
             obj.b.setEncondedFileDuration(l1);
             File uFile1 = new File(obj.g);
             File parentFile = uFile1.getParentFile();
             if (!parentFile.exists() && !parentFile.mkdirs()) {
                obj7 = new Object[0];
                a.D().t(str10, "finalizeEncoding: "+parentFile, obj7);
             }
             obj.b.setEncodedFileCrc(p0.ExportFileCRC());
             str3 = obj.h.getExportTaskStats().getExtraInfo("beautifyStatus");
             obj7 = new Object[0];
             a.D().w(str10, "finalizeEncoding\(\) beautifyStatus="+str3, obj7);
             obj.b.setBeautySdkInfo(str3);
             w b2 = obj.b;
             l1.c(obj.h, b2.mSessionId, b2.mWorkspace);
             obj8 = new v(this, uFile, obj.b, uFile1, i5, i2, obj.i, obj.g, obj.h, obj.c, p0, obj.j, l, l1);
             c.a(v18);
             ow = this;
             if (ow.h.getLinuxFileDescriptor() > 0 && ow.c != null) {
                ow.k.q().s(ow.c.getId(), ow.h.getLinuxFileDescriptor());
             }
          }
       }
       return;
    }
    public void onMp4OverWriteDataReady(ExportTask p0,Mp4OverWriteDataInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "2")) {
          return;
       }
       p0.c = p1.getMp4OverWriteOffset();
       p0.d = p1.getMp4OverWriteData();
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "onMp4OverWriteDataReady offset:"+p1.getMp4OverWriteOffset(), objArray);
       byte[] mp4OverWrite = p1.getMp4OverWriteData();
       int len = mp4OverWrite.length;
       for (int i = 0; i < len; i = i + 1) {
          Object[] objArray1 = new Object[0];
          a.D().w("EncodeManager", "getMp4OverWriteData: "+mp4OverWrite[i], objArray1);
       }
       if (this.c != null) {
          this.k.q().t(this.c.getId());
       }
       return;
    }
    public void onPipelineTemporaryFileParsed(ExportTask p0,ExportedPipelineTempFilesState p1){
       Object[] objArray2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "EncodeManager";
       a.D().w(str, "onPipelineTemporaryFileParsed", objArray);
       int b = p1.exportFileFound();
       int b1 = p1.exportFileValid();
       Object[] objArray1 = new Object[0];
       a.D().w(str, "onPipelineTemporaryFileParsed isFileExist: "+b+", isFileValid: "+b1, objArray1);
       if (!b || !b1) {
          objArray2 = new Object[0];
          a.D().w(str, "onPipelineTemporaryFileParsed file invalid", objArray2);
          return;
       }else {
          EncodedSegmentInfo[] uEncodedSegm = p1.existSegmentsInfo();
          if (uEncodedSegm == null) {
             objArray2 = new Object[0];
             a.D().w(str, "onPipelineTemporaryFileParsed encodedSegmentInfos is null", objArray2);
             return;
          }else {
             a uoa = a.D();
             StringBuilder str1 = "onPipelineTemporaryFileParsed: encodedSegmentInfos "+uEncodedSegm.length+", postWorkInfoId: ";
             w tc = this.c;
             int id = (tc != null)? tc.getId(): -1;
             Object[] objArray3 = new Object[0];
             uoa.s(str, str1+id, objArray3);
             b = uEncodedSegm.length;
             for (b1 = 0; b1 < b; b1 = b1 + 1) {
                s0.b(this.c, uEncodedSegm[b1], 0, p0.getFilePath(), p0.getLinuxFileDescriptor());
             }
             return;
          }
       }
    }
    public void onProgress(ExportTask p0,double p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, ow, "6")) {
          return;
       }
       PostLogger postLogger = new PostLogger().m("EncodeManager").e("EncodeManager");
       postLogger.k(this.b.getSessionId());
       postLogger.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(this.b.getId())).j(PostLogger$Status.PROCESSING).g("onProgress: percent: "+p1).d();
       w tb = this.b;
       tb.mProgress = (float)p1;
       this.k.y(tb);
       return;
    }
    public void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "onSegmentEncoded start="+p1.getStartByte()+" byteLen="+p1.getByteLength()+" segmentDuration="+p1.getSegmentDuration()+" isVideoSeg="+p1.isVideoSegment()+" path="+p0.getFilePath()+" isWholeFileSegment="+p1.isWholeFileSegment(), objArray);
       if (!p1.isWholeFileSegment()) {
          s0.b(this.c, p1, 0, p0.getFilePath(), p0.getLinuxFileDescriptor());
       }
       return;
    }
    public void onStuck(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "onStuck", objArray);
       this.onError(p0);
       return;
    }
}
