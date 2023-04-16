package com.kwai.widget.customer.mediapreview.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.widget.customer.mediapreview.o;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import java.lang.Object;
import android.graphics.Rect;

public class j extends Accessor	// class@001138
{
    public final PreviewMediaFragment$b c;
    public final o d;

    public void j(o p0,PreviewMediaFragment$b p1){
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
