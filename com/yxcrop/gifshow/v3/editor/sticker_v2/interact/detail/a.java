package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.a;
import ok.h;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import java.lang.Object;
import java.lang.Void;
import hmd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.c;
import erd.g;
import crd.b;
import brd.t;

public final class a implements h	// class@000a8b
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       b uob = new b(tb);
       return tb.j.subscribe(uob, c.b);
    }
}
