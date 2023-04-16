package com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import java.io.Serializable;
import cr5.a;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData$a;
import nsd.u;
import java.lang.Object;
import fr5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFloatingScreenBaseItemData implements Serializable, a	// class@000fc1
{
    public Object detailData;
    public int itemType;
    public static final LiveFloatingScreenBaseItemData$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenBaseItemData.Companion = new LiveFloatingScreenBaseItemData$a(null);
    }
    public void LiveFloatingScreenBaseItemData(){
       super();
    }
    public static void getItemType$annotations(){
    }
    public final Object getDetailData(){
       return this.detailData;
    }
    public final int getItemType(){
       return this.itemType;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenBaseItemData.class, "1")) {
          return;
       }
       a.p(p0, "preload");
       return;
    }
    public final void setDetailData(Object p0){
       this.detailData = p0;
    }
    public final void setItemType(int p0){
       this.itemType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFloatingScreenBaseItemData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFloatingScreenBaseItemData\(itemType="+this.itemType+", detailData="+this.detailData+')';
    }
}
