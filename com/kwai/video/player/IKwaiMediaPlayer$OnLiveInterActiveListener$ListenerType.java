package com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType extends Enum	// class@000ab1
{
    public int index;
    public static final IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType[] $VALUES;
    public static final IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType KwaiLiveListenerTypeAll;
    public static final IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType KwaiLiveListenerTypeDisableParseAdSei;
    public static final IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType KwaiLiveListenerTypeParseAdSei;
    public static final IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType KwaiLiveListenerTypeTsptInfo;
    public static final IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType KwaiLiveListenerTypeVideoFrameRender;

    static {
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType onLiveInterA = new IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType("KwaiLiveListenerTypeVideoFrameRender", 0, 1);
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeVideoFrameRender = onLiveInterA;
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType onLiveInterA1 = new IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType("KwaiLiveListenerTypeParseAdSei", 1, 2);
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeParseAdSei = onLiveInterA1;
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType onLiveInterA2 = new IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType("KwaiLiveListenerTypeTsptInfo", 2, 4);
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeTsptInfo = onLiveInterA2;
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType onLiveInterA3 = new IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType("KwaiLiveListenerTypeDisableParseAdSei", 3, (onLiveInterA.getIndex() | onLiveInterA2.getIndex()));
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeDisableParseAdSei = onLiveInterA3;
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType onLiveInterA4 = new IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType("KwaiLiveListenerTypeAll", 4, ((onLiveInterA.getIndex() | onLiveInterA1.getIndex()) | onLiveInterA2.getIndex()));
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.KwaiLiveListenerTypeAll = onLiveInterA4;
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType[] onLiveInterA5 = new IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType[]{onLiveInterA,onLiveInterA1,onLiveInterA2,onLiveInterA3,onLiveInterA4};
       IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.$VALUES = onLiveInterA5;
    }
    public void IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType(String p0,int p1,int p2){
       super(p0, p1);
       this.index = p2;
    }
    public static IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.class, p0);
    }
    public static IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType[] values(){
       Object obj = PatchProxy.apply(null, null, IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IKwaiMediaPlayer$OnLiveInterActiveListener$ListenerType.$VALUES.clone();
    }
    public int getIndex(){
       return this.index;
    }
}
