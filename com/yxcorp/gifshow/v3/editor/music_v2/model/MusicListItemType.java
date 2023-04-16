package com.yxcorp.gifshow.v3.editor.music_v2.model.MusicListItemType;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.music_v2.model.MusicListItemType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicListItemType extends Enum	// class@00109b
{
    public final int value;
    public static final MusicListItemType[] $VALUES;
    public static final MusicListItemType ADDED_MUSIC;
    public static final MusicListItemType CLOUD_MUSIC;
    public static final MusicListItemType COLLECT_MUSIC;
    public static final MusicListItemType$a Companion;
    public static final MusicListItemType EMPTY_ITEM;
    public static final MusicListItemType ERROR_ITEM;
    public static final MusicListItemType HISTORY_MUSIC;
    public static final MusicListItemType IMPORT_BUTTON;
    public static final MusicListItemType LIBRARY_BUTTON;
    public static final MusicListItemType LOADING_ITEM;
    public static final MusicListItemType LOCAL_MUSIC;
    public static final MusicListItemType NEW_LIBRARY_BUTTON;
    public static final MusicListItemType RAP_MUSIC;

    static {
       MusicListItemType[] musicListIte = new MusicListItemType[12];
       MusicListItemType musicListIte1 = new MusicListItemType("LIBRARY_BUTTON", 0, 0);
       MusicListItemType.LIBRARY_BUTTON = musicListIte1;
       musicListIte[0] = musicListIte1;
       musicListIte1 = new MusicListItemType("IMPORT_BUTTON", 1, 1);
       MusicListItemType.IMPORT_BUTTON = musicListIte1;
       musicListIte[1] = musicListIte1;
       musicListIte1 = new MusicListItemType("CLOUD_MUSIC", 2, 2);
       MusicListItemType.CLOUD_MUSIC = musicListIte1;
       musicListIte[2] = musicListIte1;
       musicListIte1 = new MusicListItemType("LOCAL_MUSIC", 3, 3);
       MusicListItemType.LOCAL_MUSIC = musicListIte1;
       musicListIte[3] = musicListIte1;
       musicListIte1 = new MusicListItemType("RAP_MUSIC", 4, 4);
       MusicListItemType.RAP_MUSIC = musicListIte1;
       musicListIte[4] = musicListIte1;
       musicListIte1 = new MusicListItemType("ADDED_MUSIC", 5, 5);
       MusicListItemType.ADDED_MUSIC = musicListIte1;
       musicListIte[5] = musicListIte1;
       musicListIte1 = new MusicListItemType("COLLECT_MUSIC", 6, 6);
       MusicListItemType.COLLECT_MUSIC = musicListIte1;
       musicListIte[6] = musicListIte1;
       musicListIte1 = new MusicListItemType("LOADING_ITEM", 7, 7);
       MusicListItemType.LOADING_ITEM = musicListIte1;
       musicListIte[7] = musicListIte1;
       musicListIte1 = new MusicListItemType("ERROR_ITEM", 8, 8);
       MusicListItemType.ERROR_ITEM = musicListIte1;
       musicListIte[8] = musicListIte1;
       musicListIte1 = new MusicListItemType("HISTORY_MUSIC", 9, 9);
       MusicListItemType.HISTORY_MUSIC = musicListIte1;
       musicListIte[9] = musicListIte1;
       musicListIte1 = new MusicListItemType("EMPTY_ITEM", 10, 10);
       MusicListItemType.EMPTY_ITEM = musicListIte1;
       musicListIte[10] = musicListIte1;
       musicListIte1 = new MusicListItemType("NEW_LIBRARY_BUTTON", 11, 11);
       MusicListItemType.NEW_LIBRARY_BUTTON = musicListIte1;
       musicListIte[11] = musicListIte1;
       MusicListItemType.$VALUES = musicListIte;
       MusicListItemType.Companion = new MusicListItemType$a(null);
    }
    public void MusicListItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static MusicListItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicListItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicListItemType.class, p0);
    }
    public static MusicListItemType[] values(){
       Object obj = PatchProxy.apply(null, null, MusicListItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicListItemType.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
