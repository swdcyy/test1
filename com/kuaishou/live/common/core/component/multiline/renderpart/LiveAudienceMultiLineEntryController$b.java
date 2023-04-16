package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$b;
import oq1.b;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lq1.c;
import java.util.List;
import com.google.common.collect.ImmutableList;
import lh3.b;
import sz1.e;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import f02.a;
import java.util.Collection;
import nq1.d;
import java.lang.Integer;
import xp5.g;

public final class LiveAudienceMultiLineEntryController$b implements b	// class@0014f3
{
    public final LiveAudienceMultiLineEntryController a;

    public void LiveAudienceMultiLineEntryController$b(LiveAudienceMultiLineEntryController p0){
       this.a = p0;
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j.Y();
    }
    public List b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceMultiLineEntryController$b uob = LiveAudienceMultiLineEntryController$b.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uob, "9");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          b uob1 = this.a.B.gc();
          a.o(uob1, "multiInteractManager.liveInteractRtcManager");
          SCInteractiveChatRoomInfo sCInteractiv = uob1.b();
          if (sCInteractiv != null) {
             List list = a.d(a.j(sCInteractiv));
             if (list != null) {
                objArray = ImmutableList.copyOf(list);
             }
          }
       }
       return objArray;
    }
    public String c(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, LiveAudienceMultiLineEntryController$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiLineEntryController.W2(this.a).i();
       if (obj != null) {
          objArray = obj.a();
       }
       return objArray;
    }
    public String d(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, LiveAudienceMultiLineEntryController$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiLineEntryController.W2(this.a).i();
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public String e(){
       Object[] objArray = null;
       Integer obj = PatchProxy.apply(objArray, this, LiveAudienceMultiLineEntryController$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.j.S();
       if (obj != null) {
          objArray = String.valueOf(obj.intValue());
       }
       return objArray;
    }
    public String f(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, LiveAudienceMultiLineEntryController$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceMultiLineEntryController.W2(this.a).i();
       if (obj != null) {
          objArray = String.valueOf(obj.b());
       }
       return objArray;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.A.getLiveStreamId();
    }
    public String getSessionId(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineEntryController$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.B.gc().I1(this.a.A.d());
    }
}
