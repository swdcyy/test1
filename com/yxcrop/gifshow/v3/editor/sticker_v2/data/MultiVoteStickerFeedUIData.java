package com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteStickerFeedUIData;
import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteOptionFeedData;
import java.lang.Math;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;

public final class MultiVoteStickerFeedUIData implements Serializable	// class@000a67
{
    public boolean hasVotedByMe;
    public final boolean isAuthor;
    public final ArrayList optionList;
    public final int pageSource;
    public final String question;

    public void MultiVoteStickerFeedUIData(String p0,ArrayList p1,boolean p2,boolean p3,int p4){
       a.p(p0, "question");
       a.p(p1, "optionList");
       super();
       this.question = p0;
       this.optionList = p1;
       this.isAuthor = p2;
       this.hasVotedByMe = p3;
       this.pageSource = p4;
    }
    public void MultiVoteStickerFeedUIData(String p0,ArrayList p1,boolean p2,boolean p3,int p4,int p5,u p6){
       boolean b = (p5 & 0x08)? false: p3;
       super(p0, p1, p2, b, p4);
       return;
    }
    public static MultiVoteStickerFeedUIData copy$default(MultiVoteStickerFeedUIData p0,String p1,ArrayList p2,boolean p3,boolean p4,int p5,int p6,Object p7){
       MultiVoteStickerFeedUIData question;
       MultiVoteStickerFeedUIData optionList;
       MultiVoteStickerFeedUIData isAuthor;
       MultiVoteStickerFeedUIData hasVotedByMe;
       MultiVoteStickerFeedUIData pageSource;
       if (p6 & 0x01) {
          question = p0.question;
       }
       if (p6 & 0x02) {
          optionList = p0.optionList;
       }
       p7 = optionList;
       if (p6 & 0x04) {
          isAuthor = p0.isAuthor;
       }
       MultiVoteStickerFeedUIData multiVoteSti = isAuthor;
       if (p6 & 0x08) {
          hasVotedByMe = p0.hasVotedByMe;
       }
       MultiVoteStickerFeedUIData multiVoteSti1 = hasVotedByMe;
       if (p6 & 0x10) {
          pageSource = p0.pageSource;
       }
       return p0.copy(question, p7, multiVoteSti, multiVoteSti1, pageSource);
    }
    public final String component1(){
       return this.question;
    }
    public final ArrayList component2(){
       return this.optionList;
    }
    public final boolean component3(){
       return this.isAuthor;
    }
    public final boolean component4(){
       return this.hasVotedByMe;
    }
    public final int component5(){
       return this.pageSource;
    }
    public final MultiVoteStickerFeedUIData copy(String p0,ArrayList p1,boolean p2,boolean p3,int p4){
       Object obj;
       if (PatchProxy.isSupport(MultiVoteStickerFeedUIData.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, MultiVoteStickerFeedUIData.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "question");
       a.p(p1, "optionList");
       MultiVoteStickerFeedUIData multiVoteSti = new MultiVoteStickerFeedUIData(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiVoteStickerFeedUIData.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MultiVoteStickerFeedUIData && (a.g(this.question, p0.question) && (a.g(this.optionList, p0.optionList) && (this.isAuthor == p0.isAuthor && (this.hasVotedByMe == p0.hasVotedByMe && this.pageSource == p0.pageSource)))))) {
          return true;
       }
       return false;
    }
    public final boolean getHasVotedByMe(){
       return this.hasVotedByMe;
    }
    public final ArrayList getOptionList(){
       return this.optionList;
    }
    public final int getOptionVotePercentage(int p0){
       if (PatchProxy.isSupport(MultiVoteStickerFeedUIData.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MultiVoteStickerFeedUIData.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (p0 < 0 || p0 >= this.optionList.size()) {
          return i;
       }else {
          int totalVoteCou = this.getTotalVoteCount();
          if (totalVoteCou <= 0) {
             return i;
          }else if(p0 == (this.optionList.size() - 1)){
             int i1 = this.optionList.size() - 1;
             int i2 = 0;
             for (; i < i1; i = i + 1) {
                i2 = i2 + this.getOptionVotePercentage(i);
             }
             return Math.min((i2 - 100), (int)(((float)this.optionList.get(p0).getVoteCount() * 100.00f) / (float)totalVoteCou));
          }else {
             return (int)(((float)this.optionList.get(p0).getVoteCount() * 100.00f) / (float)totalVoteCou);
          }
       }
    }
    public final int getPageSource(){
       return this.pageSource;
    }
    public final String getQuestion(){
       return this.question;
    }
    public final int getTotalVoteCount(){
       Object obj = PatchProxy.apply(null, this, MultiVoteStickerFeedUIData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = this.optionList.iterator();
       while (iterator.hasNext()) {
          i = i + iterator.next().getVoteCount();
       }
       return i;
    }
    public int hashCode(){
       MultiVoteStickerFeedUIData obj = PatchProxy.apply(null, this, MultiVoteStickerFeedUIData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.question;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MultiVoteStickerFeedUIData toptionList = this.optionList;
       if (toptionList != null) {
          i = toptionList.hashCode();
       }
       i1 = (i1 + i) * 31;
       MultiVoteStickerFeedUIData tisAuthor = this.isAuthor;
       int i2 = 1;
       if (tisAuthor != null) {
          tisAuthor = 1;
       }
       i1 = (i1 + tisAuthor) * 31;
       tisAuthor = this.hasVotedByMe;
       if (tisAuthor == null) {
          i2 = tisAuthor;
       }
       return (((i1 + i2) * 31) + this.pageSource);
    }
    public final boolean isAuthor(){
       return this.isAuthor;
    }
    public final void onOptionSelected(int p0){
       if (PatchProxy.isSupport(MultiVoteStickerFeedUIData.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MultiVoteStickerFeedUIData.class, "1")) {
          return;
       }
       if (p0 >= 0 && p0 < this.optionList.size()) {
          Object obj = this.optionList.get(p0);
          a.o(obj, "optionList[index]");
          obj.setSelectedByMe(true);
          obj.setVoteCount((obj.getVoteCount() + true));
          this.hasVotedByMe = true;
       }
       return;
    }
    public final void setHasVotedByMe(boolean p0){
       this.hasVotedByMe = p0;
    }
    public String toString(){
       Iterator obj = PatchProxy.apply(null, this, MultiVoteStickerFeedUIData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.optionList.iterator();
       String str = "";
       while (obj.hasNext()) {
          str = str+"[OPTION "+obj.next()+"]###";
       }
       return "[MultiVoteStickerFeedUIData question="+this.question+", optionList="+str+", "+"isAuthor="+this.isAuthor+", hasVotedByMe="+this.hasVotedByMe+", pageSource="+this.pageSource+']';
    }
}
