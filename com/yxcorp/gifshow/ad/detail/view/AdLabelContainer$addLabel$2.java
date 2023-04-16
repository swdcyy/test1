package com.yxcorp.gifshow.ad.detail.view.AdLabelContainer$addLabel$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import t19.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t19.a$a;

public final class AdLabelContainer$addLabel$2 extends Lambda implements l	// class@0016f1
{
    public final int $index;
    public final PhotoAdvertisement$ExtraDisplayTag $label;
    public final a this$0;

    public void AdLabelContainer$addLabel$2(a p0,int p1,PhotoAdvertisement$ExtraDisplayTag p2){
       this.this$0 = p0;
       this.$index = p1;
       this.$label = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdLabelContainer$addLabel$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a = this.this$0.a;
       if (a != null) {
          a.a(this.$index, this.$label);
       }
       return;
    }
}
