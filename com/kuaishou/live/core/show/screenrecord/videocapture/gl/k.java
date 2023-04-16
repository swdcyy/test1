package com.kuaishou.live.core.show.screenrecord.videocapture.gl.k;
import java.nio.FloatBuffer;
import kj2.c;
import java.lang.Object;
import lj2.d$f;
import kj2.b;

public class k	// class@001003
{
    public final d$f a;
    public final b b;
    public TextureBuffer$Type c;
    public a d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public static final float[][] i;
    public static final FloatBuffer j;
    public static final FloatBuffer k;

    static {
       float[][] uofloatArray = new float[][4]{new float[9]{0x3e837b4a,0xbe17c1be,0x3ee0ded3,0x3f010cb3,0xbe94fdf4,0xbebc5048,0x3dc87fcc,0x3ee0ded3,0xbd923a2a},new float[9]{0x3e991687,0xbe2cbfb1,0x3f000000,0x3f1645a2,0xbea9a027,0xbed65fd9,0x3de978d5,0x3f000000,0xbda6809d},new float[9]{0x3e3afb7f,0xbdce3bcd,0x3ee0ded3,0x3f1d3c36,0xbead4fdf,0xbecc49ba,0x3d7df3b6,0x3ee0ded3,0xbd24a8c1},new float[9]{0x3e59b3d0,0xbdeab368,0x3f000000,0x3f371759,0xbec55326,0xbee88ce7,0x3d93dd98,0x3f000000,0xbd3b98c8}};
       k.i = uofloatArray;
       k.j = c.b(new float[8]{0xbf800000,0xbf800000,0x3f800000,0xbf800000,0xbf800000,0x3f800000,0x3f800000,0x3f800000});
       k.k = c.b(new float[8]{0,0,0x3f800000,0,0,0x3f800000,0x3f800000,0x3f800000});
    }
    public void k(){
       super();
       d$f uof = new d$f();
       this.a = uof;
       this.b = new b(6408);
       this.h = false;
       uof.a();
    }
}
