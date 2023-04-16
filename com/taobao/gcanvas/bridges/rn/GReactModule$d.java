package com.taobao.gcanvas.bridges.rn.GReactModule$d;
import com.taobao.gcanvas.bridges.rn.GReactModule$b;
import com.taobao.gcanvas.bridges.rn.GReactModule;
import java.lang.String;
import java.lang.Object;

public class GReactModule$d implements GReactModule$b	// class@000df7
{
    public String a;
    public String b;
    public int c;
    public final GReactModule d;

    public void GReactModule$d(GReactModule p0,String p1,String p2,int p3){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public void execute(){
       this.d.render(this.a, this.b, this.c);
    }
}
