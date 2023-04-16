package com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import java.io.Serializable;
import xw3.c;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import xw3.b;
import xw3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Long;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;

public final class FeedChannelInfo implements Serializable, c	// class@001783
{
    public boolean b;
    public int c;
    public String d;
    public int e;
    public int height;
    public List imageUrls;
    public Long mBubbleDisplayTime;
    public String mBubbleText;
    public final int mChannelId;
    public final String mChannelName;
    public List secondCategoryList;
    public int width;
    public static final FeedChannelInfo$a Companion;
    public static final FeedChannelInfo RecommendChannel;
    public static final long serialVersionUID;

    static {
       FeedChannelInfo.Companion = new FeedChannelInfo$a(null);
       FeedChannelInfo.RecommendChannel = new FeedChannelInfo(0, "ÍÆ¼ö");
    }
    public void FeedChannelInfo(){
       super(0, null, 3, null);
    }
    public void FeedChannelInfo(int p0,String p1){
       super();
       this.mChannelId = p0;
       this.mChannelName = p1;
       this.e = 1;
    }
    public void FeedChannelInfo(int p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public long a(){
       return b.a(this);
    }
    public void b(){
       b.e(this);
    }
    public a buildClickLogger(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedChannelInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.a("TAG_TAB");
       p0.c(1);
       return p0.i("tab_id", Integer.valueOf(this.mChannelId)).j("tab_name", this.mChannelName).i("tab_style", Integer.valueOf(this.getTabStyleId()));
    }
    public a buildShowLogger(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedChannelInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.n(3);
       p0.a("TAG_TAB");
       return p0.i("tab_id", Integer.valueOf(this.mChannelId)).j("tab_name", this.mChannelName).i("tab_style", Integer.valueOf(this.getTabStyleId()));
    }
    public void c(){
       b.d(this);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedChannelInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof FeedChannelInfo) {
          return b;
       }
       if (!(a.g(FeedChannelInfo.class, p0.getClass()) ^ 1) && this.mChannelId == p0.mChannelId) {
          b = true;
       }
       return b;
    }
    public String getBiz(){
       return "ChannelInfo";
    }
    public final int getHeight(){
       return this.height;
    }
    public String getIdentity(){
       Object obj = PatchProxy.apply(null, this, FeedChannelInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mChannelId)+"";
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final Long getMBubbleDisplayTime(){
       return this.mBubbleDisplayTime;
    }
    public final String getMBubbleText(){
       return this.mBubbleText;
    }
    public QPhoto getQPhoto(){
       return b.b(this);
    }
    public final List getSecondCategoryList(){
       return this.secondCategoryList;
    }
    public final int getSelectCategoryId(){
       return this.c;
    }
    public final String getSelectCategoryName(){
       return this.d;
    }
    public final int getSelectTabType(){
       return this.e;
    }
    public final boolean getShowCategory(){
       return this.b;
    }
    public final int getTabStyleId(){
       Object obj = PatchProxy.apply(null, this, FeedChannelInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.isPictureTab();
    }
    public final int getWidth(){
       return this.width;
    }
    public int hashCode(){
       return this.mChannelId;
    }
    public boolean isCache(){
       return b.c(this);
    }
    public final boolean isDefaultChannel(){
       boolean b = (this.mChannelId == null && this.c == null)? true: false;
       return b;
    }
    public final boolean isPictureTab(){
       FeedChannelInfo obj = PatchProxy.apply(null, this, FeedChannelInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.imageUrls;
       boolean b = false;
       obj = (obj == null || obj.isEmpty())? 1: null;
       if (!obj && (this.height > null && this.width > null)) {
          b = true;
       }
    label_002f :
       return b;
    }
    public final void setHeight(int p0){
       this.height = p0;
    }
    public final void setImageUrls(List p0){
       this.imageUrls = p0;
    }
    public final void setMBubbleDisplayTime(Long p0){
       this.mBubbleDisplayTime = p0;
    }
    public final void setMBubbleText(String p0){
       this.mBubbleText = p0;
    }
    public final void setSecondCategoryList(List p0){
       this.secondCategoryList = p0;
    }
    public final void setSelectCategoryId(int p0){
       this.c = p0;
    }
    public final void setSelectCategoryName(String p0){
       this.d = p0;
    }
    public final void setSelectTabType(int p0){
       this.e = p0;
    }
    public final void setShowCategory(boolean p0){
       this.b = p0;
    }
    public final void setWidth(int p0){
       this.width = p0;
    }
}
