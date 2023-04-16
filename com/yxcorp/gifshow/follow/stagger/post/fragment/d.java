package com.yxcorp.gifshow.follow.stagger.post.fragment.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment$b;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import com.yxcorp.gifshow.follow.stagger.post.fragment.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.stagger.post.fragment.b;
import com.yxcorp.gifshow.follow.stagger.post.fragment.c;
import mm8.a;

public final class d implements b	// class@0011e3
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(TopSnackBarFragment.class, new a(this, p1));
       QPhoto qPhoto = QPhoto.class;
       b uob = new b(this, p1);
       try{
          p0.h(qPhoto, uob);
          p0.h(TopSnackBarFragment$b.class, new c(this, p1));
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
