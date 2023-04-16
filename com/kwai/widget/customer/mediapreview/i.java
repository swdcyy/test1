package com.kwai.widget.customer.mediapreview.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.widget.customer.mediapreview.o;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import java.lang.Object;
import java.lang.Integer;

public class i extends Accessor	// class@001137
{
    public final PreviewMediaFragment$b c;
    public final o d;

    public void i(o p0,PreviewMediaFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.k);
    }
    public void set(Object p0){
       this.c.k = p0.intValue();
    }
}
