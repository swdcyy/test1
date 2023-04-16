package com.kuaishou.merchant.home2.magnet.toolbar.model.ToolBarItem;
import java.io.Serializable;
import com.kuaishou.merchant.home2.magnet.toolbar.model.ToolBarItem$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToolBarItem implements Serializable	// class@001803
{
    public Drawable b;
    public List imageUrls;
    public boolean mIsOperateRedDot;
    public String mJumpUrl;
    public long mRedDotId;
    public long mTabId;
    public String mText;
    public String mTip;
    public String mTrackAreaModelName;
    public int mType;
    public static final ToolBarItem$a Companion;
    public static final long serialVersionUID;

    static {
       ToolBarItem.Companion = new ToolBarItem$a(null);
    }
    public void ToolBarItem(){
       super(0, false, 0, 0, null, null, null, null, null, null, 1023, null);
    }
    public void ToolBarItem(long p0,boolean p1,long p2,int p3,String p4,List p5,String p6,String p7,String p8,Drawable p9){
       super();
       this.mTabId = p0;
       this.mIsOperateRedDot = p1;
       this.mRedDotId = p2;
       this.mType = p3;
       this.mText = p4;
       this.imageUrls = p5;
       this.mJumpUrl = p6;
       this.mTip = p7;
       this.mTrackAreaModelName = p8;
       this.b = p9;
    }
    public void ToolBarItem(long p0,boolean p1,long p2,int p3,String p4,List p5,String p6,String p7,String p8,Drawable p9,int p10,u p11){
       int i = p10;
       int i1 = 0;
       int i2 = (i & 0x01)? i1: p0;
       int i3 = 0;
       int i4 = (i & 0x02)? 0: p1;
       if (!(i & 0x04)) {
          i1 = p2;
       }
       if (!(i & 0x08)) {
          i3 = p3;
       }
       int i5 = 0;
       int i6 = (i & 0x10)? i5: p4;
       int i7 = (i & 0x20)? i5: p5;
       int i8 = (i & 0x40)? i5: p6;
       int i9 = (i & 0x0080)? i5: p7;
       int i10 = (i & 0x0100)? i5: p8;
       if (!(i & 0x0200)) {
          i5 = p9;
       }
       super(i2, i4, i1, i3, i6, i7, i8, i9, i10, i5);
       return;
    }
    public static final List createDefault(){
       Object obj = PatchProxy.apply(null, null, ToolBarItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToolBarItem.Companion.a();
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final Drawable getMIcon(){
       return this.b;
    }
    public final boolean getMIsOperateRedDot(){
       return this.mIsOperateRedDot;
    }
    public final String getMJumpUrl(){
       return this.mJumpUrl;
    }
    public final long getMRedDotId(){
       return this.mRedDotId;
    }
    public final long getMTabId(){
       return this.mTabId;
    }
    public final String getMText(){
       return this.mText;
    }
    public final String getMTip(){
       return this.mTip;
    }
    public final String getMTrackAreaModelName(){
       return this.mTrackAreaModelName;
    }
    public final int getMType(){
       return this.mType;
    }
    public final void setImageUrls(List p0){
       this.imageUrls = p0;
    }
    public final void setMIcon(Drawable p0){
       this.b = p0;
    }
    public final void setMIsOperateRedDot(boolean p0){
       this.mIsOperateRedDot = p0;
    }
    public final void setMJumpUrl(String p0){
       this.mJumpUrl = p0;
    }
    public final void setMRedDotId(long p0){
       this.mRedDotId = p0;
    }
    public final void setMTabId(long p0){
       this.mTabId = p0;
    }
    public final void setMText(String p0){
       this.mText = p0;
    }
    public final void setMTip(String p0){
       this.mTip = p0;
    }
    public final void setMTrackAreaModelName(String p0){
       this.mTrackAreaModelName = p0;
    }
    public final void setMType(int p0){
       this.mType = p0;
    }
}
