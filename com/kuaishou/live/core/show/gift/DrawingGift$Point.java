package com.kuaishou.live.core.show.gift.DrawingGift$Point;
import java.io.Serializable;
import java.lang.Object;

public class DrawingGift$Point implements Serializable	// class@000bb2
{
    public final int mBottom;
    public final int mGiftId;
    public boolean mIsHandDown;
    public boolean mIsHandUp;
    public final int mLeft;
    public final int mPrice;
    public final int mRight;
    public final int mTop;
    public static final long serialVersionUID = 0x9dcb9ac5475dc402;

    public void DrawingGift$Point(int p0,int p1,int p2,int p3,int p4,int p5){
       super();
       this.mGiftId = p0;
       this.mPrice = p1;
       this.mLeft = p2;
       this.mTop = p3;
       this.mRight = p4;
       this.mBottom = p5;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof DrawingGift$Point) {
          return false;
       }
       if (this.mGiftId != p0.mGiftId || (this.mLeft != p0.mLeft || (this.mTop != p0.mTop || (this.mRight != p0.mRight || (this.mBottom != p0.mBottom || (this.mIsHandUp != p0.mIsHandUp || this.mIsHandDown != p0.mIsHandDown)))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((((((((((((this.mGiftId * 31) + this.mLeft) * 31) + this.mTop) * 31) + this.mRight) * 31) + this.mBottom) * 31) + this.mIsHandUp) * 31) + this.mIsHandDown);
    }
}
