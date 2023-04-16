package com.yxcorp.gifshow.init.module.RobustInitModule2$RobustLogger;
import pm7.e;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.RobustInitModule2$1;
import java.lang.String;
import java.lang.StringBuilder;
import pxa.e;
import q87.c;
import java.lang.Throwable;
import pm7.d;

public class RobustInitModule2$RobustLogger implements e	// class@0011d0
{

    public void RobustInitModule2$RobustLogger(){
       super();
    }
    public void RobustInitModule2$RobustLogger(RobustInitModule2$1 p0){
       super();
    }
    public static String j(String p0){
       return "Robust2."+p0;
    }
    public void a(String p0,String p1,Object[] p2){
       p2 = new Object[0];
       e.C().w(RobustInitModule2$RobustLogger.j(p0), String.format(p1, p2), p2);
    }
    public void b(String p0,String p1,Object[] p2){
       p2 = new Object[0];
       e.C().s(RobustInitModule2$RobustLogger.j(p0), String.format(p1, p2), p2);
    }
    public void c(String p0,String p1,Object[] p2){
       p2 = new Object[0];
       e.C().t(RobustInitModule2$RobustLogger.j(p0), String.format(p1, p2), p2);
    }
    public void d(String p0,String p1,Object[] p2){
       p2 = new Object[0];
       e.C().A(RobustInitModule2$RobustLogger.j(p0), String.format(p1, p2), p2);
    }
    public void e(String p0,Throwable p1,String p2,Object[] p3){
       e.C().z(RobustInitModule2$RobustLogger.j(p0), String.format(p2, p3), p1);
    }
    public void f(String p0,Throwable p1,String p2,Object[] p3){
       e.C().v(RobustInitModule2$RobustLogger.j(p0), String.format(p2, p3), p1);
    }
    public void g(String p0,Throwable p1,String p2,Object[] p3){
       e.C().r(RobustInitModule2$RobustLogger.j(p0), String.format(p2, p3), p1);
    }
    public void h(String p0,Throwable p1,String p2,Object[] p3){
       e.C().e(RobustInitModule2$RobustLogger.j(p0), String.format(p2, p3), p1);
    }
    public void i(e p0){
       d.a(this, p0);
    }
}
