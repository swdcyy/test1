package com.kwai.feature.api.pendant.activity.model.ActPendantCloseDialogModel;
import java.io.Serializable;
import com.kwai.feature.api.pendant.activity.model.ActPendantCloseDialogModel$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActPendantCloseDialogModel implements Serializable	// class@001025
{
    public final String cancel;
    public final String darkIconUrl;
    public final String desc;
    public final String iconUrl;
    public final String ok;
    public final String title;
    public static final ActPendantCloseDialogModel$a Companion;
    public static final long serialVersionUID;

    static {
       ActPendantCloseDialogModel.Companion = new ActPendantCloseDialogModel$a(null);
    }
    public void ActPendantCloseDialogModel(){
       super(null, null, null, null, null, null, 63, null);
    }
    public void ActPendantCloseDialogModel(String p0,String p1,String p2,String p3,String p4,String p5){
       a.p(p2, "title");
       a.p(p3, "desc");
       a.p(p4, "ok");
       a.p(p5, "cancel");
       super();
       this.iconUrl = p0;
       this.darkIconUrl = p1;
       this.title = p2;
       this.desc = p3;
       this.ok = p4;
       this.cancel = p5;
    }
    public void ActPendantCloseDialogModel(String p0,String p1,String p2,String p3,String p4,String p5,int p6,u p7){
       int i = 0;
       int i1 = (p6 & 0x01)? i: p0;
       if (!(p6 & 0x02)) {
          i = p1;
       }
       p1 = "";
       String str = (p6 & 0x04)? p1: p2;
       String str1 = (p6 & 0x08)? p1: p3;
       String str2 = (p6 & 0x10)? p1: p4;
       String str3 = (p6 & 0x20)? p1: p5;
       super(i1, i, str, str1, str2, str3);
       return;
    }
    public static ActPendantCloseDialogModel copy$default(ActPendantCloseDialogModel p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,Object p8){
       ActPendantCloseDialogModel iconUrl;
       ActPendantCloseDialogModel darkIconUrl;
       ActPendantCloseDialogModel title;
       ActPendantCloseDialogModel desc;
       ActPendantCloseDialogModel ok;
       ActPendantCloseDialogModel cancel;
       if (p7 & 0x01) {
          iconUrl = p0.iconUrl;
       }
       if (p7 & 0x02) {
          darkIconUrl = p0.darkIconUrl;
       }
       p8 = darkIconUrl;
       if (p7 & 0x04) {
          title = p0.title;
       }
       ActPendantCloseDialogModel uActPendantC = title;
       if (p7 & 0x08) {
          desc = p0.desc;
       }
       ActPendantCloseDialogModel uActPendantC1 = desc;
       if (p7 & 0x10) {
          ok = p0.ok;
       }
       ActPendantCloseDialogModel uActPendantC2 = ok;
       if (p7 & 0x20) {
          cancel = p0.cancel;
       }
       return p0.copy(iconUrl, p8, uActPendantC, uActPendantC1, uActPendantC2, cancel);
    }
    public final String component1(){
       return this.iconUrl;
    }
    public final String component2(){
       return this.darkIconUrl;
    }
    public final String component3(){
       return this.title;
    }
    public final String component4(){
       return this.desc;
    }
    public final String component5(){
       return this.ok;
    }
    public final String component6(){
       return this.cancel;
    }
    public final ActPendantCloseDialogModel copy(String p0,String p1,String p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(ActPendantCloseDialogModel.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, ActPendantCloseDialogModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "title");
       a.p(p3, "desc");
       a.p(p4, "ok");
       a.p(p5, "cancel");
       ActPendantCloseDialogModel uActPendantC = new ActPendantCloseDialogModel(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActPendantCloseDialogModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ActPendantCloseDialogModel && (a.g(this.iconUrl, p0.iconUrl) && (a.g(this.darkIconUrl, p0.darkIconUrl) && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && (a.g(this.ok, p0.ok) && a.g(this.cancel, p0.cancel)))))))) {
          return true;
       }
       return false;
    }
    public final String getCancel(){
       return this.cancel;
    }
    public final String getDarkIconUrl(){
       return this.darkIconUrl;
    }
    public final String getDesc(){
       return this.desc;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getOk(){
       return this.ok;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       ActPendantCloseDialogModel obj = PatchProxy.apply(null, this, ActPendantCloseDialogModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.iconUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ActPendantCloseDialogModel tdarkIconUrl = this.darkIconUrl;
       int i2 = (tdarkIconUrl != null)? tdarkIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdarkIconUrl = this.title;
       i2 = (tdarkIconUrl != null)? tdarkIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdarkIconUrl = this.desc;
       i2 = (tdarkIconUrl != null)? tdarkIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdarkIconUrl = this.ok;
       i2 = (tdarkIconUrl != null)? tdarkIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdarkIconUrl = this.cancel;
       if (tdarkIconUrl != null) {
          i = tdarkIconUrl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActPendantCloseDialogModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActPendantCloseDialogModel\(iconUrl="+this.iconUrl+", darkIconUrl="+this.darkIconUrl+", title="+this.title+", desc="+this.desc+", ok="+this.ok+", cancel="+this.cancel+"\)";
    }
}
