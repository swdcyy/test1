package com.kwai.library.wolverine.entity.TypeInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class TypeInfo implements Serializable	// class@000abd
{
    public final String type;
    public final String typeState;

    public void TypeInfo(String p0,String p1){
       a.p(p0, "type");
       a.p(p1, "typeState");
       super();
       this.type = p0;
       this.typeState = p1;
    }
    public static TypeInfo copy$default(TypeInfo p0,String p1,String p2,int p3,Object p4){
       TypeInfo type;
       TypeInfo typeState;
       if (p3 & 0x01) {
          type = p0.type;
       }
       if (p3 & 0x02) {
          typeState = p0.typeState;
       }
       return p0.copy(type, typeState);
    }
    public final String component1(){
       return this.type;
    }
    public final String component2(){
       return this.typeState;
    }
    public final TypeInfo copy(String p0,String p1){
       a.p(p0, "type");
       a.p(p1, "typeState");
       return new TypeInfo(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TypeInfo && (a.g(this.type, p0.type) && a.g(this.typeState, p0.typeState)))) {
          return true;
       }
       return false;
    }
    public final String getType(){
       return this.type;
    }
    public final String getTypeState(){
       return this.typeState;
    }
    public int hashCode(){
       TypeInfo ttype = this.type;
       int i = 0;
       int i1 = (ttype != null)? ttype.hashCode(): 0;
       i1 = i1 * 31;
       TypeInfo ttypeState = this.typeState;
       if (ttypeState != null) {
          i = ttypeState.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "TypeInfo\(type="+this.type+", typeState="+this.typeState+"\)";
    }
}
