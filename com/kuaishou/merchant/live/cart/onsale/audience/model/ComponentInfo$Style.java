package com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo$Style;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo$Style$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ComponentInfo$Style implements Serializable	// class@00194e
{
    public float height;
    public float width;
    public static final ComponentInfo$Style$a Companion;
    public static final long serialVersionUID;

    static {
       ComponentInfo$Style.Companion = new ComponentInfo$Style$a(null);
    }
    public void ComponentInfo$Style(){
       super(0, 0, 3, null);
    }
    public void ComponentInfo$Style(float p0,float p1){
       super();
       this.width = p0;
       this.height = p1;
    }
    public void ComponentInfo$Style(float p0,float p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static ComponentInfo$Style copy$default(ComponentInfo$Style p0,float p1,float p2,int p3,Object p4){
       ComponentInfo$Style width;
       ComponentInfo$Style height;
       if (p3 & 0x01) {
          width = p0.width;
       }
       if (p3 & 0x02) {
          height = p0.height;
       }
       return p0.copy(width, height);
    }
    public final float component1(){
       return this.width;
    }
    public final float component2(){
       return this.height;
    }
    public final ComponentInfo$Style copy(float p0,float p1){
       if (PatchProxy.isSupport(ComponentInfo$Style.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ComponentInfo$Style.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ComponentInfo$Style(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ComponentInfo$Style.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ComponentInfo$Style && (!Float.compare(this.width, p0.width) && !Float.compare(this.height, p0.height)))) {
          return true;
       }
       return false;
    }
    public final float getHeight(){
       return this.height;
    }
    public final float getWidth(){
       return this.width;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ComponentInfo$Style.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height));
    }
    public final void setHeight(float p0){
       this.height = p0;
    }
    public final void setWidth(float p0){
       this.width = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ComponentInfo$Style.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Style\(width="+this.width+", height="+this.height+"\)";
    }
}
