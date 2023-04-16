package com.kuaishou.tuna.plc.plc2.view.PlcCover2Render$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.tuna.plc.plc2.view.PlcCover2Render;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class PlcCover2Render$a extends m	// class@001062
{
    public final PlcCover2Render c;
    public final View$OnClickListener d;

    public void PlcCover2Render$a(PlcCover2Render p0,View$OnClickListener p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcCover2Render$a.class, "1")) {
          return;
       }
       PlcCover2Render$a td = this.d;
       if (p0 == null) {
          PlcCover2Render m = this.c.m;
       }
       td.onClick(p0);
       return;
    }
}
