package com.yxcorp.gifshow.model.MultiplePhotosProject$PreviewMusicType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public final class MultiplePhotosProject$PreviewMusicType extends Enum	// class@001e58
{
    public int value;
    public static final MultiplePhotosProject$PreviewMusicType[] $VALUES;
    public static final MultiplePhotosProject$PreviewMusicType LOCAL;
    public static final MultiplePhotosProject$PreviewMusicType NONE;
    public static final MultiplePhotosProject$PreviewMusicType ONLINE;
    public static final MultiplePhotosProject$PreviewMusicType SOUND_RECORD;
    public static final MultiplePhotosProject$PreviewMusicType TEMPLATE;
    public static final MultiplePhotosProject$PreviewMusicType UNSPECIFIED;

    static {
       MultiplePhotosProject$PreviewMusicType previewMusic = new MultiplePhotosProject$PreviewMusicType("SOUND_RECORD", 0, 0);
       MultiplePhotosProject$PreviewMusicType.SOUND_RECORD = previewMusic;
       MultiplePhotosProject$PreviewMusicType previewMusic1 = new MultiplePhotosProject$PreviewMusicType("NONE", 1, 1);
       MultiplePhotosProject$PreviewMusicType.NONE = previewMusic1;
       MultiplePhotosProject$PreviewMusicType previewMusic2 = new MultiplePhotosProject$PreviewMusicType("LOCAL", 2, 2);
       MultiplePhotosProject$PreviewMusicType.LOCAL = previewMusic2;
       MultiplePhotosProject$PreviewMusicType previewMusic3 = new MultiplePhotosProject$PreviewMusicType("ONLINE", 3, 3);
       MultiplePhotosProject$PreviewMusicType.ONLINE = previewMusic3;
       MultiplePhotosProject$PreviewMusicType previewMusic4 = new MultiplePhotosProject$PreviewMusicType("TEMPLATE", 4, 4);
       MultiplePhotosProject$PreviewMusicType.TEMPLATE = previewMusic4;
       MultiplePhotosProject$PreviewMusicType previewMusic5 = new MultiplePhotosProject$PreviewMusicType("UNSPECIFIED", 5, -1);
       MultiplePhotosProject$PreviewMusicType.UNSPECIFIED = previewMusic5;
       MultiplePhotosProject$PreviewMusicType[] previewMusic6 = new MultiplePhotosProject$PreviewMusicType[]{previewMusic,previewMusic1,previewMusic2,previewMusic3,previewMusic4,previewMusic5};
       MultiplePhotosProject$PreviewMusicType.$VALUES = previewMusic6;
    }
    public void MultiplePhotosProject$PreviewMusicType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static MultiplePhotosProject$PreviewMusicType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiplePhotosProject$PreviewMusicType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MultiplePhotosProject$PreviewMusicType.class, p0);
    }
    public static MultiplePhotosProject$PreviewMusicType valueOfInt(int p0){
       MultiplePhotosProject$PreviewMusicType[] obj;
       object oobject;
       MultiplePhotosProject$PreviewMusicType previewMusic = MultiplePhotosProject$PreviewMusicType.class;
       if (PatchProxy.isSupport(previewMusic)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, previewMusic, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = MultiplePhotosProject$PreviewMusicType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return MultiplePhotosProject$PreviewMusicType.UNSPECIFIED;
          }
          oobject = obj[i];
          if (p0 == oobject.getValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static MultiplePhotosProject$PreviewMusicType[] values(){
       Object obj = PatchProxy.apply(null, null, MultiplePhotosProject$PreviewMusicType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MultiplePhotosProject$PreviewMusicType.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
