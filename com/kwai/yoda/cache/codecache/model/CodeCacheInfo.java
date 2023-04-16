package com.kwai.yoda.cache.codecache.model.CodeCacheInfo;
import android.os.Parcelable;
import com.kwai.yoda.cache.codecache.model.CodeCacheInfo$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class CodeCacheInfo implements Parcelable	// class@0011a8
{
    public final String jsSourcePath;
    public final String savePath;
    public final String url;
    public static final Parcelable$Creator CREATOR;

    static {
       CodeCacheInfo.CREATOR = new CodeCacheInfo$a();
    }
    public void CodeCacheInfo(String p0,String p1,String p2){
       a.q(p0, "url");
       a.q(p1, "jsSourcePath");
       a.q(p2, "savePath");
       super();
       this.url = p0;
       this.jsSourcePath = p1;
       this.savePath = p2;
    }
    public static CodeCacheInfo copy$default(CodeCacheInfo p0,String p1,String p2,String p3,int p4,Object p5){
       CodeCacheInfo url;
       CodeCacheInfo jsSourcePath;
       CodeCacheInfo savePath;
       if (p4 & 0x01) {
          url = p0.url;
       }
       if (p4 & 0x02) {
          jsSourcePath = p0.jsSourcePath;
       }
       if (p4 & 0x04) {
          savePath = p0.savePath;
       }
       return p0.copy(url, jsSourcePath, savePath);
    }
    public final String component1(){
       return this.url;
    }
    public final String component2(){
       return this.jsSourcePath;
    }
    public final String component3(){
       return this.savePath;
    }
    public final CodeCacheInfo copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CodeCacheInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "url");
       a.q(p1, "jsSourcePath");
       a.q(p2, "savePath");
       return new CodeCacheInfo(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CodeCacheInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CodeCacheInfo && (a.g(this.url, p0.url) && (a.g(this.jsSourcePath, p0.jsSourcePath) && a.g(this.savePath, p0.savePath))))) {
          return true;
       }
       return false;
    }
    public final String getJsSourcePath(){
       return this.jsSourcePath;
    }
    public final String getSavePath(){
       return this.savePath;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       CodeCacheInfo obj = PatchProxy.apply(null, this, CodeCacheInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.url;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CodeCacheInfo tjsSourcePat = this.jsSourcePath;
       int i2 = (tjsSourcePat != null)? tjsSourcePat.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tjsSourcePat = this.savePath;
       if (tjsSourcePat != null) {
          i = tjsSourcePat.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CodeCacheInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CodeCacheInfo\(url="+this.url+", jsSourcePath="+this.jsSourcePath+", savePath="+this.savePath+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(CodeCacheInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CodeCacheInfo.class, "5")) {
          return;
       }
       a.q(p0, "parcel");
       p0.writeString(this.url);
       p0.writeString(this.jsSourcePath);
       p0.writeString(this.savePath);
       return;
    }
}
