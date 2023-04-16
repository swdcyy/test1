package com.yxcorp.gifshow.v3.editor.effect.model.AEEffectConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.effect.model.a;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import ekd.q;
import com.yxcorp.gifshow.v3.editor.effect.model.AEEffectConfig$a;
import java.util.Iterator;
import java.lang.StringBuilder;

public class AEEffectConfig implements Serializable	// class@000f1a
{
    public float mDuration;
    public int mEffectType;
    public int mFillingMode;
    public List mResolutionConfigList;

    public void AEEffectConfig(){
       super();
    }
    public String findBestResolutionPathName(float p0){
       ArrayList obj;
       AEEffectConfig$a mName;
       if (PatchProxy.isSupport(AEEffectConfig.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, AEEffectConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList(this.mResolutionConfigList);
       Collections.sort(obj, a.b);
       if (!q.f(obj)) {
          mName = obj.get(0).mName;
          int i = 0;
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             AEEffectConfig$a uoa = iterator.next();
             float f = (float)uoa.mWidth * 0x3f800000;
             f = f / (float)uoa.mHeight;
             if (p0 - i >= 0 && p0 - f <= 0) {
                mName = uoa.mName;
                break ;
             }
             i = f;
          }
       }else {
          mName = "";
       }
       return mName;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AEEffectConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AEEffectConfig{mDuration="+this.mDuration+", mFillingMode="+this.mFillingMode+", mEffectType="+this.mEffectType+", mResolutionConfigList="+this.mResolutionConfigList+'}';
    }
}
