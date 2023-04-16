package com.kwai.video.westeros.models.ImageLocaleTips$Builder;
import com.kwai.video.westeros.models.ImageLocaleTipsOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.ImageLocaleTips;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.ImageLocaleTips$1;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Collections;
import java.lang.IllegalArgumentException;

public final class ImageLocaleTips$Builder extends GeneratedMessageLite$Builder implements ImageLocaleTipsOrBuilder	// class@000f8f
{

    public void ImageLocaleTips$Builder(){
       super(ImageLocaleTips.DEFAULT_INSTANCE);
    }
    public void ImageLocaleTips$Builder(ImageLocaleTips$1 p0){
       super();
    }
    public ImageLocaleTips$Builder clearDisplayDuration(){
       this.copyOnWrite();
       this.instance.clearDisplayDuration();
       return this;
    }
    public ImageLocaleTips$Builder clearTips(){
       this.copyOnWrite();
       this.instance.getMutableTipsMap().clear();
       return this;
    }
    public boolean containsTips(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getTipsMap().containsKey(p0);
    }
    public int getDisplayDuration(){
       return this.instance.getDisplayDuration();
    }
    public Map getTips(){
       return this.getTipsMap();
    }
    public int getTipsCount(){
       return this.instance.getTipsMap().size();
    }
    public Map getTipsMap(){
       return Collections.unmodifiableMap(this.instance.getTipsMap());
    }
    public String getTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map tipsMap = this.instance.getTipsMap();
       if (tipsMap.containsKey(p0)) {
          p1 = tipsMap.get(p0);
       }
       return p1;
    }
    public String getTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map tipsMap = this.instance.getTipsMap();
       if (tipsMap.containsKey(p0)) {
          return tipsMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public ImageLocaleTips$Builder putAllTips(Map p0){
       this.copyOnWrite();
       this.instance.getMutableTipsMap().putAll(p0);
       return this;
    }
    public ImageLocaleTips$Builder putTips(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableTipsMap().put(p0, p1);
       return this;
    }
    public ImageLocaleTips$Builder removeTips(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableTipsMap().remove(p0);
       return this;
    }
    public ImageLocaleTips$Builder setDisplayDuration(int p0){
       this.copyOnWrite();
       this.instance.setDisplayDuration(p0);
       return this;
    }
}
