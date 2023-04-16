package r0d.a;
import vc.i$c;
import java.lang.Object;
import android.content.Context;
import eb.a;
import yc.b;
import yc.d;
import vc.f;
import com.facebook.common.memory.b;
import com.facebook.common.memory.c;
import tc.v;
import tc.g;
import tc.h;
import sc.d;
import vc.a;
import vc.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import r0d.d;

public class a implements i$c	// class@0022f9
{
    public v a;
    public v b;

    public void a(){
       super();
    }
    public m a(Context p0,a p1,b p2,d p3,boolean p4,boolean p5,boolean p6,f p7,b p8,c p9,v p10,v p11,g p12,g p13,h p14,d p15,int p16,int p17,boolean p18,int p19,a p20,boolean p21,int p22){
       d obj1;
       Object obj = this;
       object oobject = p10;
       object oobject1 = p11;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[23];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = oobject;
          objArray[11] = oobject1;
          objArray[12] = p12;
          objArray[13] = p13;
          objArray[14] = p14;
          objArray[15] = p15;
          objArray[16] = Integer.valueOf(p16);
          objArray[17] = Integer.valueOf(p17);
          objArray[18] = Boolean.valueOf(p18);
          objArray[19] = Integer.valueOf(p19);
          objArray[20] = p20;
          objArray[21] = Boolean.valueOf(p21);
          objArray[22] = Integer.valueOf(p22);
          obj1 = PatchProxy.apply(objArray, obj, uoa, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj.a = oobject;
       obj.b = oobject1;
       obj1 = new d(p0, p1, p2, p3, p4, p5, p6, p7, p8, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22);
       return v24;
    }
}
