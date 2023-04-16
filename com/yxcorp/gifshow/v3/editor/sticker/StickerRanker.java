package com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$stickerReRankABConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$needRankStickerGroupIds$2;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import faa.a;
import q87.c;
import crd.b;
import lnc.b9;
import ooc.d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$b;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$c;
import erd.g;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$TaskType;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$ErrorInfo;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$a;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.StringBuilder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;

public final class StickerRanker	// class@001213
{
    public static Map a;
    public static Map b;
    public static b c;
    public static String d;
    public static String e;
    public static boolean f;
    public static final p g;
    public static final p h;
    public static final StickerRanker i;

    static {
       StickerRanker.i = new StickerRanker();
       StickerRanker.g = s.c(StickerRanker$stickerReRankABConfig$2.INSTANCE);
       StickerRanker.h = s.c(StickerRanker$needRankStickerGroupIds$2.INSTANCE);
    }
    public void StickerRanker(){
       super();
    }
    public static final void a(StickerRanker p0,String p1){
       StickerRanker.d = p1;
    }
    public final void b(EditorSdk2V2$VideoEditorProject p0,List p1){
       d a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerRanker.class, "16")) {
          return;
       }
       String str = "StickerRanker";
       int i = 0;
       if (p0 == null) {
          a uoa = (p1 == null || p1.isEmpty())? 1: null;
          if (uoa) {
             Object[] objArray = new Object[i];
             a.D().w(str, "analyzeScene, project is null", objArray);
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().w(str, "start analyzeScene", objArray1);
       b9.a(StickerRanker.c);
       a = d.a;
       if (p1 == null) {
          p1 = CollectionsKt__CollectionsKt.E();
       }
       StickerRanker.c = d.b(a, p0, p1, null, 1, 4, null).observeOn(d.a).subscribe(StickerRanker$b.b, StickerRanker$c.b);
       return;
    }
    public final void c(){
       StickerRanker.d = null;
       StickerRanker.e = "Unknown";
       StickerRanker.f = false;
    }
    public final List d(){
       List obj = PatchProxy.apply(null, this, StickerRanker.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e();
       PostStickerEveLogger postStickerE = (obj == null || obj.isEmpty())? 1: null;
       if (postStickerE) {
          PostStickerEveLogger.d.d(PostStickerEveLogger$TaskType.PanelSort, PostStickerEveLogger$ErrorInfo.NoNeedRerank);
       }
       return this.e();
    }
    public final List e(){
       Object obj = PatchProxy.apply(null, this, StickerRanker.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StickerRanker.h.getValue();
    }
    public final String f(){
       return StickerRanker.d;
    }
    public final Map g(List p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, StickerRanker.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             StickerGroupInfo stickerGroup = iterator.next();
             StickerGroupInfo mGroupId = stickerGroup.mGroupId;
             StickerGroupInfo mGroupName = stickerGroup.mGroupName;
             if (mGroupId == null || mGroupName == null) {
                continue ;
             }else {
                List stickerInfos = stickerGroup.getStickerInfos();
                if (stickerInfos != null) {
                   Iterator iterator1 = stickerInfos.iterator();
                   while (iterator1.hasNext()) {
                      StickerDetailInfo stickerDetai = iterator1.next();
                      StickerDetailInfo mStickerId = stickerDetai.mStickerId;
                      if (mStickerId != null) {
                         ArrayList uArrayList = obj.get(mStickerId);
                         if (uArrayList == null) {
                            uArrayList = new ArrayList();
                         }
                         uArrayList.add(mGroupId);
                         stickerDetai = stickerDetai.mStickerId;
                         a.o(stickerDetai, "stickerDetailInfo.mStickerId");
                         obj.put(stickerDetai, uArrayList);
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       return obj;
    }
    public final StickerRanker$a h(){
       Object obj = PatchProxy.apply(null, this, StickerRanker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StickerRanker.g.getValue();
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerRanker.class, "18")) {
          return;
       }
       String str = "stickerId";
       a.p(p0, str);
       if (!this.h().a()) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StickerRanker", "onStickerSelected", objArray);
       i3 oi3 = i3.f();
       oi3.d(str, p0);
       oi3.c("usageMode", Integer.valueOf(2));
       CustomEvent uCustomEvent = CustomEvent.newBuilder().setCustomKey("postStickerUsageEvent").setCustomValue(oi3.e()).build();
       a.o(uCustomEvent, "eveCustomEvent");
       Object[] objArray1 = new Object[0];
       a.D().w("StickerRanker", "postStickerUsageEvent, "+uCustomEvent.getCustomValue(), objArray1);
       EveManagerWrapper.e.n(uCustomEvent);
       return;
    }
    public final void j(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerRanker.class, "10")) {
          return;
       }
       a.p(p0, "newScoreMap");
       StickerRanker.a = p0;
       return;
    }
    public final String k(List p0){
       String str1;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, StickerRanker.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             obj = (obj == null)? "": obj+',';
             obj = obj+str;
          }
       }
       if (obj != null) {
          str1 = obj;
          if (str1 != null) {
          label_003e :
             return str1;
          }
       }
       str1 = "";
       goto label_003e ;
    }
    public final void l(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerRanker.class, "4")) {
          return;
       }
       if (!this.h().a()) {
          return;
       }
       StickerRanker.b = this.g(p0);
       return;
    }
}
