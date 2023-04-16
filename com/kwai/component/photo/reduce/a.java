package com.kwai.component.photo.reduce.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.component.photo.reduce.c;
import com.kwai.component.photo.reduce.o$a;
import java.lang.Object;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;

public class a extends Accessor	// class@000ada
{
    public final o$a c;
    public final c d;

    public void a(c p0,o$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.w;
    }
    public void set(Object p0){
       this.c.w = p0;
    }
}
