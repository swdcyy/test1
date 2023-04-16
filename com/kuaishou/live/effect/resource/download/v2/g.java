package com.kuaishou.live.effect.resource.download.v2.g;
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
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.util.Iterator;
import boc.b;
import com.yxcorp.gifshow.util.resource.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import wz2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.effect.resource.download.v2.g$a;
import java.util.Objects;
import t16.a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public class g implements IMagicGiftResourceLoader	// class@001b63
{
    public final List a;

    public void g(Map p0){
       super();
       this.a = p0.get(this.getType().name());
    }
    public void a(MagicEmoji$MagicFace p0){
       c.a(this, p0);
    }
    public void b(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       List list = this.f(p0);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             n.l(iterator.next());
          }
       }
       return;
    }
    public void c(MagicEmoji$MagicFace p0){
       c.b(this, p0);
    }
    public boolean d(MagicEmoji$MagicFace p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       MagicBaseConfig mPassThrough = p0.mPassThroughParams;
       if (mPassThrough != null) {
          PassThroughParams mYModels = mPassThrough.mYModels;
          if (mYModels != null && MagicEmojiResourceHelper.q(mYModels)) {
             b = true;
          label_0024 :
             return b;
          }
       }
       b = false;
       goto label_0024 ;
    }
    public void e(a p0,MagicEmoji$MagicFace p1,IMagicGiftResourceLoader$a p2){
       String this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "2")) {
          return;
       }
       p2.a(this.getType(), p0, p1);
       List list = this.f(p1);
       ResourceDownloadProgressHelper resourceDown = ResourceDownloadProgressHelper.d();
       this = p1.getUniqueIdentifier();
       boolean b = (p0.b() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD)? true: false;
       Objects.requireNonNull(resourceDown);
       resourceDown.b(new a(), this, list, b, new g$a(this, p2, p0, p1));
       return;
    }
    public final List f(MagicBaseConfig p0){
       MagicBaseConfig obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mPassThroughParams;
          if (obj != null && obj.mYModels != null) {
             if (q.f(this.a)) {
                return MagicEmojiResourceHelper.k(p0.mPassThroughParams.mYModels);
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = p0.mPassThroughParams.mYModels.iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   if (this.a.contains(str)) {
                      continue ;
                   }
                   uArrayList.add(str);
                }
                return MagicEmojiResourceHelper.k(uArrayList);
             }
          }
       }
       return null;
    }
    public IMagicGiftResourceLoader$Type getType(){
       return IMagicGiftResourceLoader$Type.Y_MODE;
    }
}
