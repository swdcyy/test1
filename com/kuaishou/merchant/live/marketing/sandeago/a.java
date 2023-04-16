package com.kuaishou.merchant.live.marketing.sandeago.a;
import u07.u;
import com.kuaishou.merchant.live.marketing.sandeago.e;
import com.kuaishou.merchant.api.live.sandeabiz.LiveAnchorSandeaBizService;
import brd.v;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import brd.t;
import n64.a;
import n64.b;
import erd.g;
import crd.b;

public final class a implements u	// class@001a37
{
    public final e b;
    public final LiveAnchorSandeaBizService c;
    public final v d;

    public void a(e p0,LiveAnchorSandeaBizService p1,v p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       a tb = this.b;
       a td = this.d;
       Objects.requireNonNull(tb);
       this.c.b().subscribe(new a(tb, td), new b(tb, td));
    }
}
