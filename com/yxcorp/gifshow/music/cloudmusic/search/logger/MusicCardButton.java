package com.yxcorp.gifshow.music.cloudmusic.search.logger.MusicCardButton;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicCardButton extends Enum	// class@002039
{
    public static final MusicCardButton[] $VALUES;
    public static final MusicCardButton SCISSOR;
    public static final MusicCardButton USE;

    static {
       MusicCardButton musicCardBut1;
       MusicCardButton[] musicCardBut = new MusicCardButton[]{musicCardBut1,musicCardBut1};
       musicCardBut1 = new MusicCardButton("SCISSOR", 0);
       MusicCardButton.SCISSOR = musicCardBut1;
       musicCardBut1 = new MusicCardButton("USE", 1);
       MusicCardButton.USE = musicCardBut1;
       MusicCardButton.$VALUES = musicCardBut;
    }
    public void MusicCardButton(String p0,int p1){
       super(p0, p1);
    }
    public static MusicCardButton valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicCardButton.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicCardButton.class, p0);
    }
    public static MusicCardButton[] values(){
       Object obj = PatchProxy.apply(null, null, MusicCardButton.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicCardButton.$VALUES.clone();
    }
}
