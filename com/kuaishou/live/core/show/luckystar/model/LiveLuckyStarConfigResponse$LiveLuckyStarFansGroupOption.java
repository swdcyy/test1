package com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption implements Serializable	// class@000cd0
{
    public String mName;
    public int mValue;
    public static final long serialVersionUID = 0x2a2a2585c74871b;

    public void LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mValue != p0.mValue) {
          return false;
       }
       LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption tmName = this.mName;
       p0 = p0.mName;
       if (tmName != null) {
          b = tmName.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption obj = PatchProxy.apply(null, this, LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mName;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.mValue);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarConfigResponse$LiveLuckyStarFansGroupOption.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLuckyStarFansGroupOption{mName=\'"+this.mName+'''+", mValue="+this.mValue+'}';
    }
}
