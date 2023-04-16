package com.yxcorp.gifshow.upload.p0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;

public final class p0 implements o	// class@001e97
{
    public static final p0 b;

    static {
       p0.b = new p0();
    }
    public void p0(){
       super();
    }
    public final Object apply(Object p0){
       p0.l1(Phase.POST);
       return DraftFileManager.E().b(p0);
    }
}
