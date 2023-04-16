package com.kwai.emotionsdk.customize.b;
import android.view.View$OnClickListener;
import com.kwai.emotionsdk.customize.CustomizeEmotionFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.util.ActivityContext;
import android.content.Context;
import ekd.p0;
import e17.i;
import e17.s;
import nk5.m;
import java.util.List;
import gk5.h;
import lk5.b;
import lk5.a;
import ak5.j;
import ak5.a;
import bk5.k;
import brd.t;
import cjd.e;
import erd.o;
import jl5.m;
import brd.z;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import fk5.c;
import com.kwai.emotionsdk.customize.d;
import erd.g;
import crd.b;

public final class b implements View$OnClickListener	// class@000da4
{
    public final CustomizeEmotionFragment b;

    public void b(CustomizeEmotionFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, CustomizeEmotionFragment.class, "4")) {
       }else if(!p0.C(ActivityContext.d().b())){
          s.a(R.string.arg_RES_7f100d92);
       }else {
          m.a("moveSelectEmotion");
          b.b().a().e(j.o().i().f.e, tb.j.M0()).map(new e()).subscribeOn(m.b).observeOn(m.a).compose(tb.ge()).subscribe(new c(tb), d.b);
       }
       return;
    }
}
