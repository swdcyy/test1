package com.yxcorp.gifshow.designercreation.model.CreationTabResponse;
import java.io.Serializable;
import java.lang.Integer;
import com.yxcorp.gifshow.designercreation.model.CreationTab;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Number;

public final class CreationTabResponse implements Serializable	// class@0012ff
{
    public final Integer result;
    public final List subTab;
    public final CreationTab tab;

    public void CreationTabResponse(Integer p0,CreationTab p1,List p2){
       super();
       this.result = p0;
       this.tab = p1;
       this.subTab = p2;
    }
    public boolean equals(Object p0){
       CreationTabResponse obj = PatchProxy.applyOneRefs(p0, this, CreationTabResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof CreationTabResponse) {
          return false;
       }
       if (a.g(this.result, p0.result) ^ 1) {
          return false;
       }
       obj = this.tab;
       if (obj != null && obj.equals(p0.tab) == true) {
          obj = this.subTab;
          if (obj == null && p0.subTab == null) {
             return 1;
          }else if(obj == null || p0.subTab == null){
             if (obj.size() != p0.subTab.size()) {
                return false;
             }else if(this.subTab.isEmpty() ^ 1){
                int i = this.subTab.size();
                int i1 = 0;
                while (i1 < i) {
                   int i2 = a.g(this.subTab.get(i1), p0.subTab.get(i1)) ^ 1;
                   if (i2) {
                      return false;
                   }
                   i1 = i1 + 1;
                }
             }
             return 1;
          }
       }
       return false;
    }
    public final Integer getResult(){
       return this.result;
    }
    public final List getSubTab(){
       return this.subTab;
    }
    public final CreationTab getTab(){
       return this.tab;
    }
    public int hashCode(){
       CreationTabResponse obj = PatchProxy.apply(null, this, CreationTabResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.result;
       int i = 0;
       int i1 = (obj != null)? obj.intValue(): 0;
       i1 = i1 * 31;
       CreationTabResponse ttab = this.tab;
       int i2 = (ttab != null)? ttab.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttab = this.subTab;
       if (ttab != null) {
          i = ttab.hashCode();
       }
       return (i1 + i);
    }
}
