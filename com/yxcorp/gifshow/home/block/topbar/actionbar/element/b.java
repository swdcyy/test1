package com.yxcorp.gifshow.home.block.topbar.actionbar.element.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.e;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$b;
import java.lang.Object;
import wq6.h;

public class b extends Accessor	// class@001656
{
    public final HomeBlockViewElement$b c;
    public final e d;

    public void b(e p0,HomeBlockViewElement$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
