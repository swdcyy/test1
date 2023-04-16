package ia1.g;
import erd.g;
import java.util.List;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.basic.resource.e;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil;
import java.util.Map;
import com.kuaishou.live.common.core.basic.resource.controlfiles.utils.LiveControlFileUtil$a;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.resource.h;
import la1.a;
import qrd.p;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import java.io.File;
import qkd.b;
import java.util.UUID;
import com.kuaishou.live.common.core.basic.resource.i;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$c;

public final class g implements g	// class@00287c
{
    public final List b;
    public final boolean c;

    public void g(List p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       boolean b;
       LiveResourceFileUtil$LiveResourceFileType liveResource;
       File uFile;
       LiveResourceFileResponse$LiveResourceFileInfo liveResource1;
       LiveResourceFileUtil$LiveResourceFileType liveResource2;
       boolean b1;
       ConcurrentHashMap c;
       g tb = this.b;
       g tc = this.c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ConcurrentHashMap obj = null;
       HashMap obj1 = PatchProxy.applyTwoRefs(p0, tb, obj, LiveResourceFileUtil.class, "23");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p0 == null){
          if (q.f(p0.mLiveResourceFileInfos)) {
             LiveResourceFileUtil.b.removeAll(tb);
          }else {
             b = true;
          }
       }
       b = false;
       if (b) {
          e.a(10, p0.mLiveResourceFileInfos);
          if (LiveResourceFileUtil.g) {
             _monitor_enter(LiveResourceFileUtil.class);
             if (PatchProxy.applyVoidOneRefs(p0, obj, LiveResourceFileUtil.class, "14")) {
                _monitor_exit(LiveResourceFileUtil.class);
             }else {
                LiveResourceFileResponse mLiveResourc = p0.mLiveResourceFileInfos;
                Map map = LiveControlFileUtil.e.a();
                obj1 = new HashMap();
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                   String str1 = iterator.next();
                   List list = map.get(str1);
                   if (list != null) {
                      Iterator iterator1 = list.iterator();
                      while (iterator1.hasNext()) {
                         obj1.put(iterator1.next(), str1);
                      }
                   }
                }
                Iterator iterator2 = mLiveResourc.iterator();
                while (iterator2.hasNext()) {
                   LiveResourceFileResponse$LiveResourceFileInfo liveResource3 = iterator2.next();
                   LiveResourceFileUtil$LiveResourceFileType liveResource4 = LiveResourceFileUtil$LiveResourceFileType.fromTypeString(liveResource3.mType);
                   if (liveResource4 != null) {
                      c = LiveResourceFileUtil.c;
                      if (!c.containsKey(liveResource4)) {
                         c.put(liveResource4, liveResource3);
                      }
                   }
                   if (obj1.containsKey(liveResource3.mType)) {
                      String str2 = obj1.get(liveResource3.mType);
                      if (str2 == null) {
                         continue ;
                      }else {
                         c = LiveResourceFileUtil.d;
                         if (!c.containsKey(str2)) {
                            c.put(str2, new CopyOnWriteArrayList());
                         }
                         List list1 = c.get(str2);
                         if (list1 != null) {
                            list1.add(liveResource3);
                         }else {
                            continue ;
                         }
                      }
                   }else {
                      continue ;
                   }
                }
                _monitor_exit(LiveResourceFileUtil.class);
             }
          }else {
             _monitor_enter(LiveResourceFileUtil.class);
             if (PatchProxy.isSupport(LiveResourceFileUtil.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(tc), obj, LiveResourceFileUtil.class, "22")) {
                _monitor_exit(LiveResourceFileUtil.class);
             }else {
                String str = UUID.randomUUID().toString();
                p0 = p0.mLiveResourceFileInfos.iterator();
                while (p0.hasNext()) {
                   LiveResourceFileResponse$LiveResourceFileInfo liveResource5 = p0.next();
                   LiveResourceFileUtil$LiveResourceFileType liveResource6 = LiveResourceFileUtil$LiveResourceFileType.fromTypeString(liveResource5.mType);
                   if (liveResource6 == null) {
                      continue ;
                   }else {
                      obj = LiveResourceFileUtil.c;
                      if (!obj.contains(liveResource6)) {
                         obj.put(liveResource6, liveResource5);
                      }
                      File uFile1 = new File(liveResource6.mFilePathInfo.b());
                      boolean b2 = (LiveResourceFileUtil.l() && liveResource5.mDownloadPolicy != true)? false: true;
                      if (LiveResourceFileUtil.s(liveResource6, liveResource5, b2)) {
                         LiveLogTag lIVE_RESOURC = LiveLogTag.LIVE_RESOURCE;
                         b.Z(lIVE_RESOURC, "need update for file type: "+liveResource5.mType);
                         if (!LiveResourceFileUtil.g(tc, liveResource6, liveResource5, str, new i(liveResource5, str, liveResource6, liveResource5))) {
                            b.Z(lIVE_RESOURC, "params invalidate "+LiveResourceFileUtil.i(liveResource6.mType));
                            LiveResourceFileUtil.b.remove(LiveResourceFileUtil$LiveResourceFileType.fromTypeString(liveResource5.mType));
                         }else if(uFile1.exists()){
                            uFile1.delete();
                         }
                      }else {
                         b.Z(LiveLogTag.LIVE_RESOURCE, "file exist : "+liveResource5.mType+", dont need download");
                         LiveResourceFileUtil.b.remove(LiveResourceFileUtil$LiveResourceFileType.fromTypeString(liveResource5.mType));
                      }
                   }
                }
                _monitor_exit(LiveResourceFileUtil.class);
             }
          }
       }
    }
}
