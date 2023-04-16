package com.kwai.video.krtc.Arya$16;
import com.kwai.video.stannis.observers.DataReadyObserver;
import com.kwai.video.krtc.Arya;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.String;

public class Arya$16 implements DataReadyObserver	// class@00064f
{
    public final Arya this$0;

    public void Arya$16(Arya p0){
       this.this$0 = p0;
       super();
    }
    public void onDataReady(int p0,ByteBuffer p1,int p2,int p3,int p4,long p5,short p6,int p7){
       Object obj = this;
       int i = p0;
       object oobject = p1;
       Arya$16 u16 = Arya$16.class;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(u16)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),Short.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, obj, u16, "1")) {
             return;
          }
       }
       boolean b = (i != 512)? true: false;
       int i4 = p1.remaining();
       byte[] uobyteArray = new byte[i4];
       oobject.get(uobyteArray, i3, i4);
       i2 = (p2 * p4) * 2;
       if (i == 1536) {
          if (Arya.s(obj.this$0)) {
             Arya$16 this$0 = obj.this$0;
             Arya.a(this$0, Arya.c(this$0), uobyteArray, i2, p3, p4, p5, 0, p0);
          }
       }else {
          Arya$16 this$01 = obj.this$0;
          Arya.a(this$01, Arya.c(this$01), uobyteArray, i2, p3, p4, p5, b, 0);
       }
       return;
    }
}
