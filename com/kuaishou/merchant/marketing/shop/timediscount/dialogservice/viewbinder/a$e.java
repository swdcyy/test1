package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$e;
import y94.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import y94.c;

public final class a$e implements a	// class@001c2d
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void onChanged(Object p0){
       int i = p0.intValue();
       a$e uoe = a$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoe, "1")) {
          uoe = this.a;
          Objects.requireNonNull(uoe);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoe, uoa, "6")) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      uoe.Z8();
                   }
                }else {
                   uoe.Y8();
                }
             }else {
                i = uoe.G;
                if (i == null) {
                   a.S("mContainerLiveData");
                }
                i = i.f();
                if (!i || (i == 1 || i == 2)) {
                   uoe.Y8();
                }
             }
          }
       }
       return;
    }
}
