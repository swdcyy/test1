package com.google.archivepatcher.shared.PatchConstants$DeltaFormat;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PatchConstants$DeltaFormat extends Enum	// class@001701
{
    public final byte patchValue;
    public static final PatchConstants$DeltaFormat[] $VALUES;
    public static final PatchConstants$DeltaFormat BSDIFF;

    static {
       PatchConstants$DeltaFormat uDeltaFormat = new PatchConstants$DeltaFormat("BSDIFF", 0, 0);
       PatchConstants$DeltaFormat.BSDIFF = uDeltaFormat;
       PatchConstants$DeltaFormat[] uDeltaFormat1 = new PatchConstants$DeltaFormat[]{uDeltaFormat};
       PatchConstants$DeltaFormat.$VALUES = uDeltaFormat1;
    }
    public void PatchConstants$DeltaFormat(String p0,int p1,byte p2){
       super(p0, p1);
       this.patchValue = p2;
    }
    public static PatchConstants$DeltaFormat fromPatchValue(byte p0){
       if (p0) {
          return null;
       }
       return PatchConstants$DeltaFormat.BSDIFF;
    }
    public static PatchConstants$DeltaFormat valueOf(String p0){
       return Enum.valueOf(PatchConstants$DeltaFormat.class, p0);
    }
    public static PatchConstants$DeltaFormat[] values(){
       return PatchConstants$DeltaFormat.$VALUES.clone();
    }
}
