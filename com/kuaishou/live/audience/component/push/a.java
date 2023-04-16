package com.kuaishou.live.audience.component.push.a;
import io.reactivex.g;
import com.kuaishou.live.audience.component.push.c;
import s0d.e;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import v21.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;

public final class a implements g	// class@000bca
{
    public final c b;
    public final e c;
    public final String d;

    public void a(c p0,e p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       a td = this.d;
       a.j(tb.getContext(), this.c, td, new a(tb, td));
    }
}
