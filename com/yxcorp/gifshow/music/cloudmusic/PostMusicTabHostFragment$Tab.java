package com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$Tab;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostMusicTabHostFragment$Tab extends Enum	// class@001fe7
{
    public static final PostMusicTabHostFragment$Tab[] $VALUES;
    public static final PostMusicTabHostFragment$Tab KTV_RN;
    public static final PostMusicTabHostFragment$Tab MUSIC;

    static {
       PostMusicTabHostFragment$Tab tab = new PostMusicTabHostFragment$Tab("MUSIC", 0);
       PostMusicTabHostFragment$Tab.MUSIC = tab;
       PostMusicTabHostFragment$Tab tab1 = new PostMusicTabHostFragment$Tab("KTV_RN", 1);
       PostMusicTabHostFragment$Tab.KTV_RN = tab1;
       PostMusicTabHostFragment$Tab[] tabArray = new PostMusicTabHostFragment$Tab[]{tab,tab1};
       PostMusicTabHostFragment$Tab.$VALUES = tabArray;
    }
    public void PostMusicTabHostFragment$Tab(String p0,int p1){
       super(p0, p1);
    }
    public static PostMusicTabHostFragment$Tab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostMusicTabHostFragment$Tab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostMusicTabHostFragment$Tab.class, p0);
    }
    public static PostMusicTabHostFragment$Tab[] values(){
       Object obj = PatchProxy.apply(null, null, PostMusicTabHostFragment$Tab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostMusicTabHostFragment$Tab.$VALUES.clone();
    }
}
