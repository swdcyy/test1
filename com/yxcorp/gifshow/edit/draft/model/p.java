package com.yxcorp.gifshow.edit.draft.model.p;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;

public final class p implements FileFilter	// class@001b07
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.canRead() && (p0.isDirectory() && (p0.getName()).startsWith("kwai_lv_")))? true: false;
       return b;
    }
}
