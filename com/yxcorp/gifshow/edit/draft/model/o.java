package com.yxcorp.gifshow.edit.draft.model.o;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;

public final class o implements FileFilter	// class@001b06
{
    public static final o b;

    static {
       o.b = new o();
    }
    public void o(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.canRead() && (p0.isDirectory() && (p0.getName()).startsWith(".ignore-")))? true: false;
       return b;
    }
}
