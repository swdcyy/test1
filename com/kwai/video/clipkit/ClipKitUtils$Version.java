package com.kwai.video.clipkit.ClipKitUtils$Version;
import java.lang.Comparable;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Boolean;

public class ClipKitUtils$Version implements Comparable	// class@001a34
{
    public String version;

    public void ClipKitUtils$Version(String p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Version can not be null");
       }
       if (!p0.matches("[0-9]+\(\\.[a-z]*[0-9]+\)*")) {
          throw new IllegalArgumentException("Invalid version format");
       }
       this.version = p0;
       return;
    }
    public int compareTo(ClipKitUtils$Version p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipKitUtils$Version.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 1;
       }
       String[] stringArray = (this.get()).split("\\.");
       String[] stringArray1 = (p0.get()).split("\\.");
       int i = Math.max(stringArray.length, stringArray1.length);
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return 0;
          }
          if (!(stringArray[i1]).matches(".*[a-z]*.*")) {
             int i2 = (i1 < stringArray.length)? Integer.parseInt(stringArray[i1]): 0;
             int i3 = (i1 < stringArray1.length)? Integer.parseInt(stringArray1[i1]): 0;
             if (i2 < i3) {
                break ;
             }else if(i2 > i3){
                return 1;
             }
          }
          i1 = i1 + 1;
       }
       return -1;
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipKitUtils$Version.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.compareTo(p0)) {
          b = false;
       }
       return b;
    }
    public final String get(){
       return this.version;
    }
}
