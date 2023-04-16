package com.smile.gifshow.post.profile.ProfileUpdatePostImageCropActivity$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import com.smile.gifshow.post.profile.c;
import java.util.Map;
import java.util.HashMap;

public final class ProfileUpdatePostImageCropActivity$a implements g	// class@000c5a
{
    public f b;

    public void ProfileUpdatePostImageCropActivity$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("provider")) {
          hashMap.put(ProfileUpdatePostImageCropActivity$a.class, new c());
       }else {
          hashMap.put(ProfileUpdatePostImageCropActivity$a.class, null);
       }
       return hashMap;
    }
}
