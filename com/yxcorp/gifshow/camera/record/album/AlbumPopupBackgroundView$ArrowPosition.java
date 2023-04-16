package com.yxcorp.gifshow.camera.record.album.AlbumPopupBackgroundView$ArrowPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AlbumPopupBackgroundView$ArrowPosition extends Enum	// class@001ca5
{
    public static final AlbumPopupBackgroundView$ArrowPosition[] $VALUES;
    public static final AlbumPopupBackgroundView$ArrowPosition BOTTOM;
    public static final AlbumPopupBackgroundView$ArrowPosition LEFT;
    public static final AlbumPopupBackgroundView$ArrowPosition RIGHT;
    public static final AlbumPopupBackgroundView$ArrowPosition TOP;

    static {
       AlbumPopupBackgroundView$ArrowPosition uArrowPositi = new AlbumPopupBackgroundView$ArrowPosition("TOP", 0);
       AlbumPopupBackgroundView$ArrowPosition.TOP = uArrowPositi;
       AlbumPopupBackgroundView$ArrowPosition uArrowPositi1 = new AlbumPopupBackgroundView$ArrowPosition("BOTTOM", 1);
       AlbumPopupBackgroundView$ArrowPosition.BOTTOM = uArrowPositi1;
       AlbumPopupBackgroundView$ArrowPosition uArrowPositi2 = new AlbumPopupBackgroundView$ArrowPosition("LEFT", 2);
       AlbumPopupBackgroundView$ArrowPosition.LEFT = uArrowPositi2;
       AlbumPopupBackgroundView$ArrowPosition uArrowPositi3 = new AlbumPopupBackgroundView$ArrowPosition("RIGHT", 3);
       AlbumPopupBackgroundView$ArrowPosition.RIGHT = uArrowPositi3;
       AlbumPopupBackgroundView$ArrowPosition[] uArrowPositi4 = new AlbumPopupBackgroundView$ArrowPosition[]{uArrowPositi,uArrowPositi1,uArrowPositi2,uArrowPositi3};
       AlbumPopupBackgroundView$ArrowPosition.$VALUES = uArrowPositi4;
    }
    public void AlbumPopupBackgroundView$ArrowPosition(String p0,int p1){
       super(p0, p1);
    }
    public static AlbumPopupBackgroundView$ArrowPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumPopupBackgroundView$ArrowPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AlbumPopupBackgroundView$ArrowPosition.class, p0);
    }
    public static AlbumPopupBackgroundView$ArrowPosition[] values(){
       Object obj = PatchProxy.apply(null, null, AlbumPopupBackgroundView$ArrowPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumPopupBackgroundView$ArrowPosition.$VALUES.clone();
    }
}
