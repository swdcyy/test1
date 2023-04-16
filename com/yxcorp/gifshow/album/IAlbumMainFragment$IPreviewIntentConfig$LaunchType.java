package com.yxcorp.gifshow.album.IAlbumMainFragment$IPreviewIntentConfig$LaunchType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IAlbumMainFragment$IPreviewIntentConfig$LaunchType extends Enum	// class@0019c2
{
    public static final IAlbumMainFragment$IPreviewIntentConfig$LaunchType[] $VALUES;
    public static final IAlbumMainFragment$IPreviewIntentConfig$LaunchType ACTIVITY;
    public static final IAlbumMainFragment$IPreviewIntentConfig$LaunchType FRAGMENT;

    static {
       IAlbumMainFragment$IPreviewIntentConfig$LaunchType iPreviewInte = new IAlbumMainFragment$IPreviewIntentConfig$LaunchType("FRAGMENT", 0);
       IAlbumMainFragment$IPreviewIntentConfig$LaunchType.FRAGMENT = iPreviewInte;
       IAlbumMainFragment$IPreviewIntentConfig$LaunchType iPreviewInte1 = new IAlbumMainFragment$IPreviewIntentConfig$LaunchType("ACTIVITY", 1);
       IAlbumMainFragment$IPreviewIntentConfig$LaunchType.ACTIVITY = iPreviewInte1;
       IAlbumMainFragment$IPreviewIntentConfig$LaunchType[] iPreviewInte2 = new IAlbumMainFragment$IPreviewIntentConfig$LaunchType[]{iPreviewInte,iPreviewInte1};
       IAlbumMainFragment$IPreviewIntentConfig$LaunchType.$VALUES = iPreviewInte2;
    }
    public void IAlbumMainFragment$IPreviewIntentConfig$LaunchType(String p0,int p1){
       super(p0, p1);
    }
    public static IAlbumMainFragment$IPreviewIntentConfig$LaunchType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IAlbumMainFragment$IPreviewIntentConfig$LaunchType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IAlbumMainFragment$IPreviewIntentConfig$LaunchType.class, p0);
    }
    public static IAlbumMainFragment$IPreviewIntentConfig$LaunchType[] values(){
       Object obj = PatchProxy.apply(null, null, IAlbumMainFragment$IPreviewIntentConfig$LaunchType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IAlbumMainFragment$IPreviewIntentConfig$LaunchType.$VALUES.clone();
    }
}
