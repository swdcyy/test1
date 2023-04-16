package com.yxcorp.gifshow.activity.share.bubble.PublishBubbleItem;
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

public final class PublishBubbleItem extends Enum implements c	// class@00137a
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
    public static final PublishBubbleItem[] $VALUES;
    public static final PublishBubbleItem ADD_TITLE;
    public static final PublishBubbleItem COPY_WRITING;
    public static final PublishBubbleItem COVER_TEXT;
    public static final PublishBubbleItem CUSTOM_SWITCH_TIPS;
    public static final PublishBubbleItem HD_EXPORT;
    public static final PublishBubbleItem INTIMATE_TIP;
    public static final PublishBubbleItem PUBLISH_RULE;

    static {
       SharedPreferences a = a.a;
       PublishBubbleItem publishBubbl = new PublishBubbleItem("INTIMATE_TIP", 0, a1.p(0x7f1046b5), "intimate_visible_tip", (a.getBoolean("has_show_intimate_visibl_tip_bubble", false) ^ 0x01));
       PublishBubbleItem.INTIMATE_TIP = v6;
       publishBubbl = new PublishBubbleItem("COVER_TEXT", 1, "", "cover_text");
       PublishBubbleItem.COVER_TEXT = publishBubbl;
       PublishBubbleItem publishBubbl1 = new PublishBubbleItem("ADD_TITLE", 2, a1.p(0x7f1004cd), "add_title", (a.getBoolean("publish_photos_add_title_bubble", false) ^ 0x01));
       PublishBubbleItem.ADD_TITLE = v1;
       PublishBubbleItem publishBubbl2 = new PublishBubbleItem("COPY_WRITING", 3, a1.p(0x7f10403c), "copy_writing", (a.getBoolean("has_show_publish_copywriting_bubble", false) ^ 0x01));
       PublishBubbleItem.COPY_WRITING = v3;
       PublishBubbleItem publishBubbl3 = new PublishBubbleItem("PUBLISH_RULE", 4, a1.p(0x7f10479b), "publish_rule");
       PublishBubbleItem.PUBLISH_RULE = publishBubbl3;
       PublishBubbleItem publishBubbl4 = new PublishBubbleItem("HD_EXPORT", 5, a1.p(0x7f10402a), "hd_export", true);
       PublishBubbleItem.HD_EXPORT = v5;
       PublishBubbleItem publishBubbl5 = new PublishBubbleItem("CUSTOM_SWITCH_TIPS", 6, "", "custom_switch_tips");
       PublishBubbleItem.CUSTOM_SWITCH_TIPS = publishBubbl5;
       PublishBubbleItem[] publishBubbl6 = new PublishBubbleItem[]{v6,publishBubbl,v1,v3,publishBubbl3,v5,publishBubbl5};
       PublishBubbleItem.$VALUES = publishBubbl6;
    }
    public void PublishBubbleItem(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.mType = 2;
       this.mUpgradeVersion = 0;
       this.mContent = p2;
       this.mFunctionName = p3;
       this.mBubbleKey = "";
       this.mShowTimes = Integer.MAX_VALUE;
       this.mShouldShowOldState = true;
       this.mBlockOther = true;
       this.mBlockedByOther = false;
       this.init();
    }
    public void PublishBubbleItem(String p0,int p1,String p2,String p3,boolean p4){
       super(p0, p1);
       this.mType = 0;
       this.mUpgradeVersion = 0;
       this.mContent = p2;
       this.mFunctionName = p3;
       this.mBubbleKey = "";
       this.mShowTimes = 1;
       this.mShouldShowOldState = p4;
       this.mBlockOther = true;
       this.mBlockedByOther = true;
       this.init();
    }
    public static PublishBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PublishBubbleItem.class, p0);
    }
    public static PublishBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, PublishBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, PublishBubbleItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(this) && this.mShouldShowOldState != null)? true: false;
       return b;
    }
    public String getBubbleKey(){
       Object obj = PatchProxy.apply(null, this, PublishBubbleItem.class, "5");
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
       return b.f(this);
    }
    public int getPriority(){
       Object obj = PatchProxy.apply(null, this, PublishBubbleItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getType(){
       return this.mType;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, PublishBubbleItem.class, "3")) {
          return;
       }
       if (this.mShouldShowOldState == null) {
          e7.b(this.getBubbleKey(), this.getBubbleShowTimes());
       }
       return;
    }
    public boolean isAutoDismissWhenPageStop(){
       return b.h(this);
    }
    public boolean isBlockedAfterShowingSelf(){
       return this.mBlockOther;
    }
    public boolean isBlockedByOthersBeforeShowing(){
       return this.mBlockedByOther;
    }
    public PublishBubbleItem setContent(String p0){
       this.mContent = p0;
       return this;
    }
    public int upgradeVersion(){
       return this.mUpgradeVersion;
    }
}
