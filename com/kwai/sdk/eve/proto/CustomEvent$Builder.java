package com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.CustomEvent$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class CustomEvent$Builder extends GeneratedMessageLite$Builder implements CustomEventOrBuilder	// class@0015e6
{

    public void CustomEvent$Builder(){
       super(CustomEvent.DEFAULT_INSTANCE);
    }
    public void CustomEvent$Builder(CustomEvent$1 p0){
       super();
    }
    public CustomEvent$Builder clearCustomKey(){
       this.copyOnWrite();
       this.instance.clearCustomKey();
       return this;
    }
    public CustomEvent$Builder clearCustomValue(){
       this.copyOnWrite();
       this.instance.clearCustomValue();
       return this;
    }
    public CustomEvent$Builder clearPage(){
       this.copyOnWrite();
       this.instance.clearPage();
       return this;
    }
    public CustomEvent$Builder clearReferPage(){
       this.copyOnWrite();
       this.instance.clearReferPage();
       return this;
    }
    public CustomEvent$Builder clearTaskId(){
       this.copyOnWrite();
       this.instance.clearTaskId();
       return this;
    }
    public String getCustomKey(){
       return this.instance.getCustomKey();
    }
    public ByteString getCustomKeyBytes(){
       return this.instance.getCustomKeyBytes();
    }
    public String getCustomValue(){
       return this.instance.getCustomValue();
    }
    public ByteString getCustomValueBytes(){
       return this.instance.getCustomValueBytes();
    }
    public String getPage(){
       return this.instance.getPage();
    }
    public ByteString getPageBytes(){
       return this.instance.getPageBytes();
    }
    public String getReferPage(){
       return this.instance.getReferPage();
    }
    public ByteString getReferPageBytes(){
       return this.instance.getReferPageBytes();
    }
    public String getTaskId(){
       return this.instance.getTaskId();
    }
    public ByteString getTaskIdBytes(){
       return this.instance.getTaskIdBytes();
    }
    public CustomEvent$Builder setCustomKey(String p0){
       this.copyOnWrite();
       this.instance.setCustomKey(p0);
       return this;
    }
    public CustomEvent$Builder setCustomKeyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setCustomKeyBytes(p0);
       return this;
    }
    public CustomEvent$Builder setCustomValue(String p0){
       this.copyOnWrite();
       this.instance.setCustomValue(p0);
       return this;
    }
    public CustomEvent$Builder setCustomValueBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setCustomValueBytes(p0);
       return this;
    }
    public CustomEvent$Builder setPage(String p0){
       this.copyOnWrite();
       this.instance.setPage(p0);
       return this;
    }
    public CustomEvent$Builder setPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPageBytes(p0);
       return this;
    }
    public CustomEvent$Builder setReferPage(String p0){
       this.copyOnWrite();
       this.instance.setReferPage(p0);
       return this;
    }
    public CustomEvent$Builder setReferPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setReferPageBytes(p0);
       return this;
    }
    public CustomEvent$Builder setTaskId(String p0){
       this.copyOnWrite();
       this.instance.setTaskId(p0);
       return this;
    }
    public CustomEvent$Builder setTaskIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTaskIdBytes(p0);
       return this;
    }
}
