package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SelectMediaMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SelectMediaMode extends Enum	// class@001c16
{
    public final int value;
    public static final SelectMediaMode[] $VALUES;
    public static final SelectMediaMode MULTI_IMAGES;
    public static final SelectMediaMode MULTI_MIX;
    public static final SelectMediaMode MULTI_VIDEOS;
    public static final SelectMediaMode NOT_SELECT_MEDIA;
    public static final SelectMediaMode SINGLE_IMAGE;
    public static final SelectMediaMode SINGLE_MIX;
    public static final SelectMediaMode SINGLE_VIDEO;

    static {
       SelectMediaMode selectMediaM1;
       SelectMediaMode[] selectMediaM = new SelectMediaMode[]{selectMediaM1,selectMediaM1,selectMediaM1,selectMediaM1,selectMediaM1,selectMediaM1,selectMediaM1};
       selectMediaM1 = new SelectMediaMode("NOT_SELECT_MEDIA", 0, 0);
       SelectMediaMode.NOT_SELECT_MEDIA = selectMediaM1;
       selectMediaM1 = new SelectMediaMode("SINGLE_IMAGE", 1, 1);
       SelectMediaMode.SINGLE_IMAGE = selectMediaM1;
       selectMediaM1 = new SelectMediaMode("SINGLE_VIDEO", 2, 2);
       SelectMediaMode.SINGLE_VIDEO = selectMediaM1;
       selectMediaM1 = new SelectMediaMode("SINGLE_MIX", 3, 3);
       SelectMediaMode.SINGLE_MIX = selectMediaM1;
       selectMediaM1 = new SelectMediaMode("MULTI_IMAGES", 4, 4);
       SelectMediaMode.MULTI_IMAGES = selectMediaM1;
       selectMediaM1 = new SelectMediaMode("MULTI_VIDEOS", 5, 5);
       SelectMediaMode.MULTI_VIDEOS = selectMediaM1;
       selectMediaM1 = new SelectMediaMode("MULTI_MIX", 6, 6);
       SelectMediaMode.MULTI_MIX = selectMediaM1;
       SelectMediaMode.$VALUES = selectMediaM;
    }
    public void SelectMediaMode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static SelectMediaMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SelectMediaMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SelectMediaMode.class, p0);
    }
    public static SelectMediaMode[] values(){
       Object obj = PatchProxy.apply(null, null, SelectMediaMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SelectMediaMode.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
