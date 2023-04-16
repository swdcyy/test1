package com.kwai.slide.play.detail.information.caption.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$b;
import com.kwai.slide.play.detail.information.caption.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.slide.play.detail.information.caption.b;
import com.kwai.slide.play.detail.information.caption.c;
import com.kwai.slide.play.detail.information.caption.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@0017d6
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("caption", new a(this, p1));
       p0.i("fragment", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "username";
       try{
          p0.i(str, uoc);
          p0.h(CaptionDialogFragment$b.class, new d(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
