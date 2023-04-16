package com.yxcorp.gifshow.postwork.h;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;

public final class h implements Callable	// class@0010cb
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object call(){
       return DraftFileManager.E();
    }
}
