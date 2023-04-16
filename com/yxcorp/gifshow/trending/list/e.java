package com.yxcorp.gifshow.trending.list.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.trending.list.TrendingListAdapter$a;
import com.yxcorp.gifshow.trending.list.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.trending.list.b;
import com.yxcorp.gifshow.trending.list.c;
import com.yxcorp.gifshow.trending.list.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@001db5
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LOGGER_EXTRA_PARAMS", new a(this, p1));
       p0.i("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVABLE", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "TRENDING_INFO_ITEM_CLICK_OBSERVABLE";
       try{
          p0.i(str, uoc);
          p0.h(TrendingListAdapter$a.class, new d(this, p1));
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
