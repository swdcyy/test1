package com.kwai.video.westeros.error.WesterosErrorCode$Project;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Class;
import java.util.EnumSet;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Integer;
import java.util.Map;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WesterosErrorCode$Project extends Enum	// class@000e7a
{
    public final int code;
    public static final WesterosErrorCode$Project[] $VALUES;
    public static final WesterosErrorCode$Project kDaenerys;
    public static final WesterosErrorCode$Project kKSClipSDK;
    public static final WesterosErrorCode$Project kMax;
    public static final WesterosErrorCode$Project kNone;
    public static final WesterosErrorCode$Project kVideoRenderSDK;
    public static final WesterosErrorCode$Project kWesteros;
    public static final Map lookup;

    static {
       int i = 0;
       WesterosErrorCode$Project project = new WesterosErrorCode$Project("kDaenerys", i, i);
       WesterosErrorCode$Project.kDaenerys = project;
       WesterosErrorCode$Project project1 = new WesterosErrorCode$Project("kWesteros", 1, 1);
       WesterosErrorCode$Project.kWesteros = project1;
       WesterosErrorCode$Project project2 = new WesterosErrorCode$Project("kVideoRenderSDK", 2, 2);
       WesterosErrorCode$Project.kVideoRenderSDK = project2;
       WesterosErrorCode$Project project3 = new WesterosErrorCode$Project("kKSClipSDK", 3, 3);
       WesterosErrorCode$Project.kKSClipSDK = project3;
       WesterosErrorCode$Project project4 = new WesterosErrorCode$Project("kMax", 4, 63);
       WesterosErrorCode$Project.kMax = project4;
       WesterosErrorCode$Project project5 = new WesterosErrorCode$Project("kNone", 5, -1);
       WesterosErrorCode$Project.kNone = project5;
       WesterosErrorCode$Project[] projectArray = new WesterosErrorCode$Project[]{project,project1,project2,project3,project4,project5};
       WesterosErrorCode$Project.$VALUES = projectArray;
       WesterosErrorCode$Project.lookup = new HashMap();
       Iterator iterator = EnumSet.allOf(WesterosErrorCode$Project.class).iterator();
       while (iterator.hasNext()) {
          project1 = iterator.next();
          WesterosErrorCode$Project.lookup.put(Integer.valueOf(project1.code), project1);
       }
    }
    public void WesterosErrorCode$Project(String p0,int p1,int p2){
       super(p0, p1);
       this.code = p2;
    }
    public static WesterosErrorCode$Project fromCode(int p0){
       WesterosErrorCode$Project project = WesterosErrorCode$Project.class;
       if (PatchProxy.isSupport(project)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, project, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       WesterosErrorCode$Project project1 = WesterosErrorCode$Project.lookup.get(Integer.valueOf(p0));
       if (project1 == null) {
          project1 = WesterosErrorCode$Project.kNone;
       }
       return project1;
    }
    public static WesterosErrorCode$Project valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode$Project.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WesterosErrorCode$Project.class, p0);
    }
    public static WesterosErrorCode$Project[] values(){
       Object obj = PatchProxy.apply(null, null, WesterosErrorCode$Project.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Project.$VALUES.clone();
    }
    public int getCode(){
       return this.code;
    }
}
