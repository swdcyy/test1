package com.yxcorp.plugin.setting.helper.f;
import java.lang.Runnable;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.plugin.setting.helper.g;
import java.util.concurrent.Callable;
import brd.t;
import pgd.m;
import erd.o;
import pgd.h;
import com.yxcorp.plugin.setting.helper.d;
import erd.g;
import crd.b;

public final class f implements Runnable	// class@0008b9
{
    public final j b;
    public final SlipSwitchButton c;

    public void f(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       t.fromCallable(new g(tb, tc)).flatMap(new m(tb)).subscribe(new h(tb, tc), new d(tb, tc));
    }
}
