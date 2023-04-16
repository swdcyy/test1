package com.yxcorp.gifshow.model.response.PostStartUpResponse;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$PostStartUpData;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.response.RecoTextResult;
import com.kwai.feature.post.api.feature.live.ShareLivePredictionConfig;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PostStartUpResponse	// class@001f58
{
    public PostStartUpResponse$PostStartUpData data;

    public void PostStartUpResponse(PostStartUpResponse$PostStartUpData p0){
       super();
       this.data = p0;
    }
    public final PostStartUpResponse$PostStartUpData a(){
       return this.data;
    }
    public final List b(){
       ArrayList obj = PatchProxy.apply(null, this, PostStartUpResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Lists.b();
       a.o(obj, "Lists.newArrayList\(\)");
       PostStartUpResponse tdata = this.data;
       if (tdata != null) {
          PostStartUpResponse$PostStartUpData defaultCover = tdata.defaultCoverTextList;
          if (defaultCover != null) {
             Iterator iterator = defaultCover.iterator();
             while (iterator.hasNext()) {
                RecoTextResult mText = iterator.next().mText;
                a.o(mText, "it.mText");
                obj.add(mText);
             }
          }
       }
       return obj;
    }
    public final List c(){
       ArrayList obj = PatchProxy.apply(null, this, PostStartUpResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Lists.b();
       a.o(obj, "Lists.newArrayList\(\)");
       PostStartUpResponse tdata = this.data;
       if (tdata != null) {
          PostStartUpResponse$PostStartUpData defaultRecoT = tdata.defaultRecoTextList;
          if (defaultRecoT != null) {
             Iterator iterator = defaultRecoT.iterator();
             while (iterator.hasNext()) {
                RecoTextResult mText = iterator.next().mText;
                a.o(mText, "it.mText");
                obj.add(mText);
             }
          }
       }
       return obj;
    }
    public final ShareLivePredictionConfig d(){
       Object[] objArray = null;
       PostStartUpResponse obj = PatchProxy.apply(objArray, this, PostStartUpResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.data;
       if (obj != null) {
          objArray = obj.shareLivePredictionConfig;
       }
       return objArray;
    }
    public final ShareBusinessLinkInfo e(){
       Object[] objArray = null;
       PostStartUpResponse obj = PatchProxy.apply(objArray, this, PostStartUpResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.data;
       if (obj != null) {
          objArray = obj.shareBusinessLinkInfo;
       }
       return objArray;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostStartUpResponse.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PostStartUpResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PostStartUpResponse obj = PatchProxy.apply(null, this, PostStartUpResponse.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostStartUpResponse.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostStartUpResponse\(data="+this.data+"\)";
    }
}
