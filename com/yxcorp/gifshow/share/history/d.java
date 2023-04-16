package com.yxcorp.gifshow.share.history.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.history.f;
import com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class d extends Accessor	// class@001bb1
{
    public final ShareHistoryFragment$a c;
    public final f d;

    public void d(f p0,ShareHistoryFragment$a p1){
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
