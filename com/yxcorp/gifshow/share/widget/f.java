package com.yxcorp.gifshow.share.widget.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.widget.k;
import com.yxcorp.gifshow.share.widget.d$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class f extends Accessor	// class@001d25
{
    public final d$b c;
    public final k d;

    public void f(k p0,d$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
