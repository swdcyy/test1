package com.yxcorp.gifshow.v3.editor.ktv.crop.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.crop.g;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import java.lang.Object;
import java.lang.String;

public class e extends Accessor	// class@000fc5
{
    public final KtvCropFragment$a c;
    public final g d;

    public void e(g p0,KtvCropFragment$a p1){
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
