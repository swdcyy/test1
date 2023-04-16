package com.yxcorp.gifshow.share.history.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.history.f;
import com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import java.lang.Object;
import java.util.List;

public class c extends Accessor	// class@001bb0
{
    public final ShareHistoryFragment$a c;
    public final f d;

    public void c(f p0,ShareHistoryFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
