package com.kuaishou.tuna_js_bridge.js.bridge.BridgeImpl.c;
import dy5.e;
import java.lang.Object;
import dy5.d;
import com.kwai.feature.api.tuna.BusinessJsBridgeResult;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import y05.s;
import msd.a;
import c15.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import d36.f;
import java.io.Serializable;

public class c implements e	// class@001143
{

    public void c(){
       super();
    }
    public BusinessJsBridgeResult a(d p0,Object p1){
       c uoc = c.class;
       BusinessJsBridgeResult uBusinessJsB = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "1");
       if (uBusinessJsB != PatchProxyResult.class) {
       }else {
          int i = 1;
          String str = (!TextUtils.x(p1.mServiceId) && (!TextUtils.x(p1.mSubtype) || !TextUtils.x(p1.mEntryId)))? 1: null;
          b.f(KsLogTunaPlcTag.PLC_POST.appendTag("bridge"), new s(p1));
          if (str) {
             if (!PatchProxy.applyVoidOneRefs(p1, this, uoc, "2")) {
                if (!TextUtils.x(p1.mSubtype) && TextUtils.x(p1.mEntryId)) {
                   p1.mEntryId = p1.mSubtype;
                }
                if (!TextUtils.x(p1.mEntryId) && TextUtils.x(p1.mSubtype)) {
                   p1.mSubtype = p1.mEntryId;
                }
             }
          label_0072 :
             RxBus.f.b(p1.toEvent());
             uBusinessJsB = new BusinessJsBridgeResult(i);
          }else {
             uBusinessJsB = new BusinessJsBridgeResult(-1, "js params or entryId is null", null);
          }
       }
       return uBusinessJsB;
    }
}
