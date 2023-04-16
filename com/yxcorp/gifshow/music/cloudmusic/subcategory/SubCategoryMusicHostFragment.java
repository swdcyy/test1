package com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicHostFragment;
import lob.s;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicHostFragment$a;
import java.lang.String;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import android.widget.LinearLayout$LayoutParams;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import lnc.a1;
import android.graphics.Typeface;
import java.lang.CharSequence;
import android.os.Bundle;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.music.network.model.response.Channel;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$c;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicFragment;
import jqb.j;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;

public final class SubCategoryMusicHostFragment extends TabHostFragment implements s	// class@002041
{
    public final String B;
    public String C;
    public BaseMusicSmoothPagerSlidingTabStrip D;
    public boolean E;
    public boolean F;
    public ViewPager$i G;

    public void SubCategoryMusicHostFragment(){
       super();
       this.B = "SubCategoryMusicHostFragment";
       this.G = new SubCategoryMusicHostFragment$a(this);
    }
    public final View Qh(String p0,boolean p1){
       View obj;
       if (PatchProxy.isSupport(SubCategoryMusicHostFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, SubCategoryMusicHostFragment.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.a(this.getContext(), R.layout.arg_RES_7f0d1025);
       a.o(obj, "rootView");
       obj.setLayoutParams(new LinearLayout$LayoutParams(-1, -1));
       TextView textView = obj.findViewById(R.id.tab_text);
       textView.setSingleLine();
       if (p1) {
          textView.setTextColor(a1.a(R.color.arg_RES_7f061915));
          a.o(textView, "tabTextView");
          textView.setTextSize((float)17);
          textView.setTypeface(Typeface.defaultFromStyle(1));
       }else {
          textView.setTextColor(a1.a(R.color.arg_RES_7f061916));
          a.o(textView, "tabTextView");
          textView.setTextSize((float)16);
          textView.setTypeface(Typeface.defaultFromStyle(0));
       }
       textView.setText(p0);
       return obj;
    }
    public boolean Wd(){
       return this.F;
    }
    public void cb(){
       this.F = true;
    }
    public int getLayoutResId(){
       return 0x7f0d01a0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubCategoryMusicHostFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       a.m(p0);
       String str = p0.getString("photo_task_id", "");
       a.o(str, "arguments!!.getString\(Ca¡­onstants.KEY_TASK_ID, \"\"\)");
       this.C = str;
       str = this.getArguments();
       a.m(str);
       this.E = str.getBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", false);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubCategoryMusicHostFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = p0.findViewById(R.id.smooth_tab_layout);
       a.o(view, "view.findViewById\(R.id.smooth_tab_layout\)");
       this.D = view;
       super.onViewCreated(p0, p1);
       SubCategoryMusicHostFragment tD = this.D;
       if (tD == null) {
          a.S("mSmoothTabLayout");
       }
       tD.setViewPager(this.u);
       p0 = p0.findViewById(R.id.title_root);
       a.o(p0, "view.findViewById\(R.id.title_root\)");
       p0.setBackgroundResource(R.color.arg_RES_7f061902);
       p0.d(R.drawable.arg_RES_7f080562, 0, R.string.arg_RES_7f1037cc);
       this.Oh(this.G);
       return;
    }
    public List wh(){
       String str = this;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, str, SubCategoryMusicHostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       Bundle arguments = this.getArguments();
       Serializable serializable = (arguments != null)? SerializableHook.getSerializable(arguments, "channel_list"): objArray;
       Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.music.network.model.response.Channel>");
       Bundle arguments1 = this.getArguments();
       String str1 = "sub_title_name";
       String str2 = (arguments1 != null)? arguments1.getString(str1): objArray;
       if (!q.f(serializable)) {
          int i = serializable.size();
          int i1 = 0;
          while (i1 < i) {
             Bundle arguments2 = this.getArguments();
             Object[] objArray1 = (arguments2 != null)? arguments2.clone(): objArray;
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type android.os.Bundle");
             objArray1.putString(str1, serializable.get(i1).mName);
             objArray1.putLong("category_id", serializable.get(i1).mId);
             objArray1.putString("category_name", serializable.get(i1).mName);
             objArray1.putBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", str.E);
             PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(String.valueOf(serializable.get(i1).mId), serializable.get(i1).mName);
             if (TextUtils.n(serializable.get(i1).mName, str2)) {
                str.y = String.valueOf(serializable.get(i1).mId);
             }
             Channel mName = serializable.get(i1).mName;
             a.o(mName, "channelInfo[i].mName");
             View view = str.Qh(mName, true);
             mName = serializable.get(i1).mName;
             a.o(mName, "channelInfo[i].mName");
             View view1 = str.Qh(mName, false);
             BaseMusicSmoothPagerSlidingTabStrip$c uoc = new BaseMusicSmoothPagerSlidingTabStrip$c(String.valueOf(serializable.get(i1).mId), a1.a(0x7f061915), view, view1, -2);
             uArrayList.add(v13);
             obj.add(new b(uod, SubCategoryMusicFragment.class, objArray1));
             i1 = i1 + 1;
             objArray = null;
          }
       }
       SubCategoryMusicHostFragment d = str.D;
       if (d == null) {
          a.S("mSmoothTabLayout");
       }
       d.q(j.c, j.d);
       d = str.D;
       if (d == null) {
          a.S("mSmoothTabLayout");
       }
       d.x(uArrayList);
       TabHostFragment u = str.u;
       a.o(u, "mViewPager");
       u.setOffscreenPageLimit((obj.size() - true));
       return obj;
    }
}
