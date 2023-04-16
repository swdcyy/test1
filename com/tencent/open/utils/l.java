package com.tencent.open.utils.l;
import java.lang.Cloneable;
import java.lang.Object;

public final class l implements Cloneable	// class@000f85
{
    public long a;

    public void l(long p0){
       super();
       this.a = p0;
    }
    public byte[] a(){
       l ta;
       byte[] uobyteArray = new byte[]{(byte)(int)(255 & ta),(byte)(int)((0xff00 & ta) >> 8),(byte)(int)((0xff0000 & ta) >> 16),(byte)(int)((ta & 0xff000000) >> 24)};
       ta = this.a;
       return uobyteArray;
    }
    public long b(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 == null || (p0 instanceof l && !this.a - p0.b())) {
          b = true;
       }
    label_0015 :
       return b;
    }
    public int hashCode(){
       return (int)this.a;
    }
}
