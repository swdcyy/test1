package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabInfo;
import java.lang.Enum;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.popup.common.f;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MainTabInfo extends Enum	// class@001103
{
    public final int tabIndex;
    public final String tabLogName;
    public final String tabName;
    public static final MainTabInfo[] $VALUES;
    public static final MainTabInfo COLLECT;
    public static final MainTabInfo HISTORY;
    public static final MainTabInfo LOCAL;
    public static final MainTabInfo RECOMMEND;
    public static final MainTabInfo VOICE;

    static {
       MainTabInfo mainTabInfo;
       MainTabInfo[] mainTabInfoA = new MainTabInfo[]{v7,mainTabInfo,mainTabInfo,mainTabInfo,mainTabInfo};
       Object[] objArray = new Object[0];
       String str = f.m(R.string.arg_RES_7f100ba7, objArray);
       a.o(str, "WidgetUtils.getString\(R.¡­ing.edit_music_recommend\)");
       mainTabInfo = new MainTabInfo("RECOMMEND", 0, str, 0, "recommend");
       MainTabInfo.RECOMMEND = v7;
       Object[] objArray1 = new Object[0];
       String str1 = f.m(R.string.arg_RES_7f100b96, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.¡­dit_music_collection_tab\)");
       MainTabInfo mainTabInfo1 = new MainTabInfo("COLLECT", 1, str1, 1, "collect");
       MainTabInfo.COLLECT = mainTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f1037d7, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.music_used_tab\)");
       mainTabInfo1 = new MainTabInfo("HISTORY", 2, str1, 2, "usage");
       MainTabInfo.HISTORY = mainTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f101657, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.string.import_music_local\)");
       mainTabInfo1 = new MainTabInfo("LOCAL", 3, str1, 3, "local");
       MainTabInfo.LOCAL = mainTabInfo;
       objArray1 = new Object[0];
       str1 = f.m(R.string.arg_RES_7f100b3a, objArray1);
       a.o(str1, "WidgetUtils.getString\(R.¡­ing.edit_audio_sound_tab\)");
       mainTabInfo1 = new MainTabInfo("VOICE", 4, str1, 4, "voice");
       MainTabInfo.VOICE = mainTabInfo;
       MainTabInfo.$VALUES = mainTabInfoA;
    }
    public void MainTabInfo(String p0,int p1,String p2,int p3,String p4){
       super(p0, p1);
       this.tabName = p2;
       this.tabIndex = p3;
       this.tabLogName = p4;
    }
    public static MainTabInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MainTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MainTabInfo.class, p0);
    }
    public static MainTabInfo[] values(){
       Object obj = PatchProxy.apply(null, null, MainTabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MainTabInfo.$VALUES.clone();
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
