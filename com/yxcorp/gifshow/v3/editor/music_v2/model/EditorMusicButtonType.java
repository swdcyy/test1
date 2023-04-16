package com.yxcorp.gifshow.v3.editor.music_v2.model.EditorMusicButtonType;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.editor.music_v2.model.MusicListItemType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorMusicButtonType extends Enum	// class@001098
{
    public final int drawableResId;
    public final int nameResId;
    public final MusicListItemType type;
    public static final EditorMusicButtonType[] $VALUES;
    public static final EditorMusicButtonType IMPORT;
    public static final EditorMusicButtonType IMPORT_V2;
    public static final EditorMusicButtonType LIBRARY;

    static {
       EditorMusicButtonType uEditorMusic1;
       EditorMusicButtonType[] uEditorMusic = new EditorMusicButtonType[]{v7,uEditorMusic1,uEditorMusic1};
       uEditorMusic1 = new EditorMusicButtonType("LIBRARY", 0, MusicListItemType.LIBRARY_BUTTON, 0x7f100bb7, 0x7f081b36);
       EditorMusicButtonType.LIBRARY = v7;
       MusicListItemType iMPORT_BUTTO = MusicListItemType.IMPORT_BUTTON;
       EditorMusicButtonType uEditorMusic2 = new EditorMusicButtonType("IMPORT", 1, iMPORT_BUTTO, 0x7f101653, 0x7f0808d4);
       EditorMusicButtonType.IMPORT = uEditorMusic1;
       EditorMusicButtonType uEditorMusic3 = new EditorMusicButtonType("IMPORT_V2", 2, iMPORT_BUTTO, 0x7f101650, 0x7f081c78);
       EditorMusicButtonType.IMPORT_V2 = uEditorMusic1;
       EditorMusicButtonType.$VALUES = uEditorMusic;
    }
    public void EditorMusicButtonType(String p0,int p1,MusicListItemType p2,int p3,int p4){
       super(p0, p1);
       this.type = p2;
       this.nameResId = p3;
       this.drawableResId = p4;
    }
    public static EditorMusicButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorMusicButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorMusicButtonType.class, p0);
    }
    public static EditorMusicButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, EditorMusicButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorMusicButtonType.$VALUES.clone();
    }
    public final int getDrawableResId(){
       return this.drawableResId;
    }
    public final int getNameResId(){
       return this.nameResId;
    }
    public final MusicListItemType getType(){
       return this.type;
    }
}
