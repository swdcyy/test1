package com.yxcorp.gifshow.edit.draft.model.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class f implements g	// class@001afd
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("DraftFileManager", "logFileCount", p0);
    }
}
