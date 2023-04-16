package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$g;
import android.os.Handler$Callback;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class ShareCopyWritingListFragment$g implements Handler$Callback	// class@001386
{
    public final ShareCopyWritingListFragment b;

    public void ShareCopyWritingListFragment$g(ShareCopyWritingListFragment p0){
       this.b = p0;
       super();
    }
    public final boolean handleMessage(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareCopyWritingListFragment$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       a.b().w("ShareCopyWritingListFg", "delay refresh called", objArray);
       ShareCopyWritingListFragment$g tb = this.b;
       tb.Q = false;
       tb.a();
       return true;
    }
}
