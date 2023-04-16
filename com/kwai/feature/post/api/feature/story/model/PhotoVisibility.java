package com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.lang.Enum;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoVisibility extends Enum	// class@0013c7
{
    public final String mLogName;
    public final String mName;
    public final int mType;
    public final String mUploadParamValue;
    public static final PhotoVisibility[] $VALUES;
    public static final PhotoVisibility FRIENDS;
    public static final PhotoVisibility GROUP;
    public static final PhotoVisibility PART_INVISIBLE;
    public static final PhotoVisibility PART_VISIBLE;
    public static final PhotoVisibility PRIVATE;
    public static final PhotoVisibility PUBLIC;
    public static final PhotoVisibility STORY;

    static {
       PhotoVisibility photoVisibil = new PhotoVisibility("PUBLIC", 0, 1, "true", 0x7f10404a, "public");
       PhotoVisibility.PUBLIC = v7;
       PhotoVisibility photoVisibil1 = new PhotoVisibility("GROUP", 1, 3, "true", 0x7f1012bb, "group");
       PhotoVisibility.GROUP = photoVisibil;
       PhotoVisibility photoVisibil2 = new PhotoVisibility("FRIENDS", 2, 4, "friend", 0x7f1010c7, "friends");
       PhotoVisibility.FRIENDS = v1;
       photoVisibil1 = new PhotoVisibility("PART_VISIBLE", 3, 5, "partiallyVisible", 0x7f104783, "part-visible");
       PhotoVisibility.PART_VISIBLE = v2;
       photoVisibil2 = new PhotoVisibility("PART_INVISIBLE", 4, 6, "partiallyInvisible", 0x7f104780, "part-invisible");
       PhotoVisibility.PART_INVISIBLE = v3;
       photoVisibil1 = new PhotoVisibility("PRIVATE", 5, 2, "false", 0x7f103e61, "privacy");
       PhotoVisibility.PRIVATE = v4;
       photoVisibil2 = new PhotoVisibility("STORY", 6, 0, "snapShow", 0x7f10404b, "immediate");
       PhotoVisibility.STORY = v5;
       PhotoVisibility[] photoVisibil3 = new PhotoVisibility[]{v7,photoVisibil,v1,v2,v3,v4,v5};
       PhotoVisibility.$VALUES = photoVisibil3;
    }
    public void PhotoVisibility(String p0,int p1,int p2,String p3,int p4,String p5){
       super(p0, p1);
       this.mUploadParamValue = p3;
       this.mName = a.a().a().getString(p4);
       this.mLogName = p5;
       this.mType = p2;
    }
    public static PhotoVisibility valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoVisibility.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoVisibility.class, p0);
    }
    public static PhotoVisibility[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoVisibility.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoVisibility.$VALUES.clone();
    }
    public String getName(){
       return this.mName;
    }
}
