package com.kwai.framework.network.etag.ETagResult;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public final class ETagResult	// class@000c07
{
    public final String eTag;
    public final String entity;

    public void ETagResult(String p0,String p1){
       super();
       this.eTag = p0;
       this.entity = p1;
    }
    public static ETagResult create(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ETagResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ETagResult(p0, p1);
    }
    public String eTag(){
       return this.eTag;
    }
    public String entity(){
       return this.entity;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, ETagResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.eTag) && !TextUtils.isEmpty(this.entity))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ETagResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ETagResult{eTag="+this.eTag+", entity="+this.entity+"}";
    }
}
