package com.kwai.emotionsdk.customize.c;
import android.view.View$OnClickListener;
import com.kwai.emotionsdk.customize.CustomizeEmotionFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import mz6.b;
import jl5.c;
import mz6.a;
import mz6.b$d;
import com.kwai.emotionsdk.customize.a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class c implements View$OnClickListener	// class@000da5
{
    public final CustomizeEmotionFragment b;

    public void c(CustomizeEmotionFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, CustomizeEmotionFragment.class, "5")) {
       }else if(tb.getContext() == null){
          b uob = new b(tb.getContext());
          uob.n(R.string.arg_RES_7f100d7c);
          uob.p(14.00f, c.a(R.color.arg_RES_7f060a1a), objArray);
          a uoa = a.b();
          uoa.g(R.string.arg_RES_7f100d7b);
          uoa.o(R.color.arg_RES_7f060a21);
          uob.a(uoa.a());
          uob.l(new a(tb));
          uob.q();
       }
       return;
    }
}
