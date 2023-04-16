package com.yxcorp.gifshow.edit.draft.model.DraftFileManager$a;
import android.os.Handler;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mba.m0;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite;
import laa.e;
import com.kuaishou.edit.draft.Workspace;
import java.util.concurrent.ConcurrentMap;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$d;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.concurrent.atomic.AtomicLong;
import ekd.k1;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.edit.draft.model.e;
import crd.b;

public class DraftFileManager$a extends Handler	// class@001ae9
{
    public final DraftFileManager a;

    public void DraftFileManager$a(DraftFileManager p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DraftFileManager$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       int i = 2018;
       if (p0.what == i || p0.obj instanceof m0) {
          DraftFileManager$a ta = this.a;
          p0 = p0.obj;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, DraftFileManager.class, "59")) {
             String identifier = p0.h().getIdentifier();
             DraftFileManager$d uod = ta.e.get(identifier);
             if (uod != null && uod.a.u() == p0) {
                long l = (uod.b.get() + 5000) - k1.i();
                if (l > 0) {
                   Message message = new Message();
                   message.what = i;
                   message.obj = p0;
                   ta.j.sendMessageDelayed(message, l);
                   Object[] objArray = new Object[0];
                   f.D().w("DraftFileManager", "prepareAutoSave "+identifier+" delay="+l, objArray);
                }else {
                   ta.s(uod.a, 0, true).subscribe(Functions.d(), e.b);
                }
             }
          }
       }
       return;
    }
}
