package com.yxcorp.gifshow.edit.draft.model.j;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import brd.t;
import laa.m;

public final class j implements o	// class@001b01
{
    public final DraftFileManager b;
    public final File c;

    public void j(DraftFileManager p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return this.b.o(this.c).map(new m(p0));
    }
}
