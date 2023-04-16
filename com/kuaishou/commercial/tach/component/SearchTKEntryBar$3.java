package com.kuaishou.commercial.tach.component.SearchTKEntryBar$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.commercial.tach.component.SearchTKEntryBar;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.feature.component.entry.tk.SearchEntryTkManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class SearchTKEntryBar$3 implements DefaultLifecycleObserver	// class@00164c
{
    public final SearchTKEntryBar b;

    public void SearchTKEntryBar$3(SearchTKEntryBar p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKEntryBar$3.class, "2")) {
          return;
       }
       SearchTKEntryBar$3 tb = this.b;
       if (tb.mTKViewCreateSuccess != null && tb.mSearchEntryTkManager != null) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("startAnimation", Boolean.FALSE);
          jsonObject.a0("timerInterval", Integer.valueOf(0));
          this.b.mSearchEntryTkManager.d("searchBoxTextStartSwitchAnimation", jsonObject.toString());
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKEntryBar$3.class, "1")) {
          return;
       }
       SearchTKEntryBar$3 tb = this.b;
       if (tb.mTKViewCreateSuccess != null && (tb.mSearchEntryTkManager != null && !TextUtils.x(tb.mSwitcherConfig))) {
          tb = this.b;
          tb.mSearchEntryTkManager.d("searchBoxTextStartSwitchAnimation", tb.mSwitcherConfig);
       }
    label_0028 :
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
