package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdGetCurrentMagicFaceId;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdGetCurrentMagicFaceId$ResultData;
import tkd.b;
import tkd.d;
import h02.b;
import lp3.e;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;

public final class LiveJsCmdGetCurrentMagicFaceId extends AbstractLiveJsCommand	// class@000e0e
{
    public final List e;

    public void LiveJsCmdGetCurrentMagicFaceId(){
       super();
       this.e = LiveLogTag.MAGIC_FACE.appendTag("JS");
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdGetCurrentMagicFaceId.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = new LiveJsCmdGetCurrentMagicFaceId$ResultData();
       MagicEmoji$MagicFace magicFace = d.a(-204054297).DE(this.h());
       if (magicFace != null) {
          p0.setMagicFaceId(magicFace.mId);
       }else {
          b.P(this.e, " [LiveJsCmdGetCurrentMagicFaceId] [onExecute]: magicFace is null, MagicFaceId is null");
       }
       return m.g.f(p0, false);
    }
}
