package com.kuaishou.live.core.show.subscribe.edit.f;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig;
import com.kuaishou.live.core.show.subscribe.edit.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.util.Collection;
import ekd.q;
import cp3.h;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.subscribe.edit.h;
import ok.o;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$ActivityDisplayConfig;
import java.lang.CharSequence;

public final class f implements g	// class@001115
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, o.class, "29")) {
       }else {
          p0 = p0.mEntrySubscribeDetail.mSubscribeInfoList;
          if (!q.f(p0)) {
             h oh = new h();
             ArrayList uArrayList = Lists.b();
             m.s(p0).p(h.b).n(uArrayList);
             p0 = uArrayList.iterator();
             while (p0.hasNext()) {
                LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo liveSubscrib = p0.next();
                try{
                   LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo mDisplayConf = liveSubscrib.mDisplayConfig;
                   mDisplayConf.mTitle = o.k(mDisplayConf.mTitleBase64, oh);
                   mDisplayConf.mDetailActivityInfo = o.k(mDisplayConf.mDetailActivityInfoBase64, oh);
                   mDisplayConf.mButtonText = o.k(mDisplayConf.mButtonTextBase64, oh);
                }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
                   liveSubscrib.mDisplayConfig = null;
                   goto label_0035 ;
                }catch(java.lang.IllegalArgumentException e0){
                }
             }
          }
       }
       return;
    }
}
