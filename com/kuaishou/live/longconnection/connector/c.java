package com.kuaishou.live.longconnection.connector.c;
import java.lang.Class;
import lf3.g;
import lf3.d;
import java.util.List;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.live.longconnection.connector.l$c;
import com.kuaishou.live.longconnection.connector.l;
import lf3.a;

public interface abstract c	// class@000c5e
{

    void J(int p0,Class p1,g p2,boolean p3);
    void a();
    void b();
    void c(d p0);
    void clearAllListener();
    void d(boolean p0);
    void disconnect();
    void e();
    void f(List p0);
    void g(d p0);
    Race h();
    void i(byte[] p0);
    boolean isConnected();
    l$c j();
    void k(l p0);
    void l(l p0,Race p1);
    void m(a p0);
    void n(l p0);
    void o(int p0,g p1);
    void pause(int p0);
}
