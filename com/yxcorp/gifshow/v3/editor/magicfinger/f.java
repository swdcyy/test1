package com.yxcorp.gifshow.v3.editor.magicfinger.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.magicfinger.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import java.lang.Object;
import java.lang.String;

public class f extends Accessor	// class@00102f
{
    public final MagicFingerFragment$a c;
    public final h d;

    public void f(h p0,MagicFingerFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
