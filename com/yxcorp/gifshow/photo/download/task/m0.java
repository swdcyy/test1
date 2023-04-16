package com.yxcorp.gifshow.photo.download.task.m0;
import java.lang.Runnable;
import com.yxcorp.gifshow.photo.download.task.n0;
import x6b.j$a;
import java.lang.Object;
import java.util.Objects;
import hxc.a;
import com.yxcorp.gifshow.photo.download.task.b;
import fxb.d;
import o56.a;
import java.io.File;
import android.app.Application;
import com.yxcorp.gifshow.photo.download.task.f;
import com.kuaishou.gifshow.files.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import qkd.a;
import brd.t;
import jxb.i;
import com.yxcorp.gifshow.photo.download.task.b0;
import erd.g;
import crd.b;

public final class m0 implements Runnable	// class@000f0a
{
    public final n0 b;
    public final j$a c;

    public void m0(n0 p0,j$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m0 tb = this.b;
       m0 tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.b() != null) {
          b.h.e(tc.b());
       }
       if (!a.e(tb.j, a.B.getCacheDir().getParentFile())) {
          a.d(tb.c, tb.j, tb.b.getVideoDuration());
       }
       i.i(tb.b).subscribe(new b0(tb));
       return;
    }
}
