package com.kuaishou.live.gzone.treasurebox.presenter.g;
import ok.h;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import p53.p;
import p53.x;
import erd.g;
import crd.b;
import brd.t;

public final class g implements h	// class@001c80
{
    public final h b;
    public final LiveTreasureBoxModel c;

    public void g(h p0,LiveTreasureBoxModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       p op = new p(tb, tc);
       return tc.mOpenedDoneSubject.subscribe(op, new x(tb));
    }
}
