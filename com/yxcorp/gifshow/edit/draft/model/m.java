package com.yxcorp.gifshow.edit.draft.model.m;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;

public final class m implements FileFilter	// class@001b04
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final boolean accept(File p0){
       return p0.canRead();
    }
}
