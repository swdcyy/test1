package com.kwai.chat.kwailink.i;
import android.os.IInterface;
import java.lang.String;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import com.kwai.chat.kwailink.data.PassThroughRequest;
import com.kwai.chat.kwailink.e;
import com.kwai.chat.kwailink.d;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.data.HttpRequest;
import com.kwai.chat.kwailink.a;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.chat.kwailink.h;
import com.kwai.chat.kwailink.c;
import com.kwai.chat.kwailink.g;
import com.kwai.chat.kwailink.f;
import com.kwai.chat.kwailink.b;

public interface abstract i implements IInterface	// class@000a5c
{

    int H();
    boolean K();
    void K1(int p0);
    int M();
    void S(boolean p0,String p1,String p2,String p3);
    void U(String p0);
    String W();
    void Z(String p0,KwaiLinkDefaultServerInfo p1);
    void a1(PassThroughRequest p0,int p1,int p2,e p3,boolean p4);
    void b1(d p0);
    void c(String p0);
    void d0(ClientAppInfo p0);
    void f1(int p0);
    int getAppId();
    String getUserId();
    void h0(String p0);
    void i0(HttpRequest p0,int p1,int p2,a p3,boolean p4);
    void l1(PacketData p0,int p1,int p2,h p3,boolean p4);
    void o();
    void o0(c p0);
    void p1();
    String q();
    void s0(g p0);
    void s1(f p0);
    long t();
    void t1(PacketData p0);
    int u();
    void z0(b p0);
}
