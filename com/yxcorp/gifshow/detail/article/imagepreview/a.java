package com.yxcorp.gifshow.detail.article.imagepreview.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.article.imagepreview.f;
import com.yxcorp.gifshow.detail.article.imagepreview.ImagePreviewFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class a extends Accessor	// class@00134b
{
    public final ImagePreviewFragment$a c;
    public final f d;

    public void a(f p0,ImagePreviewFragment$a p1){
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
