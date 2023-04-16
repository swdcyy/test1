package com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import pr4.k;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$a;
import com.kuaishou.protobuf.photo.funnel.AiCutStat;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.kuaishou.protobuf.photo.funnel.EncodeStat;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Map;
import com.kuaishou.protobuf.photo.funnel.PublishStat;
import com.kuaishou.protobuf.photo.funnel.RecordStat;
import java.util.Collections;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import com.kuaishou.protobuf.photo.funnel.Action;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.protobuf.photo.funnel.AlbumStat;
import com.kuaishou.protobuf.photo.funnel.ViewClick;
import com.kuaishou.protobuf.photo.funnel.CoverStat;
import com.kuaishou.protobuf.photo.funnel.BeautyStat;
import com.kuaishou.protobuf.photo.funnel.FilterStat;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat;
import com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.kuaishou.protobuf.photo.funnel.PageInfo;
import com.kuaishou.protobuf.photo.funnel.Performance;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.ResourceDownloadStat;
import com.kuaishou.protobuf.photo.funnel.StickerStat;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat;
import com.kuaishou.protobuf.photo.funnel.TemplateStat;
import com.kuaishou.protobuf.photo.funnel.TextStat;

public final class PostFunnelStat$c extends GeneratedMessageLite$Builder implements k	// class@000e39
{

    public void PostFunnelStat$c(){
       super(PostFunnelStat.DEFAULT_INSTANCE);
    }
    public void PostFunnelStat$c(PostFunnelStat$a p0){
       super(PostFunnelStat.DEFAULT_INSTANCE);
    }
    public PostFunnelStat$c a(AiCutStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setAiCut(p0);
       return this;
    }
    public PostFunnelStat$c b(BodyStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setEditBody(p0);
       return this;
    }
    public PostFunnelStat$c c(EncodeStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setEncode(p0);
       return this;
    }
    public boolean containsAbValues(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "177");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       return this.instance.getAbValuesMap().containsKey(p0);
    }
    public boolean containsPayloads(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "115");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       return this.instance.getPayloadsMap().containsKey(p0);
    }
    public PostFunnelStat$c d(boolean p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PostFunnelStat$c.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.copyOnWrite();
       this.instance.setIsPhoto(p0);
       return this;
    }
    public PostFunnelStat$c e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setPreTaskId(p0);
       return this;
    }
    public PostFunnelStat$c f(PublishStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "104");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setPublish(p0);
       return this;
    }
    public PostFunnelStat$c g(RecordStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setRecord(p0);
       return this;
    }
    public Map getAbValues(){
       Map map = PatchProxy.apply(null, this, PostFunnelStat$c.class, "180");
       if (map != PatchProxyResult.class) {
       }else {
          map = Collections.unmodifiableMap(this.instance.getAbValuesMap());
       }
       return map;
    }
    public int getAbValuesCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getAbValuesMap().size();
    }
    public Map getAbValuesMap(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "180");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.instance.getAbValuesMap());
    }
    public String getAbValuesOrDefault(String p0,String p1){
       Map obj = PatchProxy.applyTwoRefs(p0, p1, this, PostFunnelStat$c.class, "181");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.instance.getAbValuesMap();
       if (obj.containsKey(p0)) {
          p1 = obj.get(p0);
       }
       return p1;
    }
    public String getAbValuesOrThrow(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "182");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.instance.getAbValuesMap();
       if (obj.containsKey(p0)) {
          return obj.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Action getActions(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "130");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getActions(p0);
    }
    public int getActionsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getActionsCount();
    }
    public List getActionsList(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "128");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getActionsList());
    }
    public AiCutStat getAiCut(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getAiCut();
    }
    public AlbumStat getAlbum(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getAlbum();
    }
    public ViewClick getClickEvents(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "142");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getClickEvents(p0);
    }
    public int getClickEventsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "141");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getClickEventsCount();
    }
    public List getClickEventsList(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "140");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getClickEventsList());
    }
    public CoverStat getCover(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getCover();
    }
    public BeautyStat getEditBeauty(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEditBeauty();
    }
    public BodyStat getEditBody(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEditBody();
    }
    public FilterStat getEditFilter(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEditFilter();
    }
    public MakeUpStat getEditMakeup(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEditMakeup();
    }
    public MusicStat getEditMusic(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEditMusic();
    }
    public EncodeStat getEncode(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getEncode();
    }
    public boolean getIsEditEnter(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsEditEnter();
    }
    public boolean getIsPhoto(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.getIsPhoto();
    }
    public PageInfo getPages(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "154");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getPages(p0);
    }
    public int getPagesCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getPagesCount();
    }
    public List getPagesList(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "152");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getPagesList());
    }
    public Map getPayloads(){
       Map map = PatchProxy.apply(null, this, PostFunnelStat$c.class, "118");
       if (map != PatchProxyResult.class) {
       }else {
          map = Collections.unmodifiableMap(this.instance.getPayloadsMap());
       }
       return map;
    }
    public int getPayloadsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getPayloadsMap().size();
    }
    public Map getPayloadsMap(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableMap(this.instance.getPayloadsMap());
    }
    public String getPayloadsOrDefault(String p0,String p1){
       Map obj = PatchProxy.applyTwoRefs(p0, p1, this, PostFunnelStat$c.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.instance.getPayloadsMap();
       if (obj.containsKey(p0)) {
          p1 = obj.get(p0);
       }
       return p1;
    }
    public String getPayloadsOrThrow(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = this.instance.getPayloadsMap();
       if (obj.containsKey(p0)) {
          return obj.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Performance getPerfs(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "166");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getPerfs(p0);
    }
    public int getPerfsCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getPerfsCount();
    }
    public List getPerfsList(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getPerfsList());
    }
    public String getPreTaskId(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPreTaskId();
    }
    public ByteString getPreTaskIdBytes(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "124");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPreTaskIdBytes();
    }
    public PublishStat getPublish(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getPublish();
    }
    public RecordStat getRecord(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getRecord();
    }
    public ResourceDownloadStat getResourceDownloadStat(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "187");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getResourceDownloadStat(p0);
    }
    public int getResourceDownloadStatCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "186");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getResourceDownloadStatCount();
    }
    public List getResourceDownloadStatList(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "185");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getResourceDownloadStatList());
    }
    public String getSourcePath(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getSourcePath(p0);
    }
    public ByteString getSourcePathBytes(int p0){
       if (PatchProxy.isSupport(PostFunnelStat$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostFunnelStat$c.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.instance.getSourcePathBytes(p0);
    }
    public int getSourcePathCount(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.instance.getSourcePathCount();
    }
    public List getSourcePathList(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Collections.unmodifiableList(this.instance.getSourcePathList());
    }
    public StickerStat getSticker(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSticker();
    }
    public SubtitleStat getSubtitle(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getSubtitle();
    }
    public String getTaskId(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTaskId();
    }
    public ByteString getTaskIdBytes(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTaskIdBytes();
    }
    public TemplateStat getTemplate(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getTemplate();
    }
    public TextStat getText(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getText();
    }
    public long getType(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.instance.getType();
    }
    public PostFunnelStat$c h(SubtitleStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setSubtitle(p0);
       return this;
    }
    public boolean hasAiCut(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasAiCut();
    }
    public boolean hasAlbum(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "108");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasAlbum();
    }
    public boolean hasCover(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasCover();
    }
    public boolean hasEditBeauty(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasEditBeauty();
    }
    public boolean hasEditBody(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasEditBody();
    }
    public boolean hasEditFilter(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasEditFilter();
    }
    public boolean hasEditMakeup(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasEditMakeup();
    }
    public boolean hasEditMusic(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasEditMusic();
    }
    public boolean hasEncode(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasEncode();
    }
    public boolean hasPublish(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasPublish();
    }
    public boolean hasRecord(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasRecord();
    }
    public boolean hasSticker(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasSticker();
    }
    public boolean hasSubtitle(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasSubtitle();
    }
    public boolean hasTemplate(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasTemplate();
    }
    public boolean hasText(){
       Object obj = PatchProxy.apply(null, this, PostFunnelStat$c.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.instance.hasText();
    }
    public PostFunnelStat$c i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setTaskId(p0);
       return this;
    }
    public PostFunnelStat$c j(TemplateStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setTemplate(p0);
       return this;
    }
    public PostFunnelStat$c k(TextStat p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostFunnelStat$c.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setText(p0);
       return this;
    }
}
