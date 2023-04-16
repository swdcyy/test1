package com.yxcorp.gifshow.activity.share.presenter.e1;
import java.util.concurrent.Callable;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.net.NetworkInfo;
import com.yxcorp.utility.SystemUtil;
import z1.e;
import java.lang.Boolean;

public final class e1 implements Callable	// class@0013db
{
    public static final e1 b;

    static {
       e1.b = new e1();
    }
    public void e1(){
       super();
    }
    public final Object call(){
       NetworkInfo networkInfo = SystemUtil.c(a.a().a());
       boolean b = (networkInfo == null)? true: false;
       return new e(Boolean.valueOf(b), networkInfo);
    }
}
