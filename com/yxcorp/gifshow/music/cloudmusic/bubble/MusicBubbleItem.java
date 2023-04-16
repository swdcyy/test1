package com.yxcorp.gifshow.music.cloudmusic.bubble.MusicBubbleItem;
import ra9.c;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra9.b;
import java.lang.Number;

public final class MusicBubbleItem extends Enum implements c	// class@001ff4
{
    public final String mContent;
    public final int mType;
    public static final MusicBubbleItem[] $VALUES;
    public static final MusicBubbleItem KTV_ENTRY_MOVE;

    static {
       MusicBubbleItem musicBubbleI = new MusicBubbleItem("KTV_ENTRY_MOVE", 0, 0, a1.p(0x7f103daf));
       MusicBubbleItem.KTV_ENTRY_MOVE = musicBubbleI;
       MusicBubbleItem[] musicBubbleI1 = new MusicBubbleItem[]{musicBubbleI};
       MusicBubbleItem.$VALUES = musicBubbleI1;
    }
    public void MusicBubbleItem(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mType = p2;
       this.mContent = p3;
    }
    public static MusicBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicBubbleItem.class, p0);
    }
    public static MusicBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, MusicBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       return b.a(this);
    }
    public String getBubbleKey(){
       return b.b(this);
    }
    public int getBubbleShowTimes(){
       return 1;
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
       Object obj = PatchProxy.apply(null, this, MusicBubbleItem.class, "3");
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
