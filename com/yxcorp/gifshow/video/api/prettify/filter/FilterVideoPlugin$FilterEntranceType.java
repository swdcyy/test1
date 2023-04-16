package com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType$1;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class FilterVideoPlugin$FilterEntranceType extends Enum	// class@001685
{
    public final int mValue;
    public static final FilterVideoPlugin$FilterEntranceType[] $VALUES;
    public static final FilterVideoPlugin$FilterEntranceType EDIT;
    public static final FilterVideoPlugin$FilterEntranceType IM_CHAT;
    public static final FilterVideoPlugin$FilterEntranceType LIVE_PUSH;
    public static final FilterVideoPlugin$FilterEntranceType VIDEO;

    static {
       FilterVideoPlugin$FilterEntranceType uFilterEntra = new FilterVideoPlugin$FilterEntranceType("VIDEO", 0, 1);
       FilterVideoPlugin$FilterEntranceType.VIDEO = uFilterEntra;
       FilterVideoPlugin$FilterEntranceType uFilterEntra1 = new FilterVideoPlugin$FilterEntranceType("EDIT", 1, 2);
       FilterVideoPlugin$FilterEntranceType.EDIT = uFilterEntra1;
       FilterVideoPlugin$FilterEntranceType$1 uFilterEntra2 = new FilterVideoPlugin$FilterEntranceType$1("LIVE_PUSH", 2, 3);
       FilterVideoPlugin$FilterEntranceType.LIVE_PUSH = uFilterEntra2;
       FilterVideoPlugin$FilterEntranceType uFilterEntra3 = new FilterVideoPlugin$FilterEntranceType("IM_CHAT", 3, 6);
       FilterVideoPlugin$FilterEntranceType.IM_CHAT = uFilterEntra3;
       FilterVideoPlugin$FilterEntranceType[] uFilterEntra4 = new FilterVideoPlugin$FilterEntranceType[]{uFilterEntra,uFilterEntra1,uFilterEntra2,uFilterEntra3};
       FilterVideoPlugin$FilterEntranceType.$VALUES = uFilterEntra4;
    }
    public void FilterVideoPlugin$FilterEntranceType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public void FilterVideoPlugin$FilterEntranceType(String p0,int p1,int p2,FilterVideoPlugin$a p3){
       super(p0, p1, p2);
    }
    public static FilterVideoPlugin$FilterEntranceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FilterVideoPlugin$FilterEntranceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FilterVideoPlugin$FilterEntranceType.class, p0);
    }
    public static FilterVideoPlugin$FilterEntranceType[] values(){
       Object obj = PatchProxy.apply(null, null, FilterVideoPlugin$FilterEntranceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterVideoPlugin$FilterEntranceType.$VALUES.clone();
    }
    public boolean isAutoDownloadFiltersRes(){
       return true;
    }
}
