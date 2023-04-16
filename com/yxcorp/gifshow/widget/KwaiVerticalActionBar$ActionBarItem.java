package com.yxcorp.gifshow.widget.KwaiVerticalActionBar$ActionBarItem;
import java.lang.Enum;
import java.lang.String;
import lnc.a1;
import java.lang.Class;
import java.lang.Object;

public final class KwaiVerticalActionBar$ActionBarItem extends Enum	// class@001870
{
    public int mItemIconRes;
    public String mItemStr;
    public static final KwaiVerticalActionBar$ActionBarItem[] $VALUES;
    public static final KwaiVerticalActionBar$ActionBarItem COLLECT;
    public static final KwaiVerticalActionBar$ActionBarItem MORE;
    public static final KwaiVerticalActionBar$ActionBarItem SEARCH;
    public static final KwaiVerticalActionBar$ActionBarItem SEARCH_EDIT;
    public static final KwaiVerticalActionBar$ActionBarItem SHARE;

    static {
       KwaiVerticalActionBar$ActionBarItem uActionBarIt = new KwaiVerticalActionBar$ActionBarItem("SHARE", 0, a1.p(0x7f1051cd), 0x7f08256e);
       KwaiVerticalActionBar$ActionBarItem.SHARE = uActionBarIt;
       KwaiVerticalActionBar$ActionBarItem uActionBarIt1 = new KwaiVerticalActionBar$ActionBarItem("COLLECT", 1, a1.p(0x7f1051c7), 0x7f08256a);
       KwaiVerticalActionBar$ActionBarItem.COLLECT = uActionBarIt1;
       KwaiVerticalActionBar$ActionBarItem uActionBarIt2 = new KwaiVerticalActionBar$ActionBarItem("MORE", 2, a1.p(0x7f1051ca), 0x7f08256b);
       KwaiVerticalActionBar$ActionBarItem.MORE = uActionBarIt2;
       KwaiVerticalActionBar$ActionBarItem uActionBarIt3 = new KwaiVerticalActionBar$ActionBarItem("SEARCH", 3, a1.p(0x7f1051cb), 0x7f08256d);
       KwaiVerticalActionBar$ActionBarItem.SEARCH = uActionBarIt3;
       KwaiVerticalActionBar$ActionBarItem uActionBarIt4 = new KwaiVerticalActionBar$ActionBarItem("SEARCH_EDIT", 4, a1.p(0x7f1051cc), 0);
       KwaiVerticalActionBar$ActionBarItem.SEARCH_EDIT = uActionBarIt4;
       KwaiVerticalActionBar$ActionBarItem[] uActionBarIt5 = new KwaiVerticalActionBar$ActionBarItem[]{uActionBarIt,uActionBarIt1,uActionBarIt2,uActionBarIt3,uActionBarIt4};
       KwaiVerticalActionBar$ActionBarItem.$VALUES = uActionBarIt5;
    }
    public void KwaiVerticalActionBar$ActionBarItem(String p0,int p1,String p2,int p3){
       super(p0, p1);
       this.mItemStr = p2;
       this.mItemIconRes = p3;
    }
    public static KwaiVerticalActionBar$ActionBarItem valueOf(String p0){
       return Enum.valueOf(KwaiVerticalActionBar$ActionBarItem.class, p0);
    }
    public static KwaiVerticalActionBar$ActionBarItem[] values(){
       return KwaiVerticalActionBar$ActionBarItem.$VALUES.clone();
    }
}
