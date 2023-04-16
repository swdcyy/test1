package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$7$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import upa.c;
import com.yxcorp.gifshow.entity.QPhoto;

public final class GrowthTestPage$inflate$1$7$1 extends Lambda implements a	// class@001532
{
    public static final GrowthTestPage$inflate$1$7$1 INSTANCE;

    static {
       GrowthTestPage$inflate$1$7$1.INSTANCE = new GrowthTestPage$inflate$1$7$1();
    }
    public void GrowthTestPage$inflate$1$7$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthTestPage$inflate$1$7$1.class, "1")) {
          return;
       }
       c g = c.g;
       QPhoto qPhoto = g.c();
       if (qPhoto != null) {
          objArray = qPhoto.getPhotoId();
       }
       g.d(objArray);
       g.b();
       return;
    }
}
