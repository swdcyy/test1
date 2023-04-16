package com.kwai.sdk.eve.internal.featurecenter.FeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import cn.vimfung.luascriptcore.LuaValue;
import ml5.a;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class FeatureProvider extends IFeatureProvider	// class@0014e8
{
    public final a action;
    public final a value;

    public void FeatureProvider(String p0,FeatureProvider p1){
       a.p(p0, "name");
       a.p(p1, "featureProvider");
       super(p1.getCategory(), p0);
       FeatureProvider value = p1.value;
       this.value = value;
       this.action = p1.action;
       if (value != null) {
          LuaNativeUtil.safelySetOrUpdateFeatureCache(this.getCategory()+'_'+p0, value.h());
       }
       return;
    }
    public void FeatureProvider(String p0,String p1,a p2){
       a.p(p0, "category");
       a.p(p1, "name");
       a.p(p2, "inValue");
       super(p0, p1);
       this.value = p2;
       this.action = null;
       LuaNativeUtil.safelySetOrUpdateFeatureCache(p0+'_'+p1, p2.h());
    }
    public void FeatureProvider(String p0,String p1,a p2){
       a.p(p0, "category");
       a.p(p1, "name");
       a.p(p2, "inAction");
       super(p0, p1);
       this.value = null;
       this.action = p2;
    }
    public a getFeatureValue(){
       a uoa;
       FeatureProvider obj = PatchProxy.apply(null, this, FeatureProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.action;
       if (obj != null) {
          uoa = obj.invoke();
          if (uoa != null) {
          label_001f :
             return uoa;
          }
       }
       uoa = this.value;
       goto label_001f ;
    }
}
