package com.kwai.widget.customer.mediapreview.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.widget.customer.mediapreview.o;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import java.lang.Object;
import java.util.List;

public class a extends Accessor	// class@00112f
{
    public final PreviewMediaFragment$b c;
    public final o d;

    public void a(o p0,PreviewMediaFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
