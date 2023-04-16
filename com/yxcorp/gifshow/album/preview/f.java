package com.yxcorp.gifshow.album.preview.f;
import z0.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.lang.Void;
import io.reactivex.subjects.PublishSubject;
import q79.d;
import j79.i;
import erd.g;
import crd.b;
import brd.t;

public final class f implements a	// class@001a51
{
    public final MediaPreviewFragment a;

    public void f(MediaPreviewFragment p0){
       this.a = p0;
    }
    public final Object apply(Object p0){
       f ta = this.a;
       return ta.D.D0().subscribe(new i(ta));
    }
}
