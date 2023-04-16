package com.tencent.open.utils.m;
import java.lang.Cloneable;
import java.lang.Object;

public final class m implements Cloneable	// class@000f86
{
    public int a;

    public void m(int p0){
       super();
       this.a = p0;
    }
    public void m(byte[] p0){
       super(p0, 0);
    }
    public void m(byte[] p0,int p1){
       super();
       int i = (p0[(p1 + 1)] << 8) & 0xff00;
       this.a = i;
       this.a = i + (p0[p1] & 0x00ff);
    }
    public byte[] a(){
       m ta;
       byte[] uobyteArray = new byte[]{(byte)(ta & 0x00ff),(byte)((ta & 0xff00) >> 8)};
       ta = this.a;
       return uobyteArray;
    }
    public int b(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 == null || (p0 instanceof m && this.a == p0.b())) {
          b = true;
       }
    label_0013 :
       return b;
    }
    public int hashCode(){
       return this.a;
    }
}
