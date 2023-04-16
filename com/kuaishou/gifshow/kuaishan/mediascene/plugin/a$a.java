package com.kuaishou.gifshow.kuaishan.mediascene.plugin.a$a;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import java.lang.StringBuilder;
import java.io.File;
import qkd.b;
import fg6.a;
import qkd.c;
import com.kuaishou.gifshow.kuaishan.mediascene.plugin.MediaScenePluginImpl$parseMediaSceneResource$1$templateAssetList$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import d90.a;
import java.util.Objects;
import d90.a$a;
import java.lang.IllegalArgumentException;
import com.kuaishou.gifshow.kuaishan.mediascene.plugin.MediaScenePluginImpl$parseMediaSceneResource$1$textJsonList$1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.HashMap;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.feature.post.api.mediascene.MediaSceneAssetContent;
import com.yxcorp.gifshow.model.TextGenerateJsonData;
import com.kwai.feature.post.api.mediascene.MediaSceneServerParams;
import java.lang.CharSequence;

public final class a$a implements Callable	// class@001a8d
{
    public final String b;
    public final String c;

    public void a$a(String p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       a obj1;
       a$a uoa2;
       List list;
       Object[] objArray1;
       Object[] objArray2;
       Object[] objArray = null;
       String str = "1";
       MediaSceneInitParams mediaSceneIn = PatchProxy.apply(objArray, this, a$a.class, str);
       if (mediaSceneIn != PatchProxyResult.class) {
       }else {
          String str1 = this.b+"/assets.json";
          String str2 = this.b+"/tmp.json";
          if (b.S(new File(this.b))) {
             if (b.S(new File(str1))) {
                Iterator obj = a.a.i(c.l(str1), new MediaScenePluginImpl$parseMediaSceneResource$1$templateAssetList$1().getType());
                a.o(obj, "Gsons.KWAI_GSON.fromJson…Asset>>\(\) {}.type\n      \)");
                ArrayList uArrayList = new ArrayList();
                obj = obj.iterator();
                while (true) {
                   a uoa = null;
                   a uoa1 = 1;
                   if (obj.hasNext()) {
                      obj1 = obj.next();
                      uoa2 = obj1;
                      Objects.requireNonNull(uoa2);
                      if (!PatchProxy.applyVoid(objArray, uoa2, a.class, str)) {
                         a metaDataStri = uoa2.metaDataString;
                         if (metaDataStri == null || !metaDataStri.length()) {
                            uoa = 1;
                         }
                         if (uoa == null) {
                            uoa2.a = a.a.h(uoa2.metaDataString, a$a.class);
                         }else {
                            throw new IllegalArgumentException("");
                         }
                      }
                      if (uoa2.replaceable != null) {
                         uArrayList.add(obj1);
                      }
                   }else if(b.S(new File(str2))){
                      list = a.a.i(c.l(str2), new MediaScenePluginImpl$parseMediaSceneResource$1$textJsonList$1().getType());
                      a.o(list, "Gsons.KWAI_GSON.fromJson…ata>>\(\) {}.type\n        \)");
                   }else {
                      list = CollectionsKt__CollectionsKt.E();
                   }
                   HashMap hashMap = new HashMap();
                   Iterator iterator = uArrayList.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         a uoa3 = iterator.next();
                         obj1 = uoa3.a;
                         uoa2 = (obj1 != null)? obj1.textId: objArray;
                         a$a assetTag = (obj1 != null)? obj1.assetTag: objArray;
                         boolean i = (assetTag == null || !assetTag.length())? 1: 0;
                         if (i) {
                            PostUtils.D("MediaScenePluginImpl", "可替换区域未关联 assetTag:"+uoa3.a(), new RuntimeException());
                         }else if(uoa2 == null || !uoa2.length()){
                            i = true;
                         }else {
                            i = false;
                         }
                         if (i) {
                            MediaSceneAssetContent mediaSceneAs = new MediaSceneAssetContent();
                            mediaSceneAs.mAssetType = 3;
                            mediaSceneAs.mContent = this.b+"/"+uoa3.a();
                            hashMap.put(assetTag, mediaSceneAs);
                            continue ;
                         }else {
                            Iterator iterator1 = list.iterator();
                            while (true) {
                               if (iterator1.hasNext()) {
                                  objArray1 = iterator1.next();
                                  if (!a.g(uoa2, objArray1.getId())) {
                                     continue ;
                                  }
                               }else {
                                  objArray1 = objArray;
                               }
                               if (objArray1 != null) {
                                  MediaSceneAssetContent mediaSceneAs1 = new MediaSceneAssetContent();
                                  mediaSceneAs1.mAssetType = uoa1;
                                  mediaSceneAs1.mContent = "#"+objArray1.getContent();
                                  hashMap.put(assetTag, mediaSceneAs1);
                                  continue ;
                               }else {
                                  throw new IllegalArgumentException("Can\'t find text in tmp.json, id="+uoa2);
                               }
                            }
                         }
                      }else {
                         MediaSceneServerParams mediaSceneSe = new MediaSceneServerParams();
                         mediaSceneSe.mSceneType = 100;
                         mediaSceneSe.mVideoSceneType = 0x2710;
                         mediaSceneSe.mAssetContents = hashMap;
                         MediaSceneInitParams mediaSceneIn1 = new MediaSceneInitParams();
                         mediaSceneIn1.mServerParams = mediaSceneSe;
                         b.q0(new File(this.c), a.a.q(mediaSceneIn1));
                         mediaSceneIn = mediaSceneIn1;
                         break ;
                      }
                   }
                }
             }else {
                throw new IllegalArgumentException("assets.json 未找到, path="+str1);
             }
          }else {
             throw new IllegalArgumentException("资源包未找到, path="+this.b);
          }
       }
       return mediaSceneIn;
    }
}
