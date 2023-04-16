package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$a;
import y8c.r;
import java.lang.String;
import pw8.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nl8.p;
import android.widget.TextView;
import com.yxcorp.gifshow.activity.share.copywriting.CopyWritingItem;
import java.lang.CharSequence;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$a$a;
import android.view.View$OnClickListener;

public final class ShareCopyWritingListFragment$a extends r	// class@00137f
{
    public TextView i;
    public final String j;
    public final d k;

    public void ShareCopyWritingListFragment$a(String p0,d p1){
       a.p(p0, "tabName");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareCopyWritingListFragment$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.f(p0);
       p0 = p0.findViewById(R.id.text);
       a.o(p0, "view.findViewById\(R.id.text\)");
       this.i = p0;
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, ShareCopyWritingListFragment$a.class, "2")) {
          return;
       }
       String captionRecoT = this.t().getCaptionRecoText();
       ShareCopyWritingListFragment$a ti = this.i;
       if (ti == null) {
          a.S("textView");
       }
       ti.setText(captionRecoT);
       this.b.setOnClickListener(new ShareCopyWritingListFragment$a$a(this, captionRecoT));
       return;
    }
}
