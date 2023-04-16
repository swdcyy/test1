package com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter;
import com.yxcorp.gifshow.relation.user.adapter.e;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.relation.user.model.MissUUser;
import y8c.f;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kwai.feature.post.api.postcard.PostCardView;
import com.kwai.framework.model.user.User;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;
import android.widget.LinearLayout;
import k46.b;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import android.view.ViewGroup;
import com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$PostCardPresenter;
import ml8.c;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.w;
import com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$b;
import com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$a;

public class MissUProfileAndNoticeAdapter extends e	// class@0019e8
{
    public PostCardView A;
    public GifshowActivity z;

    public void MissUProfileAndNoticeAdapter(e$b p0,GifshowActivity p1){
       super(p0);
       this.z = p1;
    }
    public int f0(int p0){
       MissUProfileAndNoticeAdapter missUProfile = MissUProfileAndNoticeAdapter.class;
       if (PatchProxy.isSupport(missUProfile)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, missUProfile, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int itemCount = this.getItemCount();
       int i = 1;
       int i1 = 3;
       if (itemCount <= i1 || (p0 == i1 || (itemCount >= i && (itemCount <= i1 && p0 == (itemCount - 1))))) {
          if (this.N0(p0) instanceof MissUUser) {
             return i;
          }
       }else if(itemCount > 5 && (p0 == 4 && this.N0(p0) instanceof MissUUser)){
          return 2;
       }
       return 0;
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(MissUProfileAndNoticeAdapter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, MissUProfileAndNoticeAdapter.class, "2")) {
          return;
       }
       if (p0.itemView instanceof PostCardView) {
          User user = this.N0(p1);
          ArrayList uArrayList = new ArrayList();
          p0.itemView.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
          if (user instanceof MissUUser) {
             uArrayList = user.mMissUMaterialList;
          }
          RecyclerView$ViewHolder itemView = p0.itemView;
          this.A = itemView;
          Objects.requireNonNull(itemView);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, itemView, PostCardView.class, "5")) {
             itemView.d = uArrayList;
             if (itemView.c.isEmpty()) {
                itemView.a(uArrayList);
             }else {
                itemView.setVisibility(0);
                itemView.e.K0(itemView.c);
                PostCardView b = itemView.b;
                if (b == null) {
                   a.S("mRecyclerView");
                }
                b.setAdapter(itemView.e);
             }
          }
       }
       super.g1(p0, p1, p2);
       return;
    }
    public f h1(ViewGroup p0,int p1){
       MissUProfileAndNoticeAdapter missUProfile = MissUProfileAndNoticeAdapter.class;
       if (PatchProxy.isSupport(missUProfile)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, missUProfile, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          this.A = new PostCardView(this.z);
          MissUProfileAndNoticeAdapter tA = this.A;
          return new f(tA, new MissUProfileAndNoticeAdapter$PostCardPresenter(tA));
       }else if(p1 == 2){
          return new f(a.i(p0, 0x7f0d0fcc), new PresenterV2());
       }else {
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.add(new w());
          presenterV2.add(new MissUProfileAndNoticeAdapter$b());
          presenterV2.add(new MissUProfileAndNoticeAdapter$a());
          return new f(a.i(p0, 0x7f0d0939), presenterV2);
       }
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
