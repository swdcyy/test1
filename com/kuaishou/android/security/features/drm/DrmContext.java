package com.kuaishou.android.security.features.drm.DrmContext;
import java.lang.Object;
import java.lang.String;

public class DrmContext	// class@000f35
{
    public static String did;
    public static boolean isDebugModel;
    public static String token;
    public static String uid;

    public void DrmContext(){
       super();
    }
    public static String getDid(){
       return DrmContext.did;
    }
    public static String getToken(){
       return DrmContext.token;
    }
    public static String getUid(){
       return DrmContext.uid;
    }
    public static boolean isIsDebugModel(){
       return DrmContext.isDebugModel;
    }
    public static void setDid(String p0){
       DrmContext.did = p0;
    }
    public static void setIsDebugModel(boolean p0){
       DrmContext.isDebugModel = p0;
    }
    public static void setToken(String p0){
       DrmContext.token = p0;
    }
    public static void setUid(String p0){
       DrmContext.uid = p0;
    }
}
