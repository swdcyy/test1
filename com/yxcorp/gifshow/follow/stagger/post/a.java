package com.yxcorp.gifshow.follow.stagger.post.a;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.post.g;

public final class a implements o	// class@0011d7
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && p0.isMine())? true: false;
       return b;
    }
}
