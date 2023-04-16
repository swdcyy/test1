package com.kuaishou.dfp.ResponseDidCallback;
import java.lang.String;

public interface abstract ResponseDidCallback	// class@0016e1
{

    void onError(int p0,String p1);
    void onGetDid(String p0,int p1,String p2);
    void report(String p0,String p1);
}
