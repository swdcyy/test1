package com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Exception;
import java.lang.Object;

public interface abstract IRpcService$Callback	// class@0003ce
{

    void onComplete(boolean p0);
    void onFailure(Exception p0,Object p1);
    void onSuccess(Object p0);
}
