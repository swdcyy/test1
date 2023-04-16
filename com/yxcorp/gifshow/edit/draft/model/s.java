package com.yxcorp.gifshow.edit.draft.model.s;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;

public final class s implements FilenameFilter	// class@001b0f
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final boolean accept(File p0,String p1){
       return p1.endsWith(".bfr");
    }
}
