package com.yxcorp.gifshow.relation.explore.presenter.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.presenter.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import wu5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.content.Intent;
import hac.e1;
import n3d.a;

public final class u implements Runnable	// class@001863
{
    public final v b;
    public final GifshowActivity c;

    public void u(v p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       u tb = this.b;
       u tc = this.c;
       Objects.requireNonNull(tb);
       if (v.I.d()) {
          tb.s.onNext(Integer.valueOf(7));
          tc.t1(d.a(0x6de3c81e).V7(tb.getActivity(), tb.y), 2049, new e1(tb));
       }
       return;
    }
}
