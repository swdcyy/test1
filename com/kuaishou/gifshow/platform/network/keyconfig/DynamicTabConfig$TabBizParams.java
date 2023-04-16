package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$TabBizParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;

public final class DynamicTabConfig$TabBizParams implements Serializable	// class@00085f
{
    public CommonFeedSlideParams mCommonFeedSlideParams;
    public HotChannel mHotChannel;
    public static final long serialVersionUID = 0x1ac7cd502856bcd0;

    public void DynamicTabConfig$TabBizParams(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$TabBizParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || DynamicTabConfig$TabBizParams.class != p0.getClass()) {
          return false;
       }
       return k.a(this.mHotChannel, p0.mHotChannel);
    }
}
