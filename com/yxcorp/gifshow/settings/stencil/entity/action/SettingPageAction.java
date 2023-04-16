package com.yxcorp.gifshow.settings.stencil.entity.action.SettingPageAction;
import java.io.Serializable;
import com.yxcorp.gifshow.settings.stencil.entity.action.SettingItemActionType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SettingPageAction implements Serializable	// class@001b3b
{
    public final SettingItemActionType type;
    public final String url;

    public void SettingPageAction(SettingItemActionType p0,String p1){
       super();
       this.type = p0;
       this.url = p1;
    }
    public static SettingPageAction copy$default(SettingPageAction p0,SettingItemActionType p1,String p2,int p3,Object p4){
       SettingPageAction type;
       SettingPageAction url;
       if (p3 & 0x01) {
          type = p0.type;
       }
       if (p3 & 0x02) {
          url = p0.url;
       }
       return p0.copy(type, url);
    }
    public final SettingItemActionType component1(){
       return this.type;
    }
    public final String component2(){
       return this.url;
    }
    public final SettingPageAction copy(SettingItemActionType p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SettingPageAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SettingPageAction(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingPageAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SettingPageAction && (a.g(this.type, p0.type) && a.g(this.url, p0.url)))) {
          return true;
       }
       return false;
    }
    public final SettingItemActionType getType(){
       return this.type;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       SettingPageAction obj = PatchProxy.apply(null, this, SettingPageAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SettingPageAction turl = this.url;
       if (turl != null) {
          i = turl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SettingPageAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingPageAction\(type="+this.type+", url="+this.url+"\)";
    }
}
