package com.yxcorp.gifshow.activity.share.presenter.b0;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import android.view.View;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import f66.i;
import jq.a;
import java.lang.String;
import q87.c;
import android.os.SystemClock;
import zw8.z;
import java.util.concurrent.Callable;

public final class b0 implements g	// class@0013c1
{
    public final c0 b;
    public final View c;
    public final Bitmap d;

    public void b0(c0 p0,View p1,Bitmap p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       b0 td = this.d;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.b().w("ShareBasePreviewPresenter", "startPreview, setDataSource success", objArray);
       tb.r = SystemClock.elapsedRealtime();
       tb.e9(this.c, td, new z(tb, td));
    }
}
