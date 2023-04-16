package com.yxcorp.plugin.setting.helper.c;
import n3d.a;
import com.yxcorp.plugin.setting.helper.j;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import android.content.Intent;
import brd.t;
import pgd.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class c implements a	// class@0008b6
{
    public final j b;
    public final SlipSwitchButton c;

    public void c(j p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tb = this.b;
       t ot = tb.f();
       j oj = new j(tb, this.c);
       ot.subscribe(oj, Functions.d());
    }
}
