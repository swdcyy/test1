package com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailUserListFragment$a;
import y8c.g;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailUserListFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import nx5.d;
import wtc.b;
import ml8.c;

public class VoteDetailUserListFragment$a extends g	// class@0012ce
{
    public final VoteDetailUserListFragment w;

    public void VoteDetailUserListFragment$a(VoteDetailUserListFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       VoteDetailUserListFragment$a uoa = VoteDetailUserListFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       d.a(0x47047d).N9(obj);
       obj.U7(new b());
       return new f(a.i(p0, 0x7f0d0965), obj);
    }
}
