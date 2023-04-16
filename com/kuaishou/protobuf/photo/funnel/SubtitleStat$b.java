package com.kuaishou.protobuf.photo.funnel.SubtitleStat$b;
import com.kuaishou.protobuf.photo.funnel.g;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$InfoItem;
import java.lang.Integer;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Result;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$Type;

public final class SubtitleStat$b extends GeneratedMessageLite$Builder implements g	// class@000e73
{

    public void SubtitleStat$b(){
       super(SubtitleStat.DEFAULT_INSTANCE);
    }
    public void SubtitleStat$b(SubtitleStat$a p0){
       super(SubtitleStat.DEFAULT_INSTANCE);
    }
    public int getAudioCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getAudioCount();
    }
    public boolean getEntranceClick(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getEntranceClick();
    }
    public boolean getIsMute(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsMute();
    }
    public SubtitleStat$InfoItem getItems(int p0){
       if (PatchProxy.isSupport(SubtitleStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SubtitleStat$b.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getItems(p0);
    }
    public int getItemsCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getItemsCount();
    }
    public List getItemsList(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getItemsList());
    }
    public long getRecCost(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getRecCost();
    }
    public long getRemuxCost(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getRemuxCost();
    }
    public SubtitleStat$Result getResults(int p0){
       if (PatchProxy.isSupport(SubtitleStat$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SubtitleStat$b.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getResults(p0);
    }
    public int getResultsCount(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getResultsCount();
    }
    public List getResultsList(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getResultsList());
    }
    public SubtitleStat$Type getType(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getType();
    }
    public int getTypeValue(){
       Object obj = PatchProxy.apply(null, this, SubtitleStat$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getTypeValue();
    }
}
