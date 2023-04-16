package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter;
import y8c.g;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import q99.a;
import yc3.n;
import a9c.e;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter$a;
import y8c.f$b;
import y8c.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Number;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter$PanelItemType;
import java.util.List;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import zc3.l;
import ml8.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kp.r1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class LiveLiteRecommendPanelAdapter extends g	// class@000aee
{
    public final j w;
    public final a x;

    public void LiveLiteRecommendPanelAdapter(j p0,a p1){
       super(new n());
       this.w = p0;
       this.x = p1;
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       LiveLiteRecommendPanelAdapter liveLiteReco = LiveLiteRecommendPanelAdapter.class;
       if (PatchProxy.isSupport(liveLiteReco)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveLiteReco, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w,this.x};
       ArrayList uArrayList = j.a(obj);
       uArrayList.add(new LiveLiteRecommendPanelAdapter$a(p1.d.f, this.N0(p0).mEntity));
       return uArrayList;
    }
    public int f0(int p0){
       LiveLiteRecommendPanelAdapter liveLiteReco = LiveLiteRecommendPanelAdapter.class;
       if (PatchProxy.isSupport(liveLiteReco)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveLiteReco, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.w.b.getValue() != null && (p0 == this.w.b.getValue().intValue() && this.w.b.getValue().intValue())) {
          return LiveLiteRecommendPanelAdapter$PanelItemType.TEXT.mType;
       }else {
          return LiveLiteRecommendPanelAdapter$PanelItemType.VIDEO_FEED.mType;
       }
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(LiveLiteRecommendPanelAdapter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveLiteRecommendPanelAdapter.class, "2")) {
          return;
       }
       if (this.w.b.getValue() != null && (this.w.b.getValue().intValue() && p1 > this.w.b.getValue().intValue())) {
          p1--;
       }
    label_0046 :
       this.n1("liteRecommendFeedItem", this.N0(p1));
       super.g1(p0, p1, p2);
       return;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       LiveLiteRecommendPanelAdapter liveLiteReco = LiveLiteRecommendPanelAdapter.class;
       if (PatchProxy.isSupport(liveLiteReco)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveLiteReco, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1 == LiveLiteRecommendPanelAdapter$PanelItemType.VIDEO_FEED.mType) {
          view = a.i(p0, R.layout.arg_RES_7f0d098e);
          obj.U7(new l());
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0991);
       }
       return new f(view, obj);
    }
    public int r1(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendPanelAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0)) {
          return -1;
       }
       obj = this.Q0();
       int i = 0;
       while (true) {
          if (i >= obj.size()) {
             return -1;
          }
          QPhoto qPhoto = obj.get(i);
          if (qPhoto != null) {
             qPhoto = qPhoto.mEntity;
             if (qPhoto != null && TextUtils.n(r1.n1(qPhoto), p0)) {
                break ;
             }
          }
          i = i + 1;
       }
       return i;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
