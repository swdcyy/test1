package com.kwai.robust.Robust$PatchNative;
import com.kwai.robust.Patch;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Object;
import com.kwai.robust.Robust$a;

public class Robust$PatchNative	// class@001404
{
    public final ClassLoader classLoader;
    public final String nativePath;
    public final Patch patch;

    public void Robust$PatchNative(Patch p0,String p1,ClassLoader p2){
       super();
       this.patch = p0;
       this.nativePath = p1;
       this.classLoader = p2;
    }
    public void Robust$PatchNative(Patch p0,String p1,ClassLoader p2,Robust$a p3){
       super(p0, p1, p2);
    }
}
