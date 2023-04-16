package kuaishou.perf.page.impl.PageData;
import java.io.Serializable;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.lang.System;
import java.util.Collection;
import java.util.Iterator;
import kuaishou.perf.page.impl.PageStage;
import java.lang.StringBuilder;
import kuaishou.perf.page.impl.a;
import kuaishou.perf.page.impl.b;
import kuaishou.perf.page.impl.c;

public class PageData implements Serializable	// class@001be5
{
    public int appStatus;
    public Map args;
    public Map b;
    public long c;
    public Map common;
    public String scene;
    public Map stageMap;
    public String subScene;
    public long totalCost;
    public static String d = "PageData";

    public void PageData(){
       super();
       this.args = new ConcurrentHashMap();
       this.stageMap = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.common = new HashMap();
    }
    public void addArg(String p0,String p1){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          this.args.put(p0, p1);
       }
       return;
    }
    public void addArg(Map p0){
       if (p0 != null && !p0.isEmpty()) {
          this.args.putAll(p0);
       }
       return;
    }
    public void addcommon(String p0,Object p1){
       if (p1 != null) {
          this.common.put(p0, p1);
       }
       return;
    }
    public PageData copyUploadInfo(){
       PageData pageData = new PageData();
       pageData.appStatus = this.appStatus;
       pageData.scene = this.scene;
       pageData.subScene = this.subScene;
       pageData.args = this.args;
       pageData.stageMap = this.stageMap;
       pageData.totalCost = this.totalCost;
       pageData.common = this.common;
       return pageData;
    }
    public void end(){
       this.totalCost = System.currentTimeMillis() - this.c;
    }
    public boolean isValid(){
       PageStage pageStage;
       if (!TextUtils.isEmpty(this.scene) && (this.stageMap.isEmpty() || this.c - null <= 0)) {
          return false;
       }
       Iterator iterator = this.stageMap.values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          pageStage = iterator.next();
          if (pageStage != null && !pageStage.isValid()) {
             break ;
          }
       }
       a.b(PageData.d, "stage:"+pageStage.alias+" not end");
       return false;
    }
    public void recordStageBegin(String p0){
       String str = this.recordStageStart(p0);
       if (!TextUtils.isEmpty(str)) {
          this.stageMap.put(str, new PageStage(p0));
       }
       return;
    }
    public void recordStageDirect(String p0,long p1,long p2){
       String str = null;
       if (p1 - str <= 0 || p2 - str <= 0) {
          a.b(PageData.d, "recordStageDirect fail as timestamp invalid");
          return;
       }else {
          str = this.recordStageStart(p0);
          if (!TextUtils.isEmpty(str)) {
             PageStage pageStage = new PageStage(p0, p1, p2);
             this.stageMap.put(str, v8);
          }
          return;
       }
    }
    public boolean recordStageEnd(String p0){
       if (TextUtils.isEmpty(p0)) {
          return true;
       }
       String str = this.b.get(p0);
       boolean b = false;
       if (TextUtils.isEmpty(str)) {
          return b;
       }
       PageStage pageStage = this.stageMap.get(str);
       if (pageStage == null) {
          return b;
       }
       if (!pageStage.end()) {
          a.c(PageData.d, "skip end stage:"+p0+" as had already end");
       }
       return true;
    }
    public String recordStageStart(String p0){
       String str = null;
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       if (this.b.containsKey(p0)) {
          a.c(PageData.d, "skip begin stage:"+p0+" as had already begin");
          return str;
       }else if(this.b.size() >= b.g.c){
          a.c(PageData.d, "begin stage:"+p0+"warning as exceed max stage nums");
       }
       if (this.c - null <= 0) {
          this.c = System.currentTimeMillis();
       }
       String str1 = "stage"+(this.b.size() + 1);
       this.b.put(p0, str1);
       return str1;
    }
    public void reset(){
       this.args = new ConcurrentHashMap();
       this.stageMap = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.c = 0;
       this.totalCost = 0;
       this.common = new HashMap();
    }
    public void start(){
       if (this.c <= 0) {
          this.c = System.currentTimeMillis();
       }
       return;
    }
}
