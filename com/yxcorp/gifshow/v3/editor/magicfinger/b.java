package com.yxcorp.gifshow.v3.editor.magicfinger.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.magicfinger.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment;

public class b extends Accessor	// class@00102b
{
    public final MagicFingerFragment$a c;
    public final h d;

    public void b(h p0,MagicFingerFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
