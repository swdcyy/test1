package com.yxcorp.gifshow.widget.adv.Action$a;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.Action;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public class Action$a	// class@001900
{
    public final Action$Type a;
    public final int b;
    public double c;
    public double d;
    public EditDecorationBaseDrawer e;

    public void Action$a(Action$Type p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Action a(){
       Object obj = PatchProxy.apply(null, this, Action$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Action uAction = new Action(this.a, this.b, this.e, this.c, this.d);
       return obj;
    }
    public Action$a b(EditDecorationBaseDrawer p0){
       this.e = p0;
       return this;
    }
    public Action$a c(double p0){
       this.c = p0;
       return this;
    }
    public Action$a d(double p0){
       this.d = p0;
       return this;
    }
}
