package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$c;
import y8c.g;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment$a;
import pw8.d;
import ml8.c;

public final class ShareCopyWritingListFragment$c extends g	// class@001381
{
    public final ShareCopyWritingListFragment w;

    public void ShareCopyWritingListFragment$c(ShareCopyWritingListFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       ShareCopyWritingListFragment$c uoc = ShareCopyWritingListFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "p0");
       return new f(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d14dd, p0, false), new ShareCopyWritingListFragment$a(this.w.Kh(), this.w.L));
    }
}
