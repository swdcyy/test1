package com.yxcorp.gifshow.model.MagicEmoji$a;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Object;

public final class MagicEmoji$a	// class@001e50
{
    public float a;
    public float b;
    public boolean c;
    public final float d;
    public float e;
    public final MagicEmoji$SeekBarType f;
    public boolean g;
    public boolean h;
    public boolean i;

    public void MagicEmoji$a(float p0,MagicEmoji$SeekBarType p1){
       super();
       this.b = 0xbf800000;
       this.g = false;
       this.h = false;
       this.i = false;
       this.a = p0;
       this.d = p0;
       this.f = p1;
    }
    public boolean a(){
       return this.h;
    }
    public float b(){
       return this.a;
    }
    public float c(){
       return this.d;
    }
    public MagicEmoji$SeekBarType d(){
       return this.f;
    }
    public boolean e(){
       return this.g;
    }
    public boolean f(){
       return this.c;
    }
    public void g(float p0,boolean p1){
       this.a = p0;
       this.c = p1;
    }
    public void h(float p0){
       this.e = p0;
    }
    public void i(boolean p0){
       this.i = p0;
    }
}
