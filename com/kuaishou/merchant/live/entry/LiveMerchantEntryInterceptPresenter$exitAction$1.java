package com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$exitAction$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b64.c;
import java.util.Objects;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.lang.System;
import java.lang.RuntimeException;

public final class LiveMerchantEntryInterceptPresenter$exitAction$1 extends Lambda implements a	// class@001a0e
{
    public static final LiveMerchantEntryInterceptPresenter$exitAction$1 INSTANCE;

    static {
       LiveMerchantEntryInterceptPresenter$exitAction$1.INSTANCE = new LiveMerchantEntryInterceptPresenter$exitAction$1();
    }
    public void LiveMerchantEntryInterceptPresenter$exitAction$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMerchantEntryInterceptPresenter$exitAction$1.class, "1")) {
          return;
       }
       c a = c.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(objArray, a, c.class, "2")) {
          return;
       }
       a.A(MerchantLiveLogBiz.ENTRY, "LiveMerchantMemUtil", "anchor kill app !!!");
       System.exit(0);
       throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
