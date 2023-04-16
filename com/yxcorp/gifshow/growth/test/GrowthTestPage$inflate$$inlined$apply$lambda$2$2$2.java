package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2$2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$2;
import ena.a;
import kotlin.jvm.internal.a;
import android.content.Intent;
import com.yxcorp.gifshow.growth.cleaner.GrowthCleanerActivity;
import android.content.Context;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2 extends Lambda implements a	// class@001515
{
    public final GrowthTestPage$inflate$$inlined$apply$lambda$2$2 this$0;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2(GrowthTestPage$inflate$$inlined$apply$lambda$2$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2.class, "1")) {
          return;
       }
       GrowthTestPage$inflate$$inlined$apply$lambda$2 $context$inl = this.this$0.this$0.$context$inlined;
       if (!PatchProxy.applyVoidOneRefs($context$inl, objArray, a.class, "1")) {
          a.p($context$inl, "$this$startGrowthCleanerActivity");
          $context$inl.startActivity(new Intent($context$inl, GrowthCleanerActivity.class));
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$2$2$2.class, "1");
       return;
    }
}
