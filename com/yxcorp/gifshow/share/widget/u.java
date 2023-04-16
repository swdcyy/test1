package com.yxcorp.gifshow.share.widget.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.a0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import java.lang.Object;
import java.lang.Boolean;

public class u extends Accessor	// class@001d36
{
    public final ForwardGridSectionWithImPanelFragment$d c;
    public final a0 d;

    public void u(a0 p0,ForwardGridSectionWithImPanelFragment$d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.b);
    }
    public void set(Object p0){
       this.c.b = p0.booleanValue();
    }
}
