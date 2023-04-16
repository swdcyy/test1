package com.kuaishou.merchant.cover.lite.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.util.HashMap;
import nv.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nv.b;
import java.util.Map;
import mv.a;

public final class a implements g	// class@00165c
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       HashMap hashMap = new HashMap();
       if (PatchProxy.applyVoidThreeRefs("LiteMerchantCoverPresenter-", p0, hashMap, null, c.class, "7")) {
       }else if(c.e() != null){
          c.e().a("SuperBowl", "LiteMerchantCoverPresenter-", p0, hashMap);
       }
       if (a.a().e() != null) {
          a.a().e().a("SuperBowl", "LiteMerchantCoverPresenter-", p0, hashMap);
       }
       return;
    }
}
