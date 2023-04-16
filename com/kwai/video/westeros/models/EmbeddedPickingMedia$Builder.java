package com.kwai.video.westeros.models.EmbeddedPickingMedia$Builder;
import com.kwai.video.westeros.models.EmbeddedPickingMediaOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EmbeddedPickingMedia$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.PickingMediaResType;

public final class EmbeddedPickingMedia$Builder extends GeneratedMessageLite$Builder implements EmbeddedPickingMediaOrBuilder	// class@000f4a
{

    public void EmbeddedPickingMedia$Builder(){
       super(EmbeddedPickingMedia.DEFAULT_INSTANCE);
    }
    public void EmbeddedPickingMedia$Builder(EmbeddedPickingMedia$1 p0){
       super();
    }
    public EmbeddedPickingMedia$Builder clearDuration(){
       this.copyOnWrite();
       this.instance.clearDuration();
       return this;
    }
    public EmbeddedPickingMedia$Builder clearIconPath(){
       this.copyOnWrite();
       this.instance.clearIconPath();
       return this;
    }
    public EmbeddedPickingMedia$Builder clearMediaPath(){
       this.copyOnWrite();
       this.instance.clearMediaPath();
       return this;
    }
    public EmbeddedPickingMedia$Builder clearPick(){
       this.copyOnWrite();
       this.instance.clearPick();
       return this;
    }
    public EmbeddedPickingMedia$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public float getDuration(){
       return this.instance.getDuration();
    }
    public String getIconPath(){
       return this.instance.getIconPath();
    }
    public ByteString getIconPathBytes(){
       return this.instance.getIconPathBytes();
    }
    public String getMediaPath(){
       return this.instance.getMediaPath();
    }
    public ByteString getMediaPathBytes(){
       return this.instance.getMediaPathBytes();
    }
    public boolean getPick(){
       return this.instance.getPick();
    }
    public PickingMediaResType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public EmbeddedPickingMedia$Builder setDuration(float p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setIconPath(String p0){
       this.copyOnWrite();
       this.instance.setIconPath(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setIconPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setIconPathBytes(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setMediaPath(String p0){
       this.copyOnWrite();
       this.instance.setMediaPath(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setMediaPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMediaPathBytes(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setPick(boolean p0){
       this.copyOnWrite();
       this.instance.setPick(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setType(PickingMediaResType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public EmbeddedPickingMedia$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
