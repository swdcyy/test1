package com.yxcorp.gifshow.edit.draft.model.u;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Long;

public final class u implements Comparator	// class@001b11
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p1.lastModified(), p0.lastModified());
    }
}
