package com.kuaishou.live.core.show.gift.DrawingGift;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class DrawingGift implements Serializable	// class@000bb3
{
    public final int mHeight;
    public final List mPoints;
    public final int mWidth;
    public static final long serialVersionUID = 0x7f242fecfe4dcf60;

    public void DrawingGift(int p0,int p1,List p2){
       super();
       this.mWidth = p0;
       this.mHeight = p1;
       this.mPoints = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DrawingGift.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof DrawingGift) {
          return false;
       }
       return this.mPoints.equals(p0.mPoints);
    }
}
