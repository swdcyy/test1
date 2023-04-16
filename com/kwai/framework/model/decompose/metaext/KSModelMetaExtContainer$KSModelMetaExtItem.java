package com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$KSModelMetaExtItem;
import java.io.Serializable;
import java.lang.String;
import ha6.a;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KSModelMetaExtContainer$KSModelMetaExtItem implements Serializable	// class@0016a4
{
    public final String jsonPath;
    public final a metaExt;

    public void KSModelMetaExtContainer$KSModelMetaExtItem(String p0,a p1){
       a.p(p0, "jsonPath");
       a.p(p1, "metaExt");
       super();
       this.jsonPath = p0;
       this.metaExt = p1;
    }
    public final String getJsonPath(){
       return this.jsonPath;
    }
    public final a getMetaExt(){
       return this.metaExt;
    }
}
