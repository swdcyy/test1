package com.kwai.performance.monitor.base.b;
import yf7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import android.util.Log;

public final class b implements c	// class@001109
{

    public void b(){
       super();
    }
    public int d(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       a.q(p0, "tag");
       a.q(p1, "msg");
       int i = (MonitorBuildConfig.b())? Log.d(p0, p1): -1;
       return i;
    }
    public int e(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       a.q(p0, "tag");
       a.q(p1, "msg");
       int i = (MonitorBuildConfig.b())? Log.e(p0, p1): -1;
       return i;
    }
    public int i(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       a.q(p0, "tag");
       a.q(p1, "msg");
       int i = (MonitorBuildConfig.b())? Log.i(p0, p1): -1;
       return i;
    }
    public int v(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       a.q(p0, "tag");
       a.q(p1, "msg");
       int i = (MonitorBuildConfig.b())? Log.v(p0, p1): -1;
       return i;
    }
    public int w(String p0,String p1){
       a.q(p0, "tag");
       a.q(p1, "msg");
       a.q(p0, "tag");
       a.q(p1, "msg");
       int i = (MonitorBuildConfig.b())? Log.w(p0, p1): -1;
       return i;
    }
}
