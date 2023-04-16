package com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SelectScrollOption extends Enum	// class@0011c0
{
    public static final SelectScrollOption[] $VALUES;
    public static final SelectScrollOption LAZY;
    public static final SelectScrollOption NONE;
    public static final SelectScrollOption REFRESH;
    public static final SelectScrollOption SMOOTH;

    static {
       SelectScrollOption selectScroll1;
       SelectScrollOption[] selectScroll = new SelectScrollOption[]{selectScroll1,selectScroll1,selectScroll1,selectScroll1};
       selectScroll1 = new SelectScrollOption("NONE", 0);
       SelectScrollOption.NONE = selectScroll1;
       selectScroll1 = new SelectScrollOption("REFRESH", 1);
       SelectScrollOption.REFRESH = selectScroll1;
       selectScroll1 = new SelectScrollOption("SMOOTH", 2);
       SelectScrollOption.SMOOTH = selectScroll1;
       selectScroll1 = new SelectScrollOption("LAZY", 3);
       SelectScrollOption.LAZY = selectScroll1;
       SelectScrollOption.$VALUES = selectScroll;
    }
    public void SelectScrollOption(String p0,int p1){
       super(p0, p1);
    }
    public static SelectScrollOption valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SelectScrollOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SelectScrollOption.class, p0);
    }
    public static SelectScrollOption[] values(){
       Object obj = PatchProxy.apply(null, null, SelectScrollOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SelectScrollOption.$VALUES.clone();
    }
}
