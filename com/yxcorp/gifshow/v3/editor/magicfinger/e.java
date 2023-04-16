package com.yxcorp.gifshow.v3.editor.magicfinger.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.magicfinger.h;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;

public class e extends Accessor	// class@00102e
{
    public final MagicFingerFragment$a c;
    public final h d;

    public void e(h p0,MagicFingerFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
