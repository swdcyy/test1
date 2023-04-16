package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$a;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y8c.r;
import pw8.d;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import nl8.p;
import com.yxcorp.gifshow.activity.share.copywriting.CopyWritingItem;
import q87.c;

public final class ShareCopyWritingListFragment$a$a extends m	// class@00137e
{
    public final ShareCopyWritingListFragment$a c;
    public final String d;

    public void ShareCopyWritingListFragment$a$a(ShareCopyWritingListFragment$a p0,String p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareCopyWritingListFragment$a$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ShareCopyWritingListFragment$a$a tc = this.c;
       ShareCopyWritingListFragment$a k = tc.k;
       if (k != null) {
          k.a(tc.j, tc.F(), this.d);
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareCopyWritingListFg", "doClick: onSelected\("+this.c.j+", "+this.c.F()+", "+this.c.t()+')', objArray);
       return;
    }
}
