package com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LoadPolicy extends Enum	// class@001ef5
{
    public static final LoadPolicy[] $VALUES;
    public static final LoadPolicy DIALOG;
    public static final LoadPolicy DIALOG_IF_DOWNLOADED;
    public static final LoadPolicy DIALOG_WITH_NEW_ACTIVITY;
    public static final LoadPolicy SILENT;
    public static final LoadPolicy SILENT_ENQUEUE;
    public static final LoadPolicy SILENT_IF_DOWNLOADED;
    public static final LoadPolicy SILENT_IMMEDIATE;
    public static final LoadPolicy SILENT_INIT;
    public static final LoadPolicy TEST;

    static {
       LoadPolicy[] loadPolicyAr = new LoadPolicy[9];
       LoadPolicy loadPolicy = new LoadPolicy("SILENT", 0);
       LoadPolicy.SILENT = loadPolicy;
       loadPolicyAr[0] = loadPolicy;
       loadPolicy = new LoadPolicy("SILENT_IMMEDIATE", 1);
       LoadPolicy.SILENT_IMMEDIATE = loadPolicy;
       loadPolicyAr[1] = loadPolicy;
       loadPolicy = new LoadPolicy("SILENT_INIT", 2);
       LoadPolicy.SILENT_INIT = loadPolicy;
       loadPolicyAr[2] = loadPolicy;
       loadPolicy = new LoadPolicy("SILENT_ENQUEUE", 3);
       LoadPolicy.SILENT_ENQUEUE = loadPolicy;
       loadPolicyAr[3] = loadPolicy;
       loadPolicy = new LoadPolicy("DIALOG", 4);
       LoadPolicy.DIALOG = loadPolicy;
       loadPolicyAr[4] = loadPolicy;
       loadPolicy = new LoadPolicy("SILENT_IF_DOWNLOADED", 5);
       LoadPolicy.SILENT_IF_DOWNLOADED = loadPolicy;
       loadPolicyAr[5] = loadPolicy;
       loadPolicy = new LoadPolicy("DIALOG_IF_DOWNLOADED", 6);
       LoadPolicy.DIALOG_IF_DOWNLOADED = loadPolicy;
       loadPolicyAr[6] = loadPolicy;
       loadPolicy = new LoadPolicy("DIALOG_WITH_NEW_ACTIVITY", 7);
       LoadPolicy.DIALOG_WITH_NEW_ACTIVITY = loadPolicy;
       loadPolicyAr[7] = loadPolicy;
       loadPolicy = new LoadPolicy("TEST", 8);
       LoadPolicy.TEST = loadPolicy;
       loadPolicyAr[8] = loadPolicy;
       LoadPolicy.$VALUES = loadPolicyAr;
    }
    public void LoadPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static LoadPolicy valueOf(String p0){
       return Enum.valueOf(LoadPolicy.class, p0);
    }
    public static LoadPolicy[] values(){
       return LoadPolicy.$VALUES.clone();
    }
}
