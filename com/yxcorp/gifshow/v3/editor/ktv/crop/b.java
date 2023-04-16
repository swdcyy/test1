package com.yxcorp.gifshow.v3.editor.ktv.crop.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.crop.g;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment;

public class b extends Accessor	// class@000fc2
{
    public final KtvCropFragment$a c;
    public final g d;

    public void b(g p0,KtvCropFragment$a p1){
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
