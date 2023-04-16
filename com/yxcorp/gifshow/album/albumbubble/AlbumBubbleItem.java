package com.yxcorp.gifshow.album.albumbubble.AlbumBubbleItem;
import ra9.c;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
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

public final class AlbumBubbleItem extends Enum implements c	// class@0019d1
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
    public static final AlbumBubbleItem[] $VALUES;
    public static final AlbumBubbleItem ALBUM_INSPIRATION_GUIDE_DIALOG;
    public static final AlbumBubbleItem ALBUM_MEMORY_PRIVACY_TIPS;
    public static final AlbumBubbleItem ALBUM_SETTING_DIALOG;
    public static final AlbumBubbleItem ALBUM_TABS_REOPEN;
    public static final AlbumBubbleItem SMART_ALBUM_ENTRANCE;

    static {
       AlbumBubbleItem uAlbumBubble = new AlbumBubbleItem("ALBUM_SETTING_DIALOG", 0, 2, "", "", Integer.MAX_VALUE, true, false, false);
       AlbumBubbleItem.ALBUM_SETTING_DIALOG = v10;
       AlbumBubbleItem uAlbumBubble1 = new AlbumBubbleItem("ALBUM_INSPIRATION_GUIDE_DIALOG", 1, 0, "", "", 1, true);
       AlbumBubbleItem.ALBUM_INSPIRATION_GUIDE_DIALOG = uAlbumBubble;
       AlbumBubbleItem uAlbumBubble2 = new AlbumBubbleItem("ALBUM_MEMORY_PRIVACY_TIPS", 2, 2, "", "", Integer.MAX_VALUE, true, true, false);
       AlbumBubbleItem.ALBUM_MEMORY_PRIVACY_TIPS = v1;
       AlbumBubbleItem uAlbumBubble3 = new AlbumBubbleItem("ALBUM_TABS_REOPEN", 3, 0, a1.p(0x7f100195), "album_setting", 1, true, true, false);
       AlbumBubbleItem.ALBUM_TABS_REOPEN = v2;
       uAlbumBubble1 = new AlbumBubbleItem("SMART_ALBUM_ENTRANCE", 4, 0, a1.p(0x7f1048a2), "smart_album_entrance", 1, true);
       AlbumBubbleItem.SMART_ALBUM_ENTRANCE = v3;
       AlbumBubbleItem[] uAlbumBubble4 = new AlbumBubbleItem[]{v10,uAlbumBubble,v1,v2,v3};
       AlbumBubbleItem.$VALUES = uAlbumBubble4;
    }
    public void AlbumBubbleItem(String p0,int p1,int p2,String p3,String p4,int p5,boolean p6){
       super(p0, p1);
       this.mType = p2;
       this.mUpgradeVersion = 0;
       this.mContent = p3;
       this.mFunctionName = p4;
       this.mBubbleKey = "";
       this.mShowTimes = p5;
       this.mShouldShowOldState = p6;
       this.mBlockOther = true;
       this.mBlockedByOther = true;
       this.init();
    }
    public void AlbumBubbleItem(String p0,int p1,int p2,String p3,String p4,int p5,boolean p6,boolean p7,boolean p8){
       super(p0, p1);
       this.mType = p2;
       this.mUpgradeVersion = 0;
       this.mContent = p3;
       this.mFunctionName = p4;
       this.mBubbleKey = "";
       this.mShowTimes = p5;
       this.mShouldShowOldState = p6;
       this.mBlockOther = p7;
       this.mBlockedByOther = p8;
       this.init();
    }
    public static AlbumBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AlbumBubbleItem.class, p0);
    }
    public static AlbumBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, AlbumBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, AlbumBubbleItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(this) && this.mShouldShowOldState != null)? true: false;
       return b;
    }
    public String getBubbleKey(){
       Object obj = PatchProxy.apply(null, this, AlbumBubbleItem.class, "5");
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
       Object obj = PatchProxy.apply(null, this, AlbumBubbleItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getType(){
       return this.mType;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, AlbumBubbleItem.class, "3")) {
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
    public AlbumBubbleItem setContent(String p0){
       this.mContent = p0;
       return this;
    }
    public int upgradeVersion(){
       return this.mUpgradeVersion;
    }
}
