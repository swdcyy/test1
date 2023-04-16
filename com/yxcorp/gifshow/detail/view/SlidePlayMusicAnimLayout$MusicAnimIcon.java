package com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$MusicAnimIcon;
import java.lang.Enum;
import lnc.a1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SlidePlayMusicAnimLayout$MusicAnimIcon extends Enum	// class@001a63
{
    public long mAnimDuration;
    public int mBackgroundResId;
    public int mSize;
    public static final SlidePlayMusicAnimLayout$MusicAnimIcon[] $VALUES;
    public static final SlidePlayMusicAnimLayout$MusicAnimIcon BIG;
    public static final SlidePlayMusicAnimLayout$MusicAnimIcon SMALL;

    static {
       SlidePlayMusicAnimLayout$MusicAnimIcon musicAnimIco = new SlidePlayMusicAnimLayout$MusicAnimIcon("BIG", 0, 0x7f0820a1, 3500, a1.e(13.00f));
       SlidePlayMusicAnimLayout$MusicAnimIcon.BIG = v7;
       SlidePlayMusicAnimLayout$MusicAnimIcon musicAnimIco1 = new SlidePlayMusicAnimLayout$MusicAnimIcon("SMALL", 1, 0x7f0820a0, 3000, a1.e(9.00f));
       SlidePlayMusicAnimLayout$MusicAnimIcon.SMALL = musicAnimIco;
       SlidePlayMusicAnimLayout$MusicAnimIcon[] musicAnimIco2 = new SlidePlayMusicAnimLayout$MusicAnimIcon[]{v7,musicAnimIco};
       SlidePlayMusicAnimLayout$MusicAnimIcon.$VALUES = musicAnimIco2;
    }
    public void SlidePlayMusicAnimLayout$MusicAnimIcon(String p0,int p1,int p2,long p3,int p4){
       super(p0, p1);
       this.mBackgroundResId = p2;
       this.mAnimDuration = p3;
       this.mSize = p4;
    }
    public static SlidePlayMusicAnimLayout$MusicAnimIcon valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlidePlayMusicAnimLayout$MusicAnimIcon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SlidePlayMusicAnimLayout$MusicAnimIcon.class, p0);
    }
    public static SlidePlayMusicAnimLayout$MusicAnimIcon[] values(){
       Object obj = PatchProxy.apply(null, null, SlidePlayMusicAnimLayout$MusicAnimIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayMusicAnimLayout$MusicAnimIcon.$VALUES.clone();
    }
}
