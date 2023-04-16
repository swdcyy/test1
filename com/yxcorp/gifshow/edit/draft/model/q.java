package com.yxcorp.gifshow.edit.draft.model.q;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;

public final class q implements FileFilter	// class@001b0b
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final boolean accept(File p0){
       boolean b = (p0.canRead() && (p0.isDirectory() && (!(p0.getName()).startsWith(".corrupt-") && (!(p0.getName()).startsWith(".ignore-") && (!(p0.getName()).endsWith(".trash") && (p0.getName()).endsWith("-editing"))))))? true: false;
       return b;
    }
}
