package com.kwai.feature.post.api.util.PostPermission;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostPermission extends Enum	// class@001459
{
    public final String mName;
    public final String mToastMessage;
    public final String mToastTitle;
    public static final PostPermission[] $VALUES;
    public static final PostPermission ALBUM;
    public static final PostPermission AUDIO;
    public static final PostPermission CAMERA;

    static {
       PostPermission postPermissi = new PostPermission("CAMERA", 0, "android.permission.CAMERA", 0x7f103d42, 0x7f103d41);
       PostPermission.CAMERA = v6;
       PostPermission postPermissi1 = new PostPermission("AUDIO", 1, "android.permission.RECORD_AUDIO", 0x7f103de0, 0x7f103dae);
       PostPermission.AUDIO = postPermissi;
       PostPermission postPermissi2 = new PostPermission("ALBUM", 2, "android.permission.WRITE_EXTERNAL_STORAGE", 0x7f103df3, 0x7f103dce);
       PostPermission.ALBUM = v1;
       PostPermission[] postPermissi3 = new PostPermission[]{v6,postPermissi,v1};
       PostPermission.$VALUES = postPermissi3;
    }
    public void PostPermission(String p0,int p1,String p2,int p3,int p4){
       super(p0, p1);
       this.mName = p2;
       this.mToastTitle = a1.p(p3);
       this.mToastMessage = a1.p(p4);
    }
    public static PostPermission valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostPermission.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostPermission.class, p0);
    }
    public static PostPermission[] values(){
       Object obj = PatchProxy.apply(null, null, PostPermission.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostPermission.$VALUES.clone();
    }
}
