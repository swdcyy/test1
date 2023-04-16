package com.kuaishou.live.core.show.screenrecord.videocapture.gl.j;
import java.nio.FloatBuffer;
import kj2.c;
import java.lang.Object;
import lj2.d$f;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer$Type;

public class j	// class@001001
{
    public final d$f a;
    public TextureBuffer$Type b;
    public boolean c;
    public a d;
    public int e;
    public static final FloatBuffer f;
    public static final FloatBuffer g;

    static {
       j.f = c.b(new float[8]{0xbf800000,0xbf800000,0x3f800000,0xbf800000,0xbf800000,0x3f800000,0x3f800000,0x3f800000});
       j.g = c.b(new float[8]{0,0,0x3f800000,0,0,0x3f800000,0x3f800000,0x3f800000});
    }
    public void j(){
       super();
       d$f uof = new d$f();
       this.a = uof;
       this.b = TextureBuffer$Type.INVALID;
       this.c = false;
       this.d = null;
       this.e = 0;
       uof.a();
    }
}
