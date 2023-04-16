package com.kwai.feature.api.pendant.activity.model.InitialPosition;
import java.io.Serializable;
import com.kwai.feature.api.pendant.activity.model.InitialPosition$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class InitialPosition implements Serializable	// class@00102d
{
    public final int side;
    public final int y;
    public static final InitialPosition$a Companion;
    public static final long serialVersionUID;

    static {
       InitialPosition.Companion = new InitialPosition$a(null);
    }
    public void InitialPosition(){
       super(0, 0, 3, null);
    }
    public void InitialPosition(int p0){
       super(p0, 0, 2, null);
    }
    public void InitialPosition(int p0,int p1){
       super();
       this.side = p0;
       this.y = p1;
    }
    public void InitialPosition(int p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static InitialPosition copy$default(InitialPosition p0,int p1,int p2,int p3,Object p4){
       InitialPosition side;
       InitialPosition y;
       if (p3 & 0x01) {
          side = p0.side;
       }
       if (p3 & 0x02) {
          y = p0.y;
       }
       return p0.copy(side, y);
    }
    public final int component1(){
       return this.side;
    }
    public final int component2(){
       return this.y;
    }
    public final InitialPosition copy(int p0,int p1){
       if (PatchProxy.isSupport(InitialPosition.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, InitialPosition.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new InitialPosition(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof InitialPosition && (this.side == p0.side && this.y == p0.y))) {
          return true;
       }
       return false;
    }
    public final int getSide(){
       return this.side;
    }
    public final int getY(){
       return this.y;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, InitialPosition.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.side * 31) + this.y);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InitialPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InitialPosition\(side="+this.side+", y="+this.y+"\)";
    }
}
