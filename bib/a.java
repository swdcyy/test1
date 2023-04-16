package bib.a;
import mw5.c;
import java.nio.ByteBuffer;
import java.lang.Object;

public class a implements c	// class@0003cf
{
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final ByteBuffer g;
    public final int h;

    public void a(int p0,int p1,long p2,boolean p3,int p4,boolean p5,int p6,ByteBuffer p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.h = p6;
       this.g = p7;
    }
    public int a(){
       return this.e;
    }
    public boolean b(){
       return this.f;
    }
    public boolean c(){
       return this.d;
    }
    public int getColorSpaceValue(){
       return 0;
    }
    public int getHeight(){
       return this.b;
    }
    public int getRotation(){
       return 0;
    }
    public int getTextureId(){
       return this.h;
    }
    public long getTimestamp(){
       return this.c;
    }
    public int getWidth(){
       return this.a;
    }
    public ByteBuffer n(){
       return this.g;
    }
}
