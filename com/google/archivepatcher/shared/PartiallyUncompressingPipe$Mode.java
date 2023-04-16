package com.google.archivepatcher.shared.PartiallyUncompressingPipe$Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PartiallyUncompressingPipe$Mode extends Enum	// class@0016fe
{
    public static final PartiallyUncompressingPipe$Mode[] $VALUES;
    public static final PartiallyUncompressingPipe$Mode COPY;
    public static final PartiallyUncompressingPipe$Mode UNCOMPRESS_NOWRAP;
    public static final PartiallyUncompressingPipe$Mode UNCOMPRESS_WRAPPED;

    static {
       PartiallyUncompressingPipe$Mode mode = new PartiallyUncompressingPipe$Mode("COPY", 0);
       PartiallyUncompressingPipe$Mode.COPY = mode;
       PartiallyUncompressingPipe$Mode mode1 = new PartiallyUncompressingPipe$Mode("UNCOMPRESS_WRAPPED", 1);
       PartiallyUncompressingPipe$Mode.UNCOMPRESS_WRAPPED = mode1;
       PartiallyUncompressingPipe$Mode mode2 = new PartiallyUncompressingPipe$Mode("UNCOMPRESS_NOWRAP", 2);
       PartiallyUncompressingPipe$Mode.UNCOMPRESS_NOWRAP = mode2;
       PartiallyUncompressingPipe$Mode[] modeArray = new PartiallyUncompressingPipe$Mode[]{mode,mode1,mode2};
       PartiallyUncompressingPipe$Mode.$VALUES = modeArray;
    }
    public void PartiallyUncompressingPipe$Mode(String p0,int p1){
       super(p0, p1);
    }
    public static PartiallyUncompressingPipe$Mode valueOf(String p0){
       return Enum.valueOf(PartiallyUncompressingPipe$Mode.class, p0);
    }
    public static PartiallyUncompressingPipe$Mode[] values(){
       return PartiallyUncompressingPipe$Mode.$VALUES.clone();
    }
}
