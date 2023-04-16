package com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;

public final class BottomSheetContainerFragment$a	// class@00177b
{
    public int a;
    public float b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void BottomSheetContainerFragment$a(){
       super(0, 0, 0, 0, false, false, false, 127, null);
    }
    public void BottomSheetContainerFragment$a(int p0,float p1,int p2,int p3,boolean p4,boolean p5,boolean p6,int p7,u p8){
       if (p7 & 0x01) {
          p0 = a1.e(16.00f);
       }
       if (p7 & 0x02) {
          p1 = 0x3f000000;
       }
       if (p7 & 0x04) {
          p2 = (n.w(a1.c()) * 7) / 10;
       }
       if (p7 & 0x08) {
          p3 = n.w(a1.c()) - n.A(a1.c());
       }
       if (p7 & 0x10) {
          p4 = false;
       }
       if (p7 & 0x20) {
          p5 = true;
       }
       if (p7 & 0x40) {
          p6 = true;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       return;
    }
    public final int a(){
       BottomSheetContainerFragment$a td = (this.e != null)? this.d: this.c;
       return td;
    }
    public final boolean b(){
       return this.e;
    }
    public final int c(){
       return this.a;
    }
}
