package com.yxcorp.gifshow.v3.editor.ktv.crop.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.crop.g;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.i;

public class a extends Accessor	// class@000fc1
{
    public final KtvCropFragment$a c;
    public final g d;

    public void a(g p0,KtvCropFragment$a p1){
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
