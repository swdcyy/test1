package com.yxcorp.gifshow.comment.emotion.detail.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.emotion.detail.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mz6.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import mz6.b$d;
import lk9.h;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class b implements View$OnClickListener	// class@0010c3
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "6")) {
       }else {
          b uob = new b(tb.getActivity());
          uob.e(true);
          uob.a(new b$d(R.string.arg_RES_7f100943, -1, R.color.arg_RES_7f061f7d));
          uob.a(new b$d(R.string.arg_RES_7f10428f, -1, R.color.arg_RES_7f061f7d));
          uob.l(new h(tb));
          uob.q();
       }
       return;
    }
}
