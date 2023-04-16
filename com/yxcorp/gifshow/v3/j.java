package com.yxcorp.gifshow.v3.j;
import erd.g;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import q87.c;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.t;
import t36.f$a;
import android.content.Intent;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ooc.x;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Runnable;
import lq.i;
import lq.a;

public final class j implements g	// class@00153e
{
    public final EditorActivity b;
    public final long c;

    public void j(EditorActivity p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("EditCost", "初始化编辑session \(初始化SDK\) 总计耗时 "+(System.currentTimeMillis() - this.c), objArray);
       tb.j1.o0().s0(t.a);
       p0 = tb.getIntent();
       if (PatchProxy.applyVoidOneRefs(p0, tb, EditorActivity.class, "6")) {
       }else if(PostExperimentUtils.K0()){
          tb.l1 = new x(tb, p0);
          tb.V2().post(tb.l1);
       }else {
          i.m().p().x(p0);
          tb.S3();
       }
       tb.T3();
       return;
    }
}
