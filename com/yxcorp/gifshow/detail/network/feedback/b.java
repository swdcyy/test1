package com.yxcorp.gifshow.detail.network.feedback.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.network.feedback.g;
import com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment$a;
import java.lang.Object;
import androidx.fragment.app.c;

public class b extends Accessor	// class@0015bc
{
    public final NetworkFeedbackFragment$a c;
    public final g d;

    public void b(g p0,NetworkFeedbackFragment$a p1){
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
