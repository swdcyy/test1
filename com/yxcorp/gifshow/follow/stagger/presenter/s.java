package com.yxcorp.gifshow.follow.stagger.presenter.s;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.soc.arch.rubas.base.Rubas;

public final class s implements g	// class@00121f
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void accept(Object p0){
       if (p0.booleanValue()) {
          Rubas.c("followStaggerPageEnter");
       }else {
          Rubas.c("followStaggerPageLeave");
       }
       return;
    }
}
