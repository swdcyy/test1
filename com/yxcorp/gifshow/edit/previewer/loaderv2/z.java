package com.yxcorp.gifshow.edit.previewer.loaderv2.z;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;

public final class z implements Comparator	// class@001b58
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final int compare(Object p0,Object p1){
       double d = 0;
       double d1 = (p0.displayRange() == null)? d: p0.displayRange().start();
       if (p1.displayRange() != null) {
          d = p1.displayRange().start();
       }
       return (int)((d1 - d) * 0x408f400000000000);
    }
}
