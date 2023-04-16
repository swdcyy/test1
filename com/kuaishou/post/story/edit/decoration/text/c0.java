package com.kuaishou.post.story.edit.decoration.text.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import k17.b;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.post.story.edit.decoration.text.s0$a;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;
import com.kuaishou.post.story.edit.decoration.text.c0$a;
import java.lang.Number;
import android.app.Activity;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;

public class c0 extends PresenterV2	// class@000ae2
{
    public RecyclerView p;
    public ImageView q;
    public StoryTextDrawer r;
    public StoryTextDataManager s;
    public int t;
    public String u;
    public int v;
    public c0$a w;
    public List x;
    public b y;
    public static final int A;
    public static final int z;

    static {
       c0.z = a1.e(18.00f);
       c0.A = a1.e(18.00f);
    }
    public void c0(){
       super();
       this.y = new b(0, c0.A, c0.z, 0);
    }
    public void E8(){
       int i1;
       int i2;
       int i4;
       StoryTextDataManager a;
       StoryTextDataManager storyTextDat = StoryTextDataManager.class;
       c0 uoc0 = c0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, uoc0, str)) {
          return;
       }
       c0 ts = this.s;
       Objects.requireNonNull(ts);
       ArrayList uArrayList = PatchProxy.apply(objArray, ts, storyTextDat, str);
       int i = 0;
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          a = ts.a;
          i4 = a.length;
          for (int i6 = 0; i6 < i4; i6 = i6 + 1) {
             uArrayList.add(new s0$a(a[i6]));
          }
       }
       this.x = uArrayList;
       c0$a uoa = new c0$a(this);
       this.w = uoa;
       uoa.e = this.r;
       NpaLinearLayoutManager obj = PatchProxy.apply(objArray, this, uoc0, "5");
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else {
          i1 = a1.d(R.dimen.arg_RES_7f070f5e);
          if (this.getActivity() != null) {
             Point point = new Point();
             this.getActivity().getWindowManager().getDefaultDisplay().getSize(point);
             Point x = point.x;
             int i3 = ((((x - (a1.d(0x7f070f5c) * 2)) - a1.d(0x7f070f5b)) - a1.d(0x7f070f62)) - a1.d(0x7f070f60)) - a1.d(0x7f070f61);
             i4 = a1.d(0x7f070f5f) + (i1 * 2);
             int i5 = i3 / i4;
             float f = (float)i1;
             float f1 = (((float)i5 + 0x3f000000) * (float)i4) - f;
             float f2 = (float)i3;
             f = (f1 - f2 > 0)? f - ((f1 - f2) / (float)((i5 * 2) + true)): f + ((f2 - f1) / (float)((i5 * 2) + true));
             Object[] objArray1 = new Object[i];
             a.D().w("StoryTextColorsPresenter", "computeTextColorItemMargin |||||||||| screenWidth:"+x+",recyclerViewWidth:"+i3+",itemSize:"+i5+",requestRecyclerWidth:"+f1+",floatItemMargin:"+f, objArray1);
             i1 = (int)f;
          }
       }
       uoa.f = Integer.valueOf(i1);
       uoc0 = this.w;
       uoc0.g = this.t;
       uoc0.h = this.u;
       uoc0.i = this.v;
       obj = new NpaLinearLayoutManager(this.getContext());
       obj.setOrientation(i);
       this.p.setLayoutManager(obj);
       this.p.setAdapter(this.w);
       if (!this.p.getItemDecorationCount()) {
          this.p.addItemDecoration(this.y);
       }
       uoc0 = this.s;
       StoryTextDrawer mTextColors = this.r.mTextColors;
       Objects.requireNonNull(uoc0);
       Object obj1 = PatchProxy.applyOneRefs(mTextColors, uoc0, storyTextDat, "5");
       if (obj1 != patchProxyRe) {
          i2 = obj1.intValue();
       }else {
          while (true) {
             storyTextDat = uoc0.a;
             if (i < storyTextDat.length) {
                if (mTextColors.equals(storyTextDat[i])) {
                   i2 = i;
                }else {
                   i = i + 1;
                }
             }else {
                i2 = -1;
             }
          }
       }
       if (i2 >= 0 && i2 < this.x.size()) {
          this.x.get(i2).b = true;
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, c0.class, "3");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, c0.class, "7");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, c0.class, "6");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3e48);
       this.q = m1.f(p0, 0x7f0a3dfb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.s = this.r8("STORY_TEXT_DATA_MANAGER");
       this.t = this.r8("LOGGER_ACTION").intValue();
       this.u = this.r8("MOOD_CURRENT_PAGE");
       this.v = this.r8("STORY_SOURCE").intValue();
       return;
    }
}
