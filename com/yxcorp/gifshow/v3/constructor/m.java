package com.yxcorp.gifshow.v3.constructor.m;
import ok.h;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Void;
import com.yxcorp.gifshow.v3.constructor.n;
import com.yxcorp.gifshow.v3.constructor.o;
import erd.g;
import crd.b;
import brd.t;

public final class m implements h	// class@000d4c
{
    public final WorkspaceConstructor b;
    public final c c;

    public void m(WorkspaceConstructor p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       m tb = this.b;
       n on = new n(tb, this.c);
       return tb.b.subscribe(on, o.b);
    }
}
