package com.kuaishou.live.effect.resource.download.v2.f;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader;
import java.util.Map;
import java.lang.Object;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import java.lang.String;
import java.lang.Enum;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import c03.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import wz2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import java.util.Iterator;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.util.Objects;
import java.lang.Number;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kuaishou.live.effect.resource.download.v2.f$a;
import com.kwai.plugin.dva.work.c$c;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public class f implements IMagicGiftResourceLoader	// class@001b61
{
    public final List a;

    public void f(Map p0){
       super();
       this.a = p0.get(this.getType().name());
    }
    public void a(MagicEmoji$MagicFace p0){
       c.a(this, p0);
    }
    public void b(MagicEmoji$MagicFace p0){
       c.c(this, p0);
    }
    public void c(MagicEmoji$MagicFace p0){
       c.b(this, p0);
    }
    public boolean d(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List list = this.f(p0);
       boolean b = (list != null && !list.isEmpty())? true: false;
       return b;
    }
    public void e(a p0,MagicEmoji$MagicFace p1,IMagicGiftResourceLoader$a p2){
       PluginDownloadExtension this;
       int i;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "2")) {
          return;
       }
       p2.a(this.getType(), p0, p1);
       List list = this.f(p1);
       if (list == null) {
          p2.b(this.getType(), p0, p1);
          return;
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this = PluginDownloadExtension.k;
             Objects.requireNonNull(p0);
             Object obj = PatchProxy.apply(null, p0, a.class, "2");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else if(p0.g()){
                i = p0.a(p0.g);
             }else {
                i = p0.a(p0.f);
             }
             this.s(str, i);
             if (p0.b() == DownloadTask$DownloadTaskType.IMMEDIATE) {
                this.a(str);
             }else if(p0.b() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD){
                this.p(str, DownloadTask$DownloadBizExtra$DownloadUpBizFt.FT_Live);
             }
          }
          Dva.instance().getPluginInstallManager().k(list).a(new f$a(this, p2, p0, p1));
          return;
       }
    }
    public final List f(MagicBaseConfig p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.mPassThroughParams != null) {
          p0 = p0.mDependSo;
          if (!q.f(p0)) {
             obj = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                f ta = this.a;
                if (ta != null && (!ta.contains(str) && !Dva.instance().isLoaded(str))) {
                   obj.add(str);
                }
             }
             return obj;
          }
       }
       return null;
    }
    public IMagicGiftResourceLoader$Type getType(){
       return IMagicGiftResourceLoader$Type.SO;
    }
}
