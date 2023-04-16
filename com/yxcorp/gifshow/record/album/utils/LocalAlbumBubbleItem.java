package com.yxcorp.gifshow.record.album.utils.LocalAlbumBubbleItem;
import ra9.c;
import java.lang.Enum;
import oa0.a;
import java.lang.String;
import android.content.SharedPreferences;
import lnc.a1;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.e7;
import ra9.b;
import java.lang.Number;

public final class LocalAlbumBubbleItem extends Enum implements c	// class@00175b
{
    public final String mContent;
    public final boolean mCouldShowOldState;
    public final int mShowTimes;
    public final int mType;
    public static final LocalAlbumBubbleItem[] $VALUES;
    public static final LocalAlbumBubbleItem AUTO_SAVE;
    public static final LocalAlbumBubbleItem DRAFT_UNINSTALL;
    public static final LocalAlbumBubbleItem POST_TIP;
    public static final LocalAlbumBubbleItem SAVE_TO_ALBUM;

    static {
       boolean b;
       SharedPreferences a = a.a;
       LocalAlbumBubbleItem localAlbumBu = new LocalAlbumBubbleItem("DRAFT_UNINSTALL", 0, 0, "", 1, (a.getBoolean("has_shown_draft_uninstall_tip_v2", false) ^ 0x01));
       LocalAlbumBubbleItem.DRAFT_UNINSTALL = v7;
       LocalAlbumBubbleItem localAlbumBu1 = new LocalAlbumBubbleItem("SAVE_TO_ALBUM", 1, 0, a1.p(0x7f102f60), 1, (a.V() ^ 0x01));
       LocalAlbumBubbleItem.SAVE_TO_ALBUM = localAlbumBu;
       String str = a1.p(R.string.arg_RES_7f102f69);
       int i = LocalAlbumUtils.o();
       Object obj = PatchProxy.apply(null, null, LocalAlbumUtils.class, "46");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(a.q0() < LocalAlbumUtils.o()){
          b = 1;
       }else {
          b = null;
       }
       boolean b1 = b;
       LocalAlbumBubbleItem localAlbumBu2 = new LocalAlbumBubbleItem("POST_TIP", 2, 2, str, i, b1);
       LocalAlbumBubbleItem.POST_TIP = v1;
       localAlbumBu1 = new LocalAlbumBubbleItem("AUTO_SAVE", 3, 0, a1.p(0x7f100ac4), 1, a.getBoolean("local_album_show_settings_bubble", true));
       LocalAlbumBubbleItem.AUTO_SAVE = b;
       LocalAlbumBubbleItem[] localAlbumBu3 = new LocalAlbumBubbleItem[]{v7,localAlbumBu,v1,b};
       LocalAlbumBubbleItem.$VALUES = localAlbumBu3;
    }
    public void LocalAlbumBubbleItem(String p0,int p1,int p2,String p3,int p4,boolean p5){
       super(p0, p1);
       this.mType = p2;
       this.mContent = p3;
       this.mShowTimes = p4;
       this.mCouldShowOldState = p5;
       if (!p5) {
          e7.b(this.getBubbleKey(), this.getBubbleShowTimes());
       }
       return;
    }
    public static LocalAlbumBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalAlbumBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocalAlbumBubbleItem.class, p0);
    }
    public static LocalAlbumBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, LocalAlbumBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalAlbumBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumBubbleItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(this) && this.mCouldShowOldState != null)? true: false;
       return b;
    }
    public String getBubbleKey(){
       return b.b(this);
    }
    public int getBubbleShowTimes(){
       return this.mShowTimes;
    }
    public String getContent(){
       return this.mContent;
    }
    public String getFunctionName(){
       return b.e(this);
    }
    public int getMode(){
       return b.f(this);
    }
    public int getPriority(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumBubbleItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getType(){
       return this.mType;
    }
    public boolean isAutoDismissWhenPageStop(){
       return b.h(this);
    }
    public boolean isBlockedAfterShowingSelf(){
       return b.i(this);
    }
    public boolean isBlockedByOthersBeforeShowing(){
       return b.j(this);
    }
    public int upgradeVersion(){
       return b.k(this);
    }
}
