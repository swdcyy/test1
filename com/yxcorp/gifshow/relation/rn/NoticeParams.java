package com.yxcorp.gifshow.relation.rn.NoticeParams;
import java.io.Serializable;
import com.yxcorp.gifshow.relation.rn.NoticeParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class NoticeParams implements Serializable	// class@001961
{
    public String categoryType;
    public final String componentName;
    public boolean isBigV;
    public boolean isInTab;
    public String mixBoxExtraInfo;
    public String mixBoxType;
    public String pageTitle;
    public int pushGuideStyle;
    public static final NoticeParams$a Companion;
    public static final long serialVersionUID;

    static {
       NoticeParams.Companion = new NoticeParams$a(null);
    }
    public void NoticeParams(String p0,boolean p1,boolean p2,int p3,String p4,String p5,String p6,String p7){
       a.p(p0, "componentName");
       super();
       this.componentName = p0;
       this.isInTab = p1;
       this.isBigV = p2;
       this.pushGuideStyle = p3;
       this.pageTitle = p4;
       this.mixBoxType = p5;
       this.categoryType = p6;
       this.mixBoxExtraInfo = p7;
    }
    public void NoticeParams(String p0,boolean p1,boolean p2,int p3,String p4,String p5,String p6,String p7,int p8,u p9){
       int i = p8;
       int i1 = 0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x04)? 0: p2;
       if (!(i & 0x08)) {
          i1 = p3;
       }
       int i4 = 0;
       int i5 = (i & 0x10)? i4: p4;
       int i6 = (i & 0x20)? i4: p5;
       int i7 = (i & 0x40)? i4: p6;
       if (!(i & 0x0080)) {
          i4 = p7;
       }
       super(p0, i2, i3, i1, i5, i6, i7, i4);
       return;
    }
}
