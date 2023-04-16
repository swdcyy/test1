package com.kuaishou.live.gzone.treasurebox.presenter.d;
import ok.h;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import p53.u;
import io.reactivex.g;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import erd.o;
import com.kuaishou.live.gzone.treasurebox.presenter.f;
import p53.n;
import p53.o;
import erd.g;
import crd.b;

public final class d implements h	// class@001c7d
{
    public final h b;
    public final LiveTreasureBoxListResponse c;
    public final LiveTreasureBoxModel d;

    public void d(h p0,LiveTreasureBoxListResponse p1,LiveTreasureBoxModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d td = this.d;
       Objects.requireNonNull(tb);
       p0 = t.create(new u(tb, this.c));
       f uof = PatchProxy.apply(null, tb, h.class, "22");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = f.b;
       }
       return p0.map(uof).subscribe(new n(tb), new o(tb, td));
    }
}
