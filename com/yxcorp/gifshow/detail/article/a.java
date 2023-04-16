package com.yxcorp.gifshow.detail.article.a;
import hka.a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.article.ArticleDetailActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.b;

public final class a implements a	// class@001346
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean onBackPressed(){
       RxBus.f.b(new b());
       return true;
    }
}
