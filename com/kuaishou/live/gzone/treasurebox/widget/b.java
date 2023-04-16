package com.kuaishou.live.gzone.treasurebox.widget.b;
import ok.h;
import com.kuaishou.live.gzone.treasurebox.widget.TreasureBoxV2StyleCellView;
import java.lang.Object;
import java.lang.Void;
import mrd.c;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import s53.k;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;

public final class b implements h	// class@001cac
{
    public final TreasureBoxV2StyleCellView b;

    public void b(TreasureBoxV2StyleCellView p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       k ok = new k(tb);
       return tb.L.getShakeAnimatorSubject().subscribe(ok, Functions.d());
    }
}
