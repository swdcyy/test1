package com.yxcorp.gifshow.v3.editor.music_v2.utils.AutoMusicUtils$VideoCategory;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AutoMusicUtils$VideoCategory extends Enum	// class@00111d
{
    public static final AutoMusicUtils$VideoCategory[] $VALUES;
    public static final AutoMusicUtils$VideoCategory CAPTURE_WITHOUT_MAGIC_FACE;
    public static final AutoMusicUtils$VideoCategory CAPTURE_WITH_MAGIC_FACE;
    public static final AutoMusicUtils$VideoCategory IMPORT_MULT;
    public static final AutoMusicUtils$VideoCategory IMPORT_SINGLE;
    public static final AutoMusicUtils$VideoCategory UNDEFINED;

    static {
       AutoMusicUtils$VideoCategory videoCategor1;
       AutoMusicUtils$VideoCategory[] videoCategor = new AutoMusicUtils$VideoCategory[]{videoCategor1,videoCategor1,videoCategor1,videoCategor1,videoCategor1};
       videoCategor1 = new AutoMusicUtils$VideoCategory("UNDEFINED", 0);
       AutoMusicUtils$VideoCategory.UNDEFINED = videoCategor1;
       videoCategor1 = new AutoMusicUtils$VideoCategory("CAPTURE_WITH_MAGIC_FACE", 1);
       AutoMusicUtils$VideoCategory.CAPTURE_WITH_MAGIC_FACE = videoCategor1;
       videoCategor1 = new AutoMusicUtils$VideoCategory("CAPTURE_WITHOUT_MAGIC_FACE", 2);
       AutoMusicUtils$VideoCategory.CAPTURE_WITHOUT_MAGIC_FACE = videoCategor1;
       videoCategor1 = new AutoMusicUtils$VideoCategory("IMPORT_SINGLE", 3);
       AutoMusicUtils$VideoCategory.IMPORT_SINGLE = videoCategor1;
       videoCategor1 = new AutoMusicUtils$VideoCategory("IMPORT_MULT", 4);
       AutoMusicUtils$VideoCategory.IMPORT_MULT = videoCategor1;
       AutoMusicUtils$VideoCategory.$VALUES = videoCategor;
    }
    public void AutoMusicUtils$VideoCategory(String p0,int p1){
       super(p0, p1);
    }
    public static AutoMusicUtils$VideoCategory valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AutoMusicUtils$VideoCategory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AutoMusicUtils$VideoCategory.class, p0);
    }
    public static AutoMusicUtils$VideoCategory[] values(){
       Object obj = PatchProxy.apply(null, null, AutoMusicUtils$VideoCategory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AutoMusicUtils$VideoCategory.$VALUES.clone();
    }
}
