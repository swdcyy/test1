package com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$b;
import gs5.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f08.f;
import f08.f$a;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Long;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import e08.b;
import d08.a;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import nsd.u;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;

public final class LiveDACPresenter$b implements a	// class@00168d
{

    public void LiveDACPresenter$b(){
       super();
    }
    public void a(String p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveDACPresenter$b.class, "3")) {
          return;
       }
       f$a.s(f.a, p0, p1, p2, p3, null, 16, null);
       return;
    }
    public void b(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(LiveDACPresenter$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, LiveDACPresenter$b.class, "2")) {
          return;
       }
       f$a.t(f.a, p0, p1, p2, null, p3, false, 40, null);
       return;
    }
    public void c(String p0,long p1,String p2){
       RxBus f;
       if (PatchProxy.isSupport(LiveDACPresenter$b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, LiveDACPresenter$b.class, "1")) {
          return;
       }
       Objects.requireNonNull(PendantUtil.a);
       f$a.t(f.a, p0, p2, "unmount component event post", null, false, false, 56, null);
       f = RxBus.f;
       a[] uoaArray = new a[1];
       String str = (p2 != null)? p2: "";
       a uoa = new a(3, p1, str, null, null, null, null, null, null, null, 0, 2016, null);
       uoaArray[0] = v19;
       f.b(new b(CollectionsKt__CollectionsKt.r(uoaArray), p0));
       return;
    }
}
