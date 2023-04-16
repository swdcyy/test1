package com.kwaishou.merchant.troubleshooting.core.model.Node;
import java.io.Serializable;
import java.lang.Object;
import java.util.UUID;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.kwaishou.merchant.troubleshooting.core.model.NodeType;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import com.kwaishou.merchant.troubleshooting.core.model.LogModel;
import java.lang.StringBuilder;
import com.kwaishou.merchant.troubleshooting.core.model.LogType;
import java.lang.Enum;
import java.util.Map;
import java.lang.Integer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Long;
import java.util.Iterator;
import java.lang.Iterable;
import t08.b;
import t08.b$a;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting$ReportConfig;
import u08.c;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Character;
import java.lang.Byte;
import java.lang.Class;
import java.util.Objects;
import trd.y;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Throwable;
import nsd.s0;

public class Node implements Serializable	// class@001353
{
    public List b;
    public ConcurrentHashMap c;
    public final List children;
    public int d;
    public int e;
    public final List extraInfo;
    public LogModel f;
    public String id;
    public NodeType nodeType;
    public CopyOnWriteArrayList onlineLogs;
    public String tag;
    public long timeStamp;

    public void Node(){
       super();
       this.id = UUID.randomUUID().toString();
       List list = Collections.synchronizedList(new ArrayList());
       a.o(list, "synchronizedList\(arrayListOf\(\)\)");
       this.children = list;
       list = Collections.synchronizedList(new ArrayList());
       a.o(list, "synchronizedList\(arrayListOf\(\)\)");
       this.extraInfo = list;
       this.timeStamp = System.currentTimeMillis();
       this.tag = "";
       this.nodeType = NodeType.NONE;
    }
    public final int a(List p0,int p1,int p2){
       int i = (p0 == null || p0.isEmpty())? 1: 0;
       if (i) {
          return 0;
       }else if(p0.size() < p2 || p0.size() < (p2 + p1)){
          return p1;
       }else if(this.c == null){
          this.c = new ConcurrentHashMap();
       }
       p2 = p0.size();
       Collection uCollection = null;
       if (p1 < p2) {
          List list = uCollection;
          int i1 = p1 + 1;
          LogModel logModel = p0.get(p1);
          while (logModel.getMsgHashCode() == -1) {
             logModel.setMsgHashCode((logModel.getTag()+'_'+logModel.getLogType().name()+'_'+logModel.getMsg()).hashCode());
             break ;
             logModel = i1;
          }
          Map params = logModel.getParams();
          int i2 = (params == null || params.isEmpty())? 1: 0;
          if (i2) {
             Node tc = this.c;
             LogModel logModel1 = (tc == null)? uCollection: tc.get(Integer.valueOf(logModel.getMsgHashCode()));
             String str = (logModel1 != null && logModel.isBasicSame(logModel1))? 1: null;
             if (str) {
                if (logModel1 != null) {
                   CopyOnWriteArrayList mergedTimeSt = logModel1.getMergedTimeStamps();
                   if (mergedTimeSt != null) {
                      mergedTimeSt.add(Long.valueOf(logModel.getTimeStamp()));
                   }
                }
                if (list == null) {
                   list = new ArrayList();
                }
                list.add(logModel);
             }else {
                tc = this.c;
                if (tc != null) {
                   logModel = tc.put(Integer.valueOf(logModel.getMsgHashCode()), logModel);
                }
             }
          }
          if (i1 >= p2) {
             uCollection = list;
          }else {
             goto label_00de ;
          }
       }
       if (uCollection != null) {
          p0.removeAll(uCollection);
       }
       return p0.size();
    }
    public final void addChildrenNode(Node p0){
       Map map;
       if (p0 == null) {
          return;
       }
       Iterator iterator = this.children.iterator();
       while (true) {
          if (iterator.hasNext()) {
             map = iterator.next();
             if (!a.g(map.getId(), p0.getId())) {
                continue ;
             }
          }else {
             map = null;
          }
          if (map != null) {
             break ;
          }else {
             this.children.add(p0);
             return;
          }
       }
       b$a.f(b.a, a.C(p0.id, " has exited"), null, 2, null);
       return;
    }
    public final void addExtraInfo(LogModel p0){
       String str2;
       Map map1;
       char c;
       Node node = this;
       LogModel logModel = p0;
       if (!logModel) {
       }else {
          node.f = logModel;
          TroubleShooting a = TroubleShooting.a;
          TroubleShooting$ReportConfig reportConfig = a.y();
          boolean b = p0.isImportantLog();
          boolean b1 = c.d();
          Map map = null;
          if (b1 && !b) {
             logModel.setParams(map);
          }
          if (!reportConfig.isOpenOpt()) {
             this.getExtraInfo().add(logModel);
             return;
          }else {
             int i = 0;
             if (b1) {
                if (p0.isMarkSuccessLog()) {
                   Node b2 = node.b;
                   if (b2 != null) {
                      b2.clear();
                   }
                }
                int singleMsgLen = (b)? reportConfig.getSingleMsgLength(): reportConfig.getUnImportantLogMaxLength();
                Map params = p0.getParams();
                String str = 1;
                String str1 = (params == null || params.isEmpty())? 1: null;
                if (!str1) {
                   if ((p0.getMsg()).length() < singleMsgLen) {
                      str1 = p0.getMsg();
                      int singleParams = a.y().getSingleParamsValueLength();
                      Map params1 = p0.getParams();
                      int i1 = (params1 == null || params1.isEmpty())? 1: 0;
                      if (!i1 && (singleParams <= 0 || (params1.size() == str && params1.containsKey("DACLogLevel")))) {
                         str2 = "";
                      }else {
                         StringBuilder str3 = " [params:{";
                         Iterator iterator = params1.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry = iterator.next();
                            str3 = str3+"\""+uEntry.getKey()+"\":";
                            String value = uEntry.getValue();
                            if (!value instanceof String && (!value instanceof Number && (!value instanceof Boolean && (!value instanceof Character && !value instanceof Byte)))) {
                               int i2 = (value != null && value.getClass().isEnum() == str)? 1: 0;
                               if (i2) {
                               label_0118 :
                                  str = value.toString();
                                  if (str.length() > singleParams) {
                                     value = str.substring(i, singleParams);
                                     a.o(value, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                                     str3 = str3+value+"\(cut\)";
                                  }else {
                                     str3 = str3+value;
                                  }
                               }else {
                                  c = '"';
                                  StringBuilder str4 = c;
                                  value = (value == null)? null: value.getClass().getSimpleName();
                                  str3 = str3+str4+value+c;
                               }
                            }else {
                               goto label_0118 ;
                            }
                            str = 1;
                         }
                         str2 = str3+"}]";
                         a.o(str2, "builder.toString\(\)");
                      }
                      logModel.setMsg(a.C(str1, str2));
                      map1 = null;
                   }else {
                      map1 = map;
                   }
                   logModel.setParams(map1);
                }
                if ((p0.getMsg()).length() > singleMsgLen) {
                   str2 = p0.getMsg();
                   Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                   str2 = str2.substring(i, singleMsgLen);
                   a.o(str2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                   logModel.setMsg(a.C(str2, "\(cut\)"));
                }
                if (b || p0.isMarkSuccessLog()) {
                   this.getExtraInfo().add(logModel);
                }else if(node.b == null){
                   node.b = Collections.synchronizedList(new ArrayList());
                }
                Node b4 = node.b;
                if (b4 != null) {
                   b4.add(logModel);
                }
             }else {
                this.getExtraInfo().add(logModel);
             }
             if (reportConfig.getSameMerge()) {
                node.d = node.a(this.getExtraInfo(), node.d, 5);
                node.e = node.a(node.b, node.e, 5);
             }
             if (b1) {
                Node b3 = node.b;
                if (b3 != null) {
                   i = b3.size();
                }
                if (i > reportConfig.getSingleNodeUnImportantLogMaxNum()) {
                   b3 = node.b;
                   if (b3 != null) {
                      y.M0(b3);
                   }
                }
             }
          }
       }
    label_01df :
       return;
    }
    public final void clear(){
       Node tonlineLogs = this.onlineLogs;
       if (tonlineLogs == null) {
       }else {
          tonlineLogs.clear();
       }
       this.extraInfo.clear();
       tonlineLogs = this.b;
       if (tonlineLogs != null) {
          tonlineLogs.clear();
       }
       tonlineLogs = this.c;
       if (tonlineLogs != null) {
          tonlineLogs.clear();
       }
       tonlineLogs = this.b;
       if (tonlineLogs != null) {
          tonlineLogs.clear();
       }
       tonlineLogs = this.c;
       if (tonlineLogs != null) {
          tonlineLogs.clear();
       }
       this.d = 0;
       this.e = 0;
       this.f = null;
       return;
    }
    public final void generateOnlineMsg(){
       try{
          Node tonlineLogs = this.onlineLogs;
          if (tonlineLogs == null) {
          }else {
             tonlineLogs.clear();
          }
          if (this.onlineLogs == null) {
             this.onlineLogs = new CopyOnWriteArrayList();
          }
          int reportMode = TroubleShooting.a.y().getReportMode();
          Node tb = this.b;
          if (tb != null) {
             this.getExtraInfo().addAll(tb);
             tb.clear();
          }
          Iterator iterator = this.extraInfo.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             Node node = 1;
             if (reportMode) {
                if (reportMode != node) {
                label_004c :
                   node = null;
                }
             }else if(obj.isImportantLog() || a.g(this.f, obj)){
             }
             if (node) {
                node = this.onlineLogs;
                if (node != null) {
                   node.add(obj.getOnlineMsg());
                }
             }
             i = i1;
          }
       }catch(java.lang.Exception e0){
          b$a.c(b.a, "Node generateOnlineMsg error", e0, null, 4, null);
       }
       return;
    }
    public final List getChildren(){
       return this.children;
    }
    public final List getExtraInfo(){
       return this.extraInfo;
    }
    public final String getId(){
       Node tid = this.id;
       if (tid == null) {
          tid = "";
       }
       return tid;
    }
    public final NodeType getNodeType(){
       return this.nodeType;
    }
    public final String getTag(){
       return this.tag;
    }
    public final long getTimeStamp(){
       return this.timeStamp;
    }
    public final boolean isActiveNode(){
       Node tchildren = this.children;
       boolean b = false;
       tchildren = (tchildren == null || tchildren.isEmpty())? 1: null;
       if (tchildren) {
          tchildren = this.extraInfo;
          tchildren = (tchildren == null || tchildren.isEmpty())? 1: 0;
          if (tchildren) {
          label_0023 :
             return b;
          }
       }
       b = true;
       goto label_0023 ;
    }
    public final void removeChildrenNode(String p0){
       Object obj;
       if (p0 == null) {
       }else {
          List children = this.getChildren();
          Iterator iterator = this.getChildren().iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                if (!a.g(obj.id, p0)) {
                   continue ;
                }
             }else {
                obj = null;
             }
             Objects.requireNonNull(children, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
             s0.a(children).remove(obj);
             break ;
          }
       }
       return;
    }
    public final void setId(String p0){
       this.id = p0;
    }
    public final void setNodeType(NodeType p0){
       a.p(p0, "<set-?>");
       this.nodeType = p0;
    }
    public final void setTag(String p0){
       a.p(p0, "<set-?>");
       this.tag = p0;
    }
    public final void setTimeStamp(long p0){
       this.timeStamp = p0;
    }
}
