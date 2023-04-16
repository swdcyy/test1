package com.yxcorp.gifshow.detail.article.imagepreview.p;
import io.reactivex.g;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import java.lang.Object;
import brd.v;
import mz6.b;
import android.content.Context;
import mz6.b$d;
import xw9.n;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class p implements g	// class@00135a
{
    public final r b;

    public void p(r p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b uob = new b(this.b.y);
       uob.a(new b$d(R.string.arg_RES_7f10368e, -1, R.color.arg_RES_7f061f94));
       uob.l(new n(p0));
       uob.q();
    }
}
