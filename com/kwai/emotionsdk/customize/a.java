package com.kwai.emotionsdk.customize.a;
import android.content.DialogInterface$OnClickListener;
import com.kwai.emotionsdk.customize.CustomizeEmotionFragment;
import java.lang.Object;
import android.content.DialogInterface;
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
import fk5.d;
import com.kwai.emotionsdk.customize.e;
import erd.g;
import crd.b;

public final class a implements DialogInterface$OnClickListener	// class@000da3
{
    public final CustomizeEmotionFragment b;

    public void a(CustomizeEmotionFragment p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f100d7b && !PatchProxy.applyVoid(null, tb, CustomizeEmotionFragment.class, "6")) {
          if (!p0.C(ActivityContext.d().b())) {
             s.a(R.string.arg_RES_7f100d92);
          }else {
             m.a("delSelectEmotion");
             b.b().a().b(j.o().i().f.d, tb.j.M0()).map(new e()).subscribeOn(m.b).observeOn(m.a).compose(tb.ge()).subscribe(new d(tb), e.b);
          }
       }
       return;
    }
}
