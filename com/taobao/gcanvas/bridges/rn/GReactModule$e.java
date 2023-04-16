package com.taobao.gcanvas.bridges.rn.GReactModule$e;
import com.taobao.gcanvas.bridges.rn.GReactModule$b;
import com.taobao.gcanvas.bridges.rn.GReactModule;
import java.lang.String;
import java.lang.Object;

public class GReactModule$e implements GReactModule$b	// class@000df8
{
    public String a;
    public int b;
    public final GReactModule c;

    public void GReactModule$e(GReactModule p0,String p1,int p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void execute(){
       this.c.setContextType(this.b, this.a);
    }
}
