package com.yxcorp.gifshow.share.history.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.history.f;
import com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import java.lang.Object;
import io.reactivex.subjects.ReplaySubject;

public class a extends Accessor	// class@001bae
{
    public final ShareHistoryFragment$a c;
    public final f d;

    public void a(f p0,ShareHistoryFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
