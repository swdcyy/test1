package com.kuaishou.tuna.plc.plc2.view.PlcCover1Render$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.tuna.plc.plc2.view.PlcCover1Render;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class PlcCover1Render$a extends m	// class@00105f
{
    public final PlcCover1Render c;
    public final View$OnClickListener d;

    public void PlcCover1Render$a(PlcCover1Render p0,View$OnClickListener p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover1Render$a.class, "1")) {
          return;
       }
       PlcCover1Render$a td = this.d;
       if (p0 == null) {
          PlcCover1Render m = this.c.m;
       }
       td.onClick(p0);
       return;
    }
}
