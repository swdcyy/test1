package com.yxcorp.gifshow.childlock.fragment.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.childlock.fragment.d;
import com.yxcorp.gifshow.childlock.fragment.ChildLockGuideFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b extends Accessor	// class@001084
{
    public final ChildLockGuideFragment$a c;
    public final d d;

    public void b(d p0,ChildLockGuideFragment$a p1){
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
