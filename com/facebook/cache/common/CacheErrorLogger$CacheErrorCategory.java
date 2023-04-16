package com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CacheErrorLogger$CacheErrorCategory extends Enum	// class@001038
{
    public static final CacheErrorLogger$CacheErrorCategory[] $VALUES;
    public static final CacheErrorLogger$CacheErrorCategory DELETE_FILE;
    public static final CacheErrorLogger$CacheErrorCategory EVICTION;
    public static final CacheErrorLogger$CacheErrorCategory GENERIC_IO;
    public static final CacheErrorLogger$CacheErrorCategory OTHER;
    public static final CacheErrorLogger$CacheErrorCategory READ_DECODE;
    public static final CacheErrorLogger$CacheErrorCategory READ_FILE;
    public static final CacheErrorLogger$CacheErrorCategory READ_FILE_NOT_FOUND;
    public static final CacheErrorLogger$CacheErrorCategory READ_INVALID_ENTRY;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_CALLBACK_ERROR;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_CREATE_DIR;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_CREATE_TEMPFILE;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_ENCODE;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_INVALID_ENTRY;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_RENAME_FILE_OTHER;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
    public static final CacheErrorLogger$CacheErrorCategory WRITE_UPDATE_FILE_NOT_FOUND;

    static {
       CacheErrorLogger$CacheErrorCategory uCacheErrorC = new CacheErrorLogger$CacheErrorCategory("READ_DECODE", 0);
       CacheErrorLogger$CacheErrorCategory.READ_DECODE = uCacheErrorC;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC1 = new CacheErrorLogger$CacheErrorCategory("READ_FILE", 1);
       CacheErrorLogger$CacheErrorCategory.READ_FILE = uCacheErrorC1;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC2 = new CacheErrorLogger$CacheErrorCategory("READ_FILE_NOT_FOUND", 2);
       CacheErrorLogger$CacheErrorCategory.READ_FILE_NOT_FOUND = uCacheErrorC2;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC3 = new CacheErrorLogger$CacheErrorCategory("READ_INVALID_ENTRY", 3);
       CacheErrorLogger$CacheErrorCategory.READ_INVALID_ENTRY = uCacheErrorC3;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC4 = new CacheErrorLogger$CacheErrorCategory("WRITE_ENCODE", 4);
       CacheErrorLogger$CacheErrorCategory.WRITE_ENCODE = uCacheErrorC4;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC5 = new CacheErrorLogger$CacheErrorCategory("WRITE_CREATE_TEMPFILE", 5);
       CacheErrorLogger$CacheErrorCategory.WRITE_CREATE_TEMPFILE = uCacheErrorC5;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC6 = new CacheErrorLogger$CacheErrorCategory("WRITE_UPDATE_FILE_NOT_FOUND", 6);
       CacheErrorLogger$CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND = uCacheErrorC6;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC7 = new CacheErrorLogger$CacheErrorCategory("WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND", 7);
       CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND = uCacheErrorC7;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC8 = new CacheErrorLogger$CacheErrorCategory("WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND", 8);
       CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND = uCacheErrorC8;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC9 = new CacheErrorLogger$CacheErrorCategory("WRITE_RENAME_FILE_OTHER", 9);
       CacheErrorLogger$CacheErrorCategory.WRITE_RENAME_FILE_OTHER = uCacheErrorC9;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC10 = new CacheErrorLogger$CacheErrorCategory("WRITE_CREATE_DIR", 10);
       CacheErrorLogger$CacheErrorCategory.WRITE_CREATE_DIR = uCacheErrorC10;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC11 = new CacheErrorLogger$CacheErrorCategory("WRITE_CALLBACK_ERROR", 11);
       CacheErrorLogger$CacheErrorCategory.WRITE_CALLBACK_ERROR = uCacheErrorC11;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC12 = new CacheErrorLogger$CacheErrorCategory("WRITE_INVALID_ENTRY", 12);
       CacheErrorLogger$CacheErrorCategory.WRITE_INVALID_ENTRY = uCacheErrorC12;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC13 = new CacheErrorLogger$CacheErrorCategory("DELETE_FILE", 13);
       CacheErrorLogger$CacheErrorCategory.DELETE_FILE = uCacheErrorC13;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC14 = uCacheErrorC13;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC15 = new CacheErrorLogger$CacheErrorCategory("EVICTION", 14);
       CacheErrorLogger$CacheErrorCategory.EVICTION = uCacheErrorC15;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC16 = uCacheErrorC15;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC17 = new CacheErrorLogger$CacheErrorCategory("GENERIC_IO", 15);
       CacheErrorLogger$CacheErrorCategory.GENERIC_IO = uCacheErrorC17;
       CacheErrorLogger$CacheErrorCategory uCacheErrorC18 = uCacheErrorC17;
       uCacheErrorC13 = new CacheErrorLogger$CacheErrorCategory("OTHER", 16);
       CacheErrorLogger$CacheErrorCategory.OTHER = uCacheErrorC13;
       CacheErrorLogger$CacheErrorCategory[] uCacheErrorC19 = new CacheErrorLogger$CacheErrorCategory[17];
       uCacheErrorC19[0] = uCacheErrorC;
       uCacheErrorC19[1] = uCacheErrorC1;
       uCacheErrorC19[2] = uCacheErrorC2;
       uCacheErrorC19[3] = uCacheErrorC3;
       uCacheErrorC19[4] = uCacheErrorC4;
       uCacheErrorC19[5] = uCacheErrorC5;
       uCacheErrorC19[6] = uCacheErrorC6;
       uCacheErrorC19[7] = uCacheErrorC7;
       uCacheErrorC19[8] = uCacheErrorC8;
       uCacheErrorC19[9] = uCacheErrorC9;
       uCacheErrorC19[10] = uCacheErrorC10;
       uCacheErrorC19[11] = uCacheErrorC11;
       uCacheErrorC19[12] = uCacheErrorC12;
       uCacheErrorC19[13] = uCacheErrorC14;
       uCacheErrorC19[14] = uCacheErrorC16;
       uCacheErrorC19[15] = uCacheErrorC18;
       uCacheErrorC19[16] = uCacheErrorC13;
       CacheErrorLogger$CacheErrorCategory.$VALUES = uCacheErrorC19;
    }
    public void CacheErrorLogger$CacheErrorCategory(String p0,int p1){
       super(p0, p1);
    }
    public static CacheErrorLogger$CacheErrorCategory valueOf(String p0){
       return Enum.valueOf(CacheErrorLogger$CacheErrorCategory.class, p0);
    }
    public static CacheErrorLogger$CacheErrorCategory[] values(){
       return CacheErrorLogger$CacheErrorCategory.$VALUES.clone();
    }
}
