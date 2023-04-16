package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$8$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.net.Uri;
import android.app.Application;
import o56.a;

public final class GrowthTestPage$inflate$1$8$2 extends Lambda implements a	// class@001535
{
    public static final GrowthTestPage$inflate$1$8$2 INSTANCE;

    static {
       GrowthTestPage$inflate$1$8$2.INSTANCE = new GrowthTestPage$inflate$1$8$2();
    }
    public void GrowthTestPage$inflate$1$8$2(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestPage$inflate$1$8$2.class, "1")) {
          return;
       }
       Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("kwai://setting/calendar"));
       intent.addFlags(0x10000000);
       a.b().startActivity(intent);
       return;
    }
}
