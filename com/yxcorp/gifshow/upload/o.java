package com.yxcorp.gifshow.upload.o;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.bean.ContactInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import wwb.o;

public final class o implements r	// class@001e96
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final boolean test(Object p0){
       return o.c(QCurrentUser.me().getId());
    }
}
