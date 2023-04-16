package com.kwai.social.startup.reminder.model.IntimateRelationItemStyleConfig$DayNightItemStyle;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zf6.k;

public class IntimateRelationItemStyleConfig$DayNightItemStyle implements Serializable	// class@000f63
{
    public String mDark;
    public String mLight;
    public static final long serialVersionUID = 0x52720977564c8835;

    public void IntimateRelationItemStyleConfig$DayNightItemStyle(){
       super();
    }
    public String get(){
       Object obj = PatchProxy.apply(null, this, IntimateRelationItemStyleConfig$DayNightItemStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (k.d()) {
          return this.mDark;
       }
       return this.mLight;
    }
}
