package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig$b;
import java.lang.String;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class PlcDynamicContainerConfig implements Serializable, Parcelable	// class@00101b
{
    public String bizExtraData;
    public final int bizType;
    public String codSourcePage;
    public PlcDynamicContainerStyle containerStyle;
    public String downgradeUrl;
    public boolean keepPlayerPause;
    public PlcDynamicTitleConfig titleConfig;
    public String token;
    public final int type;
    public String url;
    public static final Parcelable$Creator CREATOR;
    public static final PlcDynamicContainerConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PlcDynamicContainerConfig.Companion = new PlcDynamicContainerConfig$a(null);
       PlcDynamicContainerConfig.CREATOR = new PlcDynamicContainerConfig$b();
    }
    public void PlcDynamicContainerConfig(){
       super(0, null, null, 0, null, null, null, null, null, false, 1023, null);
    }
    public void PlcDynamicContainerConfig(int p0,String p1,String p2,int p3,String p4,String p5,PlcDynamicTitleConfig p6,PlcDynamicContainerStyle p7,String p8,boolean p9){
       a.p(p1, "url");
       a.p(p2, "downgradeUrl");
       a.p(p4, "token");
       a.p(p5, "codSourcePage");
       super();
       this.type = p0;
       this.url = p1;
       this.downgradeUrl = p2;
       this.bizType = p3;
       this.token = p4;
       this.codSourcePage = p5;
       this.titleConfig = p6;
       this.containerStyle = p7;
       this.bizExtraData = p8;
       this.keepPlayerPause = p9;
    }
    public void PlcDynamicContainerConfig(int p0,String p1,String p2,int p3,String p4,String p5,PlcDynamicTitleConfig p6,PlcDynamicContainerStyle p7,String p8,boolean p9,int p10,u p11){
       int i = p10;
       int i1 = 0;
       int i2 = (i & 0x01)? 0: p0;
       String str = "";
       String str1 = (i & 0x02)? str: p1;
       String str2 = (i & 0x04)? str: p2;
       int i3 = (i & 0x08)? 0: p3;
       String str3 = (i & 0x10)? str: p4;
       String str4 = (i & 0x20)? str: p5;
       int i4 = 0;
       int i5 = (i & 0x40)? i4: p6;
       if (!(i & 0x0080)) {
          i4 = p7;
       }
       if (!(i & 0x0100)) {
          str = p8;
       }
       if (!(i & 0x0200)) {
          i1 = p9;
       }
       super(i2, str1, str2, i3, str3, str4, i5, i4, str, i1);
       return;
    }
    public static PlcDynamicContainerConfig copy$default(PlcDynamicContainerConfig p0,int p1,String p2,String p3,int p4,String p5,String p6,PlcDynamicTitleConfig p7,PlcDynamicContainerStyle p8,String p9,boolean p10,int p11,Object p12){
       PlcDynamicContainerConfig plcDynamicCo = p0;
       int i = p11;
       PlcDynamicContainerConfig type = (i & 0x01)? plcDynamicCo.type: p1;
       PlcDynamicContainerConfig url = (i & 0x02)? plcDynamicCo.url: p2;
       PlcDynamicContainerConfig downgradeUrl = (i & 0x04)? plcDynamicCo.downgradeUrl: p3;
       PlcDynamicContainerConfig bizType = (i & 0x08)? plcDynamicCo.bizType: p4;
       PlcDynamicContainerConfig token = (i & 0x10)? plcDynamicCo.token: p5;
       PlcDynamicContainerConfig codSourcePag = (i & 0x20)? plcDynamicCo.codSourcePage: p6;
       PlcDynamicContainerConfig titleConfig = (i & 0x40)? plcDynamicCo.titleConfig: p7;
       PlcDynamicContainerConfig containerSty = (i & 0x0080)? plcDynamicCo.containerStyle: p8;
       PlcDynamicContainerConfig bizExtraData = (i & 0x0100)? plcDynamicCo.bizExtraData: p9;
       PlcDynamicContainerConfig keepPlayerPa = (i & 0x0200)? plcDynamicCo.keepPlayerPause: p10;
       return p0.copy(type, url, downgradeUrl, bizType, token, codSourcePag, titleConfig, containerSty, bizExtraData, keepPlayerPa);
    }
    public final int component1(){
       return this.type;
    }
    public final boolean component10(){
       return this.keepPlayerPause;
    }
    public final String component2(){
       return this.url;
    }
    public final String component3(){
       return this.downgradeUrl;
    }
    public final int component4(){
       return this.bizType;
    }
    public final String component5(){
       return this.token;
    }
    public final String component6(){
       return this.codSourcePage;
    }
    public final PlcDynamicTitleConfig component7(){
       return this.titleConfig;
    }
    public final PlcDynamicContainerStyle component8(){
       return this.containerStyle;
    }
    public final String component9(){
       return this.bizExtraData;
    }
    public final PlcDynamicContainerConfig copy(int p0,String p1,String p2,int p3,String p4,String p5,PlcDynamicTitleConfig p6,PlcDynamicContainerStyle p7,String p8,boolean p9){
       PlcDynamicContainerConfig obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p5;
       if (PatchProxy.isSupport(PlcDynamicContainerConfig.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = oobject2;
          objArray[5] = oobject3;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = Boolean.valueOf(p9);
          obj = PatchProxy.apply(objArray, this, PlcDynamicContainerConfig.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p1, "url");
       a.p(oobject1, "downgradeUrl");
       a.p(oobject2, "token");
       a.p(oobject3, "codSourcePage");
       obj = new PlcDynamicContainerConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return v12;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PlcDynamicContainerConfig && (this.type == p0.type && (a.g(this.url, p0.url) && (a.g(this.downgradeUrl, p0.downgradeUrl) && (this.bizType == p0.bizType && (a.g(this.token, p0.token) && (a.g(this.codSourcePage, p0.codSourcePage) && (a.g(this.titleConfig, p0.titleConfig) && (a.g(this.containerStyle, p0.containerStyle) && (a.g(this.bizExtraData, p0.bizExtraData) && this.keepPlayerPause == p0.keepPlayerPause))))))))))) {
          return true;
       }
       return false;
    }
    public final String getBizExtraData(){
       return this.bizExtraData;
    }
    public final int getBizType(){
       return this.bizType;
    }
    public final String getCodSourcePage(){
       return this.codSourcePage;
    }
    public final PlcDynamicContainerStyle getContainerStyle(){
       return this.containerStyle;
    }
    public final String getDowngradeUrl(){
       return this.downgradeUrl;
    }
    public final boolean getKeepPlayerPause(){
       return this.keepPlayerPause;
    }
    public final PlcDynamicTitleConfig getTitleConfig(){
       return this.titleConfig;
    }
    public final String getToken(){
       return this.token;
    }
    public final int getType(){
       return this.type;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       PlcDynamicContainerConfig turl = this.url;
       int i1 = 0;
       int i2 = (turl != null)? turl.hashCode(): 0;
       i = (i + i2) * 31;
       turl = this.downgradeUrl;
       i2 = (turl != null)? turl.hashCode(): 0;
       i = (((i + i2) * 31) + this.bizType) * 31;
       turl = this.token;
       i2 = (turl != null)? turl.hashCode(): 0;
       i = (i + i2) * 31;
       turl = this.codSourcePage;
       i2 = (turl != null)? turl.hashCode(): 0;
       i = (i + i2) * 31;
       turl = this.titleConfig;
       i2 = (turl != null)? turl.hashCode(): 0;
       i = (i + i2) * 31;
       turl = this.containerStyle;
       i2 = (turl != null)? turl.hashCode(): 0;
       i = (i + i2) * 31;
       turl = this.bizExtraData;
       if (turl != null) {
          i1 = turl.hashCode();
       }
       i = (i + i1) * 31;
       turl = this.keepPlayerPause;
       if (turl != null) {
          i2 = 1;
       }
       return (i + i2);
    }
    public final void setBizExtraData(String p0){
       this.bizExtraData = p0;
    }
    public final void setCodSourcePage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerConfig.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.codSourcePage = p0;
       return;
    }
    public final void setContainerStyle(PlcDynamicContainerStyle p0){
       this.containerStyle = p0;
    }
    public final void setDowngradeUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.downgradeUrl = p0;
       return;
    }
    public final void setKeepPlayerPause(boolean p0){
       this.keepPlayerPause = p0;
    }
    public final void setTitleConfig(PlcDynamicTitleConfig p0){
       this.titleConfig = p0;
    }
    public final void setToken(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerConfig.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.token = p0;
       return;
    }
    public final void setUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.url = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PlcDynamicContainerConfig\(type="+this.type+", url="+this.url+", downgradeUrl="+this.downgradeUrl+", bizType="+this.bizType+", token="+this.token+", codSourcePage="+this.codSourcePage+", titleConfig="+this.titleConfig+", containerStyle="+this.containerStyle+", bizExtraData="+this.bizExtraData+", keepPlayerPause="+this.keepPlayerPause+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PlcDynamicContainerConfig.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlcDynamicContainerConfig.class, "9")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.type);
       p0.writeString(this.url);
       p0.writeString(this.downgradeUrl);
       p0.writeInt(this.bizType);
       p0.writeString(this.token);
       p0.writeString(this.codSourcePage);
       PlcDynamicContainerConfig ttitleConfig = this.titleConfig;
       if (ttitleConfig != null) {
          p0.writeInt(1);
          ttitleConfig.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       ttitleConfig = this.containerStyle;
       if (ttitleConfig != null) {
          p0.writeInt(1);
          ttitleConfig.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       p0.writeString(this.bizExtraData);
       p0.writeInt(this.keepPlayerPause);
       return;
    }
}
