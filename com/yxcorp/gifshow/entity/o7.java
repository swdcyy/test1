package com.yxcorp.gifshow.entity.o7;
import ok.h;
import java.lang.Object;
import com.kwai.framework.model.user.UserStatus;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;

public final class o7 implements h	// class@000e15
{
    public static final o7 b;

    static {
       o7.b = new o7();
    }
    public void o7(){
       super();
    }
    public final Object apply(Object p0){
       return QPhoto.lambda$isStatusLiked$9(p0);
    }
}
