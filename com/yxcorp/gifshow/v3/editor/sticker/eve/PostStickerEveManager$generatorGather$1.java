package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$generatorGather$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import otc.a;
import java.util.HashMap;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$a;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;

public final class PostStickerEveManager$generatorGather$1 extends Lambda implements p	// class@001246
{
    public static final PostStickerEveManager$generatorGather$1 INSTANCE;

    static {
       PostStickerEveManager$generatorGather$1.INSTANCE = new PostStickerEveManager$generatorGather$1();
    }
    public void PostStickerEveManager$generatorGather$1(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       StickerGroupInfo stickerGroup;
       StickerGroupInfo mGroupName;
       List stickerInfos;
       Iterator iterator1;
       StickerDetailInfo stickerDetai;
       StickerDetailInfo mStickerTag;
       StickerRanker$a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DataBundle obj = PatchProxy.applyTwoRefs(p0, p1, this, PostStickerEveManager$generatorGather$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "triggerEvent");
       List f = a.f;
       obj = new DataBundle();
       HashMap hashMap = new HashMap();
       GeneratedMessageLite generatedMes = p1.f();
       if (generatedMes != null) {
          obj.a("event", generatedMes);
       }
       StickerRanker i = StickerRanker.i;
       Map map = i.g(f);
       Objects.requireNonNull(i);
       HashMap hashMap1 = PatchProxy.applyOneRefs(f, i, StickerRanker.class, "7");
       if (hashMap1 != patchProxyRe) {
       }else {
          hashMap1 = new HashMap();
          if (f != null) {
             Iterator iterator2 = f.iterator();
             while (iterator2.hasNext()) {
                stickerGroup = iterator2.next();
                mGroupName = stickerGroup.mGroupName;
                if (stickerGroup.mGroupId == null || mGroupName == null) {
                   continue ;
                }else {
                   stickerInfos = stickerGroup.getStickerInfos();
                   if (stickerInfos != null) {
                      iterator1 = stickerInfos.iterator();
                      while (iterator1.hasNext()) {
                         stickerDetai = iterator1.next();
                         mStickerTag = stickerDetai.mStickerId;
                         if (mStickerTag != null) {
                            ArrayList uArrayList = hashMap1.get(mStickerTag);
                            if (uArrayList == null) {
                               uArrayList = new ArrayList();
                            }
                            uArrayList.add(mGroupName);
                            stickerDetai = stickerDetai.mStickerId;
                            a.o(stickerDetai, "stickerDetailInfo.mStickerId");
                            hashMap1.put(stickerDetai, uArrayList);
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       List list = StickerRanker.i.d();
       if (f != null) {
          Iterator iterator = f.iterator();
          while (iterator.hasNext()) {
             stickerGroup = iterator.next();
             StickerGroupInfo mGroupId = stickerGroup.mGroupId;
             mGroupName = stickerGroup.mGroupName;
             if (mGroupId == null || (mGroupName == null || !list.contains(mGroupId))) {
                continue ;
             }else {
                stickerInfos = stickerGroup.getStickerInfos();
                if (stickerInfos != null) {
                   iterator1 = stickerInfos.iterator();
                   while (iterator1.hasNext()) {
                      stickerDetai = iterator1.next();
                      if (stickerDetai.mStickerId != null) {
                         JsonElement jsonElement = a.a.x(stickerDetai);
                         if (!jsonElement instanceof JsonObject) {
                            jsonElement = null;
                         }
                         if (jsonElement != null) {
                            StickerRanker i1 = StickerRanker.i;
                            jsonElement.c0("groupIds", i1.k(map.get(stickerDetai.mStickerId)));
                            jsonElement.c0("groupNames", i1.k(hashMap1.get(stickerDetai.mStickerId)));
                            jsonElement.c0("stickerId", stickerDetai.mStickerId);
                            jsonElement.c0("stickerName", stickerDetai.mStickerName);
                            jsonElement.a0("stickerType", Integer.valueOf(stickerDetai.mStickerType));
                            mStickerTag = stickerDetai.mStickerTag;
                            if (mStickerTag != null) {
                               jsonElement.c0("stickerTag", mStickerTag);
                            }
                            mStickerTag = stickerDetai.mFeaturesJson;
                            if (mStickerTag != null) {
                               jsonElement.c0("featuresJson", mStickerTag);
                            }
                            if (!hashMap.containsKey(stickerDetai.mStickerId)) {
                               stickerDetai = stickerDetai.mStickerId;
                               a.o(stickerDetai, "stickerDetailInfo.mStickerId");
                               hashMap.put(stickerDetai, jsonElement);
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       String str = a.a.q(hashMap);
       a.o(str, "Gsons.KWAI_GSON.toJson\(stickersMap\)");
       obj.a("stickers", str);
       obj.a("isNebula", Boolean.FALSE);
       obj.a("platform", "ANDROID_PHONE");
       StickerRanker i2 = StickerRanker.i;
       Objects.requireNonNull(i2);
       obj.a("photoType", StickerRanker.e);
       String str1 = i2.f();
       if (str1 == null) {
          str1 = "";
       }
       obj.a("productTags", str1);
       a = i2.h().a;
       if (a == null) {
          a = new JsonObject();
       }
       str = a.toString();
       a.o(str, "abObject.toString\(\)");
       obj.a("abConfig", str);
       obj.b(DataBundle$TRANSFER.REF);
       return obj;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
