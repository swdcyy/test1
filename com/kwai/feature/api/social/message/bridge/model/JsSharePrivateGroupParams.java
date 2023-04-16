package com.kwai.feature.api.social.message.bridge.model.JsSharePrivateGroupParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsSharePrivateGroupParams implements Serializable	// class@001139
{
    public final String callback;
    public final String desc;
    public final String iconUrl;
    public final String imShareId;
    public final String name;
    public final String snapshot;
    public final int style;
    public final String title;
    public final String url;

    public void JsSharePrivateGroupParams(String p0,String p1,String p2,String p3,String p4,String p5,int p6,String p7,String p8){
       a.p(p0, "imShareId");
       a.p(p1, "iconUrl");
       a.p(p2, "url");
       a.p(p3, "title");
       a.p(p4, "desc");
       a.p(p5, "name");
       a.p(p7, "snapshot");
       super();
       this.imShareId = p0;
       this.iconUrl = p1;
       this.url = p2;
       this.title = p3;
       this.desc = p4;
       this.name = p5;
       this.style = p6;
       this.snapshot = p7;
       this.callback = p8;
    }
    public static JsSharePrivateGroupParams copy$default(JsSharePrivateGroupParams p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,String p8,String p9,int p10,Object p11){
       JsSharePrivateGroupParams jsSharePriva = p0;
       int i = p10;
       JsSharePrivateGroupParams imShareId = (i & 0x01)? jsSharePriva.imShareId: p1;
       JsSharePrivateGroupParams iconUrl = (i & 0x02)? jsSharePriva.iconUrl: p2;
       JsSharePrivateGroupParams url = (i & 0x04)? jsSharePriva.url: p3;
       JsSharePrivateGroupParams title = (i & 0x08)? jsSharePriva.title: p4;
       JsSharePrivateGroupParams desc = (i & 0x10)? jsSharePriva.desc: p5;
       JsSharePrivateGroupParams name = (i & 0x20)? jsSharePriva.name: p6;
       JsSharePrivateGroupParams style = (i & 0x40)? jsSharePriva.style: p7;
       JsSharePrivateGroupParams snapshot = (i & 0x0080)? jsSharePriva.snapshot: p8;
       JsSharePrivateGroupParams callback = (i & 0x0100)? jsSharePriva.callback: p9;
       return p0.copy(imShareId, iconUrl, url, title, desc, name, style, snapshot, callback);
    }
    public final String component1(){
       return this.imShareId;
    }
    public final String component2(){
       return this.iconUrl;
    }
    public final String component3(){
       return this.url;
    }
    public final String component4(){
       return this.title;
    }
    public final String component5(){
       return this.desc;
    }
    public final String component6(){
       return this.name;
    }
    public final int component7(){
       return this.style;
    }
    public final String component8(){
       return this.snapshot;
    }
    public final String component9(){
       return this.callback;
    }
    public final JsSharePrivateGroupParams copy(String p0,String p1,String p2,String p3,String p4,String p5,int p6,String p7,String p8){
       JsSharePrivateGroupParams obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p7;
       if (PatchProxy.isSupport(JsSharePrivateGroupParams.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = oobject6;
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, JsSharePrivateGroupParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "imShareId");
       a.p(p1, "iconUrl");
       a.p(p2, "url");
       a.p(oobject3, "title");
       a.p(oobject4, "desc");
       a.p(oobject5, "name");
       a.p(oobject6, "snapshot");
       obj = new JsSharePrivateGroupParams(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsSharePrivateGroupParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsSharePrivateGroupParams && (a.g(this.imShareId, p0.imShareId) && (a.g(this.iconUrl, p0.iconUrl) && (a.g(this.url, p0.url) && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && (a.g(this.name, p0.name) && (this.style == p0.style && (a.g(this.snapshot, p0.snapshot) && a.g(this.callback, p0.callback))))))))))) {
          return true;
       }
       return false;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getDesc(){
       return this.desc;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getImShareId(){
       return this.imShareId;
    }
    public final String getName(){
       return this.name;
    }
    public final String getSnapshot(){
       return this.snapshot;
    }
    public final int getStyle(){
       return this.style;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       JsSharePrivateGroupParams obj = PatchProxy.apply(null, this, JsSharePrivateGroupParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.imShareId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsSharePrivateGroupParams ticonUrl = this.iconUrl;
       int i2 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticonUrl = this.url;
       i2 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticonUrl = this.title;
       i2 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticonUrl = this.desc;
       i2 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticonUrl = this.name;
       i2 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.style) * 31;
       ticonUrl = this.snapshot;
       i2 = (ticonUrl != null)? ticonUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ticonUrl = this.callback;
       if (ticonUrl != null) {
          i = ticonUrl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsSharePrivateGroupParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsSharePrivateGroupParams\(imShareId="+this.imShareId+", iconUrl="+this.iconUrl+", url="+this.url+", title="+this.title+", desc="+this.desc+", name="+this.name+", style="+this.style+", snapshot="+this.snapshot+", callback="+this.callback+"\)";
    }
}
