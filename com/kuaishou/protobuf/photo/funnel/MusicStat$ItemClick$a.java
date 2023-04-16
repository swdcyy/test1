package com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick$a;
import com.kuaishou.protobuf.photo.funnel.MusicStat$d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.MusicStat$ItemClick;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.MusicStat$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;
import java.lang.Boolean;
import java.lang.Number;

public final class MusicStat$ItemClick$a extends GeneratedMessageLite$Builder implements MusicStat$d	// class@000e27
{

    public void MusicStat$ItemClick$a(){
       super(MusicStat$ItemClick.DEFAULT_INSTANCE);
    }
    public void MusicStat$ItemClick$a(MusicStat$a p0){
       super(MusicStat$ItemClick.DEFAULT_INSTANCE);
    }
    public String getClickTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getClickTime();
    }
    public ByteString getClickTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getClickTimeBytes();
    }
    public String getDownloadFinishTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDownloadFinishTime();
    }
    public ByteString getDownloadFinishTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getDownloadFinishTimeBytes();
    }
    public String getMusicId(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMusicId();
    }
    public ByteString getMusicIdBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getMusicIdBytes();
    }
    public boolean getNeedDownload(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getNeedDownload();
    }
    public String getPlayTime(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPlayTime();
    }
    public ByteString getPlayTimeBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPlayTimeBytes();
    }
    public String getSource(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSource();
    }
    public ByteString getSourceBytes(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSourceBytes();
    }
    public int getStatus(){
       Object obj = PatchProxy.apply(null, this, MusicStat$ItemClick$a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getStatus();
    }
}
