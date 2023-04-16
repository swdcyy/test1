package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.e;
import ok.h;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.i;
import java.lang.Object;
import java.lang.Void;
import wtc.e;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.c;
import erd.g;
import crd.b;
import brd.t;

public final class e implements h	// class@0012d4
{
    public final i b;

    public void e(i p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       e tb = this.b;
       e uoe = new e(tb);
       return tb.k.subscribe(uoe, c.b);
    }
}
