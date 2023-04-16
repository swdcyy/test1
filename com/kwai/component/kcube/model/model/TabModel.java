package com.kwai.component.kcube.model.model.TabModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;

public class TabModel implements Serializable	// class@000997
{
    public long mClientPriorTabExpireTimestamp;
    public TabModel$EffectImmediately mEffectImmediately;
    public List mPriorTabExpireTime;
    public List mPriorTabList;
    public TabConfig mTabConfig;
    public static final long serialVersionUID = 0x932b110940a523be;

    public void TabModel(){
       super();
    }
    public boolean isValidNow(){
       Object obj = PatchProxy.apply(null, this, TabModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mClientPriorTabExpireTimestamp - System.currentTimeMillis() > 0)? true: false;
       return b;
    }
}
