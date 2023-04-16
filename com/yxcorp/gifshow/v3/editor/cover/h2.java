package com.yxcorp.gifshow.v3.editor.cover.h2;
import erd.g;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import io.reactivex.subjects.PublishSubject;
import ppc.b2;
import t36.f$a;
import t36.f;

public final class h2 implements g	// class@000e69
{
    public final VideoCoverGeneratePresenter b;

    public void h2(VideoCoverGeneratePresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h2 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "addTextToCover final", objArray);
       tb.x.onNext(p0);
       tb.w.s0(new b2(p0));
    }
}
