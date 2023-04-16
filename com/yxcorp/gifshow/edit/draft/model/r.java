package com.yxcorp.gifshow.edit.draft.model.r;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;

public final class r implements FileFilter	// class@001b0c
{
    public static final r b;

    static {
       r.b = new r();
    }
    public void r(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.canRead() && (p0.isDirectory() && (!(p0.getName()).startsWith(".corrupt-") && (!(p0.getName()).startsWith(".ignore-") && (!(p0.getName()).endsWith(".trash") && !(p0.getName()).endsWith("-editing"))))))? true: false;
       return b;
    }
}
