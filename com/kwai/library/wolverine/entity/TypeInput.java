package com.kwai.library.wolverine.entity.TypeInput;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class TypeInput implements Serializable	// class@000abe
{
    public int deviceLevel;

    public void TypeInput(int p0){
       super();
       this.deviceLevel = p0;
    }
    public static TypeInput copy$default(TypeInput p0,int p1,int p2,Object p3){
       TypeInput deviceLevel;
       if (p2 & 0x01) {
          deviceLevel = p0.deviceLevel;
       }
       return p0.copy(deviceLevel);
    }
    public final int component1(){
       return this.deviceLevel;
    }
    public final TypeInput copy(int p0){
       return new TypeInput(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TypeInput && this.deviceLevel == p0.deviceLevel)) {
          return true;
       }
       return false;
    }
    public final int getDeviceLevel(){
       return this.deviceLevel;
    }
    public int hashCode(){
       return this.deviceLevel;
    }
    public final void setDeviceLevel(int p0){
       this.deviceLevel = p0;
    }
    public String toString(){
       return "TypeInput\(deviceLevel="+this.deviceLevel+"\)";
    }
}
