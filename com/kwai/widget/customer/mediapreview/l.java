package com.kwai.widget.customer.mediapreview.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.widget.customer.mediapreview.o;
import com.kwai.widget.customer.mediapreview.PreviewMediaFragment$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class l extends Accessor	// class@00113a
{
    public final PreviewMediaFragment$b c;
    public final o d;

    public void l(o p0,PreviewMediaFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l;
    }
    public void set(Object p0){
       this.c.l = p0;
    }
}
