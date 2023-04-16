package com.yxcorp.gifshow.prettify.utils.PrettifyBubbleItem;
import ra9.c;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
import oe6.e;
import sq.a;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import km8.b;
import android.content.SharedPreferences;
import lnc.e7;
import ra9.b;
import java.lang.Number;

public final class PrettifyBubbleItem extends Enum implements c	// class@0011a4
{
    public final String mContent;
    public final boolean mCouldShowOldState;
    public static final PrettifyBubbleItem[] $VALUES;
    public static final PrettifyBubbleItem COLLECT_FILTER;
    public static final PrettifyBubbleItem MEDICAL_BEAUTY_GUIDE;
    public static final PrettifyBubbleItem RECORD_RECO_FILTER;
    public static final PrettifyBubbleItem RECORD_RECO_MAKEUP;
    public static final PrettifyBubbleItem RECO_FILTER;
    public static final PrettifyBubbleItem RECO_MAKEUP;

    static {
       PrettifyBubbleItem prettifyBubb = new PrettifyBubbleItem("MEDICAL_BEAUTY_GUIDE", 0, a1.p(0x7f100390), (e.m() ^ 1));
       PrettifyBubbleItem.MEDICAL_BEAUTY_GUIDE = prettifyBubb;
       int i = 0x7f103e13;
       PrettifyBubbleItem prettifyBubb1 = new PrettifyBubbleItem("RECO_FILTER", 1, a1.p(i), a.i());
       PrettifyBubbleItem.RECO_FILTER = prettifyBubb1;
       int i1 = 0x7f103e15;
       PrettifyBubbleItem prettifyBubb2 = new PrettifyBubbleItem("RECO_MAKEUP", 2, a1.p(i1), a.j());
       PrettifyBubbleItem.RECO_MAKEUP = prettifyBubb2;
       String str = a1.p(R.string.arg_RES_7f100f48);
       Object obj = PatchProxy.apply(null, null, a.class, "28");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): b.b("DefaultPreferenceHelper").getBoolean("filter_collect_guide_bubble", 0);
       PrettifyBubbleItem prettifyBubb3 = new PrettifyBubbleItem("COLLECT_FILTER", 3, str, (b ^ 1));
       PrettifyBubbleItem.COLLECT_FILTER = prettifyBubb3;
       PrettifyBubbleItem prettifyBubb4 = new PrettifyBubbleItem("RECORD_RECO_FILTER", 4, a1.p(i), 1);
       PrettifyBubbleItem.RECORD_RECO_FILTER = prettifyBubb4;
       PrettifyBubbleItem prettifyBubb5 = new PrettifyBubbleItem("RECORD_RECO_MAKEUP", 5, a1.p(i1), 1);
       PrettifyBubbleItem.RECORD_RECO_MAKEUP = prettifyBubb5;
       PrettifyBubbleItem[] prettifyBubb6 = new PrettifyBubbleItem[]{prettifyBubb,prettifyBubb1,prettifyBubb2,prettifyBubb3,prettifyBubb4,prettifyBubb5};
       PrettifyBubbleItem.$VALUES = prettifyBubb6;
    }
    public void PrettifyBubbleItem(String p0,int p1,String p2,boolean p3){
       super(p0, p1);
       this.mContent = p2;
       this.mCouldShowOldState = p3;
       if (!p3) {
          e7.b(this.getBubbleKey(), this.getBubbleShowTimes());
       }
       return;
    }
    public static PrettifyBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PrettifyBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PrettifyBubbleItem.class, p0);
    }
    public static PrettifyBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, PrettifyBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PrettifyBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, PrettifyBubbleItem.class, "4");
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
       return b.c(this);
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
       Object obj = PatchProxy.apply(null, this, PrettifyBubbleItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getType(){
       return b.g(this);
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
