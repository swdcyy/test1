package com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ChangeScreenVisibilityCause extends Enum	// class@000a1d
{
    public static final ChangeScreenVisibilityCause[] $VALUES;
    public static final ChangeScreenVisibilityCause AD_WEBVIEW_FULL_OVERLAY;
    public static final ChangeScreenVisibilityCause ATLAS_TOUCH_PROGRESS;
    public static final ChangeScreenVisibilityCause CAPTION_DIALOG;
    public static final ChangeScreenVisibilityCause CLICK;
    public static final ChangeScreenVisibilityCause DISLIKE;
    public static final ChangeScreenVisibilityCause FOLLOW_GUIDE;
    public static final ChangeScreenVisibilityCause MUSIC_RADIO_COVER_SHOW;
    public static final ChangeScreenVisibilityCause NASA_FEATURE_PANEL;
    public static final ChangeScreenVisibilityCause NASA_FEATURE_SCREEN_CLEAN;
    public static final ChangeScreenVisibilityCause PRESS_CONTROL_SPEED;
    public static final ChangeScreenVisibilityCause QUICK_COMMENT;
    public static final ChangeScreenVisibilityCause SCALE_SCREEN_CLEAN;
    public static final ChangeScreenVisibilityCause SERIAL_PAY_CLEAN;
    public static final ChangeScreenVisibilityCause SHARE_PANEL;
    public static final ChangeScreenVisibilityCause SHOW_AD_END;
    public static final ChangeScreenVisibilityCause SHOW_COMMENT;
    public static final ChangeScreenVisibilityCause SHOW_FEATURED_SEEK_BAR;
    public static final ChangeScreenVisibilityCause SHOW_LONG_ATLAS;
    public static final ChangeScreenVisibilityCause SWITCH_PAGE;
    public static final ChangeScreenVisibilityCause VIDEO_QUALITY_PANEL;
    public static final ChangeScreenVisibilityCause VOICE_SCREEN;

    static {
       ChangeScreenVisibilityCause uChangeScree = new ChangeScreenVisibilityCause("CLICK", 0);
       ChangeScreenVisibilityCause.CLICK = uChangeScree;
       ChangeScreenVisibilityCause uChangeScree1 = new ChangeScreenVisibilityCause("SHOW_COMMENT", 1);
       ChangeScreenVisibilityCause.SHOW_COMMENT = uChangeScree1;
       ChangeScreenVisibilityCause uChangeScree2 = new ChangeScreenVisibilityCause("SHOW_LONG_ATLAS", 2);
       ChangeScreenVisibilityCause.SHOW_LONG_ATLAS = uChangeScree2;
       ChangeScreenVisibilityCause uChangeScree3 = new ChangeScreenVisibilityCause("DISLIKE", 3);
       ChangeScreenVisibilityCause.DISLIKE = uChangeScree3;
       ChangeScreenVisibilityCause uChangeScree4 = new ChangeScreenVisibilityCause("SHOW_FEATURED_SEEK_BAR", 4);
       ChangeScreenVisibilityCause.SHOW_FEATURED_SEEK_BAR = uChangeScree4;
       ChangeScreenVisibilityCause uChangeScree5 = new ChangeScreenVisibilityCause("NASA_FEATURE_SCREEN_CLEAN", 5);
       ChangeScreenVisibilityCause.NASA_FEATURE_SCREEN_CLEAN = uChangeScree5;
       ChangeScreenVisibilityCause uChangeScree6 = new ChangeScreenVisibilityCause("NASA_FEATURE_PANEL", 6);
       ChangeScreenVisibilityCause.NASA_FEATURE_PANEL = uChangeScree6;
       ChangeScreenVisibilityCause uChangeScree7 = new ChangeScreenVisibilityCause("AD_WEBVIEW_FULL_OVERLAY", 7);
       ChangeScreenVisibilityCause.AD_WEBVIEW_FULL_OVERLAY = uChangeScree7;
       ChangeScreenVisibilityCause uChangeScree8 = new ChangeScreenVisibilityCause("QUICK_COMMENT", 8);
       ChangeScreenVisibilityCause.QUICK_COMMENT = uChangeScree8;
       ChangeScreenVisibilityCause uChangeScree9 = new ChangeScreenVisibilityCause("VIDEO_QUALITY_PANEL", 9);
       ChangeScreenVisibilityCause.VIDEO_QUALITY_PANEL = uChangeScree9;
       ChangeScreenVisibilityCause uChangeScree10 = new ChangeScreenVisibilityCause("SHOW_AD_END", 10);
       ChangeScreenVisibilityCause.SHOW_AD_END = uChangeScree10;
       ChangeScreenVisibilityCause uChangeScree11 = new ChangeScreenVisibilityCause("SWITCH_PAGE", 11);
       ChangeScreenVisibilityCause.SWITCH_PAGE = uChangeScree11;
       ChangeScreenVisibilityCause uChangeScree12 = new ChangeScreenVisibilityCause("VOICE_SCREEN", 12);
       ChangeScreenVisibilityCause.VOICE_SCREEN = uChangeScree12;
       ChangeScreenVisibilityCause uChangeScree13 = new ChangeScreenVisibilityCause("MUSIC_RADIO_COVER_SHOW", 13);
       ChangeScreenVisibilityCause.MUSIC_RADIO_COVER_SHOW = uChangeScree13;
       ChangeScreenVisibilityCause uChangeScree14 = uChangeScree13;
       ChangeScreenVisibilityCause uChangeScree15 = new ChangeScreenVisibilityCause("ATLAS_TOUCH_PROGRESS", 14);
       ChangeScreenVisibilityCause.ATLAS_TOUCH_PROGRESS = uChangeScree15;
       ChangeScreenVisibilityCause uChangeScree16 = uChangeScree15;
       ChangeScreenVisibilityCause uChangeScree17 = new ChangeScreenVisibilityCause("SCALE_SCREEN_CLEAN", 15);
       ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN = uChangeScree17;
       ChangeScreenVisibilityCause uChangeScree18 = uChangeScree17;
       uChangeScree13 = new ChangeScreenVisibilityCause("CAPTION_DIALOG", 16);
       ChangeScreenVisibilityCause.CAPTION_DIALOG = uChangeScree13;
       ChangeScreenVisibilityCause uChangeScree19 = uChangeScree13;
       uChangeScree15 = new ChangeScreenVisibilityCause("SERIAL_PAY_CLEAN", 17);
       ChangeScreenVisibilityCause.SERIAL_PAY_CLEAN = uChangeScree15;
       ChangeScreenVisibilityCause uChangeScree20 = uChangeScree15;
       uChangeScree17 = new ChangeScreenVisibilityCause("SHARE_PANEL", 18);
       ChangeScreenVisibilityCause.SHARE_PANEL = uChangeScree17;
       ChangeScreenVisibilityCause uChangeScree21 = uChangeScree17;
       uChangeScree13 = new ChangeScreenVisibilityCause("PRESS_CONTROL_SPEED", 19);
       ChangeScreenVisibilityCause.PRESS_CONTROL_SPEED = uChangeScree13;
       ChangeScreenVisibilityCause uChangeScree22 = uChangeScree13;
       uChangeScree15 = new ChangeScreenVisibilityCause("FOLLOW_GUIDE", 20);
       ChangeScreenVisibilityCause.FOLLOW_GUIDE = uChangeScree15;
       ChangeScreenVisibilityCause[] uChangeScree23 = new ChangeScreenVisibilityCause[21];
       uChangeScree23[0] = uChangeScree;
       uChangeScree23[1] = uChangeScree1;
       uChangeScree23[2] = uChangeScree2;
       uChangeScree23[3] = uChangeScree3;
       uChangeScree23[4] = uChangeScree4;
       uChangeScree23[5] = uChangeScree5;
       uChangeScree23[6] = uChangeScree6;
       uChangeScree23[7] = uChangeScree7;
       uChangeScree23[8] = uChangeScree8;
       uChangeScree23[9] = uChangeScree9;
       uChangeScree23[10] = uChangeScree10;
       uChangeScree23[11] = uChangeScree11;
       uChangeScree23[12] = uChangeScree12;
       uChangeScree23[13] = uChangeScree14;
       uChangeScree23[14] = uChangeScree16;
       uChangeScree23[15] = uChangeScree18;
       uChangeScree23[16] = uChangeScree19;
       uChangeScree23[17] = uChangeScree20;
       uChangeScree23[18] = uChangeScree21;
       uChangeScree23[19] = uChangeScree22;
       uChangeScree23[20] = uChangeScree15;
       ChangeScreenVisibilityCause.$VALUES = uChangeScree23;
    }
    public void ChangeScreenVisibilityCause(String p0,int p1){
       super(p0, p1);
    }
    public static ChangeScreenVisibilityCause valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ChangeScreenVisibilityCause.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ChangeScreenVisibilityCause.class, p0);
    }
    public static ChangeScreenVisibilityCause[] values(){
       Object obj = PatchProxy.apply(null, null, ChangeScreenVisibilityCause.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ChangeScreenVisibilityCause.$VALUES.clone();
    }
}
