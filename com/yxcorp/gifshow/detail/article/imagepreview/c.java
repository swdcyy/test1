package com.yxcorp.gifshow.detail.article.imagepreview.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.article.imagepreview.f;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends Accessor	// class@00134d
{
    public final ImagePreviewFragment$a c;
    public final f d;

    public void c(f p0,ImagePreviewFragment$a p1){
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
