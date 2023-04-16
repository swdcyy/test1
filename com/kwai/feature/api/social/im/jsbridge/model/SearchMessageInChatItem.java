package com.kwai.feature.api.social.im.jsbridge.model.SearchMessageInChatItem;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;

public final class SearchMessageInChatItem implements Serializable	// class@001103
{
    public final String imageUrl;
    public final List imageUrls;
    public final long msgClientSeq;
    public final String msgSender;
    public final long msgSeq;
    public final String msgSummary;
    public final long msgTime;
    public final String showName;

    public void SearchMessageInChatItem(long p0,long p1,String p2,long p3,String p4,String p5,String p6,List p7){
       super();
       this.msgSeq = p0;
       this.msgClientSeq = p1;
       this.msgSummary = p2;
       this.msgTime = p3;
       this.msgSender = p4;
       this.showName = p5;
       this.imageUrl = p6;
       this.imageUrls = p7;
    }
    public final String getImageUrl(){
       return this.imageUrl;
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final long getMsgClientSeq(){
       return this.msgClientSeq;
    }
    public final String getMsgSender(){
       return this.msgSender;
    }
    public final long getMsgSeq(){
       return this.msgSeq;
    }
    public final String getMsgSummary(){
       return this.msgSummary;
    }
    public final long getMsgTime(){
       return this.msgTime;
    }
    public final String getShowName(){
       return this.showName;
    }
}
