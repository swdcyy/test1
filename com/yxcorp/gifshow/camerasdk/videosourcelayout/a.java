package com.yxcorp.gifshow.camerasdk.videosourcelayout.a;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.Object;
import com.kwai.camerasdk.models.DisplayLayout;

public abstract class a	// class@001053
{
    public VideoSourceLayoutFactory$Type a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public RectF g;
    public RectF h;
    public RectF i;

    public void a(VideoSourceLayoutFactory$Type p0,int p1,int p2,int p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5 % 360;
    }
    public abstract void a();
    public abstract DisplayLayout b();
}
