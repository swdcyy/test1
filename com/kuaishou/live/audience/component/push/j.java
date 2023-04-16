package com.kuaishou.live.audience.component.push.j;
import io.reactivex.g;
import com.kuaishou.live.audience.component.push.LiveAudiencePushFragment;
import s0d.e;
import java.lang.String;
import java.lang.Object;
import brd.v;
import android.content.Context;
import androidx.fragment.app.Fragment;
import v21.m;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;

public final class j implements g	// class@000bd5
{
    public final LiveAudiencePushFragment b;
    public final e c;
    public final String d;

    public void j(LiveAudiencePushFragment p0,e p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       j tb = this.b;
       j td = this.d;
       a.j(tb.getContext(), this.c, td, new m(tb, td));
    }
}
