package com.yxcorp.gifshow.designercreation.model.CreationTab;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.CharSequence;

public final class CreationTab implements Serializable	// class@0012fe
{
    public final String name;
    public final Integer type;

    public void CreationTab(Integer p0,String p1){
       super();
       this.type = p0;
       this.name = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CreationTab.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof CreationTab) {
          return b;
       }
       if (a.g(this.type, p0.type) && a.g(this.name, p0.name)) {
          b = true;
       }
       return b;
    }
    public final String getName(){
       return this.name;
    }
    public final Integer getType(){
       return this.type;
    }
    public int hashCode(){
       CreationTab obj = PatchProxy.apply(null, this, CreationTab.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.intValue(): 0;
       i1 = i1 * 31;
       CreationTab tname = this.name;
       if (tname != null) {
          i = tname.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isCreation(){
       CreationTab obj = PatchProxy.apply(null, this, CreationTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.type;
       boolean b = (obj != null && obj.intValue() == 3)? true: false;
       return b;
    }
    public final boolean isMagic(){
       CreationTab obj = PatchProxy.apply(null, this, CreationTab.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.type;
       boolean b = true;
       if (obj == null || obj.intValue() != b) {
          b = false;
       }
       return b;
    }
    public final boolean isTemplate(){
       CreationTab obj = PatchProxy.apply(null, this, CreationTab.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.type;
       boolean b = (obj != null && obj.intValue() == 2)? true: false;
       return b;
    }
    public final boolean isValid(){
       CreationTab obj = PatchProxy.apply(null, this, CreationTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isCreation() && (this.isTemplate() || this.isMagic())) {
          obj = this.name;
          obj = (obj == null || !obj.length())? 1: 0;
          if (!obj) {
             b = true;
          }
       }
       return b;
    }
}
