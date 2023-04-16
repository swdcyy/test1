package com.yxcorp.gifshow.edit.draft.model.n;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;

public final class n implements FileFilter	// class@001b05
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.canRead() && (p0.isDirectory() && (p0.getName()).startsWith(".corrupt-")))? true: false;
       return b;
    }
}
