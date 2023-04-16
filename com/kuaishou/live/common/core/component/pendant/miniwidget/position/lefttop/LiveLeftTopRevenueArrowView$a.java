package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueArrowView$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueArrowView;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class LiveLeftTopRevenueArrowView$a extends Property	// class@0016fc
{

    public void LiveLeftTopRevenueArrowView$a(Class p0,String p1){
       super(p0, p1);
    }
    public Object get(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, LiveLeftTopRevenueArrowView$a.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(p0.b);
       }
       return integer;
    }
    public void set(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLeftTopRevenueArrowView$a.class, "2")) {
       }else if(p1.intValue() != p0.b){
          p0.setLeftCorner(p1.intValue());
       }
       return;
    }
}
