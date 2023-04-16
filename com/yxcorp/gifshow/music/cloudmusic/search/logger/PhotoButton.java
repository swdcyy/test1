package com.yxcorp.gifshow.music.cloudmusic.search.logger.PhotoButton;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoButton extends Enum	// class@00203a
{
    public static final PhotoButton[] $VALUES;
    public static final PhotoButton PAUSE;
    public static final PhotoButton PLAY;
    public static final PhotoButton USE;

    static {
       PhotoButton photoButton;
       PhotoButton[] photoButtonA = new PhotoButton[]{photoButton,photoButton,photoButton};
       photoButton = new PhotoButton("PLAY", 0);
       PhotoButton.PLAY = photoButton;
       photoButton = new PhotoButton("PAUSE", 1);
       PhotoButton.PAUSE = photoButton;
       photoButton = new PhotoButton("USE", 2);
       PhotoButton.USE = photoButton;
       PhotoButton.$VALUES = photoButtonA;
    }
    public void PhotoButton(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoButton valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoButton.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoButton.class, p0);
    }
    public static PhotoButton[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoButton.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoButton.$VALUES.clone();
    }
}
