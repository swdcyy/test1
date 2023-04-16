package com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutSchemeParams;
import java.io.Serializable;
import java.lang.String;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AICutSchemeParams implements Serializable	// class@001ae5
{
    public final boolean disableScroll;
    public final String musicId;
    public final MusicType musicType;
    public final String schemeUri;
    public final long styleId;

    public void AICutSchemeParams(long p0,String p1,MusicType p2,boolean p3,String p4){
       a.p(p4, "schemeUri");
       super();
       this.styleId = p0;
       this.musicId = p1;
       this.musicType = p2;
       this.disableScroll = p3;
       this.schemeUri = p4;
    }
    public static AICutSchemeParams copy$default(AICutSchemeParams p0,long p1,String p2,MusicType p3,boolean p4,String p5,int p6,Object p7){
       AICutSchemeParams styleId;
       AICutSchemeParams musicId;
       AICutSchemeParams musicType;
       AICutSchemeParams disableScrol;
       AICutSchemeParams schemeUri;
       if (p6 & 0x01) {
          styleId = p0.styleId;
       }
       AICutSchemeParams uAICutScheme = styleId;
       if (p6 & 0x02) {
          musicId = p0.musicId;
       }
       AICutSchemeParams uAICutScheme1 = musicId;
       if (p6 & 0x04) {
          musicType = p0.musicType;
       }
       AICutSchemeParams uAICutScheme2 = musicType;
       if (p6 & 0x08) {
          disableScrol = p0.disableScroll;
       }
       AICutSchemeParams uAICutScheme3 = disableScrol;
       if (p6 & 0x10) {
          schemeUri = p0.schemeUri;
       }
       return p0.copy(uAICutScheme, uAICutScheme1, uAICutScheme2, uAICutScheme3, schemeUri);
    }
    public final long component1(){
       return this.styleId;
    }
    public final String component2(){
       return this.musicId;
    }
    public final MusicType component3(){
       return this.musicType;
    }
    public final boolean component4(){
       return this.disableScroll;
    }
    public final String component5(){
       return this.schemeUri;
    }
    public final AICutSchemeParams copy(long p0,String p1,MusicType p2,boolean p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(AICutSchemeParams.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, AICutSchemeParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p4, "schemeUri");
       AICutSchemeParams uAICutScheme = new AICutSchemeParams(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AICutSchemeParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AICutSchemeParams && (!this.styleId - p0.styleId && (a.g(this.musicId, p0.musicId) && (a.g(this.musicType, p0.musicType) && (this.disableScroll == p0.disableScroll && a.g(this.schemeUri, p0.schemeUri))))))) {
          return true;
       }
       return false;
    }
    public final boolean getDisableScroll(){
       return this.disableScroll;
    }
    public final String getMusicId(){
       return this.musicId;
    }
    public final MusicType getMusicType(){
       return this.musicType;
    }
    public final String getSchemeUri(){
       return this.schemeUri;
    }
    public final long getStyleId(){
       return this.styleId;
    }
    public int hashCode(){
       AICutSchemeParams obj = PatchProxy.apply(null, this, AICutSchemeParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.styleId;
       int i = (int)(obj ^ (obj >> 32)) * 31;
       obj = this.musicId;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.musicType;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.disableScroll;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.schemeUri;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AICutSchemeParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AICutSchemeParams\(styleId="+this.styleId+", musicId="+this.musicId+", musicType="+this.musicType+", disableScroll="+this.disableScroll+", schemeUri="+this.schemeUri+"\)";
    }
}
