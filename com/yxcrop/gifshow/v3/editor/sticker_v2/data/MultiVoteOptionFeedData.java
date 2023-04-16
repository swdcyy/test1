package com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteOptionFeedData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MultiVoteOptionFeedData implements Serializable	// class@000a66
{
    public final String optionContent;
    public boolean selectedByMe;
    public int voteCount;

    public void MultiVoteOptionFeedData(String p0,int p1,boolean p2){
       a.p(p0, "optionContent");
       super();
       this.optionContent = p0;
       this.voteCount = p1;
       this.selectedByMe = p2;
    }
    public void MultiVoteOptionFeedData(String p0,int p1,boolean p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static MultiVoteOptionFeedData copy$default(MultiVoteOptionFeedData p0,String p1,int p2,boolean p3,int p4,Object p5){
       MultiVoteOptionFeedData optionConten;
       MultiVoteOptionFeedData voteCount;
       MultiVoteOptionFeedData selectedByMe;
       if (p4 & 0x01) {
          optionConten = p0.optionContent;
       }
       if (p4 & 0x02) {
          voteCount = p0.voteCount;
       }
       if (p4 & 0x04) {
          selectedByMe = p0.selectedByMe;
       }
       return p0.copy(optionConten, voteCount, selectedByMe);
    }
    public final String component1(){
       return this.optionContent;
    }
    public final int component2(){
       return this.voteCount;
    }
    public final boolean component3(){
       return this.selectedByMe;
    }
    public final MultiVoteOptionFeedData copy(String p0,int p1,boolean p2){
       if (PatchProxy.isSupport(MultiVoteOptionFeedData.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, MultiVoteOptionFeedData.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "optionContent");
       return new MultiVoteOptionFeedData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiVoteOptionFeedData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MultiVoteOptionFeedData && (a.g(this.optionContent, p0.optionContent) && (this.voteCount == p0.voteCount && this.selectedByMe == p0.selectedByMe)))) {
          return true;
       }
       return false;
    }
    public final String getOptionContent(){
       return this.optionContent;
    }
    public final boolean getSelectedByMe(){
       return this.selectedByMe;
    }
    public final int getVoteCount(){
       return this.voteCount;
    }
    public int hashCode(){
       MultiVoteOptionFeedData obj = PatchProxy.apply(null, this, MultiVoteOptionFeedData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.optionContent;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((i * 31) + this.voteCount) * 31;
       MultiVoteOptionFeedData tselectedByM = this.selectedByMe;
       if (tselectedByM != null) {
          tselectedByM = 1;
       }
       return (i + tselectedByM);
    }
    public final void setSelectedByMe(boolean p0){
       this.selectedByMe = p0;
    }
    public final void setVoteCount(int p0){
       this.voteCount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MultiVoteOptionFeedData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "optionContent="+this.optionContent+", voteCount="+this.voteCount+", selectedByMe="+this.selectedByMe;
    }
}
