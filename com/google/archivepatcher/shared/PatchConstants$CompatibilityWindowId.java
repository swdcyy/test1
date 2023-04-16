package com.google.archivepatcher.shared.PatchConstants$CompatibilityWindowId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PatchConstants$CompatibilityWindowId extends Enum	// class@001700
{
    public final byte patchValue;
    public static final PatchConstants$CompatibilityWindowId[] $VALUES;
    public static final PatchConstants$CompatibilityWindowId DEFAULT_DEFLATE;

    static {
       PatchConstants$CompatibilityWindowId uCompatibili = new PatchConstants$CompatibilityWindowId("DEFAULT_DEFLATE", 0, 0);
       PatchConstants$CompatibilityWindowId.DEFAULT_DEFLATE = uCompatibili;
       PatchConstants$CompatibilityWindowId[] uCompatibili1 = new PatchConstants$CompatibilityWindowId[]{uCompatibili};
       PatchConstants$CompatibilityWindowId.$VALUES = uCompatibili1;
    }
    public void PatchConstants$CompatibilityWindowId(String p0,int p1,byte p2){
       super(p0, p1);
       this.patchValue = p2;
    }
    public static PatchConstants$CompatibilityWindowId fromPatchValue(byte p0){
       if (p0) {
          return null;
       }
       return PatchConstants$CompatibilityWindowId.DEFAULT_DEFLATE;
    }
    public static PatchConstants$CompatibilityWindowId valueOf(String p0){
       return Enum.valueOf(PatchConstants$CompatibilityWindowId.class, p0);
    }
    public static PatchConstants$CompatibilityWindowId[] values(){
       return PatchConstants$CompatibilityWindowId.$VALUES.clone();
    }
}
