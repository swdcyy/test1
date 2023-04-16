package com.kuaishou.commercial.tach.component.SearchTKEntryBar;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.entry.tk.SearchEntryTkManager;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import pz.f;
import java.lang.Runnable;
import iq8.x;
import iy5.d;
import q87.c;
import py5.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.tachikoma.core.component.TKBaseNativeModule;
import android.app.Activity;
import e3a.a;
import pz.g;
import oy5.b;
import com.kwai.feature.component.entry.tk.SearchEntryTkManager$ViewType;
import pz.h;
import sx4.e$a;
import tx4.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.kuaishou.commercial.tach.component.SearchTKEntryBar$3;
import androidx.lifecycle.LifecycleObserver;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.feature.component.model.SearchPlaceHolderInfo;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.lang.Exception;

public class SearchTKEntryBar extends e	// class@00164d
{
    public final String TAG;
    public String mEntrySource;
    public SearchEntryTkManager mSearchEntryTkManager;
    public String mSearchWordList;
    public String mSwitcherConfig;
    public boolean mTKViewCreateSuccess;
    public String mUiParams;
    public a v;
    public Activity w;

    public void SearchTKEntryBar(f p0){
       super(p0);
       this.TAG = "SearchTKEntryBar";
    }
    public void configClickLogData(){
    }
    public void configShowLogData(){
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public FrameLayout createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchTKEntryBar.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FrameLayout(p0);
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, SearchTKEntryBar.class, "11")) {
          return;
       }
       SearchTKEntryBar tmSearchEntr = this.mSearchEntryTkManager;
       if (tmSearchEntr != null) {
          tmSearchEntr.b();
          this.mSearchEntryTkManager = null;
       }
       if (this.v != null) {
          this.v = null;
       }
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       SearchTKEntryBar searchTKEntr = SearchTKEntryBar.class;
       if (PatchProxy.isSupport(searchTKEntr) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, searchTKEntr, "10")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.m();
       }else {
          x.f(new f(this));
       }
       return;
    }
    public void searchEntryDidShow(){
       if (PatchProxy.applyVoid(null, this, SearchTKEntryBar.class, "8")) {
          return;
       }
       if (this.v != null && this.mTKViewCreateSuccess != null) {
          Object[] objArray = new Object[0];
          d.C().w("SearchTKEntryBar", "searchEntryDidShow", objArray);
          this.v.k();
       }
       return;
    }
    public void searchEntryUpdateAppearance(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKEntryBar.class, "7")) {
          return;
       }
       this.mUiParams = p0;
       if (this.mTKViewCreateSuccess != null) {
          Object[] objArray = new Object[0];
          d.C().w("SearchTKEntryBar", "searchEntryUpdateAppearance "+this.mUiParams, objArray);
          this.mSearchEntryTkManager.d("updateSearchEntryAppearance", this.mUiParams);
       }
       return;
    }
    public void setupSearchEntryView(int p0,String p1){
       if (PatchProxy.isSupport(SearchTKEntryBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SearchTKEntryBar.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().w("SearchTKEntryBar", "setupSearchEntryView "+p1, objArray);
       this.mEntrySource = p1;
       Context context = this.getContext();
       if (!PatchProxy.applyVoidOneRefs(context, this, SearchTKEntryBar.class, "2")) {
          this.w = a.b(context);
          SearchEntryTkManager searchEntryT = new SearchEntryTkManager();
          this.mSearchEntryTkManager = searchEntryT;
          searchEntryT.c(this.w);
          a uoa = new a(context, new g(this));
          this.v = uoa;
          this.mSearchEntryTkManager.a(SearchEntryTkManager$ViewType.SEARCH_SWITCHER, uoa, new h(this));
          if (!PatchProxy.applyVoid(null, this, SearchTKEntryBar.class, "3")) {
             SearchTKEntryBar tw = this.w;
             if (tw instanceof GifshowActivity) {
                tw.getLifecycle().addObserver(new SearchTKEntryBar$3(this));
             }
          }
       }
       return;
    }
    public void setupSwitcher(boolean p0,int p1){
       SearchTKEntryBar searchTKEntr = SearchTKEntryBar.class;
       if (PatchProxy.isSupport(searchTKEntr) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, searchTKEntr, "4")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("startAnimation", Boolean.valueOf(p0));
       jsonObject.a0("timerInterval", Integer.valueOf(p1));
       this.mSwitcherConfig = jsonObject.toString();
       Object[] objArray = new Object[0];
       d.C().w("SearchTKEntryBar", "setupSwitcher£º "+this.mSwitcherConfig, objArray);
       if (this.mTKViewCreateSuccess != null) {
          this.mSearchEntryTkManager.d("searchBoxTextStartSwitchAnimation", this.mSwitcherConfig);
       }
       return;
    }
    public void updateSearchWords(String p0){
       a uoa = a.class;
       SearchTKEntryBar searchTKEntr = SearchTKEntryBar.class;
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, this, searchTKEntr, str)) {
          return;
       }
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          d.C().w("SearchTKEntryBar", "updateSearchWords£º "+p0, objArray);
          SearchPlaceHolderInfo[] searchPlaceH = SearchPlaceHolderInfo[].class;
          List list = PatchProxy.applyTwoRefs(p0, searchPlaceH, this, searchTKEntr, "9");
          if (list != PatchProxyResult.class) {
          label_0045 :
             ArrayList uArrayList = new ArrayList();
             for (int i1 = 0; i1 < list.size(); i1 = i1 + 1) {
                uArrayList.add(list.get(i1).mSearchPlaceholder);
             }
             this.mSearchWordList = a.a.q(uArrayList);
             SearchTKEntryBar tv = this.v;
             if (tv != null) {
                Objects.requireNonNull(tv);
                if (!PatchProxy.applyVoid(null, tv, uoa, str)) {
                   tv.i.clear();
                }
                tv = this.v;
                Objects.requireNonNull(tv);
                if (!PatchProxy.applyVoidOneRefs(list, tv, uoa, "6") && !q.f(list)) {
                   tv.h = new ArrayList(list);
                }
             }
          label_0097 :
             if (this.mTKViewCreateSuccess != null) {
                this.mSearchEntryTkManager.d("updateContentText", this.mSearchWordList);
             }
          }else {
             list = Arrays.asList(a.a.h(p0, searchPlaceH));
             goto label_0045 ;
          }
       }catch(java.lang.Exception e9){
          Object[] objArray1 = new Object[i];
          d.C().w("SearchTKEntryBar", e9.getMessage(), objArray1);
       }
       return;
    }
}
