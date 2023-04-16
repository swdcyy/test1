package com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$autoDismissAction$1;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i2b.a;
import android.widget.TextView;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$d;
import android.view.View$OnClickListener;
import yhc.a;
import java.util.Objects;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import pic.h;
import pic.h$a;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$handleForwardPlatforms$1;
import z2a.a;
import msd.a;
import g9c.a;
import qrd.l1;
import o07.n;

public final class AuthorShareGuideDialog implements PopupInterface$f	// class@0015d7
{
    public c b;
    public final a c;
    public final GifshowActivity d;
    public final QPhoto e;
    public final List f;

    public void AuthorShareGuideDialog(GifshowActivity p0,QPhoto p1,List p2){
       a.p(p0, "activity");
       a.p(p1, "photo");
       a.p(p2, "photos");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.c = new AuthorShareGuideDialog$autoDismissAction$1(this);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       a uoa;
       AuthorShareGuideDialog uAuthorShare = AuthorShareGuideDialog.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, AuthorShareGuideDialog.class, "3");
       if (p3 != patchProxyRe) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       this.b = p0;
       View view = a.g(p1, R.layout.arg_RES_7f0d00e2, p2, false);
       View view1 = view.findViewById(R.id.tv_title);
       a.o(view1, "root.findViewById<TextView>\(R.id.tv_title\)");
       view1.setTypeface(d0.c());
       view1 = view.findViewById(R.id.tv_weibo);
       a.o(view1, "root.findViewById<TextView>\(R.id.tv_weibo\)");
       view1.setTypeface(d0.c());
       view.findViewById(R.id.iv_close).setOnClickListener(new AuthorShareGuideDialog$d(p0));
       a.o(view, "root");
       String str = "4";
       if (!PatchProxy.applyVoidOneRefs(view, this, uAuthorShare, str)) {
          uoa = a.a;
          Objects.requireNonNull(uoa);
          ArrayList uArrayList = PatchProxy.apply(null, uoa, a.class, str);
          if (uArrayList != patchProxyRe) {
          }else {
             WechatForward$Companion n0 = WechatForward.n0;
             QQForward$Companion m0 = QQForward.m0;
             boolean b = m0.c().K();
             h$a b0 = h.B0;
             boolean b1 = b0.a().K();
             ArrayList uArrayList1 = new ArrayList();
             if (n0.c().K()) {
                uArrayList1.add(new AuthorShareGuideDialog$a(n0.c().k(), "wechat"));
                uArrayList1.add(new AuthorShareGuideDialog$a(n0.e().k(), "wechatMoments"));
             }
             if (b) {
                uArrayList1.add(new AuthorShareGuideDialog$a(m0.c().k(), "qq"));
                uArrayList1.add(new AuthorShareGuideDialog$a(m0.d().k(), "qzone"));
             }
             if (b1) {
                uArrayList1.add(new AuthorShareGuideDialog$a(b0.a().k(), "weibo"));
             }
             uArrayList = uArrayList1;
          }
          view1 = view.findViewById(R.id.weibo_platform);
          RecyclerView recyclerView1 = view.findViewById(R.id.forward_platforms);
          if (uArrayList.size() > 1) {
             a.o(view1, "layoutWeibo");
             view1.setVisibility(8);
             a.o(recyclerView1, "recycler");
             recyclerView1.setLayoutManager(new LinearLayoutManager(this.d, false, false));
             recyclerView1.addItemDecoration(new e(false, a1.e(24.00f), false));
             recyclerView1.setAdapter(new AuthorShareGuideDialog$b(this, uArrayList));
          }else {
             a.o(recyclerView1, "recycler");
             recyclerView1.setVisibility(8);
             view1.setOnClickListener(new AuthorShareGuideDialog$handleForwardPlatforms$1(this, uArrayList));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(view, this, uAuthorShare, "5")) {
          RecyclerView recyclerView = view.findViewById(R.id.recommend_photos);
          a.o(recyclerView, "recyclerPhotos");
          recyclerView.setLayoutManager(new LinearLayoutManager(this.d, false, false));
          recyclerView.addItemDecoration(new e(false, a1.e(8.00f), false));
          uoa = new a(this.c);
          List list = (this.f.size() > 3)? this.f.subList(false, 3): this.f;
          uoa.W0(list);
          recyclerView.setAdapter(uoa);
       }
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public final GifshowActivity c(){
       return this.d;
    }
    public final QPhoto d(){
       return this.e;
    }
    public final c e(){
       AuthorShareGuideDialog obj = PatchProxy.apply(null, this, AuthorShareGuideDialog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("popup");
       }
       return obj;
    }
}
