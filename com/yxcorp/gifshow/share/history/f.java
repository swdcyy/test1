package com.yxcorp.gifshow.share.history.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.share.history.ShareHistoryFragment$a;
import com.yxcorp.gifshow.share.history.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.share.history.b;
import com.yxcorp.gifshow.share.history.c;
import com.yxcorp.gifshow.share.history.d;
import com.yxcorp.gifshow.share.history.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@001bb3
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("share_history_title_del_btn", new a(this, p1));
       p0.i("share_history_delete_num_change", new b(this, p1));
       p0.i("share_history_delete_items", new c(this, p1));
       d uod = new d(this, p1);
       String str = "share_history_delete_success";
       try{
          p0.i(str, uod);
          p0.h(ShareHistoryFragment$a.class, new e(this, p1));
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
