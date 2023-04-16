package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$d;
import erd.o;
import java.lang.Object;
import v97.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import kotlin.jvm.internal.a;
import xa7.c;

public final class EveApi$apiMocker$2$a$d implements o	// class@001454
{
    public static final EveApi$apiMocker$2$a$d b;

    static {
       EveApi$apiMocker$2$a$d.b = new EveApi$apiMocker$2$a$d();
    }
    public void EveApi$apiMocker$2$a$d(){
       super();
    }
    public Object apply(Object p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, EveApi$apiMocker$2$a$d.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = p0.data;
          a.m(p0);
          uoc = p0;
       }
       return uoc;
    }
}
