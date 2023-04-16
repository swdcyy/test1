package com.yxcorp.gifshow.album.repo.filter.FilterType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FilterType extends Enum	// class@001a90
{
    public static final FilterType[] $VALUES;
    public static final FilterType CLICK;
    public static final FilterType DISPLAY;
    public static final FilterType SELECT;

    static {
       FilterType uFilterType;
       FilterType[] uFilterTypeA = new FilterType[]{uFilterType,uFilterType,uFilterType};
       uFilterType = new FilterType("DISPLAY", 0);
       FilterType.DISPLAY = uFilterType;
       uFilterType = new FilterType("CLICK", 1);
       FilterType.CLICK = uFilterType;
       uFilterType = new FilterType("SELECT", 2);
       FilterType.SELECT = uFilterType;
       FilterType.$VALUES = uFilterTypeA;
    }
    public void FilterType(String p0,int p1){
       super(p0, p1);
    }
    public static FilterType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FilterType.class, p0);
    }
    public static FilterType[] values(){
       Object obj = PatchProxy.apply(null, null, FilterType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterType.$VALUES.clone();
    }
}
