package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$a;
import gna.b$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import msd.l;
import gna.b$c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import gna.b;

public final class GrowthCleanerLayout$a	// class@001350
{
    public final b$a a;

    public void GrowthCleanerLayout$a(b$a p0){
       a.p(p0, "parent");
       super();
       this.a = p0;
    }
    public static b$c a(GrowthCleanerLayout$a p0,String p1,String p2,Integer p3,boolean p4,String p5,Integer p6,boolean p7,Drawable p8,boolean p9,l p10,int p11,Object p12){
       b$c uoc;
       GrowthCleanerLayout$a uoa = p0;
       object oobject = p1;
       int i = p11;
       object oobject1 = (i & 0x02)? null: p2;
       object oobject2 = (i & 0x04)? null: p3;
       int i1 = 0;
       boolean b = (i & 0x08)? false: p4;
       object oobject3 = (i & 0x10)? null: p5;
       boolean b1 = (i & 0x40)? false: p7;
       object oobject4 = (i & 0x0080)? null: p8;
       boolean b2 = (i & 0x0100)? false: p9;
       object oobject5 = (i & 0x0200)? null: p10;
       Objects.requireNonNull(p0);
       GrowthCleanerLayout$a uoa1 = GrowthCleanerLayout$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[10];
          objArray[i1] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Boolean.valueOf(b);
          objArray[4] = oobject3;
          objArray[5] = null;
          objArray[6] = Boolean.valueOf(b1);
          objArray[7] = oobject4;
          objArray[8] = Boolean.valueOf(b2);
          objArray[9] = oobject5;
          uoc = PatchProxy.apply(objArray, p0, uoa1, "2");
          if (uoc != PatchProxyResult.class) {
          label_00b7 :
             return uoc;
          }
       }
       a.p(oobject, "title");
       b$c uoc1 = new b$c(p1, oobject1, oobject3, oobject4, b2, oobject5);
       uoc.r(oobject2);
       uoc.s(b);
       uoc.o(null);
       uoc.p(b1);
       uoa.a.u(uoc);
       goto label_00b7 ;
    }
}
