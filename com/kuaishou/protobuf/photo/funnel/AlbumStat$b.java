package com.kuaishou.protobuf.photo.funnel.AlbumStat$b;
import com.kuaishou.protobuf.photo.funnel.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.AlbumStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode;
import java.lang.Integer;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class AlbumStat$b extends GeneratedMessageLite$Builder implements a	// class@000e08
{

    public void AlbumStat$b(){
       super(AlbumStat.DEFAULT_INSTANCE);
    }
    public void AlbumStat$b(AlbumStat$a p0){
       super(AlbumStat.DEFAULT_INSTANCE);
    }
    public long getCntPhoto(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getCntPhoto();
    }
    public long getCntVideo(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getCntVideo();
    }
    public boolean getFinalSelMode(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getFinalSelMode();
    }
    public boolean getInitSelMode(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getInitSelMode();
    }
    public boolean getIsEnter(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsEnter();
    }
    public int getMaxLimit(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getMaxLimit();
    }
    public AlbumStat$NextMode getNextMode(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getNextMode();
    }
    public int getNextModeValue(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getNextModeValue();
    }
    public String getSelectPath(int p0){
       if (PatchProxy.isSupport(AlbumStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AlbumStat$b.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getSelectPath(p0);
    }
    public ByteString getSelectPathBytes(int p0){
       if (PatchProxy.isSupport(AlbumStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AlbumStat$b.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getSelectPathBytes(p0);
    }
    public int getSelectPathCount(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getSelectPathCount();
    }
    public List getSelectPathList(){
       Object obj = PatchProxy.apply(null, this, AlbumStat$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getSelectPathList());
    }
}
