package com.yxcorp.gifshow.settings.page.SettingItemListArguments;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SettingItemListArguments implements Serializable	// class@001b30
{
    public final List items;
    public final String title;

    public void SettingItemListArguments(String p0,List p1){
       super();
       this.title = p0;
       this.items = p1;
    }
    public static SettingItemListArguments copy$default(SettingItemListArguments p0,String p1,List p2,int p3,Object p4){
       SettingItemListArguments title;
       SettingItemListArguments items;
       if (p3 & 0x01) {
          title = p0.title;
       }
       if (p3 & 0x02) {
          items = p0.items;
       }
       return p0.copy(title, items);
    }
    public final String component1(){
       return this.title;
    }
    public final List component2(){
       return this.items;
    }
    public final SettingItemListArguments copy(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SettingItemListArguments.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SettingItemListArguments(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingItemListArguments.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SettingItemListArguments && (a.g(this.title, p0.title) && a.g(this.items, p0.items)))) {
          return true;
       }
       return false;
    }
    public final List getItems(){
       return this.items;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       SettingItemListArguments obj = PatchProxy.apply(null, this, SettingItemListArguments.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SettingItemListArguments titems = this.items;
       if (titems != null) {
          i = titems.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SettingItemListArguments.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingItemListArguments\(title="+this.title+", items="+this.items+"\)";
    }
}
