package com.kwai.feature.api.social.common.jsbridge.model.ImageCacheParams;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ImageCacheParams implements Serializable	// class@0010c2
{
    public final Map options;
    public final String uri;
    public final List uris;

    public void ImageCacheParams(String p0,List p1,Map p2){
       super();
       this.uri = p0;
       this.uris = p1;
       this.options = p2;
    }
    public static ImageCacheParams copy$default(ImageCacheParams p0,String p1,List p2,Map p3,int p4,Object p5){
       ImageCacheParams uri;
       ImageCacheParams uris;
       ImageCacheParams options;
       if (p4 & 0x01) {
          uri = p0.uri;
       }
       if (p4 & 0x02) {
          uris = p0.uris;
       }
       if (p4 & 0x04) {
          options = p0.options;
       }
       return p0.copy(uri, uris, options);
    }
    public final String component1(){
       return this.uri;
    }
    public final List component2(){
       return this.uris;
    }
    public final Map component3(){
       return this.options;
    }
    public final ImageCacheParams copy(String p0,List p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImageCacheParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImageCacheParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageCacheParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ImageCacheParams && (a.g(this.uri, p0.uri) && (a.g(this.uris, p0.uris) && a.g(this.options, p0.options))))) {
          return true;
       }
       return false;
    }
    public final Map getOptions(){
       return this.options;
    }
    public final String getUri(){
       return this.uri;
    }
    public final List getUris(){
       return this.uris;
    }
    public int hashCode(){
       ImageCacheParams obj = PatchProxy.apply(null, this, ImageCacheParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.uri;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ImageCacheParams turis = this.uris;
       int i2 = (turis != null)? turis.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       turis = this.options;
       if (turis != null) {
          i = turis.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ImageCacheParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ImageCacheParams\(uri="+this.uri+", uris="+this.uris+", options="+this.options+"\)";
    }
}
