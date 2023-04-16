package com.yxcorp.gifshow.music.utils.a;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.utils.a$a;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import t16.a;

public interface abstract a	// class@00208d
{

    CountDownLatch a(File p0);
    void b(Music p0,a$a p1);
    void c(Music p0,a$a p1);
    void d(Music p0,String p1,CDNUrl[] p2,a$a p3);
    Music e(Music p0);
    boolean f(Music p0,String p1,CDNUrl[] p2);
    void g(Music p0,String p1,CDNUrl[] p2,a$a p3);
    Music h(Music p0);
    void i(a p0,Music p1,String p2,CDNUrl[] p3,a$a p4);
    void j(Music p0,String p1,CDNUrl[] p2,a$a p3,boolean p4);
}
