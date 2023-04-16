package com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchEntryActionRecorder$SignalType extends Enum	// class@001201
{
    public static final SearchEntryActionRecorder$SignalType[] $VALUES;
    public static final SearchEntryActionRecorder$SignalType USER_CLICK_COUNT;
    public static final SearchEntryActionRecorder$SignalType USER_SHOW_COUNT;
    public static final SearchEntryActionRecorder$SignalType USER_VV_COUNT;

    static {
       SearchEntryActionRecorder$SignalType signalType = new SearchEntryActionRecorder$SignalType("USER_VV_COUNT", 0);
       SearchEntryActionRecorder$SignalType.USER_VV_COUNT = signalType;
       SearchEntryActionRecorder$SignalType signalType1 = new SearchEntryActionRecorder$SignalType("USER_SHOW_COUNT", 1);
       SearchEntryActionRecorder$SignalType.USER_SHOW_COUNT = signalType1;
       SearchEntryActionRecorder$SignalType signalType2 = new SearchEntryActionRecorder$SignalType("USER_CLICK_COUNT", 2);
       SearchEntryActionRecorder$SignalType.USER_CLICK_COUNT = signalType2;
       SearchEntryActionRecorder$SignalType[] signalTypeAr = new SearchEntryActionRecorder$SignalType[]{signalType,signalType1,signalType2};
       SearchEntryActionRecorder$SignalType.$VALUES = signalTypeAr;
    }
    public void SearchEntryActionRecorder$SignalType(String p0,int p1){
       super(p0, p1);
    }
    public static SearchEntryActionRecorder$SignalType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchEntryActionRecorder$SignalType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchEntryActionRecorder$SignalType.class, p0);
    }
    public static SearchEntryActionRecorder$SignalType[] values(){
       Object obj = PatchProxy.apply(null, null, SearchEntryActionRecorder$SignalType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchEntryActionRecorder$SignalType.$VALUES.clone();
    }
}
