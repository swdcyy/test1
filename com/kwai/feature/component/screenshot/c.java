package com.kwai.feature.component.screenshot.c;
import io.reactivex.g;
import com.kwai.feature.component.screenshot.a$c;
import java.lang.Object;
import brd.v;
import e06.f;

public final class c implements g	// class@001285
{
    public final a$c b;

    public void c(a$c p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       c tb = this.b;
       tb.b = new f(tb, p0);
    }
}
