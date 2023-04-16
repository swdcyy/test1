package com.yxcorp.gifshow.share.history.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.history.f;
import com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b extends Accessor	// class@001baf
{
    public final ShareHistoryFragment$a c;
    public final f d;

    public void b(f p0,ShareHistoryFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
