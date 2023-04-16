package com.yxcorp.gifshow.detail.article.imagepreview.j;
import erd.o;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.article.imagepreview.p;
import io.reactivex.g;
import brd.t;

public final class j implements o	// class@001354
{
    public final r b;

    public void j(r p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new p(tb));
    }
}
