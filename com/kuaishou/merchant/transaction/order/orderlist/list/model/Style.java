package com.kuaishou.merchant.transaction.order.orderlist.list.model.Style;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.Style$a;
import nsd.u;
import java.lang.Object;

public final class Style implements Serializable	// class@00089a
{
    public int height;
    public int width;
    public static final Style$a Companion;
    public static final long serialVersionUID;

    static {
       Style.Companion = new Style$a(null);
    }
    public void Style(){
       super(0, 0, 3, null);
    }
    public void Style(int p0,int p1){
       super();
       this.height = p0;
       this.width = p1;
    }
    public void Style(int p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public final int getHeight(){
       return this.height;
    }
    public final int getWidth(){
       return this.width;
    }
    public final void setHeight(int p0){
       this.height = p0;
    }
    public final void setWidth(int p0){
       this.width = p0;
    }
}
