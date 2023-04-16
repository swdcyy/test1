package com.frog.engine.network.xhr.FrogHttpResultCallBack;
import java.lang.String;
import java.util.Map;
import java.util.List;

public interface abstract FrogHttpResultCallBack	// class@001566
{

    void onFail(String p0);
    void onResult(int p0,String p1,byte[] p2,Map p3,List p4);
}
