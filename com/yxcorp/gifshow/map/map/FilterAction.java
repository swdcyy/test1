package com.yxcorp.gifshow.map.map.FilterAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FilterAction extends Enum	// class@001c7d
{
    public static final FilterAction[] $VALUES;
    public static final FilterAction OPEN;

    static {
       FilterAction uFilterActio = new FilterAction("OPEN", 0);
       FilterAction.OPEN = uFilterActio;
       FilterAction[] uFilterActio1 = new FilterAction[]{uFilterActio};
       FilterAction.$VALUES = uFilterActio1;
    }
    public void FilterAction(String p0,int p1){
       super(p0, p1);
    }
    public static FilterAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FilterAction.class, p0);
    }
    public static FilterAction[] values(){
       Object obj = PatchProxy.apply(null, null, FilterAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterAction.$VALUES.clone();
    }
}
