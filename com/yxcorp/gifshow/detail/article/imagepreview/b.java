package com.yxcorp.gifshow.detail.article.imagepreview.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.article.imagepreview.f;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@00134c
{
    public final ImagePreviewFragment$a c;
    public final f d;

    public void b(f p0,ImagePreviewFragment$a p1){
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
