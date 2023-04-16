package com.kwai.video.westeros.models.YlabModelPathConfig$Builder;
import com.kwai.video.westeros.models.YlabModelPathConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YlabModelPathConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YlabModelPathConfig$1;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Collections;
import java.lang.IllegalArgumentException;

public final class YlabModelPathConfig$Builder extends GeneratedMessageLite$Builder implements YlabModelPathConfigOrBuilder	// class@0010b1
{

    public void YlabModelPathConfig$Builder(){
       super(YlabModelPathConfig.DEFAULT_INSTANCE);
    }
    public void YlabModelPathConfig$Builder(YlabModelPathConfig$1 p0){
       super();
    }
    public YlabModelPathConfig$Builder clearMap(){
       this.copyOnWrite();
       this.instance.getMutableMapMap().clear();
       return this;
    }
    public boolean containsMap(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getMapMap().containsKey(p0);
    }
    public Map getMap(){
       return this.getMapMap();
    }
    public int getMapCount(){
       return this.instance.getMapMap().size();
    }
    public Map getMapMap(){
       return Collections.unmodifiableMap(this.instance.getMapMap());
    }
    public String getMapOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map mapMap = this.instance.getMapMap();
       if (mapMap.containsKey(p0)) {
          p1 = mapMap.get(p0);
       }
       return p1;
    }
    public String getMapOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map mapMap = this.instance.getMapMap();
       if (mapMap.containsKey(p0)) {
          return mapMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public YlabModelPathConfig$Builder putAllMap(Map p0){
       this.copyOnWrite();
       this.instance.getMutableMapMap().putAll(p0);
       return this;
    }
    public YlabModelPathConfig$Builder putMap(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableMapMap().put(p0, p1);
       return this;
    }
    public YlabModelPathConfig$Builder removeMap(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableMapMap().remove(p0);
       return this;
    }
}
