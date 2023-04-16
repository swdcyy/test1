package com.yxcorp.gifshow.camerasdk.m;
import com.kwai.camerasdk.face.FaceDetectorContext$c;
import java.lang.Object;
import java.lang.String;
import k2b.u1;

public final class m implements FaceDetectorContext$c	// class@00102f
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final void uploadStats(String p0){
       u1.R("YTECH_STAT_INFO", p0, 26);
    }
}
