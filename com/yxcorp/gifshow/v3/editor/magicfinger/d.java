package com.yxcorp.gifshow.v3.editor.magicfinger.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.magicfinger.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class d extends Accessor	// class@00102d
{
    public final MagicFingerFragment$a c;
    public final h d;

    public void d(h p0,MagicFingerFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
