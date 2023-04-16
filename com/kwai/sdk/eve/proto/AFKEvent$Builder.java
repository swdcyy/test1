package com.kwai.sdk.eve.proto.AFKEvent$Builder;
import com.kwai.sdk.eve.proto.AFKEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.sdk.eve.proto.AFKEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.AFKEvent$1;
import com.kwai.sdk.eve.proto.AFKEvent$Action;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class AFKEvent$Builder extends GeneratedMessageLite$Builder implements AFKEventOrBuilder	// class@0015d8
{

    public void AFKEvent$Builder(){
       super(AFKEvent.DEFAULT_INSTANCE);
    }
    public void AFKEvent$Builder(AFKEvent$1 p0){
       super();
    }
    public AFKEvent$Builder clearAction(){
       this.copyOnWrite();
       this.instance.clearAction();
       return this;
    }
    public AFKEvent$Builder clearDate(){
       this.copyOnWrite();
       this.instance.clearDate();
       return this;
    }
    public AFKEvent$Builder clearDuration(){
       this.copyOnWrite();
       this.instance.clearDuration();
       return this;
    }
    public AFKEvent$Builder clearLevel(){
       this.copyOnWrite();
       this.instance.clearLevel();
       return this;
    }
    public AFKEvent$Builder clearPage(){
       this.copyOnWrite();
       this.instance.clearPage();
       return this;
    }
    public AFKEvent$Builder clearSessionId(){
       this.copyOnWrite();
       this.instance.clearSessionId();
       return this;
    }
    public AFKEvent$Builder clearTimestamp(){
       this.copyOnWrite();
       this.instance.clearTimestamp();
       return this;
    }
    public AFKEvent$Action getAction(){
       return this.instance.getAction();
    }
    public int getActionValue(){
       return this.instance.getActionValue();
    }
    public String getDate(){
       return this.instance.getDate();
    }
    public ByteString getDateBytes(){
       return this.instance.getDateBytes();
    }
    public long getDuration(){
       return this.instance.getDuration();
    }
    public String getLevel(){
       return this.instance.getLevel();
    }
    public ByteString getLevelBytes(){
       return this.instance.getLevelBytes();
    }
    public String getPage(){
       return this.instance.getPage();
    }
    public ByteString getPageBytes(){
       return this.instance.getPageBytes();
    }
    public String getSessionId(){
       return this.instance.getSessionId();
    }
    public ByteString getSessionIdBytes(){
       return this.instance.getSessionIdBytes();
    }
    public long getTimestamp(){
       return this.instance.getTimestamp();
    }
    public AFKEvent$Builder setAction(AFKEvent$Action p0){
       this.copyOnWrite();
       this.instance.setAction(p0);
       return this;
    }
    public AFKEvent$Builder setActionValue(int p0){
       this.copyOnWrite();
       this.instance.setActionValue(p0);
       return this;
    }
    public AFKEvent$Builder setDate(String p0){
       this.copyOnWrite();
       this.instance.setDate(p0);
       return this;
    }
    public AFKEvent$Builder setDateBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setDateBytes(p0);
       return this;
    }
    public AFKEvent$Builder setDuration(long p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public AFKEvent$Builder setLevel(String p0){
       this.copyOnWrite();
       this.instance.setLevel(p0);
       return this;
    }
    public AFKEvent$Builder setLevelBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setLevelBytes(p0);
       return this;
    }
    public AFKEvent$Builder setPage(String p0){
       this.copyOnWrite();
       this.instance.setPage(p0);
       return this;
    }
    public AFKEvent$Builder setPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPageBytes(p0);
       return this;
    }
    public AFKEvent$Builder setSessionId(String p0){
       this.copyOnWrite();
       this.instance.setSessionId(p0);
       return this;
    }
    public AFKEvent$Builder setSessionIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setSessionIdBytes(p0);
       return this;
    }
    public AFKEvent$Builder setTimestamp(long p0){
       this.copyOnWrite();
       this.instance.setTimestamp(p0);
       return this;
    }
}
