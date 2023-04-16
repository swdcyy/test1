package com.yxcorp.gifshow.detail.network.feedback.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.network.feedback.g;
import com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class e extends Accessor	// class@0015bf
{
    public final NetworkFeedbackFragment$a c;
    public final g d;

    public void e(g p0,NetworkFeedbackFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
