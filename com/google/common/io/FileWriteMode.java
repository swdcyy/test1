package com.google.common.io.FileWriteMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class FileWriteMode extends Enum	// class@0018e2
{
    public static final FileWriteMode[] $VALUES;
    public static final FileWriteMode APPEND;

    static {
       FileWriteMode uFileWriteMo = new FileWriteMode("APPEND", 0);
       FileWriteMode.APPEND = uFileWriteMo;
       FileWriteMode[] uFileWriteMo1 = new FileWriteMode[]{uFileWriteMo};
       FileWriteMode.$VALUES = uFileWriteMo1;
    }
    public void FileWriteMode(String p0,int p1){
       super(p0, p1);
    }
    public static FileWriteMode valueOf(String p0){
       return Enum.valueOf(FileWriteMode.class, p0);
    }
    public static FileWriteMode[] values(){
       return FileWriteMode.$VALUES.clone();
    }
}
