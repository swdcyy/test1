package com.yxcorp.gifshow.util.PostBaseInfoManager;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.io.File;
import com.yxcorp.gifshow.util.PostBaseInfoManager$UnionResponse;
import erd.g;
import erd.o;
import java.lang.Throwable;

public abstract class PostBaseInfoManager	// class@001f11
{
    public final int a;
    public int b;
    public List c;
    public PostBaseInfoManager$a d;
    public b e;

    public void PostBaseInfoManager(int p0){
       super();
       this.b = 0;
       this.c = Lists.b();
       this.a = p0;
    }
    public abstract File a();
    public abstract PostBaseInfoManager$UnionResponse b();
    public abstract g c();
    public abstract o d();
    public abstract o e();
    public abstract void f(Throwable p0);
    public abstract o g();
    public abstract PostBaseInfoManager$UnionResponse h();
    public abstract boolean i();
}
