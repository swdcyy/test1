package com.kuaishou.live.gzone.treasurebox.widget.a;
import ok.h;
import com.kuaishou.live.gzone.treasurebox.widget.LiveGzoneTreasurePendantV2;
import java.lang.Object;
import java.lang.Void;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import s53.a;
import s53.b;
import erd.g;
import crd.b;

public final class a implements h	// class@001cab
{
    public final LiveGzoneTreasurePendantV2 b;

    public void a(LiveGzoneTreasurePendantV2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       return tb.i.observable().subscribe(new a(tb), new b(tb));
    }
}
