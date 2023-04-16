package com.yxcorp.gifshow.home.block.topbar.actionbar.element.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.e;
import com.yxcorp.gifshow.home.block.topbar.actionbar.element.HomeBlockViewElement$b;
import java.lang.Object;
import android.widget.TextView;

public class c extends Accessor	// class@001657
{
    public final HomeBlockViewElement$b c;
    public final e d;

    public void c(e p0,HomeBlockViewElement$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
