package com.kuaishou.bowl.data.center.data.model.page.component.TrackInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class TrackInfo implements Serializable	// class@0011f4
{
    public Track clickEvent;
    public Track common;
    public boolean isReverted;
    public Track module;
    public Track showEvent;
    public static final long serialVersionUID = 0xfa98e7321807647e;

    public void TrackInfo(){
       super();
    }
    public List assembly(Track p0,Track p1,Track p2){
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TrackInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == null) {
          return null;
       }
       obj = new ArrayList();
       Track elementPacka = p2.elementPackage;
       if (elementPacka != null && elementPacka.keySet() != null) {
          p0 = this.revertElementPackage(p0, p2);
          p1 = this.revertElementPackage(p1, p2);
       }
       elementPacka = p2.contentPackage;
       if (elementPacka != null && elementPacka.keySet() != null) {
          p0 = this.revertContentPackage(p0, p2);
          p1 = this.revertContentPackage(p1, p2);
       }
       obj.add(p0);
       obj.add(p1);
       return obj;
    }
    public void assemblyCommonData(){
       if (PatchProxy.applyVoid(null, this, TrackInfo.class, "1")) {
          return;
       }
       TrackInfo tcommon = this.common;
       if (tcommon == null) {
          return;
       }
       if (this.isReverted != null) {
          return;
       }
       List list = this.assembly(this.clickEvent, this.showEvent, tcommon);
       if (list != null && list.size() == 2) {
          this.clickEvent = list.get(0);
          this.showEvent = list.get(1);
       }
       Track areas = this.common.areas;
       if (areas != null && areas.keySet() != null) {
          if (this.clickEvent == null) {
             this.clickEvent = new Track();
          }
          if (this.showEvent == null) {
             this.showEvent = new Track();
          }
          areas = this.clickEvent.areas;
          if (areas == null || areas.size() < 1) {
             this.clickEvent.areas = new HashMap();
          }
          areas = this.showEvent.areas;
          if (areas == null || areas.size() < 1) {
             this.showEvent.areas = new HashMap();
          }
          Iterator iterator = this.common.areas.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Track track = (this.clickEvent.areas.keySet() != null && this.clickEvent.areas.keySet().contains(str))? this.clickEvent.areas.get(str): null;
             Track track1 = (this.showEvent.areas.keySet() != null && this.showEvent.areas.keySet().contains(str))? this.showEvent.areas.get(str): null;
             List list1 = this.assembly(track, track1, this.common.areas.get(str));
             if (list1 != null && list1.size() == 2) {
                this.clickEvent.areas.put(str, list1.get(0));
                this.showEvent.areas.put(str, list1.get(1));
             }
          }
          this.isReverted = true;
       }
       return;
    }
    public Track revertContentPackage(Track p0,Track p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, TrackInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p1.contentPackage.keySet().iterator();
          while (obj.hasNext()) {
             String str = obj.next();
             Track contentPacka = p0.contentPackage;
             if (contentPacka != null && (contentPacka.containsKey(str) && p0.contentPackage.get(str) != null)) {
                if (p0.contentPackage.get(str) instanceof Map && p1.contentPackage.get(str) instanceof Map) {
                   p0.contentPackage.get(str).putAll(p1.contentPackage.get(str));
                }
             }else if(p1.contentPackage.get(str) != null){
                if (p0.contentPackage == null) {
                   p0.contentPackage = new HashMap();
                }
                p0.contentPackage.put(str, p1.contentPackage.get(str));
             }
          }
       }else {
          p0 = new Track();
          p0.contentPackage = p1.contentPackage;
       }
       return p0;
    }
    public Track revertElementPackage(Track p0,Track p1){
       Track obj = PatchProxy.applyTwoRefs(p0, p1, this, TrackInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          String str = "params";
          if (p1.elementPackage.containsKey(str) && p1.elementPackage.get(str) != null) {
             obj = p0.elementPackage;
             if (obj != null && (obj.containsKey(str) && p0.elementPackage.get(str) != null)) {
                if (p0.elementPackage.get(str) instanceof Map && p1.elementPackage.get(str) instanceof Map) {
                   p0.elementPackage.get(str).putAll(p1.elementPackage.get(str));
                }
             }else {
                obj = p0.elementPackage;
                if (obj != null) {
                   obj.put(str, p1.elementPackage.get(str));
                }else {
                   p0.elementPackage = this.common.elementPackage;
                }
             }
          }
          if (p1.elementPackage.containsKey("action2") && p1.elementPackage.get("action2") != null) {
             String str1 = "";
             if (!str1.equals(p1.elementPackage.get("action2"))) {
                p1 = p0.elementPackage;
                if (p1 != null && (!p1.containsKey("action2") || (p0.elementPackage.containsKey("action2") && (p0.elementPackage.get("action2") == null || str1.equals(p0.elementPackage.get("action2")))))) {
                   p1 = p0.elementPackage;
                   p1.put("action2", p1.get("action2"));
                }else if(p0.elementPackage == null){
                   p0.elementPackage = this.common.elementPackage;
                }
             }
          }
       }else {
          p0 = new Track();
          p0.elementPackage = p1.elementPackage;
       }
    label_00d5 :
       return p0;
    }
}
