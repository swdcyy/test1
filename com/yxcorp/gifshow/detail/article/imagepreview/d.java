package com.yxcorp.gifshow.detail.article.imagepreview.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.article.imagepreview.f;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import java.lang.Object;
import java.util.List;

public class d extends Accessor	// class@00134e
{
    public final ImagePreviewFragment$a c;
    public final f d;

    public void d(f p0,ImagePreviewFragment$a p1){
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
