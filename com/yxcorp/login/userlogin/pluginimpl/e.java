package com.yxcorp.login.userlogin.pluginimpl.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.CharSequence;
import e17.i;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class e implements g	// class@001b99
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       i.d(R.style.arg_RES_7f110668, "��¼ʧ��: $error\n ��ȷ����ǰ����Ϊ��˾���� \n���� call zhangyaqing");
       ExceptionHandler.handleException(a.B, p0);
    }
}
