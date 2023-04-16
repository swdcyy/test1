package com.facebook.react.modules.network.a;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class a extends FilterOutputStream	// class@0012cd
{
    public long b;

    public void a(OutputStream p0){
       super(p0);
       this.b = 0;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.out.close();
       return;
    }
    public void write(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "2")) {
          return;
       }
       this.out.write(p0);
       this.b = this.b + 1;
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       this.out.write(p0, p1, p2);
       this.b = this.b + (long)p2;
       return;
    }
}
