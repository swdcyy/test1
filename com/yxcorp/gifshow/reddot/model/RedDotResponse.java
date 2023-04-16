package com.yxcorp.gifshow.reddot.model.RedDotResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import com.yxcorp.gifshow.reddot.model.RedDotProtectionConfig;

public class RedDotResponse implements Serializable, a	// class@0017d5
{
    public Map mRedDotPriorityMap;
    public RedDotProtectionConfig mRedDotProtectionConfig;
    public List redDots;
    public static final long serialVersionUID = 0xd79052d6850955b8;

    public void RedDotResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RedDotResponse.class, "1")) {
          return;
       }
       if (this.redDots == null) {
          this.redDots = Collections.emptyList();
       }
       if (this.mRedDotPriorityMap == null) {
          this.mRedDotPriorityMap = Collections.emptyMap();
       }
       if (this.mRedDotProtectionConfig == null) {
          this.mRedDotProtectionConfig = new RedDotProtectionConfig();
       }
       return;
    }
}
