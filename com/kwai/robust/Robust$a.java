package com.kwai.robust.Robust$a;
import com.kwai.robust.PatchProxy$a;
import com.kwai.robust.Robust;
import com.kwai.robust.Robust$MethodListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;

public class Robust$a implements PatchProxy$a	// class@001405
{
    public final Robust$MethodListener a;
    public final Robust b;

    public void Robust$a(Robust p0,Robust$MethodListener p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onMethodEntry(Class p0,String p1){
       this.a.onMethodEntry(p0, p1);
    }
    public void onMethodExit(Class p0,String p1){
       this.a.onMethodExit(p0, p1);
    }
}
