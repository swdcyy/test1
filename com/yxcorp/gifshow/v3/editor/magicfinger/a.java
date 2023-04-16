package com.yxcorp.gifshow.v3.editor.magicfinger.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.magicfinger.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class a extends Accessor	// class@00102a
{
    public final MagicFingerFragment$a c;
    public final h d;

    public void a(h p0,MagicFingerFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g;
    }
    public void set(Object p0){
       this.c.g = p0;
    }
}
