package com.yxcorp.gifshow.record.album.utils.b;
import java.lang.Object;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import com.kuaishou.edit.draft.Shoot;
import com.kuaishou.edit.draft.Shoot$RecordMode;
import k8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.record.album.utils.a;
import erd.o;
import p8c.b;

public final class b	// class@00175f
{

    public void b(){
       super();
    }
    public static t a(RxFragmentActivity p0,int p1,c p2){
       StringBuilder obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, b.class, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       t ot = PatchProxy.applyOneRefs(p2, null, uob, "1");
       if (ot != patchProxyRe) {
       }else {
          Workspace workspace = p2.v();
          if (workspace == null) {
             ot = t.error(new DraftEditException("getRecordMode: workspace is null"));
          }else if(workspace.getShoot() != null && workspace.getShoot().getRecordMode() != null){
             int number = workspace.getShoot().getRecordMode().getNumber();
             obj = -1;
             int i = 0;
             if (number != 1) {
                if (number != 3) {
                   number = (number != 5)? -1: 4;
                }else {
                   number = 2;
                }
             }else {
                number = 0;
             }
             if (number > obj) {
                Object[] objArray = new Object[i];
                a.D().s("DraftRecoverUtil", "recoverCamera set RecordMode by Draft, mode = "+number, objArray);
                ot = t.just(Integer.valueOf(number));
             }
          }
       label_0094 :
          ot = DraftUtils.p(p2).map(a.b);
       }
       return ot.map(new b(p0, p1, p2));
    }
}
