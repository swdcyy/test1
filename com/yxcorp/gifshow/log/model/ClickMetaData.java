package com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.BaseMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import k2b.e0;

public class ClickMetaData extends BaseMetaData	// class@001b11
{
    public ClientEvent$AreaPackage areaPackage;
    public CommonParams commonParams;
    public ClientContent$ContentPackage contentPackage;
    public ClientContentWrapper$ContentWrapper contentWrapper;
    public String contentWrapperString;
    public int direction;
    public ClientEvent$ElementPackage elementPackage;
    public String message;
    public ClientEvent$ElementPackage referElementPackage;
    public ClientEvent$UrlPackage referUrlPackage;
    public int type;
    public ClientEvent$UrlPackage urlPackage;
    public static final long serialVersionUID = 0x73a43e0e87aec1fc;

    public void ClickMetaData(){
       super();
       this.message = "";
       this.direction = 0;
    }
    public ClientEvent$AreaPackage getAreaPackage(){
       return this.areaPackage;
    }
    public CommonParams getCommonParams(){
       return this.commonParams;
    }
    public ClientContent$ContentPackage getContentPackage(){
       return this.contentPackage;
    }
    public ClientContentWrapper$ContentWrapper getContentWrapper(){
       return this.contentWrapper;
    }
    public String getContentWrapperString(){
       return this.contentWrapperString;
    }
    public int getDirection(){
       return this.direction;
    }
    public ClientEvent$ElementPackage getElementPackage(){
       return this.elementPackage;
    }
    public String getMessage(){
       return this.message;
    }
    public ClientEvent$ElementPackage getReferElementPackage(){
       return this.referElementPackage;
    }
    public ClientEvent$UrlPackage getReferUrlPackage(){
       return this.referUrlPackage;
    }
    public int getType(){
       return this.type;
    }
    public ClientEvent$UrlPackage getUrlPackage(){
       return this.urlPackage;
    }
    public ClickMetaData setAreaPackage(ClientEvent$AreaPackage p0){
       this.areaPackage = p0;
       return this;
    }
    public ClickMetaData setCommonParams(CommonParams p0){
       this.commonParams = p0;
       return this;
    }
    public ClickMetaData setContentPackage(ClientContent$ContentPackage p0){
       this.contentPackage = p0;
       return this;
    }
    public ClickMetaData setContentWrapper(ClientContentWrapper$ContentWrapper p0){
       this.contentWrapper = p0;
       return this;
    }
    public ClickMetaData setContentWrapperString(String p0){
       this.contentWrapperString = p0;
       return this;
    }
    public ClickMetaData setDirection(int p0){
       this.direction = p0;
       return this;
    }
    public ClickMetaData setElementPackage(ClientEvent$ElementPackage p0){
       this.elementPackage = p0;
       return this;
    }
    public ClickMetaData setFeedLogCtx(FeedLogCtx p0){
       this.feedLogCtx = p0;
       return this;
    }
    public ClickMetaData setInterStidContainer(StidContainerProto$StidContainer p0){
       this.interStidContainer = p0;
       return this;
    }
    public ClickMetaData setIsRealTime(boolean p0){
       this.isRealTime = p0;
       return this;
    }
    public ClickMetaData setKrnUrlPackage(ClientEvent$UrlPackage p0,ClientEvent$UrlPackage p1,ClientEvent$ElementPackage p2){
       this.urlPackage = p0;
       this.referUrlPackage = p1;
       this.referElementPackage = p2;
       return this;
    }
    public ClickMetaData setLogPage(e0 p0){
       this.logPage = p0;
       return this;
    }
    public ClickMetaData setMessage(String p0){
       this.message = p0;
       return this;
    }
    public ClickMetaData setType(int p0){
       this.type = p0;
       return this;
    }
}
