package com.kuaishou.live.gzone.v2.imagepreview.m;
import io.reactivex.g;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.Object;
import brd.v;
import mz6.b;
import android.content.Context;
import mz6.b$d;
import a63.o;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class m implements g	// class@001cd2
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b uob = new b(this.b.x);
       uob.a(new b$d(R.string.arg_RES_7f10368e, -1, R.color.arg_RES_7f061f94));
       uob.l(new o(p0));
       uob.q();
    }
}
