package com.kwai.robust.Robust$InnerPatch;
import com.kwai.robust.Patch;
import com.kwai.robust.Robust$PatchDex;
import com.kwai.robust.Robust$PatchNative;
import java.lang.Object;
import com.kwai.robust.Robust$a;

public class Robust$InnerPatch	// class@001401
{
    public final Patch patch;
    public final Robust$PatchDex patchDex;
    public final Robust$PatchNative patchNative;

    public void Robust$InnerPatch(Patch p0,Robust$PatchDex p1,Robust$PatchNative p2){
       super();
       this.patch = p0;
       this.patchDex = p1;
       this.patchNative = p2;
    }
    public void Robust$InnerPatch(Patch p0,Robust$PatchDex p1,Robust$PatchNative p2,Robust$a p3){
       super(p0, p1, p2);
    }
}
