package com.tachikoma.component.listview.TKListView2$LayoutMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKListView2$LayoutMode extends Enum	// class@000d0a
{
    public static final TKListView2$LayoutMode[] $VALUES;
    public static final TKListView2$LayoutMode GRID;
    public static final TKListView2$LayoutMode LIST;
    public static final TKListView2$LayoutMode WATERFALL;

    static {
       TKListView2$LayoutMode layoutMode = new TKListView2$LayoutMode("LIST", 0);
       TKListView2$LayoutMode.LIST = layoutMode;
       TKListView2$LayoutMode layoutMode1 = new TKListView2$LayoutMode("GRID", 1);
       TKListView2$LayoutMode.GRID = layoutMode1;
       TKListView2$LayoutMode layoutMode2 = new TKListView2$LayoutMode("WATERFALL", 2);
       TKListView2$LayoutMode.WATERFALL = layoutMode2;
       TKListView2$LayoutMode[] layoutModeAr = new TKListView2$LayoutMode[]{layoutMode,layoutMode1,layoutMode2};
       TKListView2$LayoutMode.$VALUES = layoutModeAr;
    }
    public void TKListView2$LayoutMode(String p0,int p1){
       super(p0, p1);
    }
    public static TKListView2$LayoutMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKListView2$LayoutMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKListView2$LayoutMode.class, p0);
    }
    public static TKListView2$LayoutMode[] values(){
       Object obj = PatchProxy.apply(null, null, TKListView2$LayoutMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKListView2$LayoutMode.$VALUES.clone();
    }
}
