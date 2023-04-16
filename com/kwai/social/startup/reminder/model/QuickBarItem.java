package com.kwai.social.startup.reminder.model.QuickBarItem;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.s0;
import java.lang.Number;
import java.lang.StringBuilder;

public final class QuickBarItem implements Serializable	// class@000f71
{
    public final String actionUrl;
    public final String desc;
    public final String id;
    public final String picUrl;
    public final String text;
    public final Integer type;

    public void QuickBarItem(Integer p0,String p1,String p2,String p3,String p4,String p5){
       a.p(p3, "text");
       a.p(p4, "picUrl");
       a.p(p5, "actionUrl");
       super();
       this.type = p0;
       this.id = p1;
       this.desc = p2;
       this.text = p3;
       this.picUrl = p4;
       this.actionUrl = p5;
    }
    public static QuickBarItem copy$default(QuickBarItem p0,Integer p1,String p2,String p3,String p4,String p5,String p6,int p7,Object p8){
       QuickBarItem type;
       QuickBarItem id;
       QuickBarItem desc;
       QuickBarItem text;
       QuickBarItem picUrl;
       QuickBarItem actionUrl;
       if (p7 & 0x01) {
          type = p0.type;
       }
       if (p7 & 0x02) {
          id = p0.id;
       }
       p8 = id;
       if (p7 & 0x04) {
          desc = p0.desc;
       }
       QuickBarItem quickBarItem = desc;
       if (p7 & 0x08) {
          text = p0.text;
       }
       QuickBarItem quickBarItem1 = text;
       if (p7 & 0x10) {
          picUrl = p0.picUrl;
       }
       QuickBarItem quickBarItem2 = picUrl;
       if (p7 & 0x20) {
          actionUrl = p0.actionUrl;
       }
       return p0.copy(type, p8, quickBarItem, quickBarItem1, quickBarItem2, actionUrl);
    }
    public final Integer component1(){
       return this.type;
    }
    public final String component2(){
       return this.id;
    }
    public final String component3(){
       return this.desc;
    }
    public final String component4(){
       return this.text;
    }
    public final String component5(){
       return this.picUrl;
    }
    public final String component6(){
       return this.actionUrl;
    }
    public final QuickBarItem copy(Integer p0,String p1,String p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(QuickBarItem.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, QuickBarItem.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p3, "text");
       a.p(p4, "picUrl");
       a.p(p5, "actionUrl");
       QuickBarItem quickBarItem = new QuickBarItem(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QuickBarItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof QuickBarItem) {
          return false;
       }
       if (!s0.a(this.text, p0.text) || (!s0.a(this.picUrl, p0.picUrl) || !s0.a(this.actionUrl, p0.actionUrl))) {
          b = false;
       }
       return b;
    }
    public final String getActionUrl(){
       return this.actionUrl;
    }
    public final String getDesc(){
       return this.desc;
    }
    public final String getId(){
       return this.id;
    }
    public final String getPicUrl(){
       return this.picUrl;
    }
    public final String getText(){
       return this.text;
    }
    public final Integer getType(){
       return this.type;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, QuickBarItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((this.text).hashCode() * 31) + (this.picUrl).hashCode()) * 31) + (this.actionUrl).hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QuickBarItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QuickBarItem\(type="+this.type+", id="+this.id+", desc="+this.desc+", text="+this.text+", picUrl="+this.picUrl+", actionUrl="+this.actionUrl+"\)";
    }
}
