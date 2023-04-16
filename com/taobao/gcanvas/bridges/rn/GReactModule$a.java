package com.taobao.gcanvas.bridges.rn.GReactModule$a;
import com.taobao.gcanvas.bridges.rn.GReactModule$b;
import com.taobao.gcanvas.bridges.rn.GReactModule;
import com.facebook.react.bridge.ReadableArray;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;

public class GReactModule$a implements GReactModule$b	// class@000df3
{
    public ReadableArray a;
    public String b;
    public Callback c;
    public final GReactModule d;

    public void GReactModule$a(GReactModule p0,ReadableArray p1,String p2,Callback p3){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public void execute(){
       this.d.bindImageTexture(this.a, this.b, this.c);
    }
}
