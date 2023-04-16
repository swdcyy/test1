package com.kwai.sdk.eve.InitConfig$Builder;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import bn7.a;
import java.util.Objects;
import com.kwai.sdk.eve.EveTaskPackageSource;
import com.kwai.sdk.eve.InitConfig$Builder$apiResponseFinder$1;

public class InitConfig$Builder	// class@001440
{
    public g a;
    public f b;
    public g c;
    public EveFeatureCenterConfig d;
    public List e;
    public a f;
    public EveTaskPackageSource g;
    public l h;
    public a i;
    public e j;
    public c k;
    public boolean l;
    public a m;
    public FeatureCenterSwitchConfig n;
    public int o;
    public o p;
    public o q;
    public List r;
    public final Context s;

    public void InitConfig$Builder(Context p0){
       a.p(p0, "context");
       super();
       this.s = p0;
       this.e = CollectionsKt__CollectionsKt.E();
       Objects.requireNonNull(a.c);
       this.f = a.b;
       this.g = EveTaskPackageSource.RecoServer;
       this.h = InitConfig$Builder$apiResponseFinder$1.INSTANCE;
       this.o = 2;
    }
}
