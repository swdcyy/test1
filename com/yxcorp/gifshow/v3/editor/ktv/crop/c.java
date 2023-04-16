package com.yxcorp.gifshow.v3.editor.ktv.crop.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.editor.ktv.crop.g;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import java.lang.Object;
import java.lang.String;

public class c extends Accessor	// class@000fc3
{
    public final KtvCropFragment$a c;
    public final g d;

    public void c(g p0,KtvCropFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
