package com.kuaishou.protobuf.photo.funnel.MusicStat$b;
import com.kuaishou.protobuf.photo.funnel.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.MusicStat$a;
import com.kuaishou.protobuf.photo.funnel.MusicStat$Download;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick;
import com.google.protobuf.ByteString;

public final class MusicStat$b extends GeneratedMessageLite$Builder implements d	// class@000e2a
{

    public void MusicStat$b(){
       super(MusicStat.DEFAULT_INSTANCE);
    }
    public void MusicStat$b(MusicStat$a p0){
       super(MusicStat.DEFAULT_INSTANCE);
    }
    public MusicStat$Download getDownloads(int p0){
       if (PatchProxy.isSupport(MusicStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MusicStat$b.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getDownloads(p0);
    }
    public int getDownloadsCount(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getDownloadsCount();
    }
    public List getDownloadsList(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getDownloadsList());
    }
    public MusicStat$ItemClick getItemClicks(int p0){
       if (PatchProxy.isSupport(MusicStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MusicStat$b.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItemClicks(p0);
    }
    public int getItemClicksCount(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemClicksCount();
    }
    public List getItemClicksList(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemClicksList());
    }
    public String getLibClickTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibClickTime();
    }
    public ByteString getLibClickTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibClickTimeBytes();
    }
    public String getLibDataFinishTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibDataFinishTime();
    }
    public ByteString getLibDataFinishTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibDataFinishTimeBytes();
    }
    public String getLibShowTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibShowTime();
    }
    public ByteString getLibShowTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibShowTimeBytes();
    }
    public String getLibanOpCerateTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibanOpCerateTime();
    }
    public ByteString getLibanOpCerateTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getLibanOpCerateTimeBytes();
    }
}
