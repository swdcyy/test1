package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabInfo;
import java.lang.Enum;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.popup.common.f;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicTabInfo extends Enum	// class@0010d4
{
    public final int tabIndex;
    public final String tabLogName;
    public final String tabName;
    public static final MusicTabInfo[] $VALUES;
    public static final MusicTabInfo MUSIC;
    public static final MusicTabInfo VOICE;
    public static final MusicTabInfo VOLUME;

    static {
       MusicTabInfo musicTabInfo1;
       MusicTabInfo[] musicTabInfo = new MusicTabInfo[]{v7,musicTabInfo1,musicTabInfo1};
       Object[] objArray = new Object[0];
       String str = f.m(R.string.arg_RES_7f100b31, objArray);
       a.o(str, "WidgetUtils.getString\(R.¡­ing.edit_audio_music_tab\)");
       musicTabInfo1 = new MusicTabInfo("MUSIC", 0, str, 0, "music");
       MusicTabInfo.MUSIC = v7;
       Object[] objArray1 = new Object[0];
       String str1 = f.m(R.string.arg_RES_7f100b3a, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.¡­ing.edit_audio_sound_tab\)");
       MusicTabInfo musicTabInfo2 = new MusicTabInfo("VOICE", 1, str1, 1, "voice");
       MusicTabInfo.VOICE = musicTabInfo1;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f100b3f, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.¡­ng.edit_audio_volume_tab\)");
       musicTabInfo2 = new MusicTabInfo("VOLUME", 2, str1, 2, "volume");
       MusicTabInfo.VOLUME = musicTabInfo1;
       MusicTabInfo.$VALUES = musicTabInfo;
    }
    public void MusicTabInfo(String p0,int p1,String p2,int p3,String p4){
       super(p0, p1);
       this.tabName = p2;
       this.tabIndex = p3;
       this.tabLogName = p4;
    }
    public static MusicTabInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicTabInfo.class, p0);
    }
    public static MusicTabInfo[] values(){
       Object obj = PatchProxy.apply(null, null, MusicTabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicTabInfo.$VALUES.clone();
    }
    public final int getTabIndex(){
       return this.tabIndex;
    }
    public final String getTabLogName(){
       return this.tabLogName;
    }
    public final String getTabName(){
       return this.tabName;
    }
}
