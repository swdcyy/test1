package com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import msd.a;
import com.kwai.sdk.eve.internal.featurecenter.CachedFeatureProvider$1;
import ml5.a;
import java.lang.StringBuilder;
import cn.vimfung.luascriptcore.LuaValue;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class CachedFeatureProvider extends IFeatureProvider	// class@0014c7
{
    public final a action;
    public a cachedValue;
    public a onFeatureChange;

    public void CachedFeatureProvider(String p0,CachedFeatureProvider p1){
       a.p(p0, "name");
       a.p(p1, "featureProvider");
       super(p1.getCategory(), p0, p1.action);
       p1.onFeatureChange = new CachedFeatureProvider$1(this);
    }
    public void CachedFeatureProvider(String p0,String p1,a p2){
       a.p(p0, "category");
       a.p(p1, "name");
       a.p(p2, "action");
       super(p0, p1);
       this.action = p2;
       p2 = p2.invoke();
       LuaNativeUtil.safelySetOrUpdateFeatureCache(p0+'_'+p1, p2.h());
       this.cachedValue = p2;
    }
    public a getFeatureValue(){
       return this.cachedValue;
    }
    public final void notifyFeatureChange(){
       if (PatchProxy.applyVoid(null, this, CachedFeatureProvider.class, "1")) {
          return;
       }
       this.cachedValue = this.action.invoke();
       CachedFeatureProvider tonFeatureCh = this.onFeatureChange;
       if (tonFeatureCh != null) {
          l1 ol1 = tonFeatureCh.invoke();
       }
       LuaNativeUtil.safelySetOrUpdateFeatureCache(this.getCategory()+'_'+this.getName(), this.cachedValue.h());
       return;
    }
}
