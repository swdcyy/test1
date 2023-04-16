package com.kwai.sdk.eve.proto.PageEvent$Builder;
import com.kwai.sdk.eve.proto.PageEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.sdk.eve.proto.PageEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.PageEvent$1;
import com.kwai.sdk.eve.proto.PageEvent$Action;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.PageEvent$SubAction;

public final class PageEvent$Builder extends GeneratedMessageLite$Builder implements PageEventOrBuilder	// class@0015f5
{

    public void PageEvent$Builder(){
       super(PageEvent.DEFAULT_INSTANCE);
    }
    public void PageEvent$Builder(PageEvent$1 p0){
       super();
    }
    public PageEvent$Builder clearAction(){
       this.copyOnWrite();
       this.instance.clearAction();
       return this;
    }
    public PageEvent$Builder clearAuthorId(){
       this.copyOnWrite();
       this.instance.clearAuthorId();
       return this;
    }
    public PageEvent$Builder clearContentId(){
       this.copyOnWrite();
       this.instance.clearContentId();
       return this;
    }
    public PageEvent$Builder clearContentParamField1(){
       this.copyOnWrite();
       this.instance.clearContentParamField1();
       return this;
    }
    public PageEvent$Builder clearContentType(){
       this.copyOnWrite();
       this.instance.clearContentType();
       return this;
    }
    public PageEvent$Builder clearEntryPageId(){
       this.copyOnWrite();
       this.instance.clearEntryPageId();
       return this;
    }
    public PageEvent$Builder clearEntryPageSource(){
       this.copyOnWrite();
       this.instance.clearEntryPageSource();
       return this;
    }
    public PageEvent$Builder clearExpTag(){
       this.copyOnWrite();
       this.instance.clearExpTag();
       return this;
    }
    public PageEvent$Builder clearForegroundTime(){
       this.copyOnWrite();
       this.instance.clearForegroundTime();
       return this;
    }
    public PageEvent$Builder clearIdentity(){
       this.copyOnWrite();
       this.instance.clearIdentity();
       return this;
    }
    public PageEvent$Builder clearLastPage(){
       this.copyOnWrite();
       this.instance.clearLastPage();
       return this;
    }
    public PageEvent$Builder clearLatitude(){
       this.copyOnWrite();
       this.instance.clearLatitude();
       return this;
    }
    public PageEvent$Builder clearLlsid(){
       this.copyOnWrite();
       this.instance.clearLlsid();
       return this;
    }
    public PageEvent$Builder clearLongitude(){
       this.copyOnWrite();
       this.instance.clearLongitude();
       return this;
    }
    public PageEvent$Builder clearPage(){
       this.copyOnWrite();
       this.instance.clearPage();
       return this;
    }
    public PageEvent$Builder clearPageShowSeq(){
       this.copyOnWrite();
       this.instance.clearPageShowSeq();
       return this;
    }
    public PageEvent$Builder clearPosition(){
       this.copyOnWrite();
       this.instance.clearPosition();
       return this;
    }
    public PageEvent$Builder clearReferPage(){
       this.copyOnWrite();
       this.instance.clearReferPage();
       return this;
    }
    public PageEvent$Builder clearSessionId(){
       this.copyOnWrite();
       this.instance.clearSessionId();
       return this;
    }
    public PageEvent$Builder clearSubAction(){
       this.copyOnWrite();
       this.instance.clearSubAction();
       return this;
    }
    public PageEvent$Builder clearTimestamp(){
       this.copyOnWrite();
       this.instance.clearTimestamp();
       return this;
    }
    public PageEvent$Builder clearUrlParamField1(){
       this.copyOnWrite();
       this.instance.clearUrlParamField1();
       return this;
    }
    public PageEvent$Builder clearUrlParamField2(){
       this.copyOnWrite();
       this.instance.clearUrlParamField2();
       return this;
    }
    public PageEvent$Action getAction(){
       return this.instance.getAction();
    }
    public int getActionValue(){
       return this.instance.getActionValue();
    }
    public String getAuthorId(){
       return this.instance.getAuthorId();
    }
    public ByteString getAuthorIdBytes(){
       return this.instance.getAuthorIdBytes();
    }
    public String getContentId(){
       return this.instance.getContentId();
    }
    public ByteString getContentIdBytes(){
       return this.instance.getContentIdBytes();
    }
    public String getContentParamField1(){
       return this.instance.getContentParamField1();
    }
    public ByteString getContentParamField1Bytes(){
       return this.instance.getContentParamField1Bytes();
    }
    public ContentType getContentType(){
       return this.instance.getContentType();
    }
    public int getContentTypeValue(){
       return this.instance.getContentTypeValue();
    }
    public String getEntryPageId(){
       return this.instance.getEntryPageId();
    }
    public ByteString getEntryPageIdBytes(){
       return this.instance.getEntryPageIdBytes();
    }
    public String getEntryPageSource(){
       return this.instance.getEntryPageSource();
    }
    public ByteString getEntryPageSourceBytes(){
       return this.instance.getEntryPageSourceBytes();
    }
    public String getExpTag(){
       return this.instance.getExpTag();
    }
    public ByteString getExpTagBytes(){
       return this.instance.getExpTagBytes();
    }
    public long getForegroundTime(){
       return this.instance.getForegroundTime();
    }
    public String getIdentity(){
       return this.instance.getIdentity();
    }
    public ByteString getIdentityBytes(){
       return this.instance.getIdentityBytes();
    }
    public String getLastPage(){
       return this.instance.getLastPage();
    }
    public ByteString getLastPageBytes(){
       return this.instance.getLastPageBytes();
    }
    public double getLatitude(){
       return this.instance.getLatitude();
    }
    public String getLlsid(){
       return this.instance.getLlsid();
    }
    public ByteString getLlsidBytes(){
       return this.instance.getLlsidBytes();
    }
    public double getLongitude(){
       return this.instance.getLongitude();
    }
    public String getPage(){
       return this.instance.getPage();
    }
    public ByteString getPageBytes(){
       return this.instance.getPageBytes();
    }
    public int getPageShowSeq(){
       return this.instance.getPageShowSeq();
    }
    public int getPosition(){
       return this.instance.getPosition();
    }
    public String getReferPage(){
       return this.instance.getReferPage();
    }
    public ByteString getReferPageBytes(){
       return this.instance.getReferPageBytes();
    }
    public String getSessionId(){
       return this.instance.getSessionId();
    }
    public ByteString getSessionIdBytes(){
       return this.instance.getSessionIdBytes();
    }
    public PageEvent$SubAction getSubAction(){
       return this.instance.getSubAction();
    }
    public int getSubActionValue(){
       return this.instance.getSubActionValue();
    }
    public long getTimestamp(){
       return this.instance.getTimestamp();
    }
    public String getUrlParamField1(){
       return this.instance.getUrlParamField1();
    }
    public ByteString getUrlParamField1Bytes(){
       return this.instance.getUrlParamField1Bytes();
    }
    public String getUrlParamField2(){
       return this.instance.getUrlParamField2();
    }
    public ByteString getUrlParamField2Bytes(){
       return this.instance.getUrlParamField2Bytes();
    }
    public PageEvent$Builder setAction(PageEvent$Action p0){
       this.copyOnWrite();
       this.instance.setAction(p0);
       return this;
    }
    public PageEvent$Builder setActionValue(int p0){
       this.copyOnWrite();
       this.instance.setActionValue(p0);
       return this;
    }
    public PageEvent$Builder setAuthorId(String p0){
       this.copyOnWrite();
       this.instance.setAuthorId(p0);
       return this;
    }
    public PageEvent$Builder setAuthorIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setAuthorIdBytes(p0);
       return this;
    }
    public PageEvent$Builder setContentId(String p0){
       this.copyOnWrite();
       this.instance.setContentId(p0);
       return this;
    }
    public PageEvent$Builder setContentIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setContentIdBytes(p0);
       return this;
    }
    public PageEvent$Builder setContentParamField1(String p0){
       this.copyOnWrite();
       this.instance.setContentParamField1(p0);
       return this;
    }
    public PageEvent$Builder setContentParamField1Bytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setContentParamField1Bytes(p0);
       return this;
    }
    public PageEvent$Builder setContentType(ContentType p0){
       this.copyOnWrite();
       this.instance.setContentType(p0);
       return this;
    }
    public PageEvent$Builder setContentTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setContentTypeValue(p0);
       return this;
    }
    public PageEvent$Builder setEntryPageId(String p0){
       this.copyOnWrite();
       this.instance.setEntryPageId(p0);
       return this;
    }
    public PageEvent$Builder setEntryPageIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setEntryPageIdBytes(p0);
       return this;
    }
    public PageEvent$Builder setEntryPageSource(String p0){
       this.copyOnWrite();
       this.instance.setEntryPageSource(p0);
       return this;
    }
    public PageEvent$Builder setEntryPageSourceBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setEntryPageSourceBytes(p0);
       return this;
    }
    public PageEvent$Builder setExpTag(String p0){
       this.copyOnWrite();
       this.instance.setExpTag(p0);
       return this;
    }
    public PageEvent$Builder setExpTagBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setExpTagBytes(p0);
       return this;
    }
    public PageEvent$Builder setForegroundTime(long p0){
       this.copyOnWrite();
       this.instance.setForegroundTime(p0);
       return this;
    }
    public PageEvent$Builder setIdentity(String p0){
       this.copyOnWrite();
       this.instance.setIdentity(p0);
       return this;
    }
    public PageEvent$Builder setIdentityBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setIdentityBytes(p0);
       return this;
    }
    public PageEvent$Builder setLastPage(String p0){
       this.copyOnWrite();
       this.instance.setLastPage(p0);
       return this;
    }
    public PageEvent$Builder setLastPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setLastPageBytes(p0);
       return this;
    }
    public PageEvent$Builder setLatitude(double p0){
       this.copyOnWrite();
       this.instance.setLatitude(p0);
       return this;
    }
    public PageEvent$Builder setLlsid(String p0){
       this.copyOnWrite();
       this.instance.setLlsid(p0);
       return this;
    }
    public PageEvent$Builder setLlsidBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setLlsidBytes(p0);
       return this;
    }
    public PageEvent$Builder setLongitude(double p0){
       this.copyOnWrite();
       this.instance.setLongitude(p0);
       return this;
    }
    public PageEvent$Builder setPage(String p0){
       this.copyOnWrite();
       this.instance.setPage(p0);
       return this;
    }
    public PageEvent$Builder setPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPageBytes(p0);
       return this;
    }
    public PageEvent$Builder setPageShowSeq(int p0){
       this.copyOnWrite();
       this.instance.setPageShowSeq(p0);
       return this;
    }
    public PageEvent$Builder setPosition(int p0){
       this.copyOnWrite();
       this.instance.setPosition(p0);
       return this;
    }
    public PageEvent$Builder setReferPage(String p0){
       this.copyOnWrite();
       this.instance.setReferPage(p0);
       return this;
    }
    public PageEvent$Builder setReferPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setReferPageBytes(p0);
       return this;
    }
    public PageEvent$Builder setSessionId(String p0){
       this.copyOnWrite();
       this.instance.setSessionId(p0);
       return this;
    }
    public PageEvent$Builder setSessionIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setSessionIdBytes(p0);
       return this;
    }
    public PageEvent$Builder setSubAction(PageEvent$SubAction p0){
       this.copyOnWrite();
       this.instance.setSubAction(p0);
       return this;
    }
    public PageEvent$Builder setSubActionValue(int p0){
       this.copyOnWrite();
       this.instance.setSubActionValue(p0);
       return this;
    }
    public PageEvent$Builder setTimestamp(long p0){
       this.copyOnWrite();
       this.instance.setTimestamp(p0);
       return this;
    }
    public PageEvent$Builder setUrlParamField1(String p0){
       this.copyOnWrite();
       this.instance.setUrlParamField1(p0);
       return this;
    }
    public PageEvent$Builder setUrlParamField1Bytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setUrlParamField1Bytes(p0);
       return this;
    }
    public PageEvent$Builder setUrlParamField2(String p0){
       this.copyOnWrite();
       this.instance.setUrlParamField2(p0);
       return this;
    }
    public PageEvent$Builder setUrlParamField2Bytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setUrlParamField2Bytes(p0);
       return this;
    }
}
