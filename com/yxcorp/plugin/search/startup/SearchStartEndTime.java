package com.yxcorp.plugin.search.startup.SearchStartEndTime;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;

public class SearchStartEndTime implements Serializable	// class@000767
{
    public long mEndTime;
    public long mStartTime;
    public static final long serialVersionUID = 0xa7917e89c7cedcd1;

    public void SearchStartEndTime(){
       super();
    }
    public boolean isValidTime(){
       Object obj = PatchProxy.apply(null, this, SearchStartEndTime.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = System.currentTimeMillis();
       boolean b = (l - this.mStartTime >= 0 && l - this.mEndTime <= 0)? true: false;
       return b;
    }
}
