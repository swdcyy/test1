package com.kuaishou.live.audience.component.gift.DrawingGiftGallery$c;
import h3.a;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kuaishou.live.audience.component.gift.DrawingGiftSimpleView;
import com.kuaishou.live.core.show.gift.DrawingGift;
import java.lang.Number;

public class DrawingGiftGallery$c extends a	// class@000ad7
{
    public final List d;
    public final List e;

    public void DrawingGiftGallery$c(){
       super();
       this.d = new ArrayList();
       this.e = new ArrayList();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(DrawingGiftGallery$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, DrawingGiftGallery$c.class, "5")) {
          return;
       }
       p0.removeView(p2);
       this.e.add(p2);
       return;
    }
    public int j(){
       return 0x2710;
    }
    public Object o(ViewGroup p0,int p1){
       View obj;
       DrawingGiftGallery$c uoc = DrawingGiftGallery$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (!this.e.isEmpty())? this.e.remove(0): a.i(p0, R.layout.arg_RES_7f0d0327);
       obj.findViewById(R.id.drawing_gift_gallery_view).setDrawingGift(this.d.get(this.z(p1)));
       p0.addView(obj);
       return obj;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
    public final int z(int p0){
       DrawingGiftGallery$c uoc = DrawingGiftGallery$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (p0 % this.d.size());
    }
}
