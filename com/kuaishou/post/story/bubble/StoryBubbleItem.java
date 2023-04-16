package com.kuaishou.post.story.bubble.StoryBubbleItem;
import ra9.c;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ra9.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import lnc.e7;

public final class StoryBubbleItem extends Enum implements c	// class@000ac3
{
    public final boolean mBlockOther;
    public final boolean mBlockedByOther;
    public final String mBubbleKey;
    public String mContent;
    public final String mFunctionName;
    public final boolean mShouldShowOldState;
    public final int mShowTimes;
    public final int mType;
    public final int mUpgradeVersion;
    public static final StoryBubbleItem[] $VALUES;
    public static final StoryBubbleItem MOOD_AI_VIDEO_BACKGROUND_SWITCH_CLOSE;
    public static final StoryBubbleItem MOOD_AI_VIDEO_BACKGROUND_SWITCH_OPEN;
    public static final StoryBubbleItem MOOD_AUTO_MUSIC;
    public static final StoryBubbleItem MOOD_EDIT_CHANGE_AI_VIDEO_BACKGROUND;
    public static final StoryBubbleItem MOOD_EDIT_PHOTO_VISIBILITY;

    static {
       StoryBubbleItem storyBubbleI = new StoryBubbleItem("MOOD_EDIT_CHANGE_AI_VIDEO_BACKGROUND", 0, 2, a1.p(0x7f104acb), "mood_edit_change_ai_video_background", "mood_edit_change_ai_video_background", 1, true);
       StoryBubbleItem.MOOD_EDIT_CHANGE_AI_VIDEO_BACKGROUND = v9;
       StoryBubbleItem storyBubbleI1 = new StoryBubbleItem("MOOD_AI_VIDEO_BACKGROUND_SWITCH_OPEN", 1, 2, a1.p(0x7f104ad1), "mood_ai_video_switch_open", "mood_ai_video_background_switch_open", 1, true);
       StoryBubbleItem.MOOD_AI_VIDEO_BACKGROUND_SWITCH_OPEN = storyBubbleI;
       StoryBubbleItem storyBubbleI2 = new StoryBubbleItem("MOOD_AI_VIDEO_BACKGROUND_SWITCH_CLOSE", 2, 2, a1.p(0x7f104ad0), "mood_ai_video_switch_close", "mood_ai_video_background_switch_close", 1, true);
       StoryBubbleItem.MOOD_AI_VIDEO_BACKGROUND_SWITCH_CLOSE = v1;
       storyBubbleI1 = new StoryBubbleItem("MOOD_EDIT_PHOTO_VISIBILITY", 3, 0, a1.p(0x7f100cd1), "mood_edit_photo_visibility", "mood_edit_photo_visibility", 1, (a.a.getBoolean("mood_edit_photo_visibility_bubble_showed", false) ^ 0x01));
       StoryBubbleItem.MOOD_EDIT_PHOTO_VISIBILITY = v2;
       storyBubbleI2 = new StoryBubbleItem("MOOD_AUTO_MUSIC", 4, 2, "", "mood_auto_music", "mood_auto_music", 1, (a.c0() ^ 0x01));
       StoryBubbleItem.MOOD_AUTO_MUSIC = v3;
       StoryBubbleItem[] storyBubbleI3 = new StoryBubbleItem[]{v9,storyBubbleI,v1,v2,v3};
       StoryBubbleItem.$VALUES = storyBubbleI3;
    }
    public void StoryBubbleItem(String p0,int p1,int p2,String p3,String p4,String p5,int p6,boolean p7){
       super(p0, p1);
       this.mType = p2;
       this.mUpgradeVersion = 0;
       this.mContent = p3;
       this.mFunctionName = p4;
       this.mBubbleKey = p5;
       this.mShowTimes = p6;
       this.mShouldShowOldState = p7;
       this.mBlockOther = true;
       this.mBlockedByOther = true;
       this.init();
    }
    public static StoryBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StoryBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StoryBubbleItem.class, p0);
    }
    public static StoryBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, StoryBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StoryBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, StoryBubbleItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(this) && this.mShouldShowOldState != null)? true: false;
       return b;
    }
    public String getBubbleKey(){
       Object obj = PatchProxy.apply(null, this, StoryBubbleItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mBubbleKey)) {
          return b.b(this);
       }
       return this.mBubbleKey;
    }
    public int getBubbleShowTimes(){
       return this.mShowTimes;
    }
    public String getContent(){
       return this.mContent;
    }
    public String getFunctionName(){
       return this.mFunctionName;
    }
    public int getMode(){
       Object obj = PatchProxy.apply(null, this, StoryBubbleItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(this);
    }
    public int getPriority(){
       return 0;
    }
    public int getType(){
       return this.mType;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, StoryBubbleItem.class, "3")) {
          return;
       }
       if (this.mShouldShowOldState == null) {
          e7.b(this.getBubbleKey(), this.getBubbleShowTimes());
       }
       return;
    }
    public boolean isAutoDismissWhenPageStop(){
       Object obj = PatchProxy.apply(null, this, StoryBubbleItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.h(this);
    }
    public boolean isBlockedAfterShowingSelf(){
       return this.mBlockOther;
    }
    public boolean isBlockedByOthersBeforeShowing(){
       return this.mBlockedByOther;
    }
    public int upgradeVersion(){
       return this.mUpgradeVersion;
    }
}
