package com.yxcorp.gifshow.ad.award.flow.model.TagInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.TagInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class TagInfo implements Serializable	// class@001517
{
    public final String backgroundColor;
    public final String title;
    public final String titleColor;
    public static final TagInfo$a Companion;
    public static final long serialVersionUID;

    static {
       TagInfo.Companion = new TagInfo$a(null);
    }
    public void TagInfo(String p0,String p1,String p2){
       super();
       this.title = p0;
       this.titleColor = p1;
       this.backgroundColor = p2;
    }
}
