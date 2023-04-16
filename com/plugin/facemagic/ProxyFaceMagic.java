package com.plugin.facemagic.ProxyFaceMagic;
import java.lang.String;
import com.plugin.facemagic.ProxyFaceMagic$c;
import com.plugin.facemagic.ProxyFaceMagic$a;
import com.plugin.facemagic.ProxyFaceMagic$TouchType;
import com.plugin.facemagic.ProxyFaceMagic$b;
import android.view.View;

public interface abstract ProxyFaceMagic	// class@000b51
{

    void a(String p0);
    void b(ProxyFaceMagic$c p0);
    void c(ProxyFaceMagic$a p0);
    void d(String p0);
    void e(ProxyFaceMagic$TouchType p0,float p1,float p2);
    void f(ProxyFaceMagic$b p0);
    View getRenderView();
    void pause();
    void release();
    void reset();
    void resume();
}
